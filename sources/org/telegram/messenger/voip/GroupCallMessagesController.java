package org.telegram.messenger.voip;

import android.util.LongSparseArray;
import ci.e3;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.c1;
import org.telegram.messenger.m5;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonBuilder;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class GroupCallMessagesController extends c1 {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public interface CallMessageListener {
        void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage);

        void onPopGroupCallMessage();
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    private GroupCallMessagesController(int i3) {
        super(i3);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
    }

    public static GroupCallMessagesController getInstance(int i3) {
        GroupCallMessagesController groupCallMessagesController;
        GroupCallMessagesController groupCallMessagesController2 = Instance[i3];
        if (groupCallMessagesController2 != null) {
            return groupCallMessagesController2;
        }
        synchronized (GroupCallMessagesController.class) {
            try {
                groupCallMessagesController = Instance[i3];
                if (groupCallMessagesController == null) {
                    GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                    GroupCallMessagesController groupCallMessagesController3 = new GroupCallMessagesController(i3);
                    groupCallMessagesControllerArr[i3] = groupCallMessagesController3;
                    groupCallMessagesController = groupCallMessagesController3;
                }
            } catch (Throwable th2) {
                throw th2;
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$processUpdate$3(long j10, long j11, byte[] bArr) {
        TLRPC.TL_groupCallMessage tL_groupCallMessage;
        byte[] groupCallMessageDecrypt;
        try {
            groupCallMessageDecrypt = groupCallMessageDecrypt(j10, j11, bArr);
        } catch (Exception | StackOverflowError e10) {
            a8.g(e10, true);
        }
        if (groupCallMessageDecrypt != null && groupCallMessageDecrypt.length <= 8192) {
            tL_groupCallMessage = TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(groupCallMessageDecrypt))));
            if (tL_groupCallMessage == null) {
                org.telegram.messenger.g0.h3(new f(this, j10, new GroupCallMessage(this.currentAccount, j11, tL_groupCallMessage.random_id, tL_groupCallMessage.message), 1));
                return;
            }
            TLRPC.TL_groupCallMessage tL_groupCallMessage2 = new TLRPC.TL_groupCallMessage();
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_groupCallMessage2.message = tL_textWithEntities;
            tL_textWithEntities.text = bd.M0(2131749499, null);
            org.telegram.messenger.g0.h3(new f(this, j10, new GroupCallMessage(this.currentAccount, j11, 0L, tL_groupCallMessage2.message), 2));
            return;
        }
        tL_groupCallMessage = null;
        if (tL_groupCallMessage == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendCallMessage$4(GroupCallMessage groupCallMessage) {
        groupCallMessage.setIsSendDelayed(true);
        groupCallMessage.notifyStateUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallMessage$5(Runnable runnable, GroupCallMessage groupCallMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.r(runnable);
        groupCallMessage.setIsSendDelayed(false);
        if (tLObject instanceof TLRPC.Bool) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                groupCallMessage.setIsSendConfirmed(true);
            } else {
                groupCallMessage.setIsSendError(true);
            }
        } else if (tLObject instanceof TLRPC.Updates) {
            groupCallMessage.setIsSendConfirmed(true);
            getMessagesController().O3((TLRPC.Updates) tLObject, false);
        }
        org.telegram.messenger.g0.h3(new e(groupCallMessage, 0));
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
            org.telegram.messenger.g0.i3(new e3(this, j10, 16), getAppGlobalConfig().w.g2(TimeUnit.MILLISECONDS));
        }
    }

    public List<GroupCallMessage> getCallMessages(long j10) {
        MessagesList messagesList = this.callMessagesList.get(j10);
        return messagesList != null ? new ArrayList(messagesList.messages) : new ArrayList();
    }

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        long j10 = tL_updateGroupCallMessage.call.id;
        long o10 = m5.o(tL_updateGroupCallMessage.message.from_id);
        long j11 = tL_updateGroupCallMessage.message.id;
        if (getUserConfig().n == o10) {
            return;
        }
        org.telegram.messenger.g0.h3(new f(this, j10, new GroupCallMessage(this.currentAccount, o10, j11, tL_updateGroupCallMessage.message.message), 0));
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
        getSendMessagesHelper().getClass();
        long E = yy.E();
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
            tL_groupCallMessage.random_id = E;
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
            sendgroupcallmessage2.random_id = E;
            sendgroupcallmessage = sendgroupcallmessage2;
        }
        GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j10, E, tL_textWithEntities);
        groupCallMessage.setIsOut(true);
        lambda$processUpdate$2(j11, groupCallMessage);
        e eVar = new e(groupCallMessage, 1);
        org.telegram.messenger.g0.i3(eVar, 1000L);
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
        long o10 = m5.o(tL_updateGroupCallEncryptedMessage.from_id);
        byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().n == o10) {
            return;
        }
        Utilities.e.c(new c3.f0(this, j10, o10, bArr, 4));
    }
}
