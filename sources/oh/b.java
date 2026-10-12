package oh;

import android.content.Context;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import zf.j0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b extends di.d implements ne.d {
    public final ne.b h0;
    public final c6 i0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.h0 = new ne.b(0, this, es.h, 320L, true);
        this.i0 = c6Var;
        e();
        setOutlineProvider(j0.b);
    }

    public final int m(int i10) {
        c6 c6Var = this.i0;
        return c6Var != null ? c6Var.F0(i10) : g6.x0(null, i10, false);
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, e eVar) {
        c6 c6Var = this.i0;
        boolean a2 = c6Var != null ? c6Var.a() : g6.I.q();
        float f11 = this.h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(g6.d6), m(g6.Oh)));
        setTextColor(i0.a.d(f11, m(g6.q7), m(g6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (a2) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
            } else {
                setOutlineAmbientShadowColor(1610612736);
                setOutlineSpotShadowColor(1610612736);
            }
        }
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
