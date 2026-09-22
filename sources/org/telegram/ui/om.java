package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class om extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ pm c;

    public /* synthetic */ om(pm pmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = pmVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                pm pmVar = this.c;
                zn znVar = pmVar.c;
                znVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                pmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                zn znVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.J3(znVar);
                znVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                pm pmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) pmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                pmVar.b = true;
                break;
        }
    }
}
