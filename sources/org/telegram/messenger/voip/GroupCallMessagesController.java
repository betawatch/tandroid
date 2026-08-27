package org.telegram.messenger.voip;

import android.util.LongSparseArray;
import cg.b2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonBuilder;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class GroupCallMessagesController extends BaseController {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface CallMessageListener {
        void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage);

        void onPopGroupCallMessage();
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class MessagesList {
        private final List<GroupCallMessage> messages;
        private final Set<Long> randomIds;

        private MessagesList() {
            this.messages = new ArrayList();
            this.randomIds = new HashSet();
        }

        public boolean isEmpty() {
            return this.messages.isEmpty();
        }

        public void pop() {
            if (this.messages.isEmpty()) {
                return;
            }
            long j10 = this.messages.remove(r0.size() - 1).randomId;
            if (j10 != 0) {
                this.randomIds.remove(Long.valueOf(j10));
            }
        }

        public boolean push(GroupCallMessage groupCallMessage) {
            long j10 = groupCallMessage.randomId;
            if (j10 != 0 && !this.randomIds.add(Long.valueOf(j10))) {
                return false;
            }
            this.messages.add(0, groupCallMessage);
            return true;
        }
    }

    private GroupCallMessagesController(int i10) {
        super(i10);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
    }

    public static GroupCallMessagesController getInstance(int i10) {
        GroupCallMessagesController groupCallMessagesController;
        GroupCallMessagesController groupCallMessagesController2 = Instance[i10];
        if (groupCallMessagesController2 != null) {
            return groupCallMessagesController2;
        }
        synchronized (GroupCallMessagesController.class) {
            try {
                groupCallMessagesController = Instance[i10];
                if (groupCallMessagesController == null) {
                    GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                    GroupCallMessagesController groupCallMessagesController3 = new GroupCallMessagesController(i10);
                    groupCallMessagesControllerArr[i10] = groupCallMessagesController3;
                    groupCallMessagesController = groupCallMessagesController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return groupCallMessagesController;
    }

    private byte[] groupCallMessageDecrypt(long j10, long j11, byte[] bArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount || (conferenceCall = sharedInstance.conference) == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != j10) {
            return null;
        }
        long callId = conferenceCall.getCallId();
        if (callId == -1) {
            return null;
        }
        return groupCallMessageDecryptImpl(callId, j11, bArr);
    }

    private static native byte[] groupCallMessageDecryptImpl(long j10, long j11, byte[] bArr);

    private static native byte[] groupCallMessageEncryptImpl(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdate$3(long j10, long j11, byte[] bArr) {
        TLRPC.TL_groupCallMessage tL_groupCallMessage = null;
        try {
            byte[] groupCallMessageDecrypt = groupCallMessageDecrypt(j10, j11, bArr);
            if (groupCallMessageDecrypt != null) {
                tL_groupCallMessage = TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(groupCallMessageDecrypt))));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (tL_groupCallMessage != null) {
            AndroidUtilities.runOnUIThread(new f(this, j10, new GroupCallMessage(this.currentAccount, j11, tL_groupCallMessage.random_id, tL_groupCallMessage.message), 1));
            return;
        }
        TLRPC.TL_groupCallMessage tL_groupCallMessage2 = new TLRPC.TL_groupCallMessage();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_groupCallMessage2.message = tL_textWithEntities;
        tL_textWithEntities.text = LocaleController.getString(R.string.GroupCalMessageDecryptionError);
        AndroidUtilities.runOnUIThread(new f(this, j10, new GroupCallMessage(this.currentAccount, j11, 0L, tL_groupCallMessage2.message), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendCallMessage$4(GroupCallMessage groupCallMessage) {
        groupCallMessage.setIsSendDelayed(true);
        groupCallMessage.notifyStateUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallMessage$5(Runnable runnable, GroupCallMessage groupCallMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        groupCallMessage.setIsSendDelayed(false);
        if (tLObject instanceof TLRPC.Bool) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                groupCallMessage.setIsSendConfirmed(true);
            } else {
                groupCallMessage.setIsSendError(true);
            }
        } else if (tLObject instanceof TLRPC.Updates) {
            groupCallMessage.setIsSendConfirmed(true);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new e(groupCallMessage, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: popMessageFromList, reason: merged with bridge method [inline-methods] */
    public void lambda$pushMessageToList$6(long j10) {
        MessagesList messagesList = this.callMessagesList.get(j10);
        if (messagesList == null) {
            return;
        }
        messagesList.pop();
        if (messagesList.isEmpty()) {
            this.callMessagesList.remove(j10);
        }
        List<CallMessageListener> list = this.callMessagesListeners.get(j10);
        if (list != null) {
            Iterator<CallMessageListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPopGroupCallMessage();
            }
        }
        List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
        if (list2 != null) {
            Iterator<CallMessageListener> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().onPopGroupCallMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pushMessageToList, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$processUpdate$2(long j10, GroupCallMessage groupCallMessage) {
        MessagesList messagesList = this.callMessagesList.get(j10);
        if (messagesList == null) {
            messagesList = new MessagesList();
            this.callMessagesList.put(j10, messagesList);
        }
        if (messagesList.push(groupCallMessage)) {
            List<CallMessageListener> list = this.callMessagesListeners.get(j10);
            if (list != null) {
                Iterator<CallMessageListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onNewGroupCallMessage(j10, groupCallMessage);
                }
            }
            List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
            if (list2 != null) {
                Iterator<CallMessageListener> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().onNewGroupCallMessage(j10, groupCallMessage);
                }
            }
            AndroidUtilities.runOnUIThread(new b2(this, j10, 17), getAppGlobalConfig().groupCallMessageTtl.get(TimeUnit.MILLISECONDS));
        }
    }

    public List<GroupCallMessage> getCallMessages(long j10) {
        MessagesList messagesList = this.callMessagesList.get(j10);
        return messagesList != null ? new ArrayList(messagesList.messages) : new ArrayList();
    }

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        long j10 = tL_updateGroupCallMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallMessage.message.from_id);
        long j11 = tL_updateGroupCallMessage.message.id;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f(this, j10, new GroupCallMessage(this.currentAccount, peerDialogId, j11, tL_updateGroupCallMessage.message.message), 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean sendCallMessage(long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, TLRPC.InputGroupCall inputGroupCall) {
        TL_phone.sendGroupCallMessage sendgroupcallmessage;
        TLRPC.GroupCall groupCall;
        byte[] groupCallMessageEncryptImpl;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount) {
            return false;
        }
        long nextRandomId = getSendMessagesHelper().getNextRandomId();
        if (sharedInstance.isConference()) {
            ConferenceCall conferenceCall = sharedInstance.conference;
            if (conferenceCall == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != j11) {
                return false;
            }
            long callId = conferenceCall.getCallId();
            if (callId == -1) {
                return false;
            }
            TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
            tL_groupCallMessage.message = tL_textWithEntities;
            tL_groupCallMessage.random_id = nextRandomId;
            JSONObject serialize = TLJsonBuilder.serialize(tL_groupCallMessage);
            if (serialize == null || (groupCallMessageEncryptImpl = groupCallMessageEncryptImpl(callId, serialize.toString().getBytes(StandardCharsets.UTF_8))) == null) {
                return false;
            }
            TL_phone.sendGroupCallEncryptedMessage sendgroupcallencryptedmessage = new TL_phone.sendGroupCallEncryptedMessage();
            sendgroupcallencryptedmessage.call = inputGroupCall;
            sendgroupcallencryptedmessage.encrypted_message = groupCallMessageEncryptImpl;
            sendgroupcallmessage = sendgroupcallencryptedmessage;
        } else {
            TL_phone.sendGroupCallMessage sendgroupcallmessage2 = new TL_phone.sendGroupCallMessage();
            sendgroupcallmessage2.call = inputGroupCall;
            sendgroupcallmessage2.message = tL_textWithEntities;
            sendgroupcallmessage2.random_id = nextRandomId;
            sendgroupcallmessage = sendgroupcallmessage2;
        }
        GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j10, nextRandomId, tL_textWithEntities);
        groupCallMessage.setIsOut(true);
        lambda$processUpdate$2(j11, groupCallMessage);
        e eVar = new e(groupCallMessage, 1);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
        getConnectionsManager().sendRequest(sendgroupcallmessage, new m(this, eVar, groupCallMessage, 1));
        return true;
    }

    public void subscribeToCallMessages(long j10, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j10);
        if (list == null) {
            list = new ArrayList<>();
            this.callMessagesListeners.put(j10, list);
        }
        list.add(callMessageListener);
    }

    public void unsubscribeFromCallMessages(long j10, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j10);
        if (list == null) {
            return;
        }
        list.remove(callMessageListener);
        if (list.isEmpty()) {
            this.callMessagesListeners.remove(j10);
        }
    }

    public void processUpdate(TL_update.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        long j10 = tL_updateGroupCallEncryptedMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallEncryptedMessage.from_id);
        byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e5.w(this, j10, peerDialogId, bArr, 11));
    }
}
