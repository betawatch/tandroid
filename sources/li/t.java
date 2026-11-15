package li;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import r0.h1;
import r0.k1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements x10, r0.m, y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ t(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // r0.m
    public k1 M0(View view, k1 k1Var) {
        h1 h1Var = k1Var.a;
        i0.c f10 = h1Var.f(527);
        d0 d0Var = this.b;
        d0Var.O1 = f10;
        d0Var.P1 = h1Var.f(519);
        d0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.O1.b, d0Var.O1.d, false);
        d0Var.C1.invalidate();
        return k1.b;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = d0.Q1;
        Object obj = b41Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j10 = user.id;
                boolean t6 = q10.t(user);
                TLRPC.Chat chat = d0Var.q1;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                j3 = j10;
                z11 = t6;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j11 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = d0Var.q1;
        z10 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        j3 = j11;
        z12 = V;
        z11 = false;
        if (z10) {
            m60 F = m60.F(d0Var.c, null, view);
            F.c(R.drawable.msg_cancel, hd.M0(2131751915, null), new k(d0Var, z11, z12, j3, 1), true);
            F.W(d0Var.v1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7 = this.a;
        d0 d0Var = this.b;
        switch (i7) {
            case 0:
                d0Var.L0((b41) obj);
                break;
            case 1:
            default:
                int i10 = d0.Q1;
                d0Var.I0((b41) obj);
                break;
            case 2:
                int i11 = d0.Q1;
                d0Var.L0((b41) obj);
                break;
            case 3:
                b41 b41Var = (b41) obj;
                View view = (View) obj2;
                e2 e2Var = d0Var.u1;
                if (!d0Var.I0(b41Var)) {
                    int i12 = b41Var.d;
                    boolean z10 = false;
                    if (i12 != 101) {
                        if (i12 != 100) {
                            Object obj3 = b41Var.G;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = t3.V(chat2);
                                j3 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = l0.b(d0Var.a, j3);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        k5.n(null, z10 ? 2131751930 : 2131751927, new cc((FrameLayout) d0Var.b, d0Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    e70 e70Var = new e70(d0Var.getContext(), chat, null, d0Var.u1, d0Var.J0);
                                    e70Var.t1 = new cc((FrameLayout) d0Var.b, d0Var.J0);
                                    e70Var.show();
                                    break;
                                }
                            } else {
                                if (e2Var instanceof an) {
                                    an anVar = (an) e2Var;
                                    TLRPC.Chat chat3 = anVar.e;
                                    TLRPC.User j10 = anVar.j();
                                    if ((chat3 != null && chat3.id == (-j3)) || (j10 != null && j10.id == j3)) {
                                        d0Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j3 > 0) {
                                    bundle.putLong("user_id", j3);
                                } else {
                                    bundle.putLong("chat_id", -j3);
                                }
                                if (!t3.c0(chat)) {
                                    e2Var.presentFragment(new an(bundle));
                                } else if (t3.a(chat)) {
                                    an anVar2 = new an(bundle);
                                    qg.c.a(anVar2, ur.a(j3, np.s1(d0Var.a).f7.getLong(p0.o(chat.id, "forumlasttopic"), 1L)));
                                    e2Var.presentFragment(anVar2);
                                } else {
                                    e2Var.presentFragment(new u91(bundle));
                                }
                                d0Var.dismiss();
                                break;
                            }
                        } else {
                            d0Var.o1.C(1);
                            d0Var.H1.e();
                            break;
                        }
                    } else {
                        d0Var.r1 = !d0Var.r1;
                        np.s1(d0Var.a).f5(d0Var.p1, d0Var.r1);
                        if (!(view instanceof p8)) {
                            d0Var.v1.d.g3.O(false);
                            break;
                        } else {
                            ((p8) view).getCheckBox().c(d0Var.r1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
