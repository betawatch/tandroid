package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rz0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                rz0 rz0Var = profileActivity.O;
                if (rz0Var != null) {
                    rz0Var.b1(14);
                    profileActivity.I4(false);
                    break;
                }
                break;
            case 1:
                this.b.I4(true);
                break;
            default:
                this.b.I4(true);
                break;
        }
    }
}
