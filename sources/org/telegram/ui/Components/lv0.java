package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ov0 b;

    public /* synthetic */ lv0(ov0 ov0Var, int i10) {
        this.a = i10;
        this.b = ov0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ov0 ov0Var = this.b;
                ov0Var.invalidate();
                org.telegram.messenger.i0.g3(new lv0(ov0Var, 1));
                break;
            default:
                ov0 ov0Var2 = this.b;
                nv0 nv0Var = ov0Var2.e;
                if (nv0Var != null) {
                    ov0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.av0) nv0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.m4(profileActivity.u6, profileActivity.w6));
                    profileActivity.r.setTranslationY(profileActivity.n4(profileActivity.x6));
                    break;
                }
                break;
        }
    }
}
