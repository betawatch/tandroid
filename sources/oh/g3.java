package oh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g3 extends m8 {
    public final /* synthetic */ i9 E;
    public final /* synthetic */ f4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(f4 f4Var, Context context, j3 j3Var, org.telegram.ui.ActionBar.g6 g6Var, i9 i9Var) {
        super(context, j3Var, g6Var);
        this.F = f4Var;
        this.E = i9Var;
    }

    @Override // oh.m8
    public final void b(boolean z4) {
        z3 z3Var = this.F.N1;
        if (z3Var != null) {
            i9 i9Var = ((z8) z3Var).d;
            i9Var.f1 = z4;
            i9Var.P();
        }
    }

    @Override // oh.m8
    public final Bitmap getPlayingBitmap() {
        return this.F.getPlayingBitmap();
    }
}
