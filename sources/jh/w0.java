package jh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ w0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
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
                d1 d1Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = d1Var.f;
                int i11 = d1Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new y0(d1Var, 4));
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
                        d1Var.v = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new hh.m5(19, d1Var, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i11).processUpdates(updates, false);
                    TLRPC.GroupCall groupCall = d1Var.v;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = findUpdates2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj2 = findUpdates2.get(i13);
                        i13++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != d1Var.g() || z10) {
                            arrayList = findUpdates2;
                        } else {
                            int i14 = 0;
                            while (true) {
                                if (i14 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = findUpdates2;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i14).peer) == d1Var.b) {
                                        d1Var.C = tL_updateGroupCallParticipants.participants.get(i14);
                                    } else {
                                        i14++;
                                        findUpdates2 = arrayList;
                                    }
                                } else {
                                    arrayList = findUpdates2;
                                }
                            }
                            if (d1Var.C != null) {
                                ArrayList findUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = findUpdates3.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = findUpdates3.get(i10);
                                    i10++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                i0.a.y(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                                d1Var.x = true;
                                if (d1Var.w && d1Var.A != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        d1Var.A.prepareForStream(z10);
                                    } else {
                                        d1Var.A.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (d1Var.n) {
                                        d1Var.A.setMuteMicrophone(d1Var.r);
                                        d1Var.A.activateVideoCapturer(d1Var.F);
                                        d1Var.A.setupOutgoingVideoCreated(d1Var.F);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = d1Var.C;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = d1Var.A;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = d1.d(tL_groupCallParticipantVideo2);
                                                d1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new y0(d1Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamchannels, new v0(d1Var, 1), 65536, 2, d1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcall, new w0(d1Var, 2));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new y0(d1Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall, new cg.g0(10, d1Var, updates));
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
                    i0.a.y(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.id);
                    d1Var.x = true;
                    if (d1Var.w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall2, new cg.g0(10, d1Var, updates));
                }
                break;
            case 1:
                final int i15 = 0;
                final d1 d1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                d1 d1Var3 = d1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i16 = d1Var3.e;
                                if (!d1Var3.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                                        d1Var3.v = groupcall.call;
                                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var3.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new y0(d1Var3, 4));
                                    }
                                    if (d1Var3.L) {
                                        Runnable runnable = d1Var3.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        y0 y0Var = new y0(d1Var3, 11);
                                        d1Var3.N = y0Var;
                                        AndroidUtilities.runOnUIThread(y0Var, d1Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d1 d1Var4 = d1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!d1Var4.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(d1Var4.G))) {
                                            if (d1Var4.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = d1Var4.A;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                                                d1Var4.I.clear();
                                                d1Var4.A = null;
                                            }
                                            d1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(d1Var4.e).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(d1Var4.e).putChats(groupcall2.chats, false);
                                        d1Var4.v = groupcall2.call;
                                        NotificationCenter.getInstance(d1Var4.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var4.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new y0(d1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new y0(d1Var4, 4));
                                        }
                                    }
                                    if (d1Var4.L) {
                                        Runnable runnable2 = d1Var4.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        y0 y0Var2 = new y0(d1Var4, 10);
                                        d1Var4.M = y0Var2;
                                        AndroidUtilities.runOnUIThread(y0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                d1 d1Var3 = this.b;
                int i16 = d1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i17 = 0;
                    MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                    if (d1Var3.A != null && !d1Var3.w) {
                        while (true) {
                            if (i17 < groupcall.participants.size()) {
                                if (DialogObject.getPeerDialogId(groupcall.participants.get(i17).peer) == d1Var3.b) {
                                    d1Var3.C = groupcall.participants.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = d1Var3.C;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = d1Var3.A;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d10 = d1.d(tL_groupCallParticipantVideo);
                            d1Var3.r(d10);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d10, d1Var3.D, DialogObject.getPeerDialogId(d1Var3.C.peer));
                            break;
                        } else {
                            AndroidUtilities.runOnUIThread(new y0(d1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i18 = 1;
                final d1 d1Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                d1 d1Var32 = d1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i162 = d1Var32.e;
                                if (!d1Var32.w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i162).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i162).putChats(groupcall2.chats, false);
                                        d1Var32.v = groupcall2.call;
                                        NotificationCenter.getInstance(i162).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var32.v.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new y0(d1Var32, 4));
                                    }
                                    if (d1Var32.L) {
                                        Runnable runnable = d1Var32.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        y0 y0Var = new y0(d1Var32, 11);
                                        d1Var32.N = y0Var;
                                        AndroidUtilities.runOnUIThread(y0Var, d1Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                d1 d1Var42 = d1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!d1Var42.w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(d1Var42.G))) {
                                            if (d1Var42.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance22 = d1Var42.A;
                                                Objects.requireNonNull(nativeInstance22);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance22, 4));
                                                d1Var42.I.clear();
                                                d1Var42.A = null;
                                            }
                                            d1Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(d1Var42.e).putUsers(groupcall22.users, false);
                                        MessagesController.getInstance(d1Var42.e).putChats(groupcall22.chats, false);
                                        d1Var42.v = groupcall22.call;
                                        NotificationCenter.getInstance(d1Var42.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var42.v.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new y0(d1Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new y0(d1Var42, 4));
                                        }
                                    }
                                    if (d1Var42.L) {
                                        Runnable runnable2 = d1Var42.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        y0 y0Var2 = new y0(d1Var42, 10);
                                        d1Var42.M = y0Var2;
                                        AndroidUtilities.runOnUIThread(y0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                d1 d1Var5 = this.b;
                int i19 = d1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        AndroidUtilities.runOnUIThread(new y0(d1Var5, 4));
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
                boolean z11 = tLObject instanceof TLRPC.Updates;
                d1 d1Var6 = this.b;
                if (!z11) {
                    d1Var6.getClass();
                    break;
                } else {
                    MessagesController.getInstance(d1Var6.e).processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
