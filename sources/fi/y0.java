package fi;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ y0(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final e1 e1Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                e1 e1Var2 = e1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = e1Var2.e;
                                if (!e1Var2.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        np.s1(i10).Y3(groupcall.users, false);
                                        np.s1(i10).S3(groupcall.chats, false);
                                        e1Var2.w = groupcall.call;
                                        ns.f(i10).k(ns.G2, Long.valueOf(e1Var2.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(e1Var2, 4));
                                    }
                                    if (e1Var2.Q) {
                                        Runnable runnable = e1Var2.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(e1Var2, 11);
                                        e1Var2.S = x0Var;
                                        org.telegram.messenger.g0.i3(x0Var, e1Var2.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e1 e1Var3 = e1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var3.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var3.L))) {
                                            if (e1Var3.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance = e1Var3.F;
                                                Objects.requireNonNull(nativeInstance);
                                                p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                                                e1Var3.N.clear();
                                                e1Var3.F = null;
                                            }
                                            e1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        np.s1(e1Var3.e).Y3(groupcall2.users, false);
                                        np.s1(e1Var3.e).S3(groupcall2.chats, false);
                                        e1Var3.w = groupcall2.call;
                                        ns.f(e1Var3.e).k(ns.G2, Long.valueOf(e1Var3.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(e1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(e1Var3, 4));
                                        }
                                    }
                                    if (e1Var3.Q) {
                                        Runnable runnable2 = e1Var3.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(e1Var3, 10);
                                        e1Var3.R = x0Var2;
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
                boolean z10 = tLObject instanceof TLRPC.Updates;
                e1 e1Var2 = this.b;
                if (!z10) {
                    e1Var2.getClass();
                    break;
                } else {
                    np.s1(e1Var2.e).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 2:
                e1 e1Var3 = this.b;
                int i10 = e1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i11 = 0;
                    np.s1(i10).Y3(groupcall.users, false);
                    np.s1(i10).S3(groupcall.chats, false);
                    if (e1Var3.F != null && !e1Var3.x) {
                        while (true) {
                            if (i11 < groupcall.participants.size()) {
                                if (org.telegram.messenger.m5.o(groupcall.participants.get(i11).peer) == e1Var3.b) {
                                    e1Var3.H = groupcall.participants.get(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = e1Var3.H;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = e1Var3.F;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo);
                            e1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, e1Var3.I, org.telegram.messenger.m5.o(e1Var3.H.peer));
                            break;
                        } else {
                            org.telegram.messenger.g0.h3(new x0(e1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i12 = 1;
                final e1 e1Var4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e1 e1Var22 = e1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = e1Var22.e;
                                if (!e1Var22.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        np.s1(i102).Y3(groupcall2.users, false);
                                        np.s1(i102).S3(groupcall2.chats, false);
                                        e1Var22.w = groupcall2.call;
                                        ns.f(i102).k(ns.G2, Long.valueOf(e1Var22.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(e1Var22, 4));
                                    }
                                    if (e1Var22.Q) {
                                        Runnable runnable = e1Var22.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(e1Var22, 11);
                                        e1Var22.S = x0Var;
                                        org.telegram.messenger.g0.i3(x0Var, e1Var22.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                e1 e1Var32 = e1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var32.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var32.L))) {
                                            if (e1Var32.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.e;
                                                NativeInstance nativeInstance2 = e1Var32.F;
                                                Objects.requireNonNull(nativeInstance2);
                                                p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                                                e1Var32.N.clear();
                                                e1Var32.F = null;
                                            }
                                            e1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        np.s1(e1Var32.e).Y3(groupcall22.users, false);
                                        np.s1(e1Var32.e).S3(groupcall22.chats, false);
                                        e1Var32.w = groupcall22.call;
                                        ns.f(e1Var32.e).k(ns.G2, Long.valueOf(e1Var32.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(e1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(e1Var32, 4));
                                        }
                                    }
                                    if (e1Var32.Q) {
                                        Runnable runnable2 = e1Var32.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(e1Var32, 10);
                                        e1Var32.R = x0Var2;
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
                e1 e1Var5 = this.b;
                int i13 = e1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.h3(new x0(e1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(i13).Y3(updates.users, false);
                    np.s1(i13).S3(updates.chats, false);
                    np.s1(i13).O3(updates, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                e1 e1Var6 = this.b;
                if (!z11) {
                    e1Var6.getClass();
                    break;
                } else {
                    np.s1(e1Var6.e).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
