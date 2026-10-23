package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m3 extends d9 {
    public final /* synthetic */ z9 H;
    public final /* synthetic */ p4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p4 p4Var, Context context, q3 q3Var, org.telegram.ui.ActionBar.g6 g6Var, z9 z9Var) {
        super(context, q3Var, g6Var);
        this.I = p4Var;
        this.H = z9Var;
    }

    @Override // ci.d9
    public final void b(boolean z10) {
        i4 i4Var = this.I.Q1;
        if (i4Var != null) {
            z9 z9Var = ((q9) i4Var).d;
            z9Var.i1 = z10;
            z9Var.P();
        }
    }

    @Override // ci.d9
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
