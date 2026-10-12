package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt b;

    public /* synthetic */ lt(xt xtVar, int i10) {
        this.a = i10;
        this.b = xtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xt xtVar = this.b;
                xtVar.K = false;
                xtVar.z.invalidate();
                xtVar.n();
                break;
            case 1:
                xt xtVar2 = this.b;
                Activity activity = xtVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                xtVar2.K = false;
                xtVar2.z.invalidate();
                xtVar2.n();
                break;
            case 2:
                xt xtVar3 = this.b;
                vt vtVar = xtVar3.l;
                if (vtVar != null) {
                    vtVar.K();
                }
                xtVar3.p();
                break;
            default:
                xt xtVar4 = this.b;
                vt vtVar2 = xtVar4.l;
                if (vtVar2 != null) {
                    vtVar2.r();
                }
                xtVar4.p();
                break;
        }
    }
}
