package org.telegram.messenger.voip;

import android.text.TextUtils;
import android.util.LongSparseArray;
import ih.h1;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import j7.l1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nh.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ConferenceCall {
    public static final int PERMISSION_ADD = 1;
    public static final int PERMISSION_REMOVE = 2;
    private int currentAccount;
    public boolean destroyed;
    public TLRPC.GroupCall groupCall;
    public TLRPC.InputGroupCall inputGroupCall;
    public boolean joined;
    private String[] lastVerificationEmojis;
    private byte[] last_block;
    private long my_private_key_id;
    private byte[] my_public_key;
    private long my_public_key_id;
    private long my_user_id;
    private boolean polling;
    private CallState state;
    private byte[] zero_block;
    private long call_id = -1;
    public final HashSet<Long> joiningBlockchainParticipants = new HashSet<>();
    private HashSet<Long> lastParticipants = null;
    private final int[] last_offset = {-1, -1};
    private final LongSparseArray<byte[]>[] blocksQueue = {new LongSparseArray<>(), new LongSparseArray<>()};
    private final Runnable pollRunnable = new b(this, 2);
    private final int[] pollRequestId = new int[2];

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class CallParticipant {
        int permissions;
        long public_key_id;
        long user_id;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CallParticipant{user_id=");
            sb2.append(this.user_id);
            sb2.append(", public_key_id=");
            return a4.w.p(sb2, this.public_key_id, "}");
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class CallState {
        int height;
        CallParticipant[] participants;

        public CallParticipant find(long j10) {
            int i10 = 0;
            while (true) {
                CallParticipant[] callParticipantArr = this.participants;
                if (i10 >= callParticipantArr.length) {
                    return null;
                }
                CallParticipant callParticipant = callParticipantArr[i10];
                if (callParticipant.user_id == j10) {
                    return callParticipant;
                }
                i10++;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(a4.w.l(this.height, ", participants=[", new StringBuilder("CallState{height=")));
            for (int i10 = 0; i10 < this.participants.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                CallParticipant callParticipant = this.participants[i10];
                if (callParticipant == null) {
                    sb2.append(BuildConfig.BETA_URL);
                } else {
                    sb2.append(callParticipant.toString());
                }
            }
            sb2.append("]}");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class CallVerificationState {
        byte[] emoji_hash;
        int height;

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("CallVerificationState{height=");
            sb2.append(this.height);
            sb2.append(", emoji_hash=");
            if (this.emoji_hash == null) {
                str = null;
            } else {
                str = "{" + Utilities.bytesToHex(this.emoji_hash) + "}";
            }
            return a4.w.q(sb2, str, "}");
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class CallVerificationWords {
        int height;
        String[] words;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(a4.w.l(this.height, ", words=[", new StringBuilder("CallVerificationWords{height=")));
            for (int i10 = 0; i10 < this.words.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.words[i10]);
            }
            sb2.append("]}");
            return sb2.toString();
        }
    }

    public ConferenceCall(int i10, long j10) {
        this.currentAccount = i10;
        this.my_user_id = j10;
        init();
    }

    private static String blockStr(byte[] bArr) {
        return "Block{" + Utilities.bytesToHex(bArr) + "}";
    }

    public static native CallState call_apply_block(long j10, byte[] bArr);

    public static native long call_create(long j10, long j11, byte[] bArr);

    public static native byte[] call_create_change_state_block(long j10, CallState callState);

    public static native byte[] call_create_self_add_block(long j10, byte[] bArr, CallParticipant callParticipant);

    public static native byte[] call_create_zero_block(long j10, CallState callState);

    public static native String call_describe(long j10);

    public static native String call_describe_block(byte[] bArr);

    public static native String call_describe_message(byte[] bArr);

    public static native void call_destroy(long j10);

    public static native void call_destroy_all();

    public static native int call_get_height(long j10);

    public static native CallState call_get_state(long j10);

    public static native CallVerificationState call_get_verification_state(long j10);

    public static native CallVerificationWords call_get_verification_words(long j10);

    public static native byte[][] call_pull_outbound_messages(long j10);

    public static native CallVerificationState call_receive_inbound_message(long j10, byte[] bArr);

    private void checkEmojiHash() {
        String[] verificationEmojis = getVerificationEmojis();
        if (eq(verificationEmojis, this.lastVerificationEmojis)) {
            return;
        }
        this.lastVerificationEmojis = verificationEmojis;
        AndroidUtilities.runOnUIThread(new b(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkParticipants() {
        long j10 = this.call_id;
        HashSet<Long> hashSet = null;
        if (j10 >= 0) {
            try {
                CallState call_get_state = call_get_state(j10);
                if (call_get_state != null && call_get_state.participants.length > 0) {
                    HashSet<Long> hashSet2 = new HashSet<>();
                    int i10 = 0;
                    while (true) {
                        try {
                            CallParticipant[] callParticipantArr = call_get_state.participants;
                            if (i10 >= callParticipantArr.length) {
                                break;
                            }
                            hashSet2.add(Long.valueOf(callParticipantArr[i10].user_id));
                            i10++;
                        } catch (Exception e10) {
                            e = e10;
                            hashSet = hashSet2;
                            FileLog.e(e);
                            if (eq(hashSet, this.lastParticipants)) {
                            }
                        }
                    }
                    hashSet = hashSet2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (eq(hashSet, this.lastParticipants)) {
            if (this.lastParticipants == null || hashSet == null) {
                this.joiningBlockchainParticipants.clear();
            } else {
                Iterator<Long> it = hashSet.iterator();
                while (it.hasNext()) {
                    Long next = it.next();
                    next.getClass();
                    if (!this.lastParticipants.contains(next)) {
                        this.joiningBlockchainParticipants.add(next);
                    }
                }
                Iterator<Long> it2 = this.joiningBlockchainParticipants.iterator();
                while (it2.hasNext()) {
                    Long next2 = it2.next();
                    next2.getClass();
                    if (this.lastParticipants.contains(next2)) {
                        it2.remove();
                    }
                }
            }
            this.lastParticipants = hashSet;
            AndroidUtilities.runOnUIThread(new b(this, 0));
        }
    }

    private boolean eq(String[] strArr, String[] strArr2) {
        if (strArr == strArr2) {
            return true;
        }
        if (strArr == null && strArr2 == null) {
            return true;
        }
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!TextUtils.equals(strArr[i10], strArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private long getPollTimeout() {
        return getVerificationEmojis() == null ? 1000L : 5000L;
    }

    private String[] getVerificationEmojis() {
        byte[] bArr;
        long j10 = this.call_id;
        if (j10 < 0) {
            return null;
        }
        try {
            bArr = call_get_verification_state(j10).emoji_hash;
        } catch (Exception e10) {
            FileLog.e(e10);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, 32);
            bArr = bArr2;
        }
        return EncryptionKeyEmojifier.emojifyForCall(bArr);
    }

    private void init() {
        long key_generate_temporary_private_key = key_generate_temporary_private_key();
        this.my_private_key_id = key_generate_temporary_private_key;
        byte[] key_to_public_key = key_to_public_key(key_generate_temporary_private_key);
        this.my_public_key = key_to_public_key;
        this.my_public_key_id = key_from_public_key(key_to_public_key);
        CallState callState = new CallState();
        this.state = callState;
        callState.height = 1;
        callState.participants = new CallParticipant[]{new CallParticipant()};
        CallParticipant callParticipant = this.state.participants[0];
        callParticipant.user_id = this.my_user_id;
        callParticipant.public_key_id = this.my_public_key_id;
        callParticipant.permissions = 3;
    }

    public static native long key_from_public_key(byte[] bArr);

    public static native long key_generate_temporary_private_key();

    public static native byte[] key_to_public_key(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkEmojiHash$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.conferenceEmojiUpdated, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkParticipants$1() {
        VoIPService sharedInstance;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        if (this.groupCall == null || (sharedInstance = VoIPService.getSharedInstance()) == null || (call = sharedInstance.groupCall) == null || (groupCall = call.call) == null || groupCall.id != this.groupCall.id) {
            return;
        }
        updateParticipants(call.sortedParticipants, false);
        sharedInstance.groupCall.shadyLeftParticipants.clear();
        ChatObject.Call call2 = sharedInstance.groupCall;
        call2.shadyLeftParticipants.addAll(sharedInstance.conference.getShadyLeftParticipants(call2.sortedParticipants));
        sharedInstance.groupCall.shadyJoinParticipants.clear();
        ChatObject.Call call3 = sharedInstance.groupCall;
        call3.shadyJoinParticipants.addAll(sharedInstance.conference.getShadyJoiningParticipants(call3.sortedParticipants));
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.id), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$kick$12(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$kick$13(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a(this, j10, tLObject, tL_error, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$poll$7(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, TLObject tLObject, TLRPC.TL_error tL_error, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        if (processUpdates(Integer.valueOf(getgroupcallchainblocks.offset), Long.valueOf(j10), tLObject, tL_error)) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.incrementAndGet() == 2) {
            this.polling = false;
            if (atomicBoolean.get()) {
                forcePoll();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
                AndroidUtilities.runOnUIThread(this.pollRunnable, getPollTimeout());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$poll$8(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jf.g0(j10, atomicBoolean, atomicInteger, this, tLObject, tL_error, getgroupcallchainblocks));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$poll$9(CallParticipant callParticipant) {
        return "[" + callParticipant.user_id + "]: " + DialogObject.getName(callParticipant.user_id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUpdates$4(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pull_outbound$5(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pull_outbound$6(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a(this, j10, tLObject, tL_error, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestLastBlock$2(long j10, TLObject tLObject, TLRPC.TL_error tL_error, Runnable runnable) {
        processUpdates(-1, Long.valueOf(j10), tLObject, tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestLastBlock$3(long j10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h1(this, j10, tLObject, tL_error, runnable, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateParticipants$10(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateParticipants$11(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a(this, j10, tLObject, tL_error, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void poll() {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.poll but destroyed!");
            return;
        }
        if (!this.joined) {
            FileLog.d("[tde2e] conference.poll but not joined!");
            return;
        }
        this.polling = true;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (int i10 = 0; i10 < 2; i10++) {
            TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
            getgroupcallchainblocks.call = this.inputGroupCall;
            getgroupcallchainblocks.sub_chain_id = i10;
            getgroupcallchainblocks.offset = Math.max(0, this.last_offset[i10]);
            getgroupcallchainblocks.limit = 10;
            FileLog.d("[tde2e] requesting getGroupCallChainBlocks sub_chain_id=" + getgroupcallchainblocks.sub_chain_id + " offset=" + getgroupcallchainblocks.offset + " limit=10");
            this.pollRequestId[i10] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new jf.f0(this, getgroupcallchainblocks, System.currentTimeMillis(), atomicBoolean, atomicInteger));
        }
        if (this.call_id >= 0) {
            try {
                FileLog.d("[tde2e] state = " + call_get_verification_state(this.call_id));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                FileLog.d("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[tde2e] call users:\n ");
                sb2.append(TextUtils.join("\n ", (Iterable) DesugarArrays.stream(call_get_state(this.call_id).participants).map(new c()).collect(Collectors.toSet())));
                FileLog.d(sb2.toString());
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        checkEmojiHash();
        checkParticipants();
    }

    private boolean processUpdates(Integer num, Long l10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            return false;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        int size = findUpdatesAndRemove.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = findUpdatesAndRemove.get(i10);
            i10++;
            if (applyUpdate(num, (TL_update.TL_updateGroupCallChainBlocks) obj, false, l10)) {
                z10 = true;
            }
        }
        Utilities.stageQueue.postRunnable(new b6(21, this, updates));
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pull_outbound() {
        int i10;
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.pull_outbound but destroyed!");
            return;
        }
        long j10 = this.call_id;
        if (j10 < 0) {
            return;
        }
        int i11 = 0;
        try {
            byte[][] call_pull_outbound_messages = call_pull_outbound_messages(j10);
            FileLog.d("[tde2e] call_pull_outbound_messages(" + this.call_id + ") = " + call_pull_outbound_messages.length + " blocks");
            i10 = 0;
            while (i11 < call_pull_outbound_messages.length) {
                try {
                    TL_phone.sendConferenceCallBroadcast sendconferencecallbroadcast = new TL_phone.sendConferenceCallBroadcast();
                    sendconferencecallbroadcast.call = this.inputGroupCall;
                    sendconferencecallbroadcast.block = call_pull_outbound_messages[i11];
                    FileLog.d("[tde2e] pull outbound block to server!");
                    FileLog.d("[tde2e] call_pull_outbound_messages(" + this.call_id + ")[" + i11 + "] = " + call_describe_message(call_pull_outbound_messages[i11]));
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendconferencecallbroadcast, new d(this, System.currentTimeMillis(), 1), 64);
                    i11++;
                    i10 = 1;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    FileLog.e(e);
                    i10 = i11;
                    FileLog.d("[tde2e] state = " + call_get_verification_state(this.call_id));
                    FileLog.d("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
                    checkEmojiHash();
                    checkParticipants();
                    if (i10 == 0) {
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            FileLog.d("[tde2e] state = " + call_get_verification_state(this.call_id));
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            FileLog.d("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        checkEmojiHash();
        checkParticipants();
        if (i10 == 0) {
            forcePoll();
        }
    }

    private void readQueue(int i10) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.readQueue(" + i10 + ") but destroyed!");
            return;
        }
        if (i10 != 0 && this.call_id < 0) {
            FileLog.d("[tde2e] conference.readQueue(" + i10 + ") but there is no call yet!");
            return;
        }
        int i11 = this.last_offset[i10];
        if (i11 == -1) {
            FileLog.d("[tde2e] conference.readQueue(" + i10 + ") but last_offset == -1!");
            return;
        }
        int max = Math.max(0, i11);
        FileLog.d("[tde2e] {subchain: " + i10 + "} processing blocks queue from " + max);
        while (true) {
            long j10 = max;
            byte[] bArr = this.blocksQueue[i10].get(j10);
            if (bArr == null) {
                StringBuilder o10 = com.google.android.recaptcha.internal.a.o("[tde2e] {subchain: ", i10, "} got into hole (might be the end) in ", i10, " subchain at #");
                l1.w(o10, max, ", when our last_offset[", i10, "] = ");
                l1.t(this.last_offset[i10], o10);
                this.last_offset[i10] = max;
                return;
            }
            try {
                FileLog.d("[tde2e] {subchain: " + i10 + "} processing #" + max + " block from queue");
                this.blocksQueue[i10].remove(j10);
                long j11 = this.call_id;
                if (j11 < 0) {
                    FileLog.d("[tde2e] #" + max + " call_create block=" + call_describe_block(bArr));
                    long j12 = this.my_user_id;
                    long j13 = this.my_private_key_id;
                    this.last_block = bArr;
                    long call_create = call_create(j12, j13, bArr);
                    this.call_id = call_create;
                    gotCallId(call_create);
                } else if (i10 == 0) {
                    if (max > call_get_height(j11)) {
                        FileLog.d("[tde2e] #" + max + " call_apply_block block=" + call_describe_block(bArr));
                        FileLog.d("[tde2e] #" + max + " call_apply_block(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_apply_block(this.call_id, bArr));
                    } else {
                        FileLog.d("[tde2e] #" + max + " block from queue is under call's height!");
                    }
                } else if (i10 == 1) {
                    FileLog.d("[tde2e] #" + max + " call_receive_inbound_message message=" + call_describe_message(bArr));
                    FileLog.d("[tde2e] #" + max + " call_receive_inbound_message(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_receive_inbound_message(this.call_id, bArr));
                }
                max++;
                this.last_offset[i10] = max;
            } catch (Exception e10) {
                FileLog.e("[tde2e] {subchain: " + i10 + "} #" + max + " block got into error: ", e10);
                return;
            }
        }
    }

    public boolean applyUpdate(Integer num, TL_update.TL_updateGroupCallChainBlocks tL_updateGroupCallChainBlocks, boolean z10, Long l10) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.applyUpdate but destroyed!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks == null) {
            return false;
        }
        TLRPC.GroupCall groupCall = this.groupCall;
        if (groupCall == null) {
            FileLog.d("[tde2e] received updateGroupCallChainBlocks but we dont have groupcall yet!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks.call.id != groupCall.id) {
            StringBuilder sb2 = new StringBuilder("[tde2e] received updateGroupCallChainBlocks for ");
            sb2.append(tL_updateGroupCallChainBlocks.call.id);
            sb2.append(" but we have ");
            l1.x(sb2, this.groupCall.id);
            return false;
        }
        StringBuilder sb3 = new StringBuilder("[tde2e] received update with ");
        sb3.append(tL_updateGroupCallChainBlocks.blocks.size());
        sb3.append(" blocks for ");
        sb3.append(tL_updateGroupCallChainBlocks.sub_chain_id);
        sb3.append(" subchain, next_offset=");
        sb3.append(tL_updateGroupCallChainBlocks.next_offset);
        sb3.append(" requested_offset=");
        sb3.append(num);
        th.v(l10 != null ? " in " + (System.currentTimeMillis() - l10.longValue()) + "ms" : "", sb3);
        int i10 = tL_updateGroupCallChainBlocks.sub_chain_id;
        int i11 = tL_updateGroupCallChainBlocks.next_offset;
        if (i10 == 0 || i10 == 1) {
            for (int i12 = 0; i12 < tL_updateGroupCallChainBlocks.blocks.size(); i12++) {
                byte[] bArr = tL_updateGroupCallChainBlocks.blocks.get(i12);
                int size = (i11 - tL_updateGroupCallChainBlocks.blocks.size()) + i12;
                if (num == null || num.intValue() != -1) {
                    if (size >= this.last_offset[i10]) {
                        FileLog.d("[tde2e] {subchain: " + i10 + "} put #" + size + " into queue");
                        this.blocksQueue[i10].put((long) size, bArr);
                    } else {
                        FileLog.d("[tde2e] {subchain: " + i10 + "} received #" + size + " that was already processed from queue");
                    }
                } else if (i10 == 0) {
                    this.last_block = bArr;
                }
            }
            if (this.last_offset[i10] == -1) {
                if (num != null && num.intValue() == 0) {
                    this.last_offset[i10] = i11 - tL_updateGroupCallChainBlocks.blocks.size();
                } else if (num == null || num.intValue() != -1) {
                    FileLog.e("[tde2e] received update where we can't know what the start offset is of " + i10 + " sub chain (we requested " + num + ")");
                } else {
                    FileLog.d("[tde2e] no offset, but we were asking for last block anyway");
                }
            }
            if (this.last_offset[i10] != -1) {
                boolean z11 = this.call_id >= 0;
                readQueue(i10);
                boolean z12 = this.call_id >= 0;
                if (i10 == 0 && !z11 && z12) {
                    readQueue(1);
                }
            }
        }
        if (i10 == 1) {
            pull_outbound();
        }
        checkEmojiHash();
        checkParticipants();
        if (z10 && tL_updateGroupCallChainBlocks.blocks.size() > 0) {
            forcePoll();
        }
        return tL_updateGroupCallChainBlocks.blocks.size() > 0;
    }

    public void destroy() {
        this.destroyed = true;
        reset();
    }

    public void forcePoll() {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.forcePoll but destroyed!");
            return;
        }
        if (!this.joined) {
            FileLog.d("[tde2e] conference.forcePoll but not joined!");
        } else {
            if (this.polling) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
            AndroidUtilities.runOnUIThread(this.pollRunnable);
        }
    }

    public byte[] generateAddSelfBlock() {
        CallParticipant callParticipant = new CallParticipant();
        callParticipant.user_id = this.my_user_id;
        callParticipant.public_key_id = this.my_public_key_id;
        callParticipant.permissions = 3;
        byte[] bArr = this.last_block;
        if (bArr == null) {
            CallState callState = new CallState();
            this.state = callState;
            callState.height = 1;
            callState.participants = new CallParticipant[]{callParticipant};
            byte[] call_create_zero_block = call_create_zero_block(this.my_private_key_id, callState);
            this.zero_block = call_create_zero_block;
            this.last_block = call_create_zero_block;
            FileLog.d("[tde2e] call_create_zero_block(" + this.my_private_key_id + ", " + this.state + ")");
        } else {
            try {
                byte[] call_create_self_add_block = call_create_self_add_block(this.my_private_key_id, bArr, callParticipant);
                FileLog.d("[tde2e] call_create_self_add_block(" + this.my_private_key_id + ", " + blockStr(this.last_block) + ", " + this.state + ") = " + blockStr(call_create_self_add_block));
                StringBuilder sb2 = new StringBuilder("[tde2e] call_create_self_add_block last_block=");
                sb2.append(call_describe_block(this.last_block));
                sb2.append(" new_block=");
                sb2.append(call_describe_block(call_create_self_add_block));
                FileLog.d(sb2.toString());
                this.last_block = call_create_self_add_block;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return this.last_block;
    }

    public HashSet<Long> getBlockchainParticipants() {
        CallState callState;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getBlockchainParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e10) {
                FileLog.e(e10);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    hashSet.add(Long.valueOf(callParticipantArr[i10].user_id));
                    i10++;
                }
            }
        }
        return hashSet;
    }

    public long getCallId() {
        return this.call_id;
    }

    public String[] getEmojis() {
        return this.lastVerificationEmojis;
    }

    public byte[] getLastBlock() {
        return this.last_block;
    }

    public byte[] getMyPublicKey() {
        return this.my_public_key;
    }

    public HashSet<Long> getShadyJoiningParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callState;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getShadyJoiningParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e10) {
                FileLog.e(e10);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    long j11 = callParticipantArr[i10].user_id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= (arrayList == null ? 0 : arrayList.size())) {
                            groupCallParticipant = null;
                            break;
                        }
                        if (j11 == DialogObject.getPeerDialogId(arrayList.get(i11).peer)) {
                            groupCallParticipant = arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (groupCallParticipant == null && j11 != this.my_user_id && this.joiningBlockchainParticipants.contains(Long.valueOf(j11))) {
                        hashSet.add(Long.valueOf(j11));
                    }
                    i10++;
                }
            }
        }
        return hashSet;
    }

    public HashSet<Long> getShadyLeftParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callState;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getShadyLeftParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e10) {
                FileLog.e(e10);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    long j11 = callParticipantArr[i10].user_id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= (arrayList == null ? 0 : arrayList.size())) {
                            groupCallParticipant = null;
                            break;
                        }
                        if (j11 == DialogObject.getPeerDialogId(arrayList.get(i11).peer)) {
                            groupCallParticipant = arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (groupCallParticipant == null && j11 != this.my_user_id && !this.joiningBlockchainParticipants.contains(Long.valueOf(j11))) {
                        hashSet.add(Long.valueOf(j11));
                    }
                    i10++;
                }
            }
        }
        return hashSet;
    }

    public CallVerificationState getVerificationState() {
        return call_get_verification_state(this.call_id);
    }

    public CallVerificationWords getVerificationWords() {
        return call_get_verification_words(this.call_id);
    }

    public void joined() {
        this.joined = true;
    }

    public void kick(long j10) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.kick but destroyed!");
            return;
        }
        if (this.call_id < 0 || !getBlockchainParticipants().contains(Long.valueOf(j10))) {
            return;
        }
        CallState call_get_state = call_get_state(this.call_id);
        CallState callState = new CallState();
        callState.height = call_get_state.height + 1;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            CallParticipant[] callParticipantArr = call_get_state.participants;
            if (i10 >= callParticipantArr.length) {
                callState.participants = (CallParticipant[]) arrayList.toArray(new CallParticipant[0]);
                FileLog.d("[tde2e] kick: call_create_change_state_block from " + this.state + " to " + callState);
                byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb2 = new StringBuilder("[tde2e] kick: call_create_change_state_block returns ");
                sb2.append(call_describe_block(call_create_change_state_block));
                FileLog.d(sb2.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.kick = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = call_create_change_state_block;
                deleteconferencecallparticipants.ids.add(Long.valueOf(j10));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new d(this, System.currentTimeMillis(), 2));
                return;
            }
            if (j10 != callParticipantArr[i10].user_id) {
                CallParticipant callParticipant = new CallParticipant();
                CallParticipant callParticipant2 = call_get_state.participants[i10];
                callParticipant.user_id = callParticipant2.user_id;
                callParticipant.public_key_id = callParticipant2.public_key_id;
                callParticipant.permissions = callParticipant2.permissions;
                arrayList.add(callParticipant);
            }
            i10++;
        }
    }

    public void requestLastBlock(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
        getgroupcallchainblocks.call = this.inputGroupCall;
        getgroupcallchainblocks.sub_chain_id = 0;
        getgroupcallchainblocks.offset = -1;
        getgroupcallchainblocks.limit = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new eg.d0(this, currentTimeMillis, runnable, 4));
    }

    public void reset() {
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        if (this.call_id != -1) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.pollRequestId[i10] != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollRequestId[i10], true);
                    this.pollRequestId[i10] = 0;
                }
            }
            call_destroy(this.call_id);
            FileLog.d("[tde2e] call_destroy(" + this.call_id + ")");
            this.call_id = -1L;
        }
        int[] iArr = this.last_offset;
        iArr[0] = -1;
        iArr[1] = -1;
        this.blocksQueue[0].clear();
        this.blocksQueue[1].clear();
        init();
    }

    public void updateParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z10) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.updateParticipants but destroyed!");
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.GroupCallParticipant groupCallParticipant = arrayList.get(i10);
            i10++;
            this.joiningBlockchainParticipants.remove(Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer)));
        }
        HashSet<Long> shadyLeftParticipants = getShadyLeftParticipants(arrayList);
        if (!shadyLeftParticipants.isEmpty()) {
            try {
                CallState call_get_state = call_get_state(this.call_id);
                CallState callState = new CallState();
                callState.height = call_get_state.height + 1;
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = call_get_state.participants;
                    if (i11 >= callParticipantArr.length) {
                        break;
                    }
                    if (!shadyLeftParticipants.contains(Long.valueOf(callParticipantArr[i11].user_id))) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = call_get_state.participants[i11];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList2.add(callParticipant);
                    }
                    i11++;
                }
                callState.participants = (CallParticipant[]) arrayList2.toArray(new CallParticipant[0]);
                FileLog.d("[tde2e] call_create_change_state_block from " + this.state + " to " + callState);
                byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[tde2e] call_create_change_state_block returns ");
                sb2.append(call_describe_block(call_create_change_state_block));
                FileLog.d(sb2.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.only_left = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = call_create_change_state_block;
                deleteconferencecallparticipants.ids.addAll(shadyLeftParticipants);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new d(this, System.currentTimeMillis(), 0));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (z10) {
            forcePoll();
        }
    }

    private boolean eq(HashSet<Long> hashSet, HashSet<Long> hashSet2) {
        if (hashSet == hashSet2) {
            return true;
        }
        if (hashSet == null && hashSet2 == null) {
            return true;
        }
        if (hashSet == null || hashSet2 == null || hashSet.size() != hashSet2.size()) {
            return false;
        }
        Iterator<Long> it = hashSet.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            next.longValue();
            if (!hashSet2.contains(next)) {
                return false;
            }
        }
        return true;
    }

    public void gotCallId(long j10) {
    }
}
