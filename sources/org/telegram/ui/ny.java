package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ny extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ wy f;

    public ny(wy wyVar) {
        this.f = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
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

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        wy wyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        return !kVar.s() && wyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        wy wyVar = this.f;
        my myVar = wyVar.X;
        if (myVar != null) {
            ArrayList arrayList = myVar.F;
            if (!arrayList.isEmpty() && myVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((cy) myVar.H).h((gg.q0) arrayList.get(i10));
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

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.sn0 sn0Var;
        org.telegram.ui.Components.sn0 sn0Var2;
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
                vyVar.a.d1();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    ai.w0 w0Var2 = gyVar.W;
                    if (w0Var2.i1) {
                        w0Var2.i1 = false;
                        w0Var2.L0(false);
                    }
                }
            }
            if (!wyVar.l2) {
                ci.f4 f4Var = wyVar.p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = wyVar.q0;
                if (f4Var2 != null) {
                    f4Var2.e(true);
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
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        wyVar.m3();
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null && (sn0Var2 = gyVar2.c0) != null) {
            sn0Var2.c = gg.f0.d;
        }
        if ((gyVar2 != null && (sn0Var = gyVar2.c0) != null && sn0Var.N()) || wyVar.getMessagesController().getTotalDialogsCount() > 10 || wyVar.s3 || wyVar.K) {
            wyVar.k2 = true;
            if (!wyVar.p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        wyVar.X.setCloseButtonVisible(true);
        wyVar.Y4(true);
        wyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        gy gyVar;
        org.telegram.ui.Components.sn0 sn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        wy wyVar = this.f;
        if (!isEmpty || (((gyVar = wyVar.C0) != null && (sn0Var = gyVar.c0) != null && sn0Var.N()) || wyVar.s3 || wyVar.K)) {
            wyVar.k2 = true;
            if (!wyVar.p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null) {
            View currentView = gyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(gyVar2.L0) ? true : !gyVar2.f0;
            gyVar2.L0 = obj;
            gyVar2.P(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
