package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    ProfileActivity profileActivity = ((org.telegram.ui.qt0) lu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.l4(profileActivity.z6, profileActivity.B6));
                    profileActivity.r.setTranslationY(profileActivity.m4(profileActivity.C6));
                    break;
                }
                break;
        }
    }
}
