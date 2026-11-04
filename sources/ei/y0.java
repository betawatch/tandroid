package ei;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ y0(g1 g1Var, int i3) {
        this.a = i3;
        this.b = g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb A[LOOP:4: B:78:0x01b9->B:79:0x01bb, LOOP_END] */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int size;
        int i3;
        ArrayList arrayList;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                TLRPC.InputGroupCall inputGroupCall = g1Var.f;
                int i10 = g1Var.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.h3(new a1(g1Var, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i11 = 0;
                    hp.s1(i10).Y3(updates.users, false);
                    hp.s1(i10).S3(updates.chats, false);
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = y02.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = y02.get(i12);
                        i12++;
                        g1Var.w = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    org.telegram.messenger.g0.h3(new b0(3, g1Var, hp.z0(updates, TL_update.TL_updateGroupCallMessage.class)));
                    hp.s1(i10).O3(updates, false);
                    TLRPC.GroupCall groupCall = g1Var.w;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList y03 = hp.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = y03.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj2 = y03.get(i13);
                        i13++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != g1Var.g() || z10) {
                            arrayList = y03;
                        } else {
                            int i14 = i11;
                            while (true) {
                                if (i14 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = y03;
                                    if (org.telegram.messenger.m5.o(tL_updateGroupCallParticipants.participants.get(i14).peer) == g1Var.b) {
                                        g1Var.H = tL_updateGroupCallParticipants.participants.get(i14);
                                    } else {
                                        i14++;
                                        y03 = arrayList;
                                    }
                                } else {
                                    arrayList = y03;
                                }
                            }
                            if (g1Var.H != null) {
                                ArrayList y04 = hp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = y04.size();
                                TLRPC.TL_dataJSON tL_dataJSON = null;
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj3 = y04.get(i3);
                                    i3++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                k2.p1.r(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                                g1Var.y = true;
                                if (g1Var.x && g1Var.F != null) {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        g1Var.F.prepareForStream(z10);
                                    } else {
                                        g1Var.F.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (g1Var.n) {
                                        g1Var.F.setMuteMicrophone(g1Var.r);
                                        g1Var.F.activateVideoCapturer(g1Var.K);
                                        g1Var.F.setupOutgoingVideoCreated(g1Var.K);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant = g1Var.H;
                                        if (groupCallParticipant != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = g1Var.F;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo2);
                                                g1Var.r(d);
                                                nativeInstance.addIncomingVideoOutput(2, str, d, g1Var.I, org.telegram.messenger.m5.o(g1Var.H.peer));
                                            } else {
                                                org.telegram.messenger.g0.h3(new a1(g1Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new x0(g1Var, 1), 65536, 2, g1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new y0(g1Var, 2));
                                        }
                                    }
                                    org.telegram.messenger.g0.h3(new a1(g1Var, 3));
                                    break;
                                } else {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i10).sendRequest(leavegroupcall, new ai.f3(10, g1Var, updates));
                                    break;
                                }
                            }
                        }
                        y03 = arrayList;
                        i11 = 0;
                    }
                    ArrayList y042 = hp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = y042.size();
                    TLRPC.TL_dataJSON tL_dataJSON2 = null;
                    i3 = 0;
                    while (i3 < size) {
                    }
                    k2.p1.r(inputGroupCall.id, new StringBuilder("[LivePlayer] joined call "));
                    g1Var.y = true;
                    if (g1Var.x) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i10).sendRequest(leavegroupcall2, new ai.f3(10, g1Var, updates));
                }
                break;
            case 1:
                final int i15 = 0;
                final g1 g1Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ei.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                g1 g1Var3 = g1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i16 = g1Var3.e;
                                if (!g1Var3.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        hp.s1(i16).Y3(groupcall.users, false);
                                        hp.s1(i16).S3(groupcall.chats, false);
                                        g1Var3.w = groupcall.call;
                                        hs.f(i16).k(hs.G2, Long.valueOf(g1Var3.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new a1(g1Var3, 4));
                                    }
                                    if (g1Var3.Q) {
                                        Runnable runnable = g1Var3.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        a1 a1Var = new a1(g1Var3, 11);
                                        g1Var3.S = a1Var;
                                        org.telegram.messenger.g0.i3(a1Var, g1Var3.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                g1 g1Var4 = g1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var4.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var4.L))) {
                                            if (g1Var4.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance2 = g1Var4.F;
                                                Objects.requireNonNull(nativeInstance2);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                                                g1Var4.N.clear();
                                                g1Var4.F = null;
                                            }
                                            g1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        hp.s1(g1Var4.e).Y3(groupcall2.users, false);
                                        hp.s1(g1Var4.e).S3(groupcall2.chats, false);
                                        g1Var4.w = groupcall2.call;
                                        hs.f(g1Var4.e).k(hs.G2, Long.valueOf(g1Var4.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new a1(g1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new a1(g1Var4, 4));
                                        }
                                    }
                                    if (g1Var4.Q) {
                                        Runnable runnable2 = g1Var4.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        a1 a1Var2 = new a1(g1Var4, 10);
                                        g1Var4.R = a1Var2;
                                        org.telegram.messenger.g0.i3(a1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                g1 g1Var3 = this.b;
                int i16 = g1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i17 = 0;
                    hp.s1(i16).Y3(groupcall.users, false);
                    hp.s1(i16).S3(groupcall.chats, false);
                    if (g1Var3.F != null && !g1Var3.x) {
                        while (true) {
                            if (i17 < groupcall.participants.size()) {
                                if (org.telegram.messenger.m5.o(groupcall.participants.get(i17).peer) == g1Var3.b) {
                                    g1Var3.H = groupcall.participants.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant2 = g1Var3.H;
                        if (groupCallParticipant2 != null && (tL_groupCallParticipantVideo = groupCallParticipant2.video) != null) {
                            NativeInstance nativeInstance2 = g1Var3.F;
                            String str2 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d10 = g1.d(tL_groupCallParticipantVideo);
                            g1Var3.r(d10);
                            nativeInstance2.addIncomingVideoOutput(2, str2, d10, g1Var3.I, org.telegram.messenger.m5.o(g1Var3.H.peer));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new a1(g1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i18 = 1;
                final g1 g1Var4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ei.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                g1 g1Var32 = g1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i162 = g1Var32.e;
                                if (!g1Var32.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        hp.s1(i162).Y3(groupcall2.users, false);
                                        hp.s1(i162).S3(groupcall2.chats, false);
                                        g1Var32.w = groupcall2.call;
                                        hs.f(i162).k(hs.G2, Long.valueOf(g1Var32.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new a1(g1Var32, 4));
                                    }
                                    if (g1Var32.Q) {
                                        Runnable runnable = g1Var32.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        a1 a1Var = new a1(g1Var32, 11);
                                        g1Var32.S = a1Var;
                                        org.telegram.messenger.g0.i3(a1Var, g1Var32.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                g1 g1Var42 = g1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var42.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var42.L))) {
                                            if (g1Var42.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance22 = g1Var42.F;
                                                Objects.requireNonNull(nativeInstance22);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance22, 3));
                                                g1Var42.N.clear();
                                                g1Var42.F = null;
                                            }
                                            g1Var42.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        hp.s1(g1Var42.e).Y3(groupcall22.users, false);
                                        hp.s1(g1Var42.e).S3(groupcall22.chats, false);
                                        g1Var42.w = groupcall22.call;
                                        hs.f(g1Var42.e).k(hs.G2, Long.valueOf(g1Var42.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new a1(g1Var42, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new a1(g1Var42, 4));
                                        }
                                    }
                                    if (g1Var42.Q) {
                                        Runnable runnable2 = g1Var42.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        a1 a1Var2 = new a1(g1Var42, 10);
                                        g1Var42.R = a1Var2;
                                        org.telegram.messenger.g0.i3(a1Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                g1 g1Var5 = this.b;
                int i19 = g1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.h3(new a1(g1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    hp.s1(i19).Y3(updates2.users, false);
                    hp.s1(i19).S3(updates2.chats, false);
                    hp.s1(i19).O3(updates2, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                g1 g1Var6 = this.b;
                if (!z11) {
                    g1Var6.getClass();
                    break;
                } else {
                    hp.s1(g1Var6.e).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
