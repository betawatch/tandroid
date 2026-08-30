package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fy extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ oy f;

    public fy(oy oyVar) {
        this.f = oyVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        oy oyVar = this.f;
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (oyVar.k2 == null) {
            return true;
        }
        oyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        oy oyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        return !kVar.s() && oyVar.O3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        oy oyVar = this.f;
        ey eyVar = oyVar.U;
        if (eyVar != null) {
            ArrayList arrayList = eyVar.C;
            if (!arrayList.isEmpty() && eyVar.E != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((tf.e0) arrayList.get(i10)).h) {
                        ((tx) eyVar.E).d((tf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        oyVar.g2 = false;
        oyVar.h2 = false;
        ny nyVar = oyVar.b0[0];
        if (nyVar != null) {
            nyVar.a.setEmptyView(oyVar.S2 == 0 ? nyVar.w : null);
            oyVar.O4(false, false, true, false);
        }
        oyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        oyVar.U.setCloseButtonVisible(false);
        oyVar.Y4(true);
        oyVar.B3();
        oyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.wn0 wn0Var;
        org.telegram.ui.Components.wn0 wn0Var2;
        oy oyVar = this.f;
        oyVar.g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        oyVar.M3();
        ny nyVar = oyVar.b0[0];
        if (nyVar != null) {
            if (oyVar.k2 != null) {
                nyVar.a.c1();
                xx xxVar = oyVar.z0;
                if (xxVar != null) {
                    lh.e1 e1Var = xxVar.S;
                    if (e1Var.f1) {
                        e1Var.f1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!oyVar.i2) {
                ph.f3 f3Var = oyVar.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                ph.f3 f3Var2 = oyVar.n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
        gx gxVar = oyVar.B0;
        if (gxVar != null && gxVar.getPremiumHint() != null) {
            oyVar.B0.getPremiumHint().e(true);
        }
        if (!oyVar.H) {
            oyVar.C4(0.0f);
        }
        oyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        oyVar.m3();
        xx xxVar2 = oyVar.z0;
        if (xxVar2 != null && (wn0Var2 = xxVar2.V) != null) {
            wn0Var2.c = tf.w.d;
        }
        if ((xxVar2 != null && (wn0Var = xxVar2.V) != null && wn0Var.N()) || oyVar.getMessagesController().getTotalDialogsCount() > 10 || oyVar.p3 || oyVar.H) {
            oyVar.h2 = true;
            if (!oyVar.m3) {
                oyVar.O4(true, false, true, false);
            }
        }
        oyVar.U.setCloseButtonVisible(true);
        oyVar.Y4(true);
        oyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        xx xxVar;
        org.telegram.ui.Components.wn0 wn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        oy oyVar = this.f;
        if (!isEmpty || (((xxVar = oyVar.z0) != null && (wn0Var = xxVar.V) != null && wn0Var.N()) || oyVar.p3 || oyVar.H)) {
            oyVar.h2 = true;
            if (!oyVar.m3) {
                oyVar.O4(true, false, true, false);
            }
        }
        xx xxVar2 = oyVar.z0;
        if (xxVar2 != null) {
            View currentView = xxVar2.getCurrentView();
            boolean z4 = TextUtils.isEmpty(xxVar2.H0) ? true : !xxVar2.b0;
            xxVar2.H0 = obj;
            xxVar2.O(currentView, xxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
