package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pz0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ s8(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                pz0 pz0Var = profileActivity.O;
                if (pz0Var != null) {
                    pz0Var.a1(14);
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
