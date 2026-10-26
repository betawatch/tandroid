package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ox0 b;

    public /* synthetic */ lx0(ox0 ox0Var, int i10) {
        this.a = i10;
        this.b = ox0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ox0 ox0Var = this.b;
                ox0Var.invalidate();
                AndroidUtilities.runOnUIThread(new lx0(ox0Var, 1));
                break;
            default:
                ox0 ox0Var2 = this.b;
                nx0 nx0Var = ox0Var2.e;
                if (nx0Var != null) {
                    ox0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wx0) nx0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.e4(profileActivity.l6, profileActivity.n6));
                    profileActivity.r.setTranslationY(profileActivity.f4(profileActivity.o6));
                    break;
                }
                break;
        }
    }
}
