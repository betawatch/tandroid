package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nw implements org.telegram.ui.Components.az {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ww b;

    public nw(Context context, ww wwVar) {
        this.b = wwVar;
        this.a = context;
    }

    public final int a(int i7) {
        ww wwVar = this.b;
        if (wwVar.R0 == 3) {
            return 0;
        }
        if (i7 == wwVar.z0.getDefaultTabId()) {
            return wwVar.getMessagesStorage().K;
        }
        ArrayList T0 = wwVar.getMessagesController().T0();
        if (i7 < 0 || i7 >= T0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.vo) wwVar.getMessagesController().T0().get(i7)).d;
    }

    public final void b(float f10) {
        ww wwVar = this.b;
        if (f10 != 1.0f || wwVar.e0[1].getVisibility() == 0 || wwVar.j2) {
            if (wwVar.i3) {
                wwVar.e0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                wwVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * wwVar.e0[0].getMeasuredWidth()));
            } else {
                wwVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                wwVar.e0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - wwVar.e0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                vw[] vwVarArr = wwVar.e0;
                vw vwVar = vwVarArr[0];
                vwVarArr[0] = vwVarArr[1];
                vwVarArr[1] = vwVar;
                vwVar.setVisibility(8);
                ww.j1(wwVar, true);
                wwVar.f5(false);
                wwVar.z0.O = false;
                wwVar.C3(wwVar.e0[0]);
                wwVar.e0[0].d.getClass();
                wwVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.bz bzVar, boolean z9) {
        int i7;
        int i10;
        ww wwVar = this.b;
        int i11 = wwVar.e0[0].h;
        int i12 = bzVar.a;
        if (i11 == i12) {
            return;
        }
        if (bzVar.f) {
            wwVar.z0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            wwVar.showDialog(new ug.i0(3, i10, this.a, wwVar, null));
            return;
        }
        ArrayList T0 = wwVar.getMessagesController().T0();
        if (bzVar.e || ((i7 = bzVar.a) >= 0 && i7 < T0.size())) {
            vw vwVar = wwVar.e0[1];
            vwVar.h = bzVar.a;
            vwVar.setVisibility(0);
            wwVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            ww.j1(wwVar, false);
            wwVar.d5(true);
            wwVar.i3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        ww wwVar = this.b;
        if (d) {
            org.telegram.ui.Components.vz.g1(wwVar, voVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wwVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131750791, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new pu(2, this, voVar));
        wwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, wwVar.getResourceProvider());
        }
    }
}
