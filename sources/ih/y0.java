package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i9) {
        this.a = i9;
        this.b = f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[LOOP:4: B:78:0x01ba->B:79:0x01bc, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int size;
        int i9;
        ArrayList arrayList;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = f1Var.f;
                int i10 = f1Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new a1(f1Var, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i10).putUsers(updates.users, false);
                    MessagesController.getInstance(i10).putChats(updates.chats, false);
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdates.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = findUpdates.get(i11);
                        i11++;
                        f1Var.v = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new h3.g0(10, f1Var, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i10).processUpdates(updates, false);
                    TLRPC.GroupCall groupCall = f1Var.v;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = findUpdates2.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj2 = findUpdates2.get(i12);
                        i12++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != f1Var.g() || z10) {
                            arrayList = findUpdates2;
                        } else {
                            int i13 = 0;
                            while (true) {
                                if (i13 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = findUpdates2;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i13).peer) == f1Var.b) {
                                        f1Var.C = tL_updateGroupCallParticipants.participants.get(i13);
                                    } else {
                                        i13++;
                                        findUpdates2 = arrayList;
                                    }
                                } else {
                                    arrayList = findUpdates2;
                                }
                            }
                            if (f1Var.C != null) {
                                ArrayList findUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = findUpdates3.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i9 = 0;
                                while (i9 < size) {
                                    Object obj3 = findUpdates3.get(i9);
                                    i9++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                j3.r0.z(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                                f1Var.x = true;
                                if (f1Var.w && f1Var.A != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        f1Var.A.prepareForStream(z10);
                                    } else {
                                        f1Var.A.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (f1Var.n) {
                                        f1Var.A.setMuteMicrophone(f1Var.r);
                                        f1Var.A.activateVideoCapturer(f1Var.F);
                                        f1Var.A.setupOutgoingVideoCreated(f1Var.F);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = f1Var.C;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = f1Var.A;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = f1.d(tL_groupCallParticipantVideo2);
                                                f1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, f1Var.D, DialogObject.getPeerDialogId(f1Var.C.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new a1(f1Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new x0(f1Var, 1), 65536, 2, f1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new y0(f1Var, 2));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new a1(f1Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i10).sendRequest(leavegroupcall, new bg.j0(10, f1Var, updates));
                                    break;
                                }
                            }
                        }
                        findUpdates2 = arrayList;
                    }
                    ArrayList findUpdates32 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = findUpdates32.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i9 = 0;
                    while (i9 < size) {
                    }
                    j3.r0.z(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                    f1Var.x = true;
                    if (f1Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i10).sendRequest(leavegroupcall2, new bg.j0(10, f1Var, updates));
                }
                break;
            case 1:
                final int i14 = 0;
                final f1 f1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                f1 f1Var3 = f1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i15 = f1Var3.e;
                                if (!f1Var3.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i15).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i15).putChats(groupcall.chats, false);
                                        f1Var3.v = groupcall.call;
                                        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var3.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new a1(f1Var3, 4));
                                    }
                                    if (f1Var3.L) {
                                        Runnable runnable = f1Var3.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        a1 a1Var = new a1(f1Var3, 11);
                                        f1Var3.N = a1Var;
                                        AndroidUtilities.runOnUIThread(a1Var, f1Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f1 f1Var4 = f1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!f1Var4.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(f1Var4.G))) {
                                            if (f1Var4.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = f1Var4.A;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                                                f1Var4.I.clear();
                                                f1Var4.A = null;
                                            }
                                            f1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(f1Var4.e).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(f1Var4.e).putChats(groupcall2.chats, false);
                                        f1Var4.v = groupcall2.call;
                                        NotificationCenter.getInstance(f1Var4.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var4.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new a1(f1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new a1(f1Var4, 4));
                                        }
                                    }
                                    if (f1Var4.L) {
                                        Runnable runnable2 = f1Var4.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        a1 a1Var2 = new a1(f1Var4, 10);
                                        f1Var4.M = a1Var2;
                                        AndroidUtilities.runOnUIThread(a1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                f1 f1Var3 = this.b;
                int i15 = f1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i16 = 0;
                    MessagesController.getInstance(i15).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i15).putChats(groupcall.chats, false);
                    if (f1Var3.A != null && !f1Var3.w) {
                        while (true) {
                            if (i16 < groupcall.participants.size()) {
                                if (DialogObject.getPeerDialogId(groupcall.participants.get(i16).peer) == f1Var3.b) {
                                    f1Var3.C = groupcall.participants.get(i16);
                                } else {
                                    i16++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = f1Var3.C;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = f1Var3.A;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d9 = f1.d(tL_groupCallParticipantVideo);
                            f1Var3.r(d9);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d9, f1Var3.D, DialogObject.getPeerDialogId(f1Var3.C.peer));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new a1(f1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i17 = 1;
                final f1 f1Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                f1 f1Var32 = f1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i152 = f1Var32.e;
                                if (!f1Var32.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i152).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i152).putChats(groupcall2.chats, false);
                                        f1Var32.v = groupcall2.call;
                                        NotificationCenter.getInstance(i152).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var32.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new a1(f1Var32, 4));
                                    }
                                    if (f1Var32.L) {
                                        Runnable runnable = f1Var32.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        a1 a1Var = new a1(f1Var32, 11);
                                        f1Var32.N = a1Var;
                                        AndroidUtilities.runOnUIThread(a1Var, f1Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f1 f1Var42 = f1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!f1Var42.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(f1Var42.G))) {
                                            if (f1Var42.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance22 = f1Var42.A;
                                                Objects.requireNonNull(nativeInstance22);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance22, 4));
                                                f1Var42.I.clear();
                                                f1Var42.A = null;
                                            }
                                            f1Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(f1Var42.e).putUsers(groupcall22.users, false);
                                        MessagesController.getInstance(f1Var42.e).putChats(groupcall22.chats, false);
                                        f1Var42.v = groupcall22.call;
                                        NotificationCenter.getInstance(f1Var42.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var42.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new a1(f1Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new a1(f1Var42, 4));
                                        }
                                    }
                                    if (f1Var42.L) {
                                        Runnable runnable2 = f1Var42.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        a1 a1Var2 = new a1(f1Var42, 10);
                                        f1Var42.M = a1Var2;
                                        AndroidUtilities.runOnUIThread(a1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                f1 f1Var5 = this.b;
                int i18 = f1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new a1(f1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i18).putUsers(updates2.users, false);
                    MessagesController.getInstance(i18).putChats(updates2.chats, false);
                    MessagesController.getInstance(i18).processUpdates(updates2, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                f1 f1Var6 = this.b;
                if (!z11) {
                    f1Var6.getClass();
                    break;
                } else {
                    MessagesController.getInstance(f1Var6.e).processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
