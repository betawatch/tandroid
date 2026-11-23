package li;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
import org.telegram.ui.w91;
import r0.i1;
import r0.l1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements u10, r0.m, v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ t(c0 c0Var, int i7) {
        this.a = i7;
        this.b = c0Var;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = c0.Q1;
        Object obj = n41Var.H;
        boolean z13 = obj instanceof TLRPC.Chat;
        c0 c0Var = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j10 = user.id;
                boolean u10 = n10.u(user);
                TLRPC.Chat chat = c0Var.q1;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || v3.y(27, chat));
                j3 = j10;
                z11 = u10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j11 = -chat2.id;
        boolean V = v3.V(chat2);
        TLRPC.Chat chat3 = c0Var.q1;
        z10 = chat3 != null && (chat2.creator || v3.y(27, chat3));
        j3 = j11;
        z12 = V;
        z11 = false;
        if (z10) {
            x60 G = x60.G(c0Var.c, null, view);
            G.c(R.drawable.msg_cancel, gd.N0(2131751903, null), new l(c0Var, z11, z12, j3, 1), true);
            G.X(c0Var.v1.d.U0(view, true));
            G.a0();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7 = this.a;
        c0 c0Var = this.b;
        switch (i7) {
            case 0:
                c0Var.M0((n41) obj);
                break;
            case 1:
            default:
                int i10 = c0.Q1;
                c0Var.J0((n41) obj);
                break;
            case 2:
                int i11 = c0.Q1;
                c0Var.M0((n41) obj);
                break;
            case 3:
                n41 n41Var = (n41) obj;
                View view = (View) obj2;
                g2 g2Var = c0Var.u1;
                if (!c0Var.J0(n41Var)) {
                    int i12 = n41Var.d;
                    boolean z10 = false;
                    if (i12 != 101) {
                        if (i12 != 100) {
                            Object obj3 = n41Var.H;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = v3.V(chat2);
                                j3 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = k0.b(c0Var.a, j3);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        f3.n(null, z10 ? 2131751918 : 2131751915, new kc((FrameLayout) c0Var.b, c0Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    o70 o70Var = new o70(c0Var.getContext(), chat, null, c0Var.u1, c0Var.J0);
                                    o70Var.t1 = new kc((FrameLayout) c0Var.b, c0Var.J0);
                                    o70Var.show();
                                    break;
                                }
                            } else {
                                if (g2Var instanceof bn) {
                                    bn bnVar = (bn) g2Var;
                                    TLRPC.Chat chat3 = bnVar.e;
                                    TLRPC.User j10 = bnVar.j();
                                    if ((chat3 != null && chat3.id == (-j3)) || (j10 != null && j10.id == j3)) {
                                        c0Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j3 > 0) {
                                    bundle.putLong("user_id", j3);
                                } else {
                                    bundle.putLong("chat_id", -j3);
                                }
                                if (!v3.c0(chat)) {
                                    g2Var.presentFragment(new bn(bundle));
                                } else if (v3.a(chat)) {
                                    bn bnVar2 = new bn(bundle);
                                    qg.c.a(bnVar2, sr.a(j3, mp.u1(c0Var.a).h7.getLong(p0.o(chat.id, "forumlasttopic"), 1L)));
                                    g2Var.presentFragment(bnVar2);
                                } else {
                                    g2Var.presentFragment(new w91(bundle));
                                }
                                c0Var.dismiss();
                                break;
                            }
                        } else {
                            c0Var.o1.C(1);
                            c0Var.H1.e();
                            break;
                        }
                    } else {
                        c0Var.r1 = !c0Var.r1;
                        mp.u1(c0Var.a).q5(c0Var.p1, c0Var.r1);
                        if (!(view instanceof q8)) {
                            c0Var.v1.d.g3.O(false);
                            break;
                        } else {
                            ((q8) view).getCheckBox().c(c0Var.r1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // r0.m
    public l1 l1(View view, l1 l1Var) {
        i1 i1Var = l1Var.a;
        i0.b f10 = i1Var.f(527);
        c0 c0Var = this.b;
        c0Var.O1 = f10;
        c0Var.P1 = i1Var.f(519);
        c0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + c0Var.O1.b, c0Var.O1.d, false);
        c0Var.C1.invalidate();
        return l1.b;
    }
}
