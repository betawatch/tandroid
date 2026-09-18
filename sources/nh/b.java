package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
import yf.k0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class b extends ci.d implements le.d {
    public final le.b h0;
    public final e6 i0;

    public b(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.h0 = new le.b(0, this, qr.h, 320L, true);
        this.i0 = e6Var;
        e();
        setOutlineProvider(k0.b);
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, e eVar) {
        e6 e6Var = this.i0;
        boolean a2 = e6Var != null ? e6Var.a() : j6.I.q();
        float f11 = this.h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(j6.d6), m(j6.Oh)));
        setTextColor(i0.a.d(f11, m(j6.q7), m(j6.Sh)));
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
        e6 e6Var = this.i0;
        return e6Var != null ? e6Var.G0(i10) : j6.w0(null, i10, false);
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
