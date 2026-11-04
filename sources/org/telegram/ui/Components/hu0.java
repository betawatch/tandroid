package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku0 b;

    public /* synthetic */ hu0(ku0 ku0Var, int i3) {
        this.a = i3;
        this.b = ku0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ku0 ku0Var = this.b;
                ku0Var.invalidate();
                org.telegram.messenger.g0.h3(new hu0(ku0Var, 1));
                break;
            default:
                ku0 ku0Var2 = this.b;
                ju0 ju0Var = ku0Var2.e;
                if (ju0Var != null) {
                    ku0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.jt0) ju0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.v6, profileActivity.x6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.y6));
                    break;
                }
                break;
        }
    }
}
