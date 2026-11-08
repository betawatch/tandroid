package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                vv0 vv0Var = profileActivity.N;
                if (vv0Var != null) {
                    vv0Var.i1(14);
                    profileActivity.U4(false);
                    break;
                }
                break;
            case 1:
                this.b.U4(true);
                break;
            default:
                this.b.U4(true);
                break;
        }
    }
}
