package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class py extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ yy f;

    public py(yy yyVar) {
        this.f = yyVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        yy yyVar = this.f;
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (yyVar.n2 == null) {
            return true;
        }
        yyVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        yy yyVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        return !kVar.t() && yyVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        yy yyVar = this.f;
        oy oyVar = yyVar.X;
        if (oyVar != null) {
            ArrayList arrayList = oyVar.F;
            if (!arrayList.isEmpty() && oyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.p0) arrayList.get(i10)).h) {
                        ((ey) oyVar.H).c((hg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        yyVar.j2 = false;
        yyVar.k2 = false;
        xy xyVar = yyVar.e0[0];
        if (xyVar != null) {
            xyVar.a.setEmptyView(yyVar.V2 == 0 ? xyVar.w : null);
            yyVar.L4(false, false, true, false);
        }
        yyVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        yyVar.X.setCloseButtonVisible(false);
        yyVar.V4(true);
        yyVar.y3();
        yyVar.j3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
        yy yyVar = this.f;
        yyVar.j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        yyVar.J3();
        xy xyVar = yyVar.e0[0];
        if (xyVar != null) {
            if (yyVar.n2 != null) {
                xyVar.a.c1();
                iy iyVar = yyVar.C0;
                if (iyVar != null) {
                    bi.o0 o0Var = iyVar.V;
                    if (o0Var.g1) {
                        o0Var.g1 = false;
                        o0Var.K0(false);
                    }
                }
            }
            if (!yyVar.l2) {
                di.d4 d4Var = yyVar.p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                di.d4 d4Var2 = yyVar.q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        px pxVar = yyVar.E0;
        if (pxVar != null && pxVar.getPremiumHint() != null) {
            yyVar.E0.getPremiumHint().e(true);
        }
        if (!yyVar.K) {
            yyVar.z4(0.0f);
        }
        yyVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        yyVar.j3();
        iy iyVar2 = yyVar.C0;
        if (iyVar2 != null && (so0Var2 = iyVar2.b0) != null) {
            so0Var2.c = hg.e0.d;
        }
        if ((iyVar2 != null && (so0Var = iyVar2.b0) != null && so0Var.N()) || yyVar.getMessagesController().getTotalDialogsCount() > 10 || yyVar.s3 || yyVar.K) {
            yyVar.k2 = true;
            if (!yyVar.p3) {
                yyVar.L4(true, false, true, false);
            }
        }
        yyVar.X.setCloseButtonVisible(true);
        yyVar.V4(true);
        yyVar.y3();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        iy iyVar;
        org.telegram.ui.Components.so0 so0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        yy yyVar = this.f;
        if (!isEmpty || (((iyVar = yyVar.C0) != null && (so0Var = iyVar.b0) != null && so0Var.N()) || yyVar.s3 || yyVar.K)) {
            yyVar.k2 = true;
            if (!yyVar.p3) {
                yyVar.L4(true, false, true, false);
            }
        }
        iy iyVar2 = yyVar.C0;
        if (iyVar2 != null) {
            View currentView = iyVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(iyVar2.K0) ? true : !iyVar2.e0;
            iyVar2.K0 = obj;
            iyVar2.O(currentView, iyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
