package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut b;

    public /* synthetic */ jt(ut utVar, int i10) {
        this.a = i10;
        this.b = utVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ut utVar = this.b;
                utVar.K = false;
                utVar.z.invalidate();
                utVar.n();
                break;
            case 1:
                ut utVar2 = this.b;
                Activity activity = utVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                utVar2.K = false;
                utVar2.z.invalidate();
                utVar2.n();
                break;
            case 2:
                ut utVar3 = this.b;
                st stVar = utVar3.l;
                if (stVar != null) {
                    stVar.K();
                }
                utVar3.p();
                break;
            default:
                ut utVar4 = this.b;
                st stVar2 = utVar4.l;
                if (stVar2 != null) {
                    stVar2.r();
                }
                utVar4.p();
                break;
        }
    }
}
