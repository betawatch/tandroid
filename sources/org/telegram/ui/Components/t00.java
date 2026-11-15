package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final te.a a;
    public final te.a b;
    public final fh0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.e6 e;
    public ArrayList f;
    public final boolean h;
    public final ui.c n;
    public final fh.g r;
    public final hi.f s;
    public org.telegram.ui.Cells.y w;
    public int x;
    public boolean y;

    public t00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
    public final void G(int i7, float f10, float f11, te.c cVar) {
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        RadialProgressView radialProgressView;
        fh0 fh0Var = this.c;
        if (fh0Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z10 = this.w != null && getBackground() == this.w;
        boolean z11 = this.h;
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        if (!z11) {
            int i7 = org.telegram.ui.ActionBar.j6.O9;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            if (w02 != this.x || !this.y) {
                this.x = w02;
                this.y = true;
                fh0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Hi, e6Var);
            if (!z10) {
                this.E = w03;
                this.F = w04;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(48.0f), w03, w04);
                this.w = j02;
                setBackground(j02);
                return;
            }
            if (w03 == this.E && w04 == this.F) {
                return;
            }
            this.E = w03;
            this.F = w04;
            org.telegram.ui.ActionBar.j6.H1(this.w, w03, false);
            org.telegram.ui.ActionBar.j6.H1(this.w, w04, true);
            this.w.invalidateSelf();
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        int w05 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        if (w05 != this.x || !this.y) {
            this.x = w05;
            this.y = true;
            fh0Var.setColorFilter(w05, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        ui.c cVar = this.n;
        if (cVar != null) {
            cVar.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
        hi.f fVar = this.s;
        if (fVar != null) {
            fVar.d();
        }
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        int L = org.telegram.messenger.g0.L(18.0f);
        int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, e6Var);
        if (z10) {
            if (w06 != this.F) {
                this.F = w06;
                org.telegram.ui.ActionBar.j6.H1(this.w, w06, true);
                return;
            }
            return;
        }
        this.F = w06;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.j6.Y(L, w06, L2, L2, L2, L2);
        this.w = Y;
        setBackground(Y);
    }

    public t00(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 380L, true);
        this.b = new te.a(1, this, erVar, 380L, false);
        this.e = e6Var;
        this.h = z10;
        fh0 fh0Var = new fh0(context);
        this.c = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, c8.ja.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.ja.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.na.a(this);
        if (!z10) {
            setOutlineProvider(bg.t0.a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z10) {
            hi.f fVar = new hi.f(org.telegram.ui.ActionBar.j6.h5, null);
            this.s = fVar;
            ui.c cVar = new ui.c();
            this.n = cVar;
            fh.g gVar = new fh.g(cVar, cVar, cVar);
            this.r = gVar;
            gVar.p(fVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar2 = gVar.R;
            fVar2.i = N;
            fVar2.j = N2;
            gVar.P = null;
            org.telegram.messenger.i20.r(gVar, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
