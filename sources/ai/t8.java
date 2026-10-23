package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nz0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
