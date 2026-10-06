package ai;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class v4 extends mb {
    public final /* synthetic */ jc H;
    public final /* synthetic */ e6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(e6 e6Var, Context context, a5 a5Var, org.telegram.ui.ActionBar.d6 d6Var, jc jcVar) {
        super(context, a5Var, d6Var);
        this.I = e6Var;
        this.H = jcVar;
    }

    @Override // ai.mb
    public final void b(boolean z10) {
        x5 x5Var = this.I.Q1;
        if (x5Var != null) {
            jc jcVar = ((ac) x5Var).d;
            jcVar.i1 = z10;
            jcVar.P();
        }
    }

    @Override // ai.mb
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
