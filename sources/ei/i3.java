package ei;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i3 extends t8 {
    public final /* synthetic */ r9 I;
    public final /* synthetic */ j4 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j4 j4Var, Context context, m3 m3Var, org.telegram.ui.ActionBar.e6 e6Var, r9 r9Var) {
        super(context, m3Var, e6Var);
        this.J = j4Var;
        this.I = r9Var;
    }

    @Override // ei.t8
    public final void b(boolean z10) {
        c4 c4Var = this.J.A1;
        if (c4Var != null) {
            r9 r9Var = ((i9) c4Var).d;
            r9Var.j1 = z10;
            r9Var.d0();
        }
    }

    @Override // ei.t8
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
