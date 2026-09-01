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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a20 extends FrameLayout implements xd.b {
    public final xd.a a;
    public final xd.a b;
    public final lj0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.g6 e;
    public ArrayList f;
    public final boolean h;
    public final tg.c n;
    public final qg.d r;
    public final z10 s;
    public float v;
    public float w;
    public boolean x;

    public a20(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.v != f10) {
            this.x = true;
            super.setTranslationY(this.w + f10);
            this.x = false;
            this.v = f10;
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11 = 0;
        if (i10 == 0) {
            d(this, f10);
            setClickable(f10 >= 0.99f);
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(this.h ? 64.0f : 40.0f));
        } else if (i10 == 1) {
            d(this.d, f10);
            float f12 = 1.0f - f10;
            d(this.c, f12);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f12);
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
        qg.d dVar = this.r;
        if (dVar != null) {
            dVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        this.a.a(z4, z10);
    }

    public final void f(boolean z4, boolean z10) {
        this.b.a(z4, z10);
    }

    public final void g() {
        boolean z4 = this.h;
        RadialProgressView radialProgressView = this.d;
        lj0 lj0Var = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        if (!z4) {
            int i10 = org.telegram.ui.ActionBar.k6.O9;
            lj0Var.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var)));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.v8;
        lj0Var.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        this.n.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.s.b();
        this.r.u();
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.k6.W(dp, v02, dp2, dp2, dp2, dp2));
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
        qg.d dVar = this.r;
        if (dVar != null) {
            dVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.c.setImageResource(i10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (this.w != f10) {
            this.x = true;
            super.setTranslationY(this.v + f10);
            this.x = false;
            this.w = f10;
        }
    }

    public a20(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        pr prVar = pr.h;
        this.a = new xd.a(0, this, prVar, 380L, true);
        this.b = new xd.a(1, this, prVar, 380L, false);
        this.e = g6Var;
        this.h = z4;
        lj0 lj0Var = new lj0(context);
        this.c = lj0Var;
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(lj0Var, k7.c6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, k7.c6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        k7.e6.a(this);
        if (!z4) {
            setOutlineProvider(lf.q0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z4) {
            z10 z10Var = new z10(org.telegram.ui.ActionBar.k6.h5, null);
            this.s = z10Var;
            tg.c cVar = new tg.c();
            this.n = cVar;
            qg.d dVar = new qg.d(cVar);
            this.r = dVar;
            dVar.n(z10Var);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            qg.a aVar = dVar.h;
            aVar.i = dpf2;
            aVar.j = dpf22;
            dVar.p(AndroidUtilities.dp(18.0f));
            dVar.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
