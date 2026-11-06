package di;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ y0(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final g1 g1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                g1 g1Var2 = g1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = g1Var2.e;
                                if (!g1Var2.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        qp.s1(i10).Y3(groupcall.users, false);
                                        qp.s1(i10).S3(groupcall.chats, false);
                                        g1Var2.w = groupcall.call;
                                        qs.f(i10).k(qs.G2, Long.valueOf(g1Var2.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(g1Var2, 4));
                                    }
                                    if (g1Var2.P) {
                                        Runnable runnable = g1Var2.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(g1Var2, 11);
                                        g1Var2.R = x0Var;
                                        org.telegram.messenger.g0.i3(x0Var, g1Var2.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                g1 g1Var3 = g1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var3.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var3.K))) {
                                            if (g1Var3.E != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance = g1Var3.E;
                                                Objects.requireNonNull(nativeInstance);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                                                g1Var3.M.clear();
                                                g1Var3.E = null;
                                            }
                                            g1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        qp.s1(g1Var3.e).Y3(groupcall2.users, false);
                                        qp.s1(g1Var3.e).S3(groupcall2.chats, false);
                                        g1Var3.w = groupcall2.call;
                                        qs.f(g1Var3.e).k(qs.G2, Long.valueOf(g1Var3.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(g1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(g1Var3, 4));
                                        }
                                    }
                                    if (g1Var3.P) {
                                        Runnable runnable2 = g1Var3.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(g1Var3, 10);
                                        g1Var3.Q = x0Var2;
                                        org.telegram.messenger.g0.i3(x0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                boolean z9 = tLObject instanceof TLRPC.Updates;
                g1 g1Var2 = this.b;
                if (!z9) {
                    g1Var2.getClass();
                    break;
                } else {
                    qp.s1(g1Var2.e).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 2:
                g1 g1Var3 = this.b;
                int i10 = g1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i11 = 0;
                    qp.s1(i10).Y3(groupcall.users, false);
                    qp.s1(i10).S3(groupcall.chats, false);
                    if (g1Var3.E != null && !g1Var3.x) {
                        while (true) {
                            if (i11 < groupcall.participants.size()) {
                                if (org.telegram.messenger.m5.o(groupcall.participants.get(i11).peer) == g1Var3.b) {
                                    g1Var3.G = groupcall.participants.get(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = g1Var3.G;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = g1Var3.E;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                            g1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, g1Var3.H, org.telegram.messenger.m5.o(g1Var3.G.peer));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new x0(g1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i12 = 1;
                final g1 g1Var4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                g1 g1Var22 = g1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = g1Var22.e;
                                if (!g1Var22.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        qp.s1(i102).Y3(groupcall2.users, false);
                                        qp.s1(i102).S3(groupcall2.chats, false);
                                        g1Var22.w = groupcall2.call;
                                        qs.f(i102).k(qs.G2, Long.valueOf(g1Var22.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(g1Var22, 4));
                                    }
                                    if (g1Var22.P) {
                                        Runnable runnable = g1Var22.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(g1Var22, 11);
                                        g1Var22.R = x0Var;
                                        org.telegram.messenger.g0.i3(x0Var, g1Var22.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                g1 g1Var32 = g1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var32.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var32.K))) {
                                            if (g1Var32.E != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance2 = g1Var32.E;
                                                Objects.requireNonNull(nativeInstance2);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                                                g1Var32.M.clear();
                                                g1Var32.E = null;
                                            }
                                            g1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        qp.s1(g1Var32.e).Y3(groupcall22.users, false);
                                        qp.s1(g1Var32.e).S3(groupcall22.chats, false);
                                        g1Var32.w = groupcall22.call;
                                        qs.f(g1Var32.e).k(qs.G2, Long.valueOf(g1Var32.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(g1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(g1Var32, 4));
                                        }
                                    }
                                    if (g1Var32.P) {
                                        Runnable runnable2 = g1Var32.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(g1Var32, 10);
                                        g1Var32.Q = x0Var2;
                                        org.telegram.messenger.g0.i3(x0Var2, 4000L);
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
                int i13 = g1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.h3(new x0(g1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(i13).Y3(updates.users, false);
                    qp.s1(i13).S3(updates.chats, false);
                    qp.s1(i13).O3(updates, false);
                    break;
                }
                break;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                g1 g1Var6 = this.b;
                if (!z10) {
                    g1Var6.getClass();
                    break;
                } else {
                    qp.s1(g1Var6.e).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
