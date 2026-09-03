package lh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zz0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ h2(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G4(true);
                break;
            case 1:
                this.b.G4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                zz0 zz0Var = profileActivity.L;
                if (zz0Var != null) {
                    zz0Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
        }
    }
}
