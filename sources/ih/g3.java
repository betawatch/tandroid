package ih;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g3 extends q8 {
    public final /* synthetic */ m9 D;
    public final /* synthetic */ i4 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i4 i4Var, Context context, l3 l3Var, org.telegram.ui.ActionBar.b6 b6Var, m9 m9Var) {
        super(context, l3Var, b6Var);
        this.E = i4Var;
        this.D = m9Var;
    }

    @Override // ih.q8
    public final void b(boolean z10) {
        c4 c4Var = this.E.M1;
        if (c4Var != null) {
            m9 m9Var = ((d9) c4Var).d;
            m9Var.e1 = z10;
            m9Var.P();
        }
    }

    @Override // ih.q8
    public final Bitmap getPlayingBitmap() {
        return this.E.getPlayingBitmap();
    }
}
