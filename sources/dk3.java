// default package

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dk3 implements dg4 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nk3 b;

    public dk3(nk3 nk3Var, Context context) {
        this.b = nk3Var;
        this.a = context;
    }

    public final int a(int i) {
        nk3 nk3Var = this.b;
        if (nk3Var.T0 == 3) {
            return 0;
        }
        if (i == nk3Var.A0.getDefaultTabId()) {
            return nk3Var.getMessagesStorage().L;
        }
        ArrayList S0 = nk3Var.getMessagesController().S0();
        if (i < 0 || i >= S0.size()) {
            return 0;
        }
        return ((ub7) nk3Var.getMessagesController().S0().get(i)).d;
    }

    public final void b(float f) {
        nk3 nk3Var = this.b;
        if (f != 1.0f || nk3Var.f0[1].getVisibility() == 0 || nk3Var.l2) {
            boolean z = nk3Var.k3;
            mk3[] mk3VarArr = nk3Var.f0;
            if (z) {
                mk3VarArr[0].setTranslationX((-f) * r2.getMeasuredWidth());
                nk3Var.f0[1].setTranslationX(r2[0].getMeasuredWidth() - (f * nk3Var.f0[0].getMeasuredWidth()));
            } else {
                mk3VarArr[0].setTranslationX(r2.getMeasuredWidth() * f);
                nk3Var.f0[1].setTranslationX((f * r2[0].getMeasuredWidth()) - nk3Var.f0[0].getMeasuredWidth());
            }
            if (f == 1.0f) {
                mk3[] mk3VarArr2 = nk3Var.f0;
                mk3 mk3Var = mk3VarArr2[0];
                mk3VarArr2[0] = mk3VarArr2[1];
                mk3VarArr2[1] = mk3Var;
                mk3Var.setVisibility(8);
                nk3Var.j5(true);
                nk3Var.p5(false);
                nk3Var.F5(-1, true);
                nk3Var.A0.P = false;
                nk3Var.M2(nk3Var.f0[0]);
                nk3Var.f0[0].d.getClass();
                nk3Var.f0[1].d.getClass();
            }
        }
    }

    public final void c(eg4 eg4Var, boolean z) {
        int i;
        int i2;
        nk3 nk3Var = this.b;
        int i3 = nk3Var.f0[0].h;
        int i4 = eg4Var.a;
        if (i3 != i4) {
            if (eg4Var.f) {
                nk3Var.A0.l(i4);
                i2 = ((d) nk3Var).currentAccount;
                nk3Var.showDialog(new i46(3, i2, null, this.a, nk3Var));
                return;
            }
            ArrayList S0 = nk3Var.getMessagesController().S0();
            if (eg4Var.e || ((i = eg4Var.a) >= 0 && i < S0.size())) {
                mk3 mk3Var = nk3Var.f0[1];
                mk3Var.h = eg4Var.a;
                mk3Var.setVisibility(0);
                nk3Var.f0[1].setTranslationX(r6[0].getMeasuredWidth());
                nk3Var.j5(false);
                nk3Var.n5(true);
                nk3Var.F5(eg4Var.a, true);
                nk3Var.k3 = z;
            }
        }
    }

    public final void d(ub7 ub7Var) {
        boolean c = ub7Var.c();
        nk3 nk3Var = this.b;
        if (c) {
            ln4.b1(nk3Var, ub7Var.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
        String M0 = jb6.M0(2131750727, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131750726, null);
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new x92((Object) this, (Object) ub7Var, (byte) 24));
        nk3Var.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, nk3Var.getResourceProvider());
        }
    }
}
