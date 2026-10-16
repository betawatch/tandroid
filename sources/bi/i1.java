package bi;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ i1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[LOOP:4: B:78:0x01ba->B:79:0x01bc, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int size;
        int i10;
        ArrayList arrayList;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = t1Var.f;
                int i11 = t1Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new k1(t1Var, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdates.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = findUpdates.get(i13);
                        i13++;
                        t1Var.v = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new a1.f(19, t1Var, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i11).lambda$processUpdates$377(updates, false);
                    TLRPC.GroupCall groupCall = t1Var.v;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = findUpdates2.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj2 = findUpdates2.get(i14);
                        i14++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != t1Var.g() || z10) {
                            arrayList = findUpdates2;
                        } else {
                            int i15 = i12;
                            while (true) {
                                if (i15 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = findUpdates2;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i15).peer) == t1Var.b) {
                                        t1Var.G = tL_updateGroupCallParticipants.participants.get(i15);
                                    } else {
                                        i15++;
                                        findUpdates2 = arrayList;
                                    }
                                } else {
                                    arrayList = findUpdates2;
                                }
                            }
                            if (t1Var.G != null) {
                                ArrayList findUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = findUpdates3.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = findUpdates3.get(i10);
                                    i10++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                i2.d.x(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                                t1Var.x = true;
                                if (t1Var.w && t1Var.E != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        t1Var.E.prepareForStream(z10);
                                    } else {
                                        t1Var.E.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (t1Var.n) {
                                        t1Var.E.setMuteMicrophone(t1Var.r);
                                        t1Var.E.activateVideoCapturer(t1Var.J);
                                        t1Var.E.setupOutgoingVideoCreated(t1Var.J);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = t1Var.G;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = t1Var.E;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = t1.d(tL_groupCallParticipantVideo2);
                                                t1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, t1Var.H, DialogObject.getPeerDialogId(t1Var.G.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new k1(t1Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamchannels, new h1(t1Var, 1), 65536, 2, t1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcall, new i1(t1Var, 2));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new k1(t1Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall, new m1(0, t1Var, updates));
                                    break;
                                }
                            }
                        }
                        findUpdates2 = arrayList;
                        i12 = 0;
                    }
                    ArrayList findUpdates32 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = findUpdates32.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i10 = 0;
                    while (i10 < size) {
                    }
                    i2.d.x(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                    t1Var.x = true;
                    if (t1Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall2, new m1(0, t1Var, updates));
                }
                break;
            case 1:
                final int i16 = 0;
                final t1 t1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                t1 t1Var3 = t1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i17 = t1Var3.e;
                                if (!t1Var3.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i17).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i17).putChats(groupcall.chats, false);
                                        t1Var3.v = groupcall.call;
                                        NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var3.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new k1(t1Var3, 4));
                                    }
                                    if (t1Var3.P) {
                                        Runnable runnable = t1Var3.R;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        k1 k1Var = new k1(t1Var3, 11);
                                        t1Var3.R = k1Var;
                                        AndroidUtilities.runOnUIThread(k1Var, t1Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t1 t1Var4 = t1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!t1Var4.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(t1Var4.K))) {
                                            if (t1Var4.E != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = t1Var4.E;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance2, 3));
                                                t1Var4.M.clear();
                                                t1Var4.E = null;
                                            }
                                            t1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(t1Var4.e).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(t1Var4.e).putChats(groupcall2.chats, false);
                                        t1Var4.v = groupcall2.call;
                                        NotificationCenter.getInstance(t1Var4.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var4.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new k1(t1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new k1(t1Var4, 4));
                                        }
                                    }
                                    if (t1Var4.P) {
                                        Runnable runnable2 = t1Var4.Q;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        k1 k1Var2 = new k1(t1Var4, 10);
                                        t1Var4.Q = k1Var2;
                                        AndroidUtilities.runOnUIThread(k1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                t1 t1Var3 = this.b;
                int i17 = t1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i18 = 0;
                    MessagesController.getInstance(i17).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i17).putChats(groupcall.chats, false);
                    if (t1Var3.E != null && !t1Var3.w) {
                        while (true) {
                            if (i18 < groupcall.participants.size()) {
                                if (DialogObject.getPeerDialogId(groupcall.participants.get(i18).peer) == t1Var3.b) {
                                    t1Var3.G = groupcall.participants.get(i18);
                                } else {
                                    i18++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = t1Var3.G;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = t1Var3.E;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d10 = t1.d(tL_groupCallParticipantVideo);
                            t1Var3.r(d10);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d10, t1Var3.H, DialogObject.getPeerDialogId(t1Var3.G.peer));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new k1(t1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i19 = 1;
                final t1 t1Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                t1 t1Var32 = t1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i172 = t1Var32.e;
                                if (!t1Var32.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i172).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i172).putChats(groupcall2.chats, false);
                                        t1Var32.v = groupcall2.call;
                                        NotificationCenter.getInstance(i172).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var32.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new k1(t1Var32, 4));
                                    }
                                    if (t1Var32.P) {
                                        Runnable runnable = t1Var32.R;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        k1 k1Var = new k1(t1Var32, 11);
                                        t1Var32.R = k1Var;
                                        AndroidUtilities.runOnUIThread(k1Var, t1Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t1 t1Var42 = t1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!t1Var42.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(t1Var42.K))) {
                                            if (t1Var42.E != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance22 = t1Var42.E;
                                                Objects.requireNonNull(nativeInstance22);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance22, 3));
                                                t1Var42.M.clear();
                                                t1Var42.E = null;
                                            }
                                            t1Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(t1Var42.e).putUsers(groupcall22.users, false);
                                        MessagesController.getInstance(t1Var42.e).putChats(groupcall22.chats, false);
                                        t1Var42.v = groupcall22.call;
                                        NotificationCenter.getInstance(t1Var42.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var42.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new k1(t1Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new k1(t1Var42, 4));
                                        }
                                    }
                                    if (t1Var42.P) {
                                        Runnable runnable2 = t1Var42.Q;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        k1 k1Var2 = new k1(t1Var42, 10);
                                        t1Var42.Q = k1Var2;
                                        AndroidUtilities.runOnUIThread(k1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                t1 t1Var5 = this.b;
                int i20 = t1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new k1(t1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i20).putUsers(updates2.users, false);
                    MessagesController.getInstance(i20).putChats(updates2.chats, false);
                    MessagesController.getInstance(i20).lambda$processUpdates$377(updates2, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                t1 t1Var6 = this.b;
                if (!z11) {
                    t1Var6.getClass();
                    break;
                } else {
                    MessagesController.getInstance(t1Var6.e).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
