// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq8 b;

    public /* synthetic */ hv8(lq8 lq8Var, byte b) {
        this.a = b;
        this.b = lq8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lq8 lq8Var = this.b;
        switch (b) {
            case 0:
                int i = ProfileStoriesView.t0;
                ProfileActivity profileActivity = lq8Var.v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.a3(false);
                break;
            default:
                lq8Var.invalidate();
                break;
        }
    }
}
