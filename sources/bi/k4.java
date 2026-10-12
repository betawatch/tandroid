package bi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k4 extends wa {
    public final /* synthetic */ sb H;
    public final /* synthetic */ q5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(q5 q5Var, Context context, o4 o4Var, org.telegram.ui.ActionBar.c6 c6Var, sb sbVar) {
        super(context, o4Var, c6Var);
        this.I = q5Var;
        this.H = sbVar;
    }

    @Override // bi.wa
    public final void b(boolean z10) {
        j5 j5Var = this.I.Q1;
        if (j5Var != null) {
            sb sbVar = ((jb) j5Var).d;
            sbVar.i1 = z10;
            sbVar.P();
        }
    }

    @Override // bi.wa
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
