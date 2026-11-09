package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.Components.bz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yw b;

    public pw(Context context, yw ywVar) {
        this.b = ywVar;
        this.a = context;
    }

    public final int a(int i7) {
        yw ywVar = this.b;
        if (ywVar.S0 == 3) {
            return 0;
        }
        if (i7 == ywVar.z0.getDefaultTabId()) {
            return ywVar.getMessagesStorage().K;
        }
        ArrayList T0 = ywVar.getMessagesController().T0();
        if (i7 < 0 || i7 >= T0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.vo) ywVar.getMessagesController().T0().get(i7)).d;
    }

    public final void b(float f10) {
        yw ywVar = this.b;
        if (f10 != 1.0f || ywVar.e0[1].getVisibility() == 0 || ywVar.k2) {
            if (ywVar.j3) {
                ywVar.e0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                ywVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * ywVar.e0[0].getMeasuredWidth()));
            } else {
                ywVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                ywVar.e0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - ywVar.e0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                xw[] xwVarArr = ywVar.e0;
                xw xwVar = xwVarArr[0];
                xwVarArr[0] = xwVarArr[1];
                xwVarArr[1] = xwVar;
                xwVar.setVisibility(8);
                yw.j1(ywVar, true);
                ywVar.f5(false);
                ywVar.z0.O = false;
                ywVar.C3(ywVar.e0[0]);
                ywVar.e0[0].d.getClass();
                ywVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.cz czVar, boolean z9) {
        int i7;
        int i10;
        yw ywVar = this.b;
        int i11 = ywVar.e0[0].h;
        int i12 = czVar.a;
        if (i11 == i12) {
            return;
        }
        if (czVar.f) {
            ywVar.z0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            ywVar.showDialog(new ug.i0(3, i10, this.a, ywVar, null));
            return;
        }
        ArrayList T0 = ywVar.getMessagesController().T0();
        if (czVar.e || ((i7 = czVar.a) >= 0 && i7 < T0.size())) {
            xw xwVar = ywVar.e0[1];
            xwVar.h = czVar.a;
            xwVar.setVisibility(0);
            ywVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            yw.j1(ywVar, false);
            ywVar.d5(true);
            ywVar.j3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        yw ywVar = this.b;
        if (d) {
            org.telegram.ui.Components.wz.g1(ywVar, voVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131750790, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ru(2, this, voVar));
        ywVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, ywVar.getResourceProvider());
        }
    }
}
