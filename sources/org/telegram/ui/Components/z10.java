package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z10 extends FrameLayout implements le.e {
    public final le.c a;
    public final le.c b;
    public final lj0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.d6 e;
    public ArrayList f;
    public final boolean h;
    public final fh.c n;
    public final ch.f r;
    public final ci.f s;
    public float v;
    public float w;
    public boolean x;

    public z10(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f7) {
        if (view == null) {
            return;
        }
        view.setAlpha(f7);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        view.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f7) {
        if (this.v != f7) {
            this.x = true;
            super.setTranslationY(this.w + f7);
            this.x = false;
            this.v = f7;
        }
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11 = 0;
        if (i10 == 0) {
            d(this, f7);
            setClickable(f7 >= 0.99f);
            setAdditionalTranslationY((1.0f - f7) * AndroidUtilities.dp(this.h ? 64.0f : 40.0f));
        } else if (i10 == 1) {
            d(this.d, f7);
            float f11 = 1.0f - f7;
            d(this.c, f11);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f11);
                }
            }
        }
    }

    public final void a(View view) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(view);
        d(view, 1.0f - this.b.e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ch.f fVar = this.r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        lj0 lj0Var = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        if (!z10) {
            int i10 = org.telegram.ui.ActionBar.h6.O9;
            lj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
            setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var)));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.v8;
        lj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        this.n.a(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        this.s.d();
        this.r.v();
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.h6.W(dp, v02, dp2, dp2, dp2, dp2));
    }

    public boolean getButtonVisible() {
        return this.a.f;
    }

    public boolean getProgressVisible() {
        return this.b.f;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return this.x ? super.getTranslationY() : this.w;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ch.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.c.setImageResource(i10);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (this.w != f7) {
            this.x = true;
            super.setTranslationY(this.v + f7);
            this.x = false;
            this.w = f7;
        }
    }

    public z10(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        rr rrVar = rr.h;
        this.a = new le.c(0, this, rrVar, 380L, true);
        this.b = new le.c(1, this, rrVar, 380L, false);
        this.e = d6Var;
        this.h = z10;
        lj0 lj0Var = new lj0(context);
        this.c = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(lj0Var, w7.y5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.y5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.a6.a(this);
        if (!z10) {
            setOutlineProvider(yf.i0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ci.f fVar = new ci.f(org.telegram.ui.ActionBar.h6.h5, null);
            this.s = fVar;
            fh.c cVar = new fh.c();
            this.n = cVar;
            ch.f fVar2 = new ch.f(cVar);
            this.r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ch.c cVar2 = fVar2.j;
            cVar2.i = dpf2;
            cVar2.j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
