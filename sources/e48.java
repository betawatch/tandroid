// default package

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class e48 extends x6b {
    public final /* synthetic */ oab I;
    public final /* synthetic */ a58 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e48(a58 a58Var, Context context, g48 g48Var, r63 r63Var, oab oabVar) {
        super(context, g48Var, r63Var);
        this.J = a58Var;
        this.I = oabVar;
    }

    @Override // x6b
    public final void b(boolean z) {
        w48 w48Var = this.J.G1;
        if (w48Var != null) {
            oab oabVar = ((fab) w48Var).d;
            oabVar.i1 = z;
            oabVar.U();
        }
    }

    @Override // x6b
    public final Bitmap getPlayingBitmap() {
        return this.J.getPlayingBitmap();
    }
}
