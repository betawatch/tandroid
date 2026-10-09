package ai;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w4 extends nb {
    public final /* synthetic */ kc H;
    public final /* synthetic */ f6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(f6 f6Var, Context context, b5 b5Var, org.telegram.ui.ActionBar.e6 e6Var, kc kcVar) {
        super(context, b5Var, e6Var);
        this.I = f6Var;
        this.H = kcVar;
    }

    @Override // ai.nb
    public final void b(boolean z10) {
        y5 y5Var = this.I.Q1;
        if (y5Var != null) {
            kc kcVar = ((bc) y5Var).d;
            kcVar.i1 = z10;
            kcVar.P();
        }
    }

    @Override // ai.nb
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
