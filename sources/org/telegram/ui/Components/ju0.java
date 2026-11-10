package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu0 b;

    public /* synthetic */ ju0(mu0 mu0Var, int i7) {
        this.a = i7;
        this.b = mu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mu0 mu0Var = this.b;
                mu0Var.invalidate();
                org.telegram.messenger.g0.h3(new ju0(mu0Var, 1));
                break;
            default:
                mu0 mu0Var2 = this.b;
                lu0 lu0Var = mu0Var2.e;
                if (lu0Var != null) {
                    mu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wt0) lu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.x6, profileActivity.z6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.A6));
                    break;
                }
                break;
        }
    }
}
