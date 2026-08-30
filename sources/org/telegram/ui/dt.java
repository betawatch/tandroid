package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ dt(pt ptVar, int i10) {
        this.a = i10;
        this.b = ptVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.K = false;
                ptVar.z.invalidate();
                ptVar.n();
                break;
            case 1:
                pt ptVar2 = this.b;
                Activity activity = ptVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ptVar2.K = false;
                ptVar2.z.invalidate();
                ptVar2.n();
                break;
            case 2:
                pt ptVar3 = this.b;
                nt ntVar = ptVar3.l;
                if (ntVar != null) {
                    ntVar.K();
                }
                ptVar3.p();
                break;
            default:
                pt ptVar4 = this.b;
                nt ntVar2 = ptVar4.l;
                if (ntVar2 != null) {
                    ntVar2.r();
                }
                ptVar4.p();
                break;
        }
    }
}
