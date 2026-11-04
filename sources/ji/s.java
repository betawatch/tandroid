package ji;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.x60;
import org.telegram.ui.m91;
import org.telegram.ui.wm;
import r0.h1;
import r0.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements s10, r0.m, t10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ s(b0 b0Var, int i3) {
        this.a = i3;
        this.b = b0Var;
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        h1 h1Var = k1Var.a;
        i0.b f10 = h1Var.f(527);
        b0 b0Var = this.b;
        b0Var.L1 = f10;
        b0Var.M1 = h1Var.f(519);
        b0Var.x1.j(org.telegram.messenger.g0.L(56.0f) + b0Var.L1.b, b0Var.L1.d, false);
        b0Var.z1.invalidate();
        return k1.b;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i3 = b0.N1;
        Object obj = r31Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        b0 b0Var = this.b;
        boolean z14 = true;
        if (!z13) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j11 = user.id;
                boolean t10 = l10.t(user);
                TLRPC.Chat chat = b0Var.n1;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                j10 = j11;
                z11 = t10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j12 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = b0Var.n1;
        z10 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        j10 = j12;
        z12 = V;
        z11 = false;
        if (z10) {
            f60 F = f60.F(b0Var.c, null, view);
            F.c(R.drawable.msg_cancel, bd.M0(2131751915, null), new k(b0Var, z11, z12, j10, 1), true);
            F.W(b0Var.s1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j10;
        TLRPC.Chat chat;
        int i3 = this.a;
        b0 b0Var = this.b;
        switch (i3) {
            case 0:
                b0Var.L0((r31) obj);
                break;
            case 1:
            default:
                int i10 = b0.N1;
                b0Var.I0((r31) obj);
                break;
            case 2:
                int i11 = b0.N1;
                b0Var.L0((r31) obj);
                break;
            case 3:
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                d2 d2Var = b0Var.r1;
                if (!b0Var.I0(r31Var)) {
                    int i12 = r31Var.d;
                    boolean z10 = false;
                    if (i12 != 101) {
                        if (i12 != 100) {
                            Object obj3 = r31Var.G;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z10 = t3.V(chat2);
                                j10 = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b10 = j0.b(b0Var.a, j10);
                            if (b10 != 1 && b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 == 4) {
                                        k5.o(null, z10 ? 2131751930 : 2131751927, new fc((FrameLayout) b0Var.b, b0Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    x60 x60Var = new x60(b0Var.getContext(), chat, null, b0Var.r1, b0Var.J0);
                                    x60Var.q1 = new fc((FrameLayout) b0Var.b, b0Var.J0);
                                    x60Var.show();
                                    break;
                                }
                            } else {
                                if (d2Var instanceof wm) {
                                    wm wmVar = (wm) d2Var;
                                    TLRPC.Chat chat3 = wmVar.e;
                                    TLRPC.User j11 = wmVar.j();
                                    if ((chat3 != null && chat3.id == (-j10)) || (j11 != null && j11.id == j10)) {
                                        b0Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j10 > 0) {
                                    bundle.putLong("user_id", j10);
                                } else {
                                    bundle.putLong("chat_id", -j10);
                                }
                                if (!t3.c0(chat)) {
                                    d2Var.presentFragment(new wm(bundle));
                                } else if (t3.a(chat)) {
                                    wm wmVar2 = new wm(bundle);
                                    rg.c.a(wmVar2, pr.a(j10, hp.s1(b0Var.a).e7.getLong(a1.g.p(chat.id, "forumlasttopic"), 1L)));
                                    d2Var.presentFragment(wmVar2);
                                } else {
                                    d2Var.presentFragment(new m91(bundle));
                                }
                                b0Var.dismiss();
                                break;
                            }
                        } else {
                            b0Var.l1.D(1);
                            b0Var.E1.e();
                            break;
                        }
                    } else {
                        b0Var.o1 = !b0Var.o1;
                        hp.s1(b0Var.a).e5(b0Var.m1, b0Var.o1);
                        if (!(view instanceof p8)) {
                            b0Var.s1.d.g3.O(false);
                            break;
                        } else {
                            ((p8) view).getCheckBox().c(b0Var.o1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
