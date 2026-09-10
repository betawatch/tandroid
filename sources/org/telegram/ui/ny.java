package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ny extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ wy f;

    public ny(wy wyVar) {
        this.f = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean b() {
        wy wyVar = this.f;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (wyVar.n2 == null) {
            return true;
        }
        wyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        wy wyVar = this.f;
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        return !lVar.s() && wyVar.R3 == null;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        wy wyVar = this.f;
        my myVar = wyVar.X;
        if (myVar != null) {
            ArrayList arrayList = myVar.F;
            if (!arrayList.isEmpty() && myVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((fg.q0) arrayList.get(i10)).h) {
                        ((cy) myVar.H).g((fg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        wyVar.j2 = false;
        wyVar.k2 = false;
        vy vyVar = wyVar.e0[0];
        if (vyVar != null) {
            vyVar.a.setEmptyView(wyVar.V2 == 0 ? vyVar.w : null);
            wyVar.O4(false, false, true, false);
        }
        wyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        wyVar.X.setCloseButtonVisible(false);
        wyVar.Y4(true);
        wyVar.B3();
        wyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.ao0 ao0Var;
        org.telegram.ui.Components.ao0 ao0Var2;
        wy wyVar = this.f;
        wyVar.j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        wyVar.M3();
        vy vyVar = wyVar.e0[0];
        if (vyVar != null) {
            if (wyVar.n2 != null) {
                vyVar.a.b1();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    bi.y1 y1Var = gyVar.V;
                    if (y1Var.i1) {
                        y1Var.i1 = false;
                        y1Var.J0(false);
                    }
                }
            }
            if (!wyVar.l2) {
                bi.x4 x4Var = wyVar.p0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                bi.x4 x4Var2 = wyVar.q0;
                if (x4Var2 != null) {
                    x4Var2.e(true);
                }
            }
        }
        nx nxVar = wyVar.E0;
        if (nxVar != null && nxVar.getPremiumHint() != null) {
            wyVar.E0.getPremiumHint().e(true);
        }
        if (!wyVar.K) {
            wyVar.C4(0.0f);
        }
        wyVar.Z4(false, false);
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        lVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        wyVar.m3();
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null && (ao0Var2 = gyVar2.b0) != null) {
            ao0Var2.c = fg.e0.d;
        }
        if ((gyVar2 != null && (ao0Var = gyVar2.b0) != null && ao0Var.N()) || wyVar.getMessagesController().getTotalDialogsCount() > 10 || wyVar.s3 || wyVar.K) {
            wyVar.k2 = true;
            if (!wyVar.p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        wyVar.X.setCloseButtonVisible(true);
        wyVar.Y4(true);
        wyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        gy gyVar;
        org.telegram.ui.Components.ao0 ao0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        wy wyVar = this.f;
        if (!isEmpty || (((gyVar = wyVar.C0) != null && (ao0Var = gyVar.b0) != null && ao0Var.N()) || wyVar.s3 || wyVar.K)) {
            wyVar.k2 = true;
            if (!wyVar.p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null) {
            View currentView = gyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(gyVar2.K0) ? true : !gyVar2.e0;
            gyVar2.K0 = obj;
            gyVar2.O(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
