package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import yf.f0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class b extends ci.d implements le.d {
    public final le.b h0;
    public final d6 i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = new le.b(0, this, tr.h, 320L, true);
        this.i0 = d6Var;
        e();
        setOutlineProvider(f0.b);
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, e eVar) {
        d6 d6Var = this.i0;
        boolean a2 = d6Var != null ? d6Var.a() : i6.I.q();
        float f11 = this.h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(i6.d6), m(i6.Oh)));
        setTextColor(i0.a.d(f11, m(i6.q7), m(i6.Sh)));
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
        return d6Var != null ? d6Var.H0(i10) : i6.w0(null, i10, false);
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
