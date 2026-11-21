package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ uu0(xu0 xu0Var, int i7) {
        this.a = i7;
        this.b = xu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xu0 xu0Var = this.b;
                xu0Var.invalidate();
                org.telegram.messenger.g0.g3(new uu0(xu0Var, 1));
                break;
            default:
                xu0 xu0Var2 = this.b;
                wu0 wu0Var = xu0Var2.e;
                if (wu0Var != null) {
                    xu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) wu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    break;
                }
                break;
        }
    }
}
