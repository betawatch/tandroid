package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bv0 b;

    public /* synthetic */ j4(bv0 bv0Var, int i7) {
        this.a = i7;
        this.b = bv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        bv0 bv0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = bv0Var.u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                break;
            default:
                bv0Var.invalidate();
                break;
        }
    }
}
