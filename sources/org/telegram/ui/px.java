package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class px extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ cy a;

    public px(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean b() {
        cy cyVar = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = cyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (cyVar.n2 == null) {
            return true;
        }
        cyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        return !kVar.q() && cyVar.R3 == null;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        oi.q qVar;
        cy cyVar = this.a;
        ox oxVar = cyVar.X;
        if (oxVar != null) {
            ArrayList arrayList = oxVar.F;
            if (!arrayList.isEmpty() && oxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((ig.p0) arrayList.get(i10)).h) {
                        ((ix) oxVar.H).f((ig.p0) arrayList.get(i10));
                    }
                }
            }
        }
        cyVar.j2 = false;
        cyVar.k2 = false;
        ay ayVar = cyVar.e0[0];
        if (ayVar != null) {
            ayVar.a.setEmptyView(cyVar.W2 == 0 ? ayVar.w : null);
            cyVar.W4(false, false, true, false);
        }
        cyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        cyVar.X.setCloseButtonVisible(false);
        cyVar.h5(true);
        cyVar.J3();
        qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        org.telegram.ui.ActionBar.k kVar;
        oi.q qVar;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        cy cyVar = this.a;
        cyVar.j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = cyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        cyVar.U3();
        ay ayVar = cyVar.e0[0];
        if (ayVar != null) {
            if (cyVar.n2 != null) {
                ayVar.a.c1();
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    bi.r1 r1Var = jxVar.a0;
                    if (r1Var.g1) {
                        r1Var.g1 = false;
                        r1Var.K0(false);
                    }
                }
            }
            if (!cyVar.l2) {
                fi.v3 v3Var = cyVar.p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = cyVar.q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
        qw qwVar = cyVar.E0;
        if (qwVar != null && qwVar.getPremiumHint() != null) {
            cyVar.E0.getPremiumHint().e(true);
        }
        if (!cyVar.K) {
            cyVar.K4(0.0f);
        }
        cyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
        qVar.g();
        jx jxVar2 = cyVar.C0;
        if (jxVar2 != null && (wo0Var2 = jxVar2.d0) != null) {
            wo0Var2.c = ig.f0.d;
        }
        if ((jxVar2 != null && (wo0Var = jxVar2.d0) != null && wo0Var.M()) || cyVar.getMessagesController().getTotalDialogsCount() > 10 || cyVar.t3 || cyVar.K) {
            cyVar.k2 = true;
            if (!cyVar.q3) {
                cyVar.W4(true, false, true, false);
            }
        }
        cyVar.X.setCloseButtonVisible(true);
        cyVar.h5(true);
        cyVar.J3();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        jx jxVar;
        org.telegram.ui.Components.wo0 wo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        cy cyVar = this.a;
        if (!isEmpty || (((jxVar = cyVar.C0) != null && (wo0Var = jxVar.d0) != null && wo0Var.M()) || cyVar.t3 || cyVar.K)) {
            cyVar.k2 = true;
            if (!cyVar.q3) {
                cyVar.W4(true, false, true, false);
            }
        }
        jx jxVar2 = cyVar.C0;
        if (jxVar2 != null) {
            View currentView = jxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(jxVar2.M0) ? true : !jxVar2.g0;
            jxVar2.M0 = obj;
            jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
