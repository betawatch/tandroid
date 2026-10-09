package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ ty f;

    public ky(ty tyVar) {
        this.f = tyVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        ty tyVar = this.f;
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (tyVar.n2 == null) {
            return true;
        }
        tyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ty tyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        return !kVar.t() && tyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        ty tyVar = this.f;
        jy jyVar = tyVar.X;
        if (jyVar != null) {
            ArrayList arrayList = jyVar.F;
            if (!arrayList.isEmpty() && jyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.p0) arrayList.get(i10)).h) {
                        ((yx) jyVar.H).d((gg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        tyVar.j2 = false;
        tyVar.k2 = false;
        sy syVar = tyVar.e0[0];
        if (syVar != null) {
            syVar.a.setEmptyView(tyVar.V2 == 0 ? syVar.w : null);
            tyVar.L4(false, false, true, false);
        }
        tyVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        tyVar.X.setCloseButtonVisible(false);
        tyVar.V4(true);
        tyVar.y3();
        tyVar.j3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        ty tyVar = this.f;
        tyVar.j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        tyVar.J3();
        sy syVar = tyVar.e0[0];
        if (syVar != null) {
            if (tyVar.n2 != null) {
                syVar.a.c1();
                dy dyVar = tyVar.C0;
                if (dyVar != null) {
                    ai.w0 w0Var = dyVar.V;
                    if (w0Var.g1) {
                        w0Var.g1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!tyVar.l2) {
                ci.d4 d4Var = tyVar.p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = tyVar.q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        kx kxVar = tyVar.E0;
        if (kxVar != null && kxVar.getPremiumHint() != null) {
            tyVar.E0.getPremiumHint().e(true);
        }
        if (!tyVar.K) {
            tyVar.z4(0.0f);
        }
        tyVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        tyVar.j3();
        dy dyVar2 = tyVar.C0;
        if (dyVar2 != null && (wo0Var2 = dyVar2.b0) != null) {
            wo0Var2.c = gg.e0.d;
        }
        if ((dyVar2 != null && (wo0Var = dyVar2.b0) != null && wo0Var.N()) || tyVar.getMessagesController().getTotalDialogsCount() > 10 || tyVar.s3 || tyVar.K) {
            tyVar.k2 = true;
            if (!tyVar.p3) {
                tyVar.L4(true, false, true, false);
            }
        }
        tyVar.X.setCloseButtonVisible(true);
        tyVar.V4(true);
        tyVar.y3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        dy dyVar;
        org.telegram.ui.Components.wo0 wo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        ty tyVar = this.f;
        if (!isEmpty || (((dyVar = tyVar.C0) != null && (wo0Var = dyVar.b0) != null && wo0Var.N()) || tyVar.s3 || tyVar.K)) {
            tyVar.k2 = true;
            if (!tyVar.p3) {
                tyVar.L4(true, false, true, false);
            }
        }
        dy dyVar2 = tyVar.C0;
        if (dyVar2 != null) {
            View currentView = dyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(dyVar2.K0) ? true : !dyVar2.e0;
            dyVar2.K0 = obj;
            dyVar2.O(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
