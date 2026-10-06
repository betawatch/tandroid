package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class et implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ et(rt rtVar, int i10) {
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
                    ptVar2.s();
                }
                rtVar4.p();
                break;
        }
    }
}
