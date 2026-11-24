// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ld5 extends q59 {
    public final Context c;
    public final /* synthetic */ pd5 d;

    public ld5(pd5 pd5Var, Context context) {
        this.d = pd5Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        View view = u69Var.a;
        if ((view instanceof ij6) && this.d.Z1.contains(Long.valueOf(((ij6) view).getUserId()))) {
            return false;
        }
        int i = u69Var.f;
        return i == 0 || i == 1;
    }

    @Override // y59
    public final int b() {
        return this.d.l2;
    }

    @Override // y59
    public final int d(int i) {
        pd5 pd5Var = this.d;
        if (i >= pd5Var.e2 && i < pd5Var.f2) {
            return 0;
        }
        if (i >= pd5Var.h2 && i < pd5Var.i2) {
            return 0;
        }
        if (i == pd5Var.c2) {
            return 1;
        }
        if (i == pd5Var.j2 || i == pd5Var.g2) {
            return 2;
        }
        if (i == 0) {
            return 3;
        }
        if (i == pd5Var.d2) {
            return 4;
        }
        return i == pd5Var.k2 ? 5 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLObject tLObject;
        int i2;
        pd5 pd5Var = this.d;
        ArrayList arrayList = pd5Var.R1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 0) {
            ij6 ij6Var = (ij6) view;
            ij6Var.setTag(Integer.valueOf(i));
            int i4 = pd5Var.e2;
            if (i < i4 || i >= pd5Var.f2) {
                int i5 = pd5Var.h2;
                tLObject = (i < i5 || i >= pd5Var.i2) ? null : (TLObject) pd5Var.S1.get(i - i5);
            } else {
                tLObject = (TLObject) arrayList.get(i - i4);
            }
            if (i < pd5Var.e2 || i >= (i2 = pd5Var.f2)) {
                i2 = pd5Var.i2;
            }
            TLRPC.User W1 = oc7.r1(pd5Var.a).W1(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? k47.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (W1 != null) {
                ij6Var.setCustomImageVisible(pd5Var.Z1.contains(Long.valueOf(W1.id)));
                ij6Var.c(W1, null, null, i != i2 - 1);
                return;
            }
            return;
        }
        if (i3 == 1) {
            fj6 fj6Var = (fj6) view;
            if (i == pd5Var.c2) {
                if ((!pd5Var.W1 || pd5Var.X1) && pd5Var.j2 == -1 && !arrayList.isEmpty()) {
                    r2 = true;
                }
                fj6Var.b(R.drawable.msg_link, 7, jb6.M0(2131743074, null), r2);
                return;
            }
            return;
        }
        if (i3 == 2) {
            l55 l55Var = (l55) view;
            if (i == pd5Var.j2) {
                l55Var.setText(jb6.M0(2131752278, null));
            } else if (i == pd5Var.g2) {
                if (pd5Var.b2) {
                    l55Var.setText(jb6.M0(2131742488, null));
                } else {
                    l55Var.setText(jb6.M0(2131749213, null));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [fj6] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, l55] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v5, types: [tk4] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ij6 ij6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? fj6Var = new fj6(context);
                int i2 = cmb.fh;
                fj6Var.a(i2, i2);
                fj6Var.setDividerColor(cmb.Wg);
                ij6Var = fj6Var;
            } else if (i == 2) {
                ?? l55Var = new l55(context, null);
                anb.h(cmb.Zg, null, l55Var);
                l55Var.setTextColor(cmb.Gh);
                ij6Var = l55Var;
            } else if (i == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                ij6Var = view;
            } else if (i != 5) {
                ij6Var = new View(context);
            } else {
                ?? tk4Var = new tk4(context, null);
                tk4Var.setViewType(6);
                tk4Var.setIsSingleCell(true);
                tk4Var.e(cmb.Vg, cmb.Hh, cmb.Zg);
                ij6Var = tk4Var;
            }
        } else {
            ij6 ij6Var2 = new ij6(this.c, 6, 2, false, null);
            ij6Var2.setCustomRightImage(R.drawable.msg_invited);
            ij6Var2.setNameColor(cmb.w0(null, cmb.dh, false));
            int w0 = cmb.w0(null, cmb.bh, false);
            int w02 = cmb.w0(null, cmb.fh, false);
            ij6Var2.P = true;
            ij6Var2.I = w0;
            ij6Var2.J = w02;
            ij6Var2.setDividerColor(cmb.Wg);
            ij6Var = ij6Var2;
        }
        return new b59(ij6Var);
    }
}
