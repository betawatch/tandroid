package ah;

import android.content.Context;
import android.os.Build;
import lf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c extends ph.d implements xd.b {
    public final xd.a e0;
    public final f6 f0;

    public c(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.e0 = new xd.a(0, this, nr.h, 320L, true);
        this.f0 = f6Var;
        e();
        setOutlineProvider(q0.b);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        f6 f6Var = this.f0;
        boolean a2 = f6Var != null ? f6Var.a() : j6.I.q();
        float f12 = this.e0.e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(j6.d6), m(j6.Oh)));
        setTextColor(i0.a.d(f12, m(j6.q7), m(j6.Sh)));
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
        f6 f6Var = this.f0;
        return f6Var != null ? f6Var.x0(i10) : j6.w0(null, i10, false);
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
