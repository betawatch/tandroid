package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ qy f;

    public hy(qy qyVar) {
        this.f = qyVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        qy qyVar = this.f;
        org.telegram.ui.ActionBar.u0 u0Var = qyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (qyVar.n2 == null) {
            return true;
        }
        qyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        return !kVar.s() && qyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        qy qyVar = this.f;
        gy gyVar = qyVar.X;
        if (gyVar != null) {
            ArrayList arrayList = gyVar.F;
            if (!arrayList.isEmpty() && gyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((vx) gyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        qyVar.j2 = false;
        qyVar.k2 = false;
        py pyVar = qyVar.e0[0];
        if (pyVar != null) {
            pyVar.a.setEmptyView(qyVar.V2 == 0 ? pyVar.w : null);
            qyVar.O4(false, false, true, false);
        }
        qyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        qyVar.X.setCloseButtonVisible(false);
        qyVar.Y4(true);
        qyVar.B3();
        qyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.eo0 eo0Var;
        org.telegram.ui.Components.eo0 eo0Var2;
        qy qyVar = this.f;
        qyVar.j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = qyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        qyVar.M3();
        py pyVar = qyVar.e0[0];
        if (pyVar != null) {
            if (qyVar.n2 != null) {
                pyVar.a.c1();
                zx zxVar = qyVar.C0;
                if (zxVar != null) {
                    ai.w0 w0Var = zxVar.V;
                    if (w0Var.i1) {
                        w0Var.i1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!qyVar.l2) {
                ci.e4 e4Var = qyVar.p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = qyVar.q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        hx hxVar = qyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null) {
            qyVar.E0.getPremiumHint().e(true);
        }
        if (!qyVar.K) {
            qyVar.C4(0.0f);
        }
        qyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qyVar.m3();
        zx zxVar2 = qyVar.C0;
        if (zxVar2 != null && (eo0Var2 = zxVar2.b0) != null) {
            eo0Var2.c = gg.f0.d;
        }
        if ((zxVar2 != null && (eo0Var = zxVar2.b0) != null && eo0Var.N()) || qyVar.getMessagesController().getTotalDialogsCount() > 10 || qyVar.s3 || qyVar.K) {
            qyVar.k2 = true;
            if (!qyVar.p3) {
                qyVar.O4(true, false, true, false);
            }
        }
        qyVar.X.setCloseButtonVisible(true);
        qyVar.Y4(true);
        qyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        zx zxVar;
        org.telegram.ui.Components.eo0 eo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        qy qyVar = this.f;
        if (!isEmpty || (((zxVar = qyVar.C0) != null && (eo0Var = zxVar.b0) != null && eo0Var.N()) || qyVar.s3 || qyVar.K)) {
            qyVar.k2 = true;
            if (!qyVar.p3) {
                qyVar.O4(true, false, true, false);
            }
        }
        zx zxVar2 = qyVar.C0;
        if (zxVar2 != null) {
            View currentView = zxVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(zxVar2.K0) ? true : !zxVar2.e0;
            zxVar2.K0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
