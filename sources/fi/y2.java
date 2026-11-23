package fi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class y2 extends j8 {
    public final /* synthetic */ f9 I;
    public final /* synthetic */ z3 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z3 z3Var, Context context, c3 c3Var, org.telegram.ui.ActionBar.h6 h6Var, f9 f9Var) {
        super(context, c3Var, h6Var);
        this.J = z3Var;
        this.I = f9Var;
    }

    @Override // fi.j8
    public final void b(boolean z10) {
        s3 s3Var = this.J.A1;
        if (s3Var != null) {
            f9 f9Var = ((w8) s3Var).d;
            f9Var.i1 = z10;
            f9Var.V();
        }
    }

    @Override // fi.j8
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
