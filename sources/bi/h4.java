package bi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class h4 extends ta {
    public final /* synthetic */ pb H;
    public final /* synthetic */ o5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(o5 o5Var, Context context, l4 l4Var, org.telegram.ui.ActionBar.f6 f6Var, pb pbVar) {
        super(context, l4Var, f6Var);
        this.I = o5Var;
        this.H = pbVar;
    }

    @Override // bi.ta
    public final void b(boolean z10) {
        h5 h5Var = this.I.Q1;
        if (h5Var != null) {
            pb pbVar = ((gb) h5Var).d;
            pbVar.i1 = z10;
            pbVar.P();
        }
    }

    @Override // bi.ta
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
