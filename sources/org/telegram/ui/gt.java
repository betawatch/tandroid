package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ st b;

    public /* synthetic */ gt(st stVar, int i10) {
        this.a = i10;
        this.b = stVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                st stVar = this.b;
                stVar.K = false;
                stVar.z.invalidate();
                stVar.n();
                break;
            case 1:
                st stVar2 = this.b;
                Activity activity = stVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                stVar2.K = false;
                stVar2.z.invalidate();
                stVar2.n();
                break;
            case 2:
                st stVar3 = this.b;
                qt qtVar = stVar3.l;
                if (qtVar != null) {
                    qtVar.K();
                }
                stVar3.p();
                break;
            default:
                st stVar4 = this.b;
                qt qtVar2 = stVar4.l;
                if (qtVar2 != null) {
                    qtVar2.q();
                }
                stVar4.p();
                break;
        }
    }
}
