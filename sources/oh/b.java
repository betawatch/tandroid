package oh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
import yf.j0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b extends di.d implements le.d {
    public final le.b h0;
    public final f6 i0;

    public b(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = new le.b(0, this, pr.h, 320L, true);
        this.i0 = f6Var;
        e();
        setOutlineProvider(j0.b);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, e eVar) {
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
        return f6Var != null ? f6Var.G0(i10) : j6.w0(null, i10, false);
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
