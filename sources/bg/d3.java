package bg;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d3 extends kh.d {
    public final /* synthetic */ g3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(g3 g3Var, Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.d0 = g3Var;
    }

    @Override // kh.d
    public final float a(float f10, float f11) {
        g3 g3Var = this.d0;
        boolean z10 = g3Var.p0 == 0.0f;
        g3Var.p0 = f10;
        if (z10) {
            g3Var.q0 = new z2(g3Var, 0);
            g3Var.f0(false);
        }
        return f10;
    }
}
