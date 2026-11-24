// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dr5 extends n39 {
    public final /* synthetic */ jr5 c;

    public dr5(jr5 jr5Var) {
        this.c = jr5Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 3 || i == 1;
    }

    public final TLObject E(int i) {
        jr5 jr5Var = this.c;
        if (jr5Var.g2 == null) {
            return (TLObject) jr5Var.Y1.get(i - jr5Var.S1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) jr5Var.h2.get(i - jr5Var.S1);
        boolean D = cf3.D(dialog.id);
        int i2 = jr5Var.a;
        return D ? na7.q1(i2).V1(Long.valueOf(dialog.id)) : na7.q1(i2).K0(Long.valueOf(-dialog.id));
    }

    @Override // w39
    public final int b() {
        return this.c.W1;
    }

    @Override // w39
    public final int d(int i) {
        jr5 jr5Var = this.c;
        if (i == jr5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= jr5Var.S1 && i < jr5Var.T1) {
            return 3;
        }
        if (i == jr5Var.V1) {
            return 4;
        }
        return i == jr5Var.U1 ? 5 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 2) {
            view.requestLayout();
            return;
        }
        if (i2 == 3) {
            za5 za5Var = (za5) view;
            TLObject E = E(i);
            Object object = za5Var.getObject();
            long j = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            jr5 jr5Var = this.c;
            za5Var.e(E, null, null, i != jr5Var.T1);
            long j2 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
            if (j2 != 0) {
                vf6 vf6Var = jr5Var.N1;
                if (vf6Var == null || vf6Var.h(j2) < 0) {
                    za5Var.c(jr5Var.Z1.h(j2) >= 0, j == j2);
                    za5Var.setCheckBoxEnabled(true);
                } else {
                    za5Var.c(true, false);
                    za5Var.setCheckBoxEnabled(false);
                }
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        if (i != 2) {
            jr5 jr5Var = this.c;
            int i2 = 0;
            if (i != 3) {
                if (i != 4) {
                    View view3 = null;
                    boolean z = false;
                    if (i != 5) {
                        dh6 dh6Var = new dh6(context);
                        dh6Var.b(R.drawable.msg_link, 7, k96.M0(2131743148, null), true);
                        int i3 = bkb.m5;
                        dh6Var.a(i3, i3);
                        view2 = dh6Var;
                    } else {
                        na5 na5Var = new na5(context, view3, i2, z ? 1 : 0, (byte) 1);
                        na5Var.setLayoutParams(new e49(-1, -1));
                        na5Var.e.setVisibility(8);
                        vu2 vu2Var = jr5Var.g2;
                        wla wlaVar = na5Var.d;
                        if (vu2Var != null) {
                            wlaVar.setText(k96.M0(2131750714, null));
                        } else {
                            wlaVar.setText(k96.M0(2131748031, null));
                        }
                        na5Var.setAnimateLayoutChange(true);
                        view2 = na5Var;
                    }
                } else {
                    view2 = new View(context);
                }
                return new y29(view2);
            }
            view = new za5(context, 1, 0, jr5Var.g2 != null);
        } else {
            view = new sb((byte) 16, context, this);
        }
        view2 = view;
        return new y29(view2);
    }
}
