package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ uy f;

    public jy(uy uyVar) {
        this.f = uyVar;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean b() {
        uy uyVar = this.f;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (uyVar.n2 == null) {
            return true;
        }
        uyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        return !kVar.s() && uyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        li.p pVar;
        uy uyVar = this.f;
        iy iyVar = uyVar.X;
        if (iyVar != null) {
            ArrayList arrayList = iyVar.F;
            if (!arrayList.isEmpty() && iyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((cy) iyVar.H).d((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        uyVar.j2 = false;
        uyVar.k2 = false;
        ty tyVar = uyVar.e0[0];
        if (tyVar != null) {
            tyVar.a.setEmptyView(uyVar.V2 == 0 ? tyVar.w : null);
            uyVar.X4(false, false, true, false);
        }
        uyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        uyVar.X.setCloseButtonVisible(false);
        uyVar.h5(true);
        uyVar.K3();
        pVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
        pVar.g();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        li.p pVar;
        org.telegram.ui.Components.jo0 jo0Var;
        org.telegram.ui.Components.jo0 jo0Var2;
        uy uyVar = this.f;
        uyVar.j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.V3();
        ty tyVar = uyVar.e0[0];
        if (tyVar != null) {
            if (uyVar.n2 != null) {
                tyVar.a.c1();
                dy dyVar = uyVar.C0;
                if (dyVar != null) {
                    ai.w0 w0Var = dyVar.a0;
                    if (w0Var.i1) {
                        w0Var.i1 = false;
                        w0Var.L0(false);
                    }
                }
            }
            if (!uyVar.l2) {
                ci.e4 e4Var = uyVar.p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = uyVar.q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        jx jxVar = uyVar.E0;
        if (jxVar != null && jxVar.getPremiumHint() != null) {
            uyVar.E0.getPremiumHint().e(true);
        }
        if (!uyVar.K) {
            uyVar.L4(0.0f);
        }
        uyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        pVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
        pVar.g();
        dy dyVar2 = uyVar.C0;
        if (dyVar2 != null && (jo0Var2 = dyVar2.d0) != null) {
            jo0Var2.c = gg.f0.d;
        }
        if ((dyVar2 != null && (jo0Var = dyVar2.d0) != null && jo0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.s3 || uyVar.K) {
            uyVar.k2 = true;
            if (!uyVar.p3) {
                uyVar.X4(true, false, true, false);
            }
        }
        uyVar.X.setCloseButtonVisible(true);
        uyVar.h5(true);
        uyVar.K3();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        dy dyVar;
        org.telegram.ui.Components.jo0 jo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        uy uyVar = this.f;
        if (!isEmpty || (((dyVar = uyVar.C0) != null && (jo0Var = dyVar.d0) != null && jo0Var.N()) || uyVar.s3 || uyVar.K)) {
            uyVar.k2 = true;
            if (!uyVar.p3) {
                uyVar.X4(true, false, true, false);
            }
        }
        dy dyVar2 = uyVar.C0;
        if (dyVar2 != null) {
            View currentView = dyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(dyVar2.M0) ? true : !dyVar2.g0;
            dyVar2.M0 = obj;
            dyVar2.Q(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
