package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ev0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ev0 b;

    public /* synthetic */ k4(ev0 ev0Var, int i7) {
        this.a = i7;
        this.b = ev0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ev0 ev0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = ev0Var.u0;
                RectF rectF = ProfileActivity.V6;
                profileActivity.N4(false);
                break;
            default:
                ev0Var.invalidate();
                break;
        }
    }
}
