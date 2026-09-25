package ai;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
