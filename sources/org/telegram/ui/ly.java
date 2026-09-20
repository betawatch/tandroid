package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ly extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ uy f;

    public ly(uy uyVar) {
        this.f = uyVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
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

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        return !kVar.s() && uyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        uy uyVar = this.f;
        ky kyVar = uyVar.X;
        if (kyVar != null) {
            ArrayList arrayList = kyVar.F;
            if (!arrayList.isEmpty() && kyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((zx) kyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        uyVar.j2 = false;
        uyVar.k2 = false;
        ty tyVar = uyVar.e0[0];
        if (tyVar != null) {
            tyVar.a.setEmptyView(uyVar.V2 == 0 ? tyVar.w : null);
            uyVar.O4(false, false, true, false);
        }
        uyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        uyVar.X.setCloseButtonVisible(false);
        uyVar.Y4(true);
        uyVar.B3();
        uyVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.eo0 eo0Var;
        org.telegram.ui.Components.eo0 eo0Var2;
        uy uyVar = this.f;
        uyVar.j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.M3();
        ty tyVar = uyVar.e0[0];
        if (tyVar != null) {
            if (uyVar.n2 != null) {
                tyVar.a.d1();
                ey eyVar = uyVar.C0;
                if (eyVar != null) {
                    ai.w0 w0Var = eyVar.W;
                    if (w0Var.i1) {
                        w0Var.i1 = false;
                        w0Var.L0(false);
                    }
                }
            }
            if (!uyVar.l2) {
                ci.f4 f4Var = uyVar.p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = uyVar.q0;
                if (f4Var2 != null) {
                    f4Var2.e(true);
                }
            }
        }
        lx lxVar = uyVar.E0;
        if (lxVar != null && lxVar.getPremiumHint() != null) {
            uyVar.E0.getPremiumHint().e(true);
        }
        if (!uyVar.K) {
            uyVar.C4(0.0f);
        }
        uyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        uyVar.m3();
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null && (eo0Var2 = eyVar2.c0) != null) {
            eo0Var2.c = gg.f0.d;
        }
        if ((eyVar2 != null && (eo0Var = eyVar2.c0) != null && eo0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.s3 || uyVar.K) {
            uyVar.k2 = true;
            if (!uyVar.p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        uyVar.X.setCloseButtonVisible(true);
        uyVar.Y4(true);
        uyVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        ey eyVar;
        org.telegram.ui.Components.eo0 eo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        uy uyVar = this.f;
        if (!isEmpty || (((eyVar = uyVar.C0) != null && (eo0Var = eyVar.c0) != null && eo0Var.N()) || uyVar.s3 || uyVar.K)) {
            uyVar.k2 = true;
            if (!uyVar.p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null) {
            View currentView = eyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(eyVar2.L0) ? true : !eyVar2.f0;
            eyVar2.L0 = obj;
            eyVar2.P(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
