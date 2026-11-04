package ei;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu0 b;

    public /* synthetic */ k4(tu0 tu0Var, int i3) {
        this.a = i3;
        this.b = tu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        tu0 tu0Var = this.b;
        switch (i3) {
            case 0:
                int i10 = ProfileStoriesView.t0;
                ProfileActivity profileActivity = tu0Var.v0;
                RectF rectF = ProfileActivity.T6;
                profileActivity.K4(false);
                break;
            default:
                tu0Var.invalidate();
                break;
        }
    }
}
