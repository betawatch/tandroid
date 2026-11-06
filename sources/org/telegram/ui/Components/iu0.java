package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu0 b;

    public /* synthetic */ iu0(lu0 lu0Var, int i7) {
        this.a = i7;
        this.b = lu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lu0 lu0Var = this.b;
                lu0Var.invalidate();
                org.telegram.messenger.g0.h3(new iu0(lu0Var, 1));
                break;
            default:
                lu0 lu0Var2 = this.b;
                ku0 ku0Var = lu0Var2.e;
                if (ku0Var != null) {
                    lu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) ku0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.u6, profileActivity.w6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.x6));
                    break;
                }
                break;
        }
    }
}
