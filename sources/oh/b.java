package oh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import zf.j0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class b extends ei.d implements ne.d {
    public final ne.b k0;
    public final g6 l0;
    public boolean m0;

    public b(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.k0 = new ne.b(0, this, bs.h, 320L, true);
        this.l0 = g6Var;
        f();
        setOutlineProvider(j0.b);
    }

    public final int m(int i10) {
        g6 g6Var = this.l0;
        return g6Var != null ? g6Var.g(i10) : k6.x0(null, i10, false);
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, e eVar) {
        this.m0 = true;
        g6 g6Var = this.l0;
        boolean a2 = g6Var != null ? g6Var.a() : k6.I.q();
        float f11 = this.k0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(k6.d6), m(k6.Oh)));
        setTextColor(i0.a.f(f11, m(k6.q7), m(k6.Sh)));
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

    @Override // ei.d, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        ne.b bVar = this.k0;
        if (bVar == null || !this.m0) {
            return;
        }
        try {
            float f7 = bVar.e;
            int f10 = i0.a.f(f7, m(k6.d6), m(k6.Oh));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                ((ShapeDrawable) background).getPaint().setColor(f10);
                background.invalidateSelf();
            }
            setTextColor(i0.a.f(f7, m(k6.q7), m(k6.Sh)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
