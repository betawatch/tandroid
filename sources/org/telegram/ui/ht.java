package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tt b;

    public /* synthetic */ ht(tt ttVar, int i10) {
        this.a = i10;
        this.b = ttVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tt ttVar = this.b;
                ttVar.K = false;
                ttVar.z.invalidate();
                ttVar.n();
                break;
            case 1:
                tt ttVar2 = this.b;
                Activity activity = ttVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ttVar2.K = false;
                ttVar2.z.invalidate();
                ttVar2.n();
                break;
            case 2:
                tt ttVar3 = this.b;
                rt rtVar = ttVar3.l;
                if (rtVar != null) {
                    rtVar.J();
                }
                ttVar3.p();
                break;
            default:
                tt ttVar4 = this.b;
                rt rtVar2 = ttVar4.l;
                if (rtVar2 != null) {
                    rtVar2.q();
                }
                ttVar4.p();
                break;
        }
    }
}
