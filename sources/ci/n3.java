package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class n3 extends e9 {
    public final /* synthetic */ aa H;
    public final /* synthetic */ q4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(q4 q4Var, Context context, r3 r3Var, org.telegram.ui.ActionBar.d6 d6Var, aa aaVar) {
        super(context, r3Var, d6Var);
        this.I = q4Var;
        this.H = aaVar;
    }

    @Override // ci.e9
    public final void b(boolean z10) {
        j4 j4Var = this.I.Q1;
        if (j4Var != null) {
            aa aaVar = ((r9) j4Var).d;
            aaVar.i1 = z10;
            aaVar.P();
        }
    }

    @Override // ci.e9
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
