package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h20 extends FrameLayout implements ne.d, org.telegram.ui.ActionBar.b6 {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final ne.b a;
    public final ne.b b;
    public final bk0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.g6 e;
    public ArrayList f;
    public final boolean h;
    public final gh.c n;
    public final dh.f r;
    public final ei.f s;
    public org.telegram.ui.Cells.y v;
    public int w;
    public boolean x;
    public int y;

    public h20(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
        if (this.F != f7) {
            this.H = true;
            super.setTranslationY(this.G + f7);
            this.H = false;
            this.F = f7;
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

    public boolean getButtonVisible() {
        return this.a.f;
    }

    public boolean getProgressVisible() {
        return this.b.f;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return this.H ? super.getTranslationY() : this.G;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
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

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dh.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.c.setImageResource(i10);
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (this.G != f7) {
            this.H = true;
            super.setTranslationY(this.F + f7);
            this.H = false;
            this.G = f7;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        RadialProgressView radialProgressView;
        bk0 bk0Var = this.c;
        if (bk0Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z10 = this.v != null && getBackground() == this.v;
        boolean z11 = this.h;
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        if (!z11) {
            int i10 = org.telegram.ui.ActionBar.k6.O9;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            if (w02 != this.w || !this.x) {
                this.w = w02;
                this.x = true;
                bk0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
            if (!z10) {
                this.y = w03;
                this.E = w04;
                org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(48.0f), w03, w04);
                this.v = i02;
                setBackground(i02);
                return;
            }
            if (w03 == this.y && w04 == this.E) {
                return;
            }
            this.y = w03;
            this.E = w04;
            org.telegram.ui.ActionBar.k6.E1(this.v, w03, false);
            org.telegram.ui.ActionBar.k6.E1(this.v, w04, true);
            this.v.invalidateSelf();
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.v8;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        if (w05 != this.w || !this.x) {
            this.w = w05;
            this.x = true;
            bk0Var.setColorFilter(w05, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        gh.c cVar = this.n;
        if (cVar != null) {
            cVar.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        ei.f fVar = this.s;
        if (fVar != null) {
            fVar.c();
        }
        dh.f fVar2 = this.r;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var);
        if (z10) {
            if (w06 != this.E) {
                this.E = w06;
                org.telegram.ui.ActionBar.k6.E1(this.v, w06, true);
                return;
            }
            return;
        }
        this.E = w06;
        int dp2 = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.k6.X(dp, w06, dp2, dp2, dp2, dp2);
        this.v = X;
        setBackground(X);
    }

    public h20(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 380L, true);
        this.b = new ne.b(1, this, bsVar, 380L, false);
        this.e = g6Var;
        this.h = z10;
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bk0Var, w7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.z5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.b6.a(this);
        if (!z10) {
            setOutlineProvider(zf.j0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ei.f fVar = new ei.f(org.telegram.ui.ActionBar.k6.h5, null);
            this.s = fVar;
            gh.c cVar = new gh.c();
            this.n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.v;
            cVar2.i = dpf2;
            cVar2.j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
