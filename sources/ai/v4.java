package ai;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class v4 extends mb {
    public final /* synthetic */ jc H;
    public final /* synthetic */ f6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(f6 f6Var, Context context, a5 a5Var, org.telegram.ui.ActionBar.f6 f6Var2, jc jcVar) {
        super(context, a5Var, f6Var2);
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
