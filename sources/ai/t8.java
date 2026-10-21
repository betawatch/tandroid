package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nz0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ t8(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                nz0 nz0Var = profileActivity.O;
                if (nz0Var != null) {
                    nz0Var.a1(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
            case 1:
                this.b.G4(true);
                break;
            default:
                this.b.G4(true);
                break;
        }
    }
}
