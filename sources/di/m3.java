package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m3 extends c9 {
    public final /* synthetic */ y9 H;
    public final /* synthetic */ q4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(q4 q4Var, Context context, q3 q3Var, org.telegram.ui.ActionBar.u6 u6Var, y9 y9Var) {
        super(context, q3Var, u6Var);
        this.I = q4Var;
        this.H = y9Var;
    }

    @Override // di.c9
    public final void b(boolean z10) {
        j4 j4Var = this.I.F1;
        if (j4Var != null) {
            y9 y9Var = ((p9) j4Var).d;
            y9Var.i1 = z10;
            y9Var.P();
        }
    }

    @Override // di.c9
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
