package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu0 b;

    public /* synthetic */ tu0(wu0 wu0Var, int i7) {
        this.a = i7;
        this.b = wu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wu0 wu0Var = this.b;
                wu0Var.invalidate();
                org.telegram.messenger.g0.g3(new tu0(wu0Var, 1));
                break;
            default:
                wu0 wu0Var2 = this.b;
                vu0 vu0Var = wu0Var2.e;
                if (vu0Var != null) {
                    wu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.st0) vu0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    break;
                }
                break;
        }
    }
}
