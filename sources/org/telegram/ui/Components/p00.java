package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final te.a a;
    public final te.a b;
    public final ch0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ArrayList f;
    public final boolean h;
    public final ri.c n;
    public final fh.g r;
    public final fi.f s;
    public org.telegram.ui.Cells.y w;
    public int x;
    public boolean y;

    public p00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
        if (this.F != f10) {
            this.H = true;
            super.setTranslationY(this.G + f10);
            this.H = false;
            this.F = f10;
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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

    public final void e(boolean z9, boolean z10) {
        this.a.a(z9, z10);
    }

    public final void f(boolean z9, boolean z10) {
        this.b.a(z9, z10);
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
        if (this.G != f10) {
            this.H = true;
            super.setTranslationY(this.F + f10);
            this.H = false;
            this.G = f10;
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        RadialProgressView radialProgressView;
        ch0 ch0Var = this.c;
        if (ch0Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z9 = this.w != null && getBackground() == this.w;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        if (!z10) {
            int i7 = org.telegram.ui.ActionBar.k6.O9;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            if (w02 != this.x || !this.y) {
                this.x = w02;
                this.y = true;
                ch0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, f6Var);
            if (!z9) {
                this.D = w03;
                this.E = w04;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(48.0f), w03, w04);
                this.w = j02;
                setBackground(j02);
                return;
            }
            if (w03 == this.D && w04 == this.E) {
                return;
            }
            this.D = w03;
            this.E = w04;
            org.telegram.ui.ActionBar.k6.H1(this.w, w03, false);
            org.telegram.ui.ActionBar.k6.H1(this.w, w04, true);
            this.w.invalidateSelf();
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        if (w05 != this.x || !this.y) {
            this.x = w05;
            this.y = true;
            ch0Var.setColorFilter(w05, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        ri.c cVar = this.n;
        if (cVar != null) {
            cVar.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        fi.f fVar = this.s;
        if (fVar != null) {
            fVar.d();
        }
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        int L = org.telegram.messenger.g0.L(18.0f);
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var);
        if (z9) {
            if (w06 != this.E) {
                this.E = w06;
                org.telegram.ui.ActionBar.k6.H1(this.w, w06, true);
                return;
            }
            return;
        }
        this.E = w06;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(L, w06, L2, L2, L2, L2);
        this.w = Y;
        setBackground(Y);
    }

    public p00(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 380L, true);
        this.b = new te.a(1, this, xqVar, 380L, false);
        this.e = f6Var;
        this.h = z9;
        ch0 ch0Var = new ch0(context);
        this.c = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ch0Var, c8.ha.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.ha.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.ka.a(this);
        if (!z9) {
            setOutlineProvider(bg.u0.a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z9) {
            fi.f fVar = new fi.f(org.telegram.ui.ActionBar.k6.h5, null);
            this.s = fVar;
            ri.c cVar = new ri.c();
            this.n = cVar;
            fh.g gVar = new fh.g(cVar, cVar, cVar);
            this.r = gVar;
            gVar.p(fVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar2 = gVar.Q;
            fVar2.i = N;
            fVar2.j = N2;
            gVar.O = null;
            org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
