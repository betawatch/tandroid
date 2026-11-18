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
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.v10;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.y91;
import r0.i1;
import r0.l1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements v10, r0.m, w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ u(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // r0.m
    public l1 P0(View view, l1 l1Var) {
        i1 i1Var = l1Var.a;
        i0.b f10 = i1Var.f(527);
        d0 d0Var = this.b;
        d0Var.O1 = f10;
        d0Var.P1 = i1Var.f(519);
        d0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.O1.b, d0Var.O1.d, false);
        d0Var.C1.invalidate();
        return l1.b;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = d0.Q1;
        Object obj = l41Var.H;
        boolean z13 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j10 = user.id;
                boolean u10 = o10.u(user);
                TLRPC.Chat chat = d0Var.q1;
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
        TLRPC.Chat chat3 = d0Var.q1;
        z10 = chat3 != null && (chat2.creator || v3.y(27, chat3));
        j3 = j11;
        z12 = V;
        z11 = false;
        if (z10) {
            y60 G = y60.G(d0Var.c, null, view);
            G.c(R.drawable.msg_cancel, gd.M0(2131751904, null), new m(d0Var, z11, z12, j3, 1), true);
            G.X(d0Var.v1.d.U0(view, true));
            G.a0();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7 = this.a;
        d0 d0Var = this.b;
        switch (i7) {
            case 0:
                d0Var.M0((l41) obj);
                break;
            case 1:
            default:
                int i10 = d0.Q1;
                d0Var.J0((l41) obj);
                break;
            case 2:
                int i11 = d0.Q1;
                d0Var.M0((l41) obj);
                break;
            case 3:
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                h2 h2Var = d0Var.u1;
                if (!d0Var.J0(l41Var)) {
                    int i12 = l41Var.d;
                    boolean z10 = false;
                    if (i12 != 101) {
                        if (i12 != 100) {
                            Object obj3 = l41Var.H;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = v3.V(chat2);
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
                                        f3.n(null, z10 ? 2131751919 : 2131751916, new lc((FrameLayout) d0Var.b, d0Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    p70 p70Var = new p70(d0Var.getContext(), chat, null, d0Var.u1, d0Var.J0);
                                    p70Var.t1 = new lc((FrameLayout) d0Var.b, d0Var.J0);
                                    p70Var.show();
                                    break;
                                }
                            } else {
                                if (h2Var instanceof bn) {
                                    bn bnVar = (bn) h2Var;
                                    TLRPC.Chat chat3 = bnVar.e;
                                    TLRPC.User j10 = bnVar.j();
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
                                if (!v3.c0(chat)) {
                                    h2Var.presentFragment(new bn(bundle));
                                } else if (v3.a(chat)) {
                                    bn bnVar2 = new bn(bundle);
                                    qg.c.a(bnVar2, sr.a(j3, mp.u1(d0Var.a).h7.getLong(p0.o(chat.id, "forumlasttopic"), 1L)));
                                    h2Var.presentFragment(bnVar2);
                                } else {
                                    h2Var.presentFragment(new y91(bundle));
                                }
                                d0Var.dismiss();
                                break;
                            }
                        } else {
                            d0Var.o1.A(1);
                            d0Var.H1.e();
                            break;
                        }
                    } else {
                        d0Var.r1 = !d0Var.r1;
                        mp.u1(d0Var.a).q5(d0Var.p1, d0Var.r1);
                        if (!(view instanceof r8)) {
                            d0Var.v1.d.g3.O(false);
                            break;
                        } else {
                            ((r8) view).getCheckBox().c(d0Var.r1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
