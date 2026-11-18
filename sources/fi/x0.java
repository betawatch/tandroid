package fi;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final c1 c1Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: fi.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = c1Var2.e;
                                if (!c1Var2.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        mp.u1(i10).f4(groupcall.users, false);
                                        mp.u1(i10).Z3(groupcall.chats, false);
                                        c1Var2.w = groupcall.call;
                                        ks.f(i10).k(ks.G2, Long.valueOf(c1Var2.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.g3(new w0(c1Var2, 4));
                                    }
                                    if (c1Var2.Q) {
                                        Runnable runnable = c1Var2.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        w0 w0Var = new w0(c1Var2, 11);
                                        c1Var2.S = w0Var;
                                        org.telegram.messenger.g0.h3(w0Var, c1Var2.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                c1 c1Var3 = c1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!c1Var3.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(c1Var3.L))) {
                                            if (c1Var3.F != null) {
                                                org.telegram.messenger.q5 q5Var = Utilities.e;
                                                NativeInstance nativeInstance = c1Var3.F;
                                                Objects.requireNonNull(nativeInstance);
                                                q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                                                c1Var3.N.clear();
                                                c1Var3.F = null;
                                            }
                                            c1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        mp.u1(c1Var3.e).f4(groupcall2.users, false);
                                        mp.u1(c1Var3.e).Z3(groupcall2.chats, false);
                                        c1Var3.w = groupcall2.call;
                                        ks.f(c1Var3.e).k(ks.G2, Long.valueOf(c1Var3.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.g3(new w0(c1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.g3(new w0(c1Var3, 4));
                                        }
                                    }
                                    if (c1Var3.Q) {
                                        Runnable runnable2 = c1Var3.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        w0 w0Var2 = new w0(c1Var3, 10);
                                        c1Var3.R = w0Var2;
                                        org.telegram.messenger.g0.h3(w0Var2, 4000L);
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
                c1 c1Var2 = this.b;
                if (!z10) {
                    c1Var2.getClass();
                    break;
                } else {
                    mp.u1(c1Var2.e).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 2:
                c1 c1Var3 = this.b;
                int i10 = c1Var3.e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i11 = 0;
                    mp.u1(i10).f4(groupcall.users, false);
                    mp.u1(i10).Z3(groupcall.chats, false);
                    if (c1Var3.F != null && !c1Var3.x) {
                        while (true) {
                            if (i11 < groupcall.participants.size()) {
                                if (org.telegram.messenger.n5.o(groupcall.participants.get(i11).peer) == c1Var3.b) {
                                    c1Var3.H = groupcall.participants.get(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = c1Var3.H;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = c1Var3.F;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = c1.d(tL_groupCallParticipantVideo);
                            c1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, c1Var3.I, org.telegram.messenger.n5.o(c1Var3.H.peer));
                            break;
                        } else {
                            org.telegram.messenger.g0.g3(new w0(c1Var3, 7));
                            break;
                        }
                    }
                }
                break;
            case 3:
                final int i12 = 1;
                final c1 c1Var4 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: fi.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c1 c1Var22 = c1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = c1Var22.e;
                                if (!c1Var22.x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        mp.u1(i102).f4(groupcall2.users, false);
                                        mp.u1(i102).Z3(groupcall2.chats, false);
                                        c1Var22.w = groupcall2.call;
                                        ks.f(i102).k(ks.G2, Long.valueOf(c1Var22.w.id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.g3(new w0(c1Var22, 4));
                                    }
                                    if (c1Var22.Q) {
                                        Runnable runnable = c1Var22.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        w0 w0Var = new w0(c1Var22, 11);
                                        c1Var22.S = w0Var;
                                        org.telegram.messenger.g0.h3(w0Var, c1Var22.l() ? 5000 : 20000);
                                        break;
                                    }
                                }
                                break;
                            default:
                                c1 c1Var32 = c1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!c1Var32.x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(c1Var32.L))) {
                                            if (c1Var32.F != null) {
                                                org.telegram.messenger.q5 q5Var = Utilities.e;
                                                NativeInstance nativeInstance2 = c1Var32.F;
                                                Objects.requireNonNull(nativeInstance2);
                                                q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                                                c1Var32.N.clear();
                                                c1Var32.F = null;
                                            }
                                            c1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        mp.u1(c1Var32.e).f4(groupcall22.users, false);
                                        mp.u1(c1Var32.e).Z3(groupcall22.chats, false);
                                        c1Var32.w = groupcall22.call;
                                        ks.f(c1Var32.e).k(ks.G2, Long.valueOf(c1Var32.w.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.g3(new w0(c1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.g3(new w0(c1Var32, 4));
                                        }
                                    }
                                    if (c1Var32.Q) {
                                        Runnable runnable2 = c1Var32.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        w0 w0Var2 = new w0(c1Var32, 10);
                                        c1Var32.R = w0Var2;
                                        org.telegram.messenger.g0.h3(w0Var2, 4000L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                c1 c1Var5 = this.b;
                int i13 = c1Var5.e;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.g3(new w0(c1Var5, 4));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(i13).f4(updates.users, false);
                    mp.u1(i13).Z3(updates.chats, false);
                    mp.u1(i13).V3(updates, false);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                c1 c1Var6 = this.b;
                if (!z11) {
                    c1Var6.getClass();
                    break;
                } else {
                    mp.u1(c1Var6.e).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
        }
    }
}
