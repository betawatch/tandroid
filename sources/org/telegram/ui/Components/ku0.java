package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nu0 b;

    public /* synthetic */ ku0(nu0 nu0Var, int i7) {
        this.a = i7;
        this.b = nu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nu0 nu0Var = this.b;
                nu0Var.invalidate();
                org.telegram.messenger.g0.h3(new ku0(nu0Var, 1));
                break;
            default:
                nu0 nu0Var2 = this.b;
                mu0 mu0Var = nu0Var2.e;
                if (mu0Var != null) {
                    nu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.vt0) mu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.x6, profileActivity.z6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.A6));
                    break;
                }
                break;
        }
    }
}
