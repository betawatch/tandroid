package ai;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class v4 extends mb {
    public final /* synthetic */ jc H;
    public final /* synthetic */ f6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(f6 f6Var, Context context, a5 a5Var, org.telegram.ui.ActionBar.e6 e6Var, jc jcVar) {
        super(context, a5Var, e6Var);
        this.I = f6Var;
        this.H = jcVar;
    }

    @Override // ai.mb
    public final void b(boolean z10) {
        y5 y5Var = this.I.Q1;
        if (y5Var != null) {
            jc jcVar = ((ac) y5Var).d;
            jcVar.i1 = z10;
            jcVar.P();
        }
    }

    @Override // ai.mb
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
