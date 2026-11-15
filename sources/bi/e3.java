package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ e3(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W4(true);
                break;
            case 1:
                this.b.W4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null) {
                    uv0Var.k1(14);
                    profileActivity.W4(false);
                    break;
                }
                break;
        }
    }
}
