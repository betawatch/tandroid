package oh;

import android.content.Context;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import zf.j0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class b extends ei.d implements ne.d {
    public final ne.b h0;
    public final d6 i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = new ne.b(0, this, bs.h, 320L, true);
        this.i0 = d6Var;
        e();
        setOutlineProvider(j0.b);
    }

    public final int m(int i10) {
        d6 d6Var = this.i0;
        return d6Var != null ? d6Var.u(i10) : h6.x0(null, i10, false);
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, e eVar) {
        d6 d6Var = this.i0;
        boolean a2 = d6Var != null ? d6Var.a() : h6.I.q();
        float f11 = this.h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(h6.d6), m(h6.Oh)));
        setTextColor(i0.a.f(f11, m(h6.q7), m(h6.Sh)));
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
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
