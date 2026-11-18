package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ m5(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X4(true);
                break;
            case 1:
                this.b.X4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                vv0 vv0Var = profileActivity.O;
                if (vv0Var != null) {
                    vv0Var.k1(14);
                    profileActivity.X4(false);
                    break;
                }
                break;
        }
    }
}
