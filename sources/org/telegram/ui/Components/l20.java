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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l20 extends FrameLayout implements ne.d {
    public final ne.b a;
    public final ne.b b;
    public final bk0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.c6 e;
    public ArrayList f;
    public final boolean h;
    public final gh.c n;
    public final dh.f r;
    public final di.f s;
    public float v;
    public float w;
    public boolean x;

    public l20(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return w7.z5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, (LocaleController.isRTL ? 3 : 5) | 80);
    }

    public static FrameLayout.LayoutParams c() {
        return w7.z5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, (LocaleController.isRTL ? 3 : 5) | 80);
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

    public final void a(View view) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(view);
        d(view, 1.0f - this.b.e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        dh.f fVar = this.r;
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
        bk0 bk0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        if (!z10) {
            int i10 = org.telegram.ui.ActionBar.g6.O9;
            bk0Var.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
            setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Qh, c6Var)));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        bk0Var.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        this.n.a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        this.s.b();
        this.r.v();
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.g6.X(dp, w02, dp2, dp2, dp2, dp2));
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
        dh.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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

    public l20(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        es esVar = es.h;
        this.a = new ne.b(0, this, esVar, 380L, true);
        this.b = new ne.b(1, this, esVar, 380L, false);
        this.e = c6Var;
        this.h = z10;
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bk0Var, w7.z5.d(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.z5.d(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.b6.a(this);
        if (!z10) {
            setOutlineProvider(zf.j0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            di.f fVar = new di.f(org.telegram.ui.ActionBar.g6.h5, null);
            this.s = fVar;
            gh.c cVar = new gh.c();
            this.n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.j;
            cVar2.i = dpf2;
            cVar2.j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
