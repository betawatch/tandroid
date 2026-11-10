package di;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fv0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ k4(fv0 fv0Var, int i7) {
        this.a = i7;
        this.b = fv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fv0 fv0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.s0;
                ProfileActivity profileActivity = fv0Var.u0;
                RectF rectF = ProfileActivity.V6;
                profileActivity.N4(false);
                break;
            default:
                fv0Var.invalidate();
                break;
        }
    }
}
