package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
