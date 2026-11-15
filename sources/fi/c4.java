package fi;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.av0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ av0 b;

    public /* synthetic */ c4(av0 av0Var, int i7) {
        this.a = i7;
        this.b = av0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        av0 av0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ProfileStoriesView.t0;
                ProfileActivity profileActivity = av0Var.v0;
                RectF rectF = ProfileActivity.X6;
                profileActivity.M4(false);
                break;
            default:
                av0Var.invalidate();
                break;
        }
    }
}
