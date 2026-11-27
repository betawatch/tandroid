// default package

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mo2 implements ncc, nr7, occ {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xo2 b;

    public /* synthetic */ mo2(xo2 xo2Var, byte b) {
        this.a = b;
        this.b = xo2Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        i2d i2dVar = l2dVar.a;
        mq5 f = i2dVar.f(527);
        xo2 xo2Var = this.b;
        xo2Var.N1 = f;
        xo2Var.O1 = i2dVar.f(519);
        xo2Var.z1.j(hl.L(56.0f) + xo2Var.N1.b, xo2Var.N1.d, false);
        xo2Var.B1.invalidate();
        return l2d.b;
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        int i = xo2.P1;
        Object obj = b8cVar.H;
        boolean z4 = obj instanceof TLRPC.Chat;
        xo2 xo2Var = this.b;
        boolean z5 = true;
        if (!z4) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j2 = user.id;
                boolean v = lbc.v(user);
                TLRPC.Chat chat = xo2Var.p1;
                z = chat != null && ((user.bot && user.bot_can_edit) || xc2.y(27, chat));
                j = j2;
                z2 = v;
                z3 = false;
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        long j3 = -chat2.id;
        boolean V = xc2.V(chat2);
        TLRPC.Chat chat3 = xo2Var.p1;
        z = chat3 != null && (chat2.creator || xc2.y(27, chat3));
        j = j3;
        z3 = V;
        z2 = false;
        if (z) {
            fu5 G = fu5.G(xo2Var.c, null, view);
            G.b(R.drawable.msg_cancel, ob6.M0(2131751880, null), new cm1(xo2Var, z2, z3, j, (byte) 2), true);
            G.X(xo2Var.u1.d.W0(view, true));
            G.a0();
            return Boolean.valueOf(z5);
        }
        z5 = false;
        return Boolean.valueOf(z5);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j;
        TLRPC.Chat chat;
        byte b = this.a;
        xo2 xo2Var = this.b;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        switch (b) {
            case 0:
                xo2Var.H0(b8cVar);
                break;
            case 1:
            default:
                int i = xo2.P1;
                xo2Var.E0(b8cVar);
                break;
            case 2:
                int i2 = xo2.P1;
                xo2Var.H0(b8cVar);
                break;
            case 3:
                int i3 = xo2.P1;
                e eVar = xo2Var.t1;
                if (!xo2Var.E0(b8cVar)) {
                    int i4 = b8cVar.d;
                    boolean z = false;
                    if (i4 != 101) {
                        if (i4 != 100) {
                            Object obj3 = b8cVar.H;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                                z = xc2.V(chat2);
                                j = -chat2.id;
                                chat = chat2;
                            } else if (obj3 instanceof TLRPC.User) {
                                j = ((TLRPC.User) obj3).id;
                                chat = null;
                            }
                            int b2 = gp2.b(xo2Var.a, j);
                            if (b2 != 1 && b2 != 2) {
                                if (b2 != 3) {
                                    if (b2 == 4) {
                                        bs2.v(null, z ? 2131751895 : 2131751892, new d31((FrameLayout) xo2Var.b, xo2Var.J0), R.raw.e_hand_2, 36);
                                        break;
                                    }
                                } else {
                                    jw5 jw5Var = new jw5(xo2Var.getContext(), chat, null, xo2Var.t1, xo2Var.J0);
                                    jw5Var.s1 = new d31((FrameLayout) xo2Var.b, xo2Var.J0);
                                    jw5Var.show();
                                    break;
                                }
                            } else {
                                if (eVar instanceof zu1) {
                                    zu1 zu1Var = (zu1) eVar;
                                    TLRPC.Chat chat3 = zu1Var.e;
                                    TLRPC.User h = zu1Var.h();
                                    if ((chat3 != null && chat3.id == (-j)) || (h != null && h.id == j)) {
                                        xo2Var.dismiss();
                                        break;
                                    }
                                }
                                Bundle bundle = new Bundle();
                                if (j > 0) {
                                    bundle.putLong("user_id", j);
                                } else {
                                    bundle.putLong("chat_id", -j);
                                }
                                if (!xc2.c0(chat)) {
                                    eVar.presentFragment(new zu1(bundle));
                                } else if (xc2.a(chat)) {
                                    zu1 zu1Var2 = new zu1(bundle);
                                    ro4.a(zu1Var2, if7.a(j, uc7.s1(xo2Var.a).X3.getLong(qu6.n(chat.id, "forumlasttopic"), 1L)));
                                    eVar.presentFragment(zu1Var2);
                                } else {
                                    eVar.presentFragment(new tzb(bundle));
                                }
                                xo2Var.dismiss();
                                break;
                            }
                        } else {
                            xo2Var.n1.F(1);
                            xo2Var.G1.e();
                            break;
                        }
                    } else {
                        xo2Var.q1 = !xo2Var.q1;
                        uc7.s1(xo2Var.a).s5(xo2Var.o1, xo2Var.q1);
                        if (!(view instanceof vkb)) {
                            xo2Var.u1.d.g3.O(false);
                            break;
                        } else {
                            ((vkb) view).getCheckBox().c(xo2Var.q1, true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
