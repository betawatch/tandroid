package fh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import fe.e;
import fe.f;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import rf.e0;
import vh.d;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends d implements e {
    public final fe.b k0;
    public final p6 l0;
    public boolean m0;

    public a(Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.k0 = new fe.b(0, this, gr.h, 320L, true);
        this.l0 = p6Var;
        f();
        setOutlineProvider(e0.b);
    }

    public final int m(int i10) {
        p6 p6Var = this.l0;
        return p6Var != null ? p6Var.h(i10) : t6.x0(null, i10, false);
    }

    @Override // vh.d, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        super.updateColors();
        fe.b bVar = this.k0;
        if (bVar == null || !this.m0) {
            return;
        }
        try {
            float f7 = bVar.e;
            int f10 = i0.b.f(f7, m(t6.d6), m(t6.Ci));
            Drawable background = getBackground();
            if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                ((ShapeDrawable) background).getPaint().setColor(f10);
                background.invalidateSelf();
            }
            setTextColor(i0.b.f(f7, m(t6.q7), m(t6.Gi)));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, f fVar) {
        this.m0 = true;
        p6 p6Var = this.l0;
        boolean a2 = p6Var != null ? p6Var.a() : t6.I.q();
        float f11 = this.k0.e;
        setElevation((1.0f - f11) * i0.L(1.0f));
        setColor(i0.b.f(f11, m(t6.d6), m(t6.Ci)));
        setTextColor(i0.b.f(f11, m(t6.q7), m(t6.Gi)));
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

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
