package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                vz0 vz0Var = profileActivity.N;
                if (vz0Var != null) {
                    vz0Var.e1(14);
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
