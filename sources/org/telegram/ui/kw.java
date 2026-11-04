package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kw implements org.telegram.ui.Components.xy {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uw b;

    public kw(Context context, uw uwVar) {
        this.b = uwVar;
        this.a = context;
    }

    public final int a(int i3) {
        uw uwVar = this.b;
        if (uwVar.S0 == 3) {
            return 0;
        }
        if (i3 == uwVar.A0.getDefaultTabId()) {
            return uwVar.getMessagesStorage().L;
        }
        ArrayList T0 = uwVar.getMessagesController().T0();
        if (i3 < 0 || i3 >= T0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.mo) uwVar.getMessagesController().T0().get(i3)).d;
    }

    public final void b(float f10) {
        uw uwVar = this.b;
        if (f10 != 1.0f || uwVar.f0[1].getVisibility() == 0 || uwVar.k2) {
            if (uwVar.j3) {
                uwVar.f0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                uwVar.f0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * uwVar.f0[0].getMeasuredWidth()));
            } else {
                uwVar.f0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                uwVar.f0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - uwVar.f0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                tw[] twVarArr = uwVar.f0;
                tw twVar = twVarArr[0];
                twVarArr[0] = twVarArr[1];
                twVarArr[1] = twVar;
                twVar.setVisibility(8);
                uw.j1(uwVar, true);
                uwVar.f5(false);
                uwVar.A0.P = false;
                uwVar.C3(uwVar.f0[0]);
                uwVar.f0[0].d.getClass();
                uwVar.f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.yy yyVar, boolean z10) {
        int i3;
        int i10;
        uw uwVar = this.b;
        int i11 = uwVar.f0[0].h;
        int i12 = yyVar.a;
        if (i11 == i12) {
            return;
        }
        if (yyVar.f) {
            uwVar.A0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            uwVar.showDialog(new vg.i0(3, i10, this.a, uwVar, null));
            return;
        }
        ArrayList T0 = uwVar.getMessagesController().T0();
        if (yyVar.e || ((i3 = yyVar.a) >= 0 && i3 < T0.size())) {
            tw twVar = uwVar.f0[1];
            twVar.h = yyVar.a;
            twVar.setVisibility(0);
            uwVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            uw.j1(uwVar, false);
            uwVar.d5(true);
            uwVar.j3 = z10;
        }
    }

    public final void d(org.telegram.messenger.mo moVar) {
        boolean d = moVar.d();
        uw uwVar = this.b;
        if (d) {
            org.telegram.ui.Components.rz.g1(uwVar, moVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uwVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131750791, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(12, this, moVar));
        uwVar.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, uwVar.getResourceProvider());
        }
    }
}
