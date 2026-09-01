package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ et(qt qtVar, int i10) {
        this.a = i10;
        this.b = qtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qt qtVar = this.b;
                qtVar.K = false;
                qtVar.z.invalidate();
                qtVar.n();
                break;
            case 1:
                qt qtVar2 = this.b;
                Activity activity = qtVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                qtVar2.K = false;
                qtVar2.z.invalidate();
                qtVar2.n();
                break;
            case 2:
                qt qtVar3 = this.b;
                ot otVar = qtVar3.l;
                if (otVar != null) {
                    otVar.K();
                }
                qtVar3.p();
                break;
            default:
                qt qtVar4 = this.b;
                ot otVar2 = qtVar4.l;
                if (otVar2 != null) {
                    otVar2.q();
                }
                qtVar4.p();
                break;
        }
    }
}
