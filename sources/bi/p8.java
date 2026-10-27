package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xz0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ p8(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                xz0 xz0Var = profileActivity.N;
                if (xz0Var != null) {
                    xz0Var.e1(14);
                    profileActivity.O4(false);
                    break;
                }
                break;
            case 1:
                this.b.O4(true);
                break;
            default:
                this.b.O4(true);
                break;
        }
    }
}
