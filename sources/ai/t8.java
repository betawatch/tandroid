package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rz0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
