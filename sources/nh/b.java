package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
import yf.i0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b extends ci.d implements e {
    public final le.c h0;
    public final d6 i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = new le.c(0, this, rr.h, 320L, true);
        this.i0 = d6Var;
        e();
        setOutlineProvider(i0.b);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, f fVar) {
        d6 d6Var = this.i0;
        boolean a2 = d6Var != null ? d6Var.a() : h6.I.q();
        float f11 = this.h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(h6.d6), m(h6.Oh)));
        setTextColor(i0.a.d(f11, m(h6.q7), m(h6.Sh)));
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

    public final int m(int i10) {
        d6 d6Var = this.i0;
        return d6Var != null ? d6Var.G0(i10) : h6.w0(null, i10, false);
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
