package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ ry f;

    public iy(ry ryVar) {
        this.f = ryVar;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean b() {
        ry ryVar = this.f;
        org.telegram.ui.ActionBar.v0 v0Var = ryVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (ryVar.n2 == null) {
            return true;
        }
        ryVar.finishFragment();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ry ryVar = this.f;
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        return !kVar.s() && ryVar.Q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        ry ryVar = this.f;
        hy hyVar = ryVar.X;
        if (hyVar != null) {
            ArrayList arrayList = hyVar.F;
            if (!arrayList.isEmpty() && hyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((wx) hyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        ryVar.j2 = false;
        ryVar.k2 = false;
        qy qyVar = ryVar.e0[0];
        if (qyVar != null) {
            qyVar.a.setEmptyView(ryVar.V2 == 0 ? qyVar.w : null);
            ryVar.O4(false, false, true, false);
        }
        ryVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        ryVar.X.setCloseButtonVisible(false);
        ryVar.Y4(true);
        ryVar.B3();
        ryVar.m3();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.rn0 rn0Var;
        org.telegram.ui.Components.rn0 rn0Var2;
        ry ryVar = this.f;
        ryVar.j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = ryVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        ryVar.M3();
        qy qyVar = ryVar.e0[0];
        if (qyVar != null) {
            if (ryVar.n2 != null) {
                qyVar.a.c1();
                ay ayVar = ryVar.C0;
                if (ayVar != null) {
                    ai.w0 w0Var = ayVar.V;
                    if (w0Var.i1) {
                        w0Var.i1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!ryVar.l2) {
                ci.e4 e4Var = ryVar.p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = ryVar.q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        ix ixVar = ryVar.E0;
        if (ixVar != null && ixVar.getPremiumHint() != null) {
            ryVar.E0.getPremiumHint().e(true);
        }
        if (!ryVar.K) {
            ryVar.C4(0.0f);
        }
        ryVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        ryVar.m3();
        ay ayVar2 = ryVar.C0;
        if (ayVar2 != null && (rn0Var2 = ayVar2.b0) != null) {
            rn0Var2.c = gg.f0.d;
        }
        if ((ayVar2 != null && (rn0Var = ayVar2.b0) != null && rn0Var.N()) || ryVar.getMessagesController().getTotalDialogsCount() > 10 || ryVar.s3 || ryVar.K) {
            ryVar.k2 = true;
            if (!ryVar.p3) {
                ryVar.O4(true, false, true, false);
            }
        }
        ryVar.X.setCloseButtonVisible(true);
        ryVar.Y4(true);
        ryVar.B3();
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        ay ayVar;
        org.telegram.ui.Components.rn0 rn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        ry ryVar = this.f;
        if (!isEmpty || (((ayVar = ryVar.C0) != null && (rn0Var = ayVar.b0) != null && rn0Var.N()) || ryVar.s3 || ryVar.K)) {
            ryVar.k2 = true;
            if (!ryVar.p3) {
                ryVar.O4(true, false, true, false);
            }
        }
        ay ayVar2 = ryVar.C0;
        if (ayVar2 != null) {
            View currentView = ayVar2.getCurrentView();
            boolean z10 = TextUtils.isEmpty(ayVar2.K0) ? true : !ayVar2.e0;
            ayVar2.K0 = obj;
            ayVar2.O(currentView, ayVar2.getCurrentPosition(), obj, z10);
        }
    }
}
