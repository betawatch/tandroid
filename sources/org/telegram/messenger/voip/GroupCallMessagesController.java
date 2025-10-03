package org.telegram.messenger.voip;

import android.util.LongSparseArray;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonBuilder;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_phone;

/* loaded from: classes3.dex */
public class GroupCallMessagesController extends BaseController {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;

    public interface CallMessageListener {
        void onNewGroupCallMessage(GroupCallMessage groupCallMessage);

        void onPopGroupCallMessage();
    }

    private static native byte[] groupCallMessageDecryptImpl(long j, long j2, byte[] bArr);

    private static native byte[] groupCallMessageEncryptImpl(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendCallMessage$4(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }

    public void processUpdate(TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        final long j = tL_updateGroupCallMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallMessage.from_id);
        long j2 = tL_updateGroupCallMessage.random_id;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        final GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, peerDialogId, j2, tL_updateGroupCallMessage.message);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallMessagesController.this.lambda$processUpdate$0(j, groupCallMessage);
            }
        });
    }

    public void processUpdate(TLRPC.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        final long j = tL_updateGroupCallEncryptedMessage.call.id;
        final long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallEncryptedMessage.from_id);
        final byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallMessagesController.this.lambda$processUpdate$3(j, peerDialogId, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$processUpdate$3(final long j, long j2, byte[] bArr) {
        TLRPC.TL_groupCallMessage tL_groupCallMessage;
        byte[] groupCallMessageDecrypt;
        try {
            groupCallMessageDecrypt = groupCallMessageDecrypt(j, j2, bArr);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (groupCallMessageDecrypt != null) {
            tL_groupCallMessage = TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(groupCallMessageDecrypt))));
            if (tL_groupCallMessage == null) {
                final GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j2, tL_groupCallMessage.random_id, tL_groupCallMessage.message);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallMessagesController.this.lambda$processUpdate$1(j, groupCallMessage);
                    }
                });
                return;
            }
            TLRPC.TL_groupCallMessage tL_groupCallMessage2 = new TLRPC.TL_groupCallMessage();
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_groupCallMessage2.message = tL_textWithEntities;
            tL_textWithEntities.text = LocaleController.getString(R.string.GroupCalMessageDecryptionError);
            final GroupCallMessage groupCallMessage2 = new GroupCallMessage(this.currentAccount, j2, 0L, tL_groupCallMessage2.message);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallMessagesController.this.lambda$processUpdate$2(j, groupCallMessage2);
                }
            });
            return;
        }
        tL_groupCallMessage = null;
        if (tL_groupCallMessage == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean sendCallMessage(long j, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.InputGroupCall inputGroupCall) {
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
            if (conferenceCall == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != inputGroupCall.id) {
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
        TL_phone.sendGroupCallMessage sendgroupcallmessage3 = sendgroupcallmessage;
        lambda$processUpdate$2(inputGroupCall.id, new GroupCallMessage(this.currentAccount, j, nextRandomId, tL_textWithEntities));
        getConnectionsManager().sendRequestTyped(sendgroupcallmessage3, new Utilities.Callback2() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                GroupCallMessagesController.lambda$sendCallMessage$4((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
        return true;
    }

    public List<GroupCallMessage> getCallMessages(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        return messagesList != null ? new ArrayList(messagesList.messages) : new ArrayList();
    }

    public void subscribeToCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list == null) {
            list = new ArrayList<>();
            this.callMessagesListeners.put(j, list);
        }
        list.add(callMessageListener);
    }

    public void unsubscribeFromCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list == null) {
            return;
        }
        list.remove(callMessageListener);
        if (list.isEmpty()) {
            this.callMessagesListeners.remove(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pushMessageToList, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$processUpdate$2(final long j, GroupCallMessage groupCallMessage) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList == null) {
            messagesList = new MessagesList();
            this.callMessagesList.put(j, messagesList);
        }
        if (messagesList.push(groupCallMessage)) {
            List<CallMessageListener> list = this.callMessagesListeners.get(j);
            if (list != null) {
                Iterator<CallMessageListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onNewGroupCallMessage(groupCallMessage);
                }
            }
            List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
            if (list2 != null) {
                Iterator<CallMessageListener> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().onNewGroupCallMessage(groupCallMessage);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.GroupCallMessagesController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallMessagesController.this.lambda$pushMessageToList$5(j);
                }
            }, getAppGlobalConfig().groupCallMessageTtl.get(TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: popMessageFromList, reason: merged with bridge method [inline-methods] */
    public void lambda$pushMessageToList$5(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList == null) {
            return;
        }
        messagesList.pop();
        if (messagesList.isEmpty()) {
            this.callMessagesList.remove(j);
        }
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
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

    private static class MessagesList {
        private final List<GroupCallMessage> messages;
        private final Set<Long> randomIds;

        private MessagesList() {
            this.messages = new ArrayList();
            this.randomIds = new HashSet();
        }

        boolean push(GroupCallMessage groupCallMessage) {
            long j = groupCallMessage.randomId;
            if (j != 0 && !this.randomIds.add(Long.valueOf(j))) {
                return false;
            }
            this.messages.add(0, groupCallMessage);
            return true;
        }

        void pop() {
            if (this.messages.isEmpty()) {
                return;
            }
            long j = this.messages.remove(r0.size() - 1).randomId;
            if (j != 0) {
                this.randomIds.remove(Long.valueOf(j));
            }
        }

        boolean isEmpty() {
            return this.messages.isEmpty();
        }
    }

    private byte[] groupCallMessageDecrypt(long j, long j2, byte[] bArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount || (conferenceCall = sharedInstance.conference) == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != j) {
            return null;
        }
        long callId = conferenceCall.getCallId();
        if (callId == -1) {
            return null;
        }
        return groupCallMessageDecryptImpl(callId, j2, bArr);
    }

    public static GroupCallMessagesController getInstance(int i) {
        GroupCallMessagesController groupCallMessagesController = Instance[i];
        if (groupCallMessagesController == null) {
            synchronized (GroupCallMessagesController.class) {
                try {
                    groupCallMessagesController = Instance[i];
                    if (groupCallMessagesController == null) {
                        GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                        GroupCallMessagesController groupCallMessagesController2 = new GroupCallMessagesController(i);
                        groupCallMessagesControllerArr[i] = groupCallMessagesController2;
                        groupCallMessagesController = groupCallMessagesController2;
                    }
                } finally {
                }
            }
        }
        return groupCallMessagesController;
    }

    private GroupCallMessagesController(int i) {
        super(i);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
    }
}
