package bh;

import android.content.Context;
import android.os.Build;
import lf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c extends qh.d implements xd.b {
    public final xd.a e0;
    public final g6 f0;

    public c(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.e0 = new xd.a(0, this, pr.h, 320L, true);
        this.f0 = g6Var;
        e();
        setOutlineProvider(q0.b);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        g6 g6Var = this.f0;
        boolean a2 = g6Var != null ? g6Var.a() : k6.I.q();
        float f12 = this.e0.e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(k6.d6), m(k6.Oh)));
        setTextColor(i0.a.d(f12, m(k6.q7), m(k6.Sh)));
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
        g6 g6Var = this.f0;
        return g6Var != null ? g6Var.B0(i10) : k6.w0(null, i10, false);
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
