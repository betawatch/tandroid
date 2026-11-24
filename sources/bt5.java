// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bt5 extends q59 {
    public final /* synthetic */ it5 c;

    public bt5(it5 it5Var) {
        this.c = it5Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 1;
    }

    public final TLObject E(int i) {
        it5 it5Var = this.c;
        if (it5Var.g2 == null) {
            return (TLObject) it5Var.Y1.get(i - it5Var.S1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) it5Var.h2.get(i - it5Var.S1);
        boolean D = pg3.D(dialog.id);
        int i2 = it5Var.a;
        return D ? oc7.r1(i2).W1(Long.valueOf(dialog.id)) : oc7.r1(i2).L0(Long.valueOf(-dialog.id));
    }

    @Override // y59
    public final int b() {
        return this.c.W1;
    }

    @Override // y59
    public final int d(int i) {
        it5 it5Var = this.c;
        if (i == it5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= it5Var.S1 && i < it5Var.T1) {
            return 3;
        }
        if (i == it5Var.V1) {
            return 4;
        }
        return i == it5Var.U1 ? 5 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 2) {
            view.requestLayout();
            return;
        }
        if (i2 == 3) {
            xc5 xc5Var = (xc5) view;
            TLObject E = E(i);
            Object object = xc5Var.getObject();
            long j = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            it5 it5Var = this.c;
            xc5Var.e(E, null, null, i != it5Var.T1);
            long j2 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
            if (j2 != 0) {
                vh6 vh6Var = it5Var.N1;
                if (vh6Var == null || vh6Var.h(j2) < 0) {
                    xc5Var.c(it5Var.Z1.h(j2) >= 0, j == j2);
                    xc5Var.setCheckBoxEnabled(true);
                } else {
                    xc5Var.c(true, false);
                    xc5Var.setCheckBoxEnabled(false);
                }
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        if (i != 2) {
            it5 it5Var = this.c;
            int i2 = 0;
            if (i != 3) {
                if (i != 4) {
                    View view3 = null;
                    boolean z = false;
                    if (i != 5) {
                        fj6 fj6Var = new fj6(context);
                        fj6Var.b(R.drawable.msg_link, 7, jb6.M0(2131743074, null), true);
                        int i3 = cmb.m5;
                        fj6Var.a(i3, i3);
                        view2 = fj6Var;
                    } else {
                        lc5 lc5Var = new lc5(context, view3, i2, z ? 1 : 0, (byte) 1);
                        lc5Var.setLayoutParams(new g69(-1, -1));
                        lc5Var.e.setVisibility(8);
                        yu3 yu3Var = it5Var.g2;
                        xna xnaVar = lc5Var.d;
                        if (yu3Var != null) {
                            xnaVar.setText(jb6.M0(2131750663, null));
                        } else {
                            xnaVar.setText(jb6.M0(2131747957, null));
                        }
                        lc5Var.setAnimateLayoutChange(true);
                        view2 = lc5Var;
                    }
                } else {
                    view2 = new View(context);
                }
                return new b59(view2);
            }
            view = new xc5(context, 1, 0, it5Var.g2 != null);
        } else {
            view = new sb((byte) 17, context, this);
        }
        view2 = view;
        return new b59(view2);
    }
}
