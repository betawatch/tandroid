package ii;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.r31;
import org.telegram.ui.an;
import org.telegram.ui.v91;
import r0.h1;
import r0.k1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements a20, r0.m, b20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ u(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        h1 h1Var = k1Var.a;
        i0.b f10 = h1Var.f(527);
        d0 d0Var = this.b;
        d0Var.K1 = f10;
        d0Var.L1 = h1Var.f(519);
        d0Var.w1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.K1.b, d0Var.K1.d, false);
        d0Var.y1.invalidate();
        return k1.b;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        long j3;
        boolean z10;
        boolean z11;
        int i7 = d0.M1;
        Object obj = r31Var.G;
        boolean z12 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.b;
        boolean z13 = true;
        if (!z12) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j10 = user.id;
                boolean t6 = t10.t(user);
                TLRPC.Chat chat = d0Var.m1;
                z9 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                j3 = j10;
                z10 = t6;
                z11 = false;
            }
            z13 = false;
            return Boolean.valueOf(z13);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j11 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = d0Var.m1;
        z9 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        j3 = j11;
        z11 = V;
        z10 = false;
        if (z9) {
            k60 F = k60.F(d0Var.c, null, view);
            F.c(R.drawable.msg_cancel, hd.M0(2131751915, null), new m(d0Var, z10, z11, j3, 1), true);
            F.W(d0Var.r1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z13);
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7 = this.a;
        d0 d0Var = this.b;
        switch (i7) {
            case 0:
                d0Var.L0((r31) obj);
                break;
            case 1:
            default:
                int i10 = d0.M1;
                d0Var.I0((r31) obj);
                break;
            case 2:
                int i11 = d0.M1;
                d0Var.L0((r31) obj);
                break;
            case 3:
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                f2 f2Var = d0Var.q1;
                if (!d0Var.I0(r31Var)) {
                    int i12 = r31Var.d;
                    boolean z9 = false;
                    if (i12 != 101) {
                        if (i12 != 100) {
                            Object obj3 = r31Var.G;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z9 = t3.V(chat2);
                                j3 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = m0.b(d0Var.a, j3);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        k5.o(null, z9 ? 2131751930 : 2131751927, new hc((FrameLayout) d0Var.b, d0Var.I0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    b70 b70Var = new b70(d0Var.getContext(), chat, null, d0Var.q1, d0Var.I0);
                                    b70Var.p1 = new hc((FrameLayout) d0Var.b, d0Var.I0);
                                    b70Var.show();
                                    break;
                                }
                            } else {
                                if (f2Var instanceof an) {
                                    an anVar = (an) f2Var;
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
                                    f2Var.presentFragment(new an(bundle));
                                } else if (t3.a(chat)) {
                                    an anVar2 = new an(bundle);
                                    qg.d.a(anVar2, xr.a(j3, qp.s1(d0Var.a).e7.getLong(p0.o(chat.id, "forumlasttopic"), 1L)));
                                    f2Var.presentFragment(anVar2);
                                } else {
                                    f2Var.presentFragment(new v91(bundle));
                                }
                                d0Var.dismiss();
                                break;
                            }
                        } else {
                            d0Var.k1.E(1);
                            d0Var.D1.e();
                            break;
                        }
                    } else {
                        d0Var.n1 = !d0Var.n1;
                        qp.s1(d0Var.a).e5(d0Var.l1, d0Var.n1);
                        if (!(view instanceof q8)) {
                            d0Var.r1.d.f3.O(false);
                            break;
                        } else {
                            ((q8) view).getCheckBox().c(d0Var.n1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
