package mh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
import xf.k0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b extends bi.d implements le.d {
    public final le.b h0;
    public final f6 i0;

    public b(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = new le.b(0, this, wr.h, 320L, true);
        this.i0 = f6Var;
        e();
        setOutlineProvider(k0.b);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, e eVar) {
        f6 f6Var = this.i0;
        boolean a2 = f6Var != null ? f6Var.a() : j6.I.q();
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
        f6 f6Var = this.i0;
        return f6Var != null ? f6Var.F0(i10) : j6.w0(null, i10, false);
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
