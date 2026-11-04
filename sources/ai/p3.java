package ai;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ p3(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U4(true);
                break;
            case 1:
                this.b.U4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null) {
                    mv0Var.i1(14);
                    profileActivity.U4(false);
                    break;
                }
                break;
        }
    }
}
