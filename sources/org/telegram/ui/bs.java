package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ms b;

    public /* synthetic */ bs(ms msVar, int i7) {
        this.a = i7;
        this.b = msVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ms msVar = this.b;
                msVar.K = false;
                msVar.z.invalidate();
                msVar.m();
                break;
            case 1:
                ms msVar2 = this.b;
                Activity activity = msVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                msVar2.K = false;
                msVar2.z.invalidate();
                msVar2.m();
                break;
            case 2:
                ms msVar3 = this.b;
                ks ksVar = msVar3.l;
                if (ksVar != null) {
                    ksVar.K();
                }
                msVar3.o();
                break;
            default:
                ms msVar4 = this.b;
                ks ksVar2 = msVar4.l;
                if (ksVar2 != null) {
                    ksVar2.r();
                }
                msVar4.o();
                break;
        }
    }
}
