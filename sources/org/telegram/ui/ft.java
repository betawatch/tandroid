package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ ft(rt rtVar, int i10) {
        this.a = i10;
        this.b = rtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rt rtVar = this.b;
                rtVar.K = false;
                rtVar.z.invalidate();
                rtVar.n();
                break;
            case 1:
                rt rtVar2 = this.b;
                Activity activity = rtVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                rtVar2.K = false;
                rtVar2.z.invalidate();
                rtVar2.n();
                break;
            case 2:
                rt rtVar3 = this.b;
                pt ptVar = rtVar3.l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                break;
            default:
                rt rtVar4 = this.b;
                pt ptVar2 = rtVar4.l;
                if (ptVar2 != null) {
                    ptVar2.r();
                }
                rtVar4.p();
                break;
        }
    }
}
