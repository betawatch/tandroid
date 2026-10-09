package nh;

import android.content.Context;
import android.os.Build;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import yf.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b extends ci.d implements me.d {
    public final me.b h0;
    public final e6 i0;

    public b(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.h0 = new me.b(0, this, hs.h, 320L, true);
        this.i0 = e6Var;
        e();
        setOutlineProvider(i0.b);
    }

    public final int m(int i10) {
        e6 e6Var = this.i0;
        return e6Var != null ? e6Var.x0(i10) : i6.x0(null, i10, false);
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, e eVar) {
        e6 e6Var = this.i0;
        boolean a2 = e6Var != null ? e6Var.a() : i6.I.q();
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

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
