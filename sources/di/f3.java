package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f3 extends u8 {
    public final /* synthetic */ q9 H;
    public final /* synthetic */ j4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(j4 j4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.g6 g6Var, q9 q9Var) {
        super(context, j3Var, g6Var);
        this.I = j4Var;
        this.H = q9Var;
    }

    @Override // di.u8
    public final void b(boolean z9) {
        c4 c4Var = this.I.z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.h1 = z9;
            q9Var.V();
        }
    }

    @Override // di.u8
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
