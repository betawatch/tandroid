package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv0 b;

    public /* synthetic */ j4(cv0 cv0Var, int i7) {
        this.a = i7;
        this.b = cv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        cv0 cv0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = cv0Var.u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                break;
            default:
                cv0Var.invalidate();
                break;
        }
    }
}
