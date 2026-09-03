package oh;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
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
                e1 e1Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = e1Var.f;
                int i11 = e1Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new z0(e1Var, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdates.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = findUpdates.get(i12);
                        i12++;
                        e1Var.v = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new mh.m2(28, e1Var, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i11).processUpdates(updates, false);
                    TLRPC.GroupCall groupCall = e1Var.v;
                    boolean z4 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = findUpdates2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj2 = findUpdates2.get(i13);
                        i13++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != e1Var.g() || z4) {
                            arrayList = findUpdates2;
                        } else {
                            int i14 = 0;
                            while (true) {
                                if (i14 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = findUpdates2;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i14).peer) == e1Var.b) {
                                        e1Var.D = tL_updateGroupCallParticipants.participants.get(i14);
                                    } else {
                                        i14++;
                                        findUpdates2 = arrayList;
                                    }
                                } else {
                                    arrayList = findUpdates2;
                                }
                            }
                            if (e1Var.D != null) {
                                ArrayList findUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = findUpdates3.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = findUpdates3.get(i10);
                                    i10++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                l.d.x(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                                e1Var.x = true;
                                if (e1Var.w && e1Var.B != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        e1Var.B.prepareForStream(z4);
                                    } else {
                                        e1Var.B.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (e1Var.n) {
                                        e1Var.B.setMuteMicrophone(e1Var.r);
                                        e1Var.B.activateVideoCapturer(e1Var.G);
                                        e1Var.B.setupOutgoingVideoCreated(e1Var.G);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = e1Var.D;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = e1Var.B;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo2);
                                                e1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, e1Var.E, DialogObject.getPeerDialogId(e1Var.D.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new z0(e1Var, 2));
                                            }
                                        } else if (z4) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamchannels, new w0(e1Var, 1), 65536, 2, e1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcall, new x0(e1Var, 2));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new z0(e1Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall, new eg.b3(11, e1Var, updates));
                                    break;
                                }
                            }
                        }
                        findUpdates2 = arrayList;
                    }
                    ArrayList findUpdates32 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = findUpdates32.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i10 = 0;
                    while (i10 < size) {
                    }
                    l.d.x(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                    e1Var.x = true;
                    if (e1Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall2, new eg.b3(11, e1Var, updates));
                }
                break;
            case 1:
                final int i15 = 0;
                final e1 e1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: oh.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                e1 e1Var3 = e1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i16 = e1Var3.e;
                                if (!e1Var3.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                                        e1Var3.v = groupcall.call;
                                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var3.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new z0(e1Var3, 4));
                                    }
                                    if (e1Var3.M) {
                                        Runnable runnable = e1Var3.O;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        z0 z0Var = new z0(e1Var3, 11);
                                        e1Var3.O = z0Var;
                                        AndroidUtilities.runOnUIThread(z0Var, e1Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e1 e1Var4 = e1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var4.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var4.H))) {
                                            if (e1Var4.B != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = e1Var4.B;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance2, 3));
                                                e1Var4.J.clear();
                                                e1Var4.B = null;
                                            }
                                            e1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(e1Var4.e).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(e1Var4.e).putChats(groupcall2.chats, false);
                                        e1Var4.v = groupcall2.call;
                                        NotificationCenter.getInstance(e1Var4.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var4.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new z0(e1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new z0(e1Var4, 4));
                                        }
                                    }
                                    if (e1Var4.M) {
                                        Runnable runnable2 = e1Var4.N;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        z0 z0Var2 = new z0(e1Var4, 10);
                                        e1Var4.N = z0Var2;
                                        AndroidUtilities.runOnUIThread(z0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                e1 e1Var3 = this.b;
                int i16 = e1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i17 = 0;
                    MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                    if (e1Var3.B != null && !e1Var3.w) {
                        while (true) {
                            if (i17 < groupcall.participants.size()) {
                                if (DialogObject.getPeerDialogId(groupcall.participants.get(i17).peer) == e1Var3.b) {
                                    e1Var3.D = groupcall.participants.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = e1Var3.D;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = e1Var3.B;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d10 = e1.d(tL_groupCallParticipantVideo);
                            e1Var3.r(d10);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d10, e1Var3.E, DialogObject.getPeerDialogId(e1Var3.D.peer));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new z0(e1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i18 = 1;
                final e1 e1Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: oh.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                e1 e1Var32 = e1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i162 = e1Var32.e;
                                if (!e1Var32.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i162).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i162).putChats(groupcall2.chats, false);
                                        e1Var32.v = groupcall2.call;
                                        NotificationCenter.getInstance(i162).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var32.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new z0(e1Var32, 4));
                                    }
                                    if (e1Var32.M) {
                                        Runnable runnable = e1Var32.O;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        z0 z0Var = new z0(e1Var32, 11);
                                        e1Var32.O = z0Var;
                                        AndroidUtilities.runOnUIThread(z0Var, e1Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e1 e1Var42 = e1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var42.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var42.H))) {
                                            if (e1Var42.B != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance22 = e1Var42.B;
                                                Objects.requireNonNull(nativeInstance22);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance22, 3));
                                                e1Var42.J.clear();
                                                e1Var42.B = null;
                                            }
                                            e1Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(e1Var42.e).putUsers(groupcall22.users, false);
                                        MessagesController.getInstance(e1Var42.e).putChats(groupcall22.chats, false);
                                        e1Var42.v = groupcall22.call;
                                        NotificationCenter.getInstance(e1Var42.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var42.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new z0(e1Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new z0(e1Var42, 4));
                                        }
                                    }
                                    if (e1Var42.M) {
                                        Runnable runnable2 = e1Var42.N;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        z0 z0Var2 = new z0(e1Var42, 10);
                                        e1Var42.N = z0Var2;
                                        AndroidUtilities.runOnUIThread(z0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                e1 e1Var5 = this.b;
                int i19 = e1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new z0(e1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i19).putUsers(updates2.users, false);
                    MessagesController.getInstance(i19).putChats(updates2.chats, false);
                    MessagesController.getInstance(i19).processUpdates(updates2, false);
                    break;
                }
                break;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                e1 e1Var6 = this.b;
                if (!z10) {
                    e1Var6.getClass();
                    break;
                } else {
                    MessagesController.getInstance(e1Var6.e).processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
