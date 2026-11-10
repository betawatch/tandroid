package bi;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                yv0 yv0Var = profileActivity.N;
                if (yv0Var != null) {
                    yv0Var.k1(14);
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
