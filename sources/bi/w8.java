package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xv0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ w8(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null) {
                    xv0Var.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
            case 1:
                this.b.X4(true);
                break;
            default:
                this.b.X4(true);
                break;
        }
    }
}
