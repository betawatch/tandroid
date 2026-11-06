package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
