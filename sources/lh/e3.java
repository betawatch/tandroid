package lh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e3 extends m8 {
    public final /* synthetic */ i9 D;
    public final /* synthetic */ d4 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(d4 d4Var, Context context, h3 h3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var) {
        super(context, h3Var, c6Var);
        this.E = d4Var;
        this.D = i9Var;
    }

    @Override // lh.m8
    public final void b(boolean z10) {
        x3 x3Var = this.E.M1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.e1 = z10;
            i9Var.P();
        }
    }

    @Override // lh.m8
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
