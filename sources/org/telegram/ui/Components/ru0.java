package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu0 b;

    public /* synthetic */ ru0(uu0 uu0Var, int i7) {
        this.a = i7;
        this.b = uu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uu0 uu0Var = this.b;
                uu0Var.invalidate();
                org.telegram.messenger.g0.g3(new ru0(uu0Var, 1));
                break;
            default:
                uu0 uu0Var2 = this.b;
                tu0 tu0Var = uu0Var2.e;
                if (tu0Var != null) {
                    uu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) tu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    break;
                }
                break;
        }
    }
}
