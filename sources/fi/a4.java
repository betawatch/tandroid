package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv0 b;

    public /* synthetic */ a4(cv0 cv0Var, int i7) {
        this.a = i7;
        this.b = cv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        cv0 cv0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.t0;
                ProfileActivity profileActivity = cv0Var.v0;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.N4(false);
                break;
            default:
                cv0Var.invalidate();
                break;
        }
    }
}
