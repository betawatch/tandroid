package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c10 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final te.a a;
    public final te.a b;
    public final rh0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.h6 e;
    public ArrayList f;
    public final boolean h;
    public final ui.c n;
    public final fh.g r;
    public final hi.g s;
    public org.telegram.ui.Cells.y w;
    public int x;
    public boolean y;

    public c10(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return c8.ma.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return c8.ma.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        view.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        view.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.G != f10) {
            this.I = true;
            super.setTranslationY(this.H + f10);
            this.I = false;
            this.G = f10;
        }
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10 = 0;
        if (i7 == 0) {
            d(this, f10);
            setClickable(f10 >= 0.99f);
            setAdditionalTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(this.h ? 64.0f : 40.0f));
        } else if (i7 == 1) {
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
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.draw(canvas);
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
        return this.I ? super.getTranslationY() : this.H;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.setBounds(0, 0, i7, i10);
        }
    }

    public void setImageResource(int i7) {
        this.c.setImageResource(i7);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (this.H != f10) {
            this.I = true;
            super.setTranslationY(this.G + f10);
            this.I = false;
            this.H = f10;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        RadialProgressView radialProgressView;
        rh0 rh0Var = this.c;
        if (rh0Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z10 = this.w != null && getBackground() == this.w;
        boolean z11 = this.h;
        org.telegram.ui.ActionBar.h6 h6Var = this.e;
        if (!z11) {
            int i7 = org.telegram.ui.ActionBar.m6.O9;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            if (w02 != this.x || !this.y) {
                this.x = w02;
                this.y = true;
                rh0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hi, h6Var);
            if (!z10) {
                this.E = w03;
                this.F = w04;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(48.0f), w03, w04);
                this.w = j02;
                setBackground(j02);
                return;
            }
            if (w03 == this.E && w04 == this.F) {
                return;
            }
            this.E = w03;
            this.F = w04;
            org.telegram.ui.ActionBar.m6.H1(this.w, w03, false);
            org.telegram.ui.ActionBar.m6.H1(this.w, w04, true);
            this.w.invalidateSelf();
            return;
        }
        int i10 = org.telegram.ui.ActionBar.m6.v8;
        int w05 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (w05 != this.x || !this.y) {
            this.x = w05;
            this.y = true;
            rh0Var.setColorFilter(w05, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        ui.c cVar = this.n;
        if (cVar != null) {
            cVar.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
        }
        hi.g gVar = this.s;
        if (gVar != null) {
            gVar.d();
        }
        fh.g gVar2 = this.r;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
        int L = org.telegram.messenger.g0.L(18.0f);
        int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var);
        if (z10) {
            if (w06 != this.F) {
                this.F = w06;
                org.telegram.ui.ActionBar.m6.H1(this.w, w06, true);
                return;
            }
            return;
        }
        this.F = w06;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.m6.Y(L, w06, L2, L2, L2, L2);
        this.w = Y;
        setBackground(Y);
    }

    public c10(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        nr nrVar = nr.h;
        this.a = new te.a(0, this, nrVar, 380L, true);
        this.b = new te.a(1, this, nrVar, 380L, false);
        this.e = h6Var;
        this.h = z10;
        rh0 rh0Var = new rh0(context);
        this.c = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(rh0Var, c8.ma.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.ma.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.ra.a(this);
        if (!z10) {
            setOutlineProvider(bg.u0.a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z10) {
            hi.g gVar = new hi.g(org.telegram.ui.ActionBar.m6.h5, null);
            this.s = gVar;
            ui.c cVar = new ui.c();
            this.n = cVar;
            fh.g gVar2 = new fh.g(cVar, cVar, cVar);
            this.r = gVar2;
            gVar2.p(gVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar = gVar2.R;
            fVar.i = N;
            fVar.j = N2;
            gVar2.P = null;
            org.telegram.messenger.n10.s(gVar2, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
