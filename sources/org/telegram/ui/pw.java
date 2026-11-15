package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.Components.ez {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yw b;

    public pw(Context context, yw ywVar) {
        this.b = ywVar;
        this.a = context;
    }

    public final int a(int i7) {
        yw ywVar = this.b;
        if (ywVar.T0 == 3) {
            return 0;
        }
        if (i7 == ywVar.A0.getDefaultTabId()) {
            return ywVar.getMessagesStorage().L;
        }
        ArrayList T0 = ywVar.getMessagesController().T0();
        if (i7 < 0 || i7 >= T0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.so) ywVar.getMessagesController().T0().get(i7)).d;
    }

    public final void b(float f10) {
        yw ywVar = this.b;
        if (f10 != 1.0f || ywVar.f0[1].getVisibility() == 0 || ywVar.l2) {
            if (ywVar.k3) {
                ywVar.f0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                ywVar.f0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * ywVar.f0[0].getMeasuredWidth()));
            } else {
                ywVar.f0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                ywVar.f0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - ywVar.f0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                xw[] xwVarArr = ywVar.f0;
                xw xwVar = xwVarArr[0];
                xwVarArr[0] = xwVarArr[1];
                xwVarArr[1] = xwVar;
                xwVar.setVisibility(8);
                yw.j1(ywVar, true);
                ywVar.f5(false);
                ywVar.A0.P = false;
                ywVar.C3(ywVar.f0[0]);
                ywVar.f0[0].d.getClass();
                ywVar.f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.fz fzVar, boolean z10) {
        int i7;
        int i10;
        yw ywVar = this.b;
        int i11 = ywVar.f0[0].h;
        int i12 = fzVar.a;
        if (i11 == i12) {
            return;
        }
        if (fzVar.f) {
            ywVar.A0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            ywVar.showDialog(new ug.j0(3, i10, this.a, ywVar, null));
            return;
        }
        ArrayList T0 = ywVar.getMessagesController().T0();
        if (fzVar.e || ((i7 = fzVar.a) >= 0 && i7 < T0.size())) {
            xw xwVar = ywVar.f0[1];
            xwVar.h = fzVar.a;
            xwVar.setVisibility(0);
            ywVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            yw.j1(ywVar, false);
            ywVar.d5(true);
            ywVar.k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.so soVar) {
        boolean d = soVar.d();
        yw ywVar = this.b;
        if (d) {
            org.telegram.ui.Components.zz.g1(ywVar, soVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131750790, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(6, this, soVar));
        ywVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, ywVar.getResourceProvider());
        }
    }
}
