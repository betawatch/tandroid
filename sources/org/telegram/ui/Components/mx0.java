package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ px0 b;

    public /* synthetic */ mx0(px0 px0Var, int i10) {
        this.a = i10;
        this.b = px0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                px0 px0Var = this.b;
                px0Var.invalidate();
                AndroidUtilities.runOnUIThread(new mx0(px0Var, 1));
                break;
            default:
                px0 px0Var2 = this.b;
                ox0 ox0Var = px0Var2.e;
                if (ox0Var != null) {
                    px0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.yx0) ox0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.e4(profileActivity.l6, profileActivity.n6));
                    profileActivity.r.setTranslationY(profileActivity.f4(profileActivity.o6));
                    break;
                }
                break;
        }
    }
}
