package org.telegram.ui;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ cs(ns nsVar, int i7) {
        this.a = i7;
        this.b = nsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ns nsVar = this.b;
                nsVar.K = false;
                nsVar.z.invalidate();
                nsVar.m();
                break;
            case 1:
                ns nsVar2 = this.b;
                Activity activity = nsVar2.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                nsVar2.K = false;
                nsVar2.z.invalidate();
                nsVar2.m();
                break;
            case 2:
                ns nsVar3 = this.b;
                ls lsVar = nsVar3.l;
                if (lsVar != null) {
                    lsVar.K();
                }
                nsVar3.o();
                break;
            default:
                ns nsVar4 = this.b;
                ls lsVar2 = nsVar4.l;
                if (lsVar2 != null) {
                    lsVar2.r();
                }
                nsVar4.o();
                break;
        }
    }
}
