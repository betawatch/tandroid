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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j10 extends FrameLayout implements td.b {
    public final td.a a;
    public final td.a b;
    public final pi0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.b6 e;
    public ArrayList f;
    public final boolean h;
    public final ng.c n;
    public final kg.f r;
    public final kh.f s;
    public float v;
    public float w;
    public boolean x;

    public j10(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, b6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10 = 0;
        if (i9 == 0) {
            d(this, f10);
            setClickable(f10 >= 0.99f);
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(this.h ? 64.0f : 40.0f));
        } else if (i9 == 1) {
            d(this.d, f10);
            float f12 = 1.0f - f10;
            d(this.c, f12);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
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
        kg.f fVar = this.r;
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
        pi0 pi0Var = this.c;
        org.telegram.ui.ActionBar.b6 b6Var = this.e;
        if (!z10) {
            int i9 = org.telegram.ui.ActionBar.f6.O9;
            pi0Var.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var)));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.v8;
        pi0Var.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        this.n.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        this.s.b();
        this.r.u();
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.f6.W(dp, v02, dp2, dp2, dp2, dp2));
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        kg.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i9, i10);
        }
    }

    public void setImageResource(int i9) {
        this.c.setImageResource(i9);
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

    public j10(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 380L, true);
        this.b = new td.a(1, this, grVar, 380L, false);
        this.e = b6Var;
        this.h = z10;
        pi0 pi0Var = new pi0(context);
        this.c = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(pi0Var, g7.e6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, g7.e6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        g7.g6.a(this);
        if (!z10) {
            setOutlineProvider(ff.r0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            kh.f fVar = new kh.f(org.telegram.ui.ActionBar.f6.h5, null);
            this.s = fVar;
            ng.c cVar = new ng.c();
            this.n = cVar;
            kg.f fVar2 = new kg.f(cVar);
            this.r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            kg.c cVar2 = fVar2.h;
            cVar2.i = dpf2;
            cVar2.j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
