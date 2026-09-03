package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ qy f;

    public hy(qy qyVar) {
        this.f = qyVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        qy qyVar = this.f;
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (qyVar.k2 == null) {
            return true;
        }
        qyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        return !kVar.s() && qyVar.O3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        qy qyVar = this.f;
        gy gyVar = qyVar.U;
        if (gyVar != null) {
            ArrayList arrayList = gyVar.C;
            if (!arrayList.isEmpty() && gyVar.E != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((tf.e0) arrayList.get(i10)).h) {
                        ((vx) gyVar.E).d((tf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        qyVar.g2 = false;
        qyVar.h2 = false;
        py pyVar = qyVar.b0[0];
        if (pyVar != null) {
            pyVar.a.setEmptyView(qyVar.S2 == 0 ? pyVar.w : null);
            qyVar.O4(false, false, true, false);
        }
        qyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        qyVar.U.setCloseButtonVisible(false);
        qyVar.Y4(true);
        qyVar.B3();
        qyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.vn0 vn0Var;
        org.telegram.ui.Components.vn0 vn0Var2;
        qy qyVar = this.f;
        qyVar.g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        qyVar.M3();
        py pyVar = qyVar.b0[0];
        if (pyVar != null) {
            if (qyVar.k2 != null) {
                pyVar.a.b1();
                zx zxVar = qyVar.z0;
                if (zxVar != null) {
                    lh.e1 e1Var = zxVar.S;
                    if (e1Var.f1) {
                        e1Var.f1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!qyVar.i2) {
                ph.f3 f3Var = qyVar.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                ph.f3 f3Var2 = qyVar.n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
        ix ixVar = qyVar.B0;
        if (ixVar != null && ixVar.getPremiumHint() != null) {
            qyVar.B0.getPremiumHint().e(true);
        }
        if (!qyVar.H) {
            qyVar.C4(0.0f);
        }
        qyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qyVar.m3();
        zx zxVar2 = qyVar.z0;
        if (zxVar2 != null && (vn0Var2 = zxVar2.V) != null) {
            vn0Var2.c = tf.w.d;
        }
        if ((zxVar2 != null && (vn0Var = zxVar2.V) != null && vn0Var.N()) || qyVar.getMessagesController().getTotalDialogsCount() > 10 || qyVar.p3 || qyVar.H) {
            qyVar.h2 = true;
            if (!qyVar.m3) {
                qyVar.O4(true, false, true, false);
            }
        }
        qyVar.U.setCloseButtonVisible(true);
        qyVar.Y4(true);
        qyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        zx zxVar;
        org.telegram.ui.Components.vn0 vn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        qy qyVar = this.f;
        if (!isEmpty || (((zxVar = qyVar.z0) != null && (vn0Var = zxVar.V) != null && vn0Var.N()) || qyVar.p3 || qyVar.H)) {
            qyVar.h2 = true;
            if (!qyVar.m3) {
                qyVar.O4(true, false, true, false);
            }
        }
        zx zxVar2 = qyVar.z0;
        if (zxVar2 != null) {
            View currentView = zxVar2.getCurrentView();
            boolean z4 = TextUtils.isEmpty(zxVar2.H0) ? true : !zxVar2.b0;
            zxVar2.H0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
