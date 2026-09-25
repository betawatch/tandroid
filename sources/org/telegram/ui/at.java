package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nt b;

    public /* synthetic */ at(nt ntVar, int i10) {
        this.a = i10;
        this.b = ntVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nt ntVar = this.b;
                ntVar.K = false;
                ntVar.z.invalidate();
                ntVar.n();
                break;
            case 1:
                nt ntVar2 = this.b;
                Activity activity = ntVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ntVar2.K = false;
                ntVar2.z.invalidate();
                ntVar2.n();
                break;
            case 2:
                nt ntVar3 = this.b;
                lt ltVar = ntVar3.l;
                if (ltVar != null) {
                    ltVar.K();
                }
                ntVar3.p();
                break;
            default:
                nt ntVar4 = this.b;
                lt ltVar2 = ntVar4.l;
                if (ltVar2 != null) {
                    ltVar2.s();
                }
                ntVar4.p();
                break;
        }
    }
}
