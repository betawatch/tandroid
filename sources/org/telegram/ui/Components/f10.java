package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f10 extends FrameLayout implements fe.e, org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final fe.b a;
    public final fe.b b;
    public final ei0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.p6 e;
    public ArrayList f;
    public final boolean h;
    public final hi.c n;
    public final vg.f r;
    public final e10 s;
    public org.telegram.ui.Cells.y w;
    public int x;
    public boolean y;

    public f10(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f7) {
        if (view == null) {
            return;
        }
        view.setAlpha(f7);
        view.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        view.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
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
        vg.f fVar = this.r;
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

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        vg.f fVar = this.r;
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        RadialProgressView radialProgressView;
        ei0 ei0Var = this.c;
        if (ei0Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z10 = this.w != null && getBackground() == this.w;
        boolean z11 = this.h;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        if (!z11) {
            int i10 = org.telegram.ui.ActionBar.t6.O9;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            if (w02 != this.x || !this.y) {
                this.x = w02;
                this.y = true;
                ei0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ei, p6Var);
            if (!z10) {
                this.D = w03;
                this.E = w04;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(48.0f), w03, w04);
                this.w = j02;
                setBackground(j02);
                return;
            }
            if (w03 == this.D && w04 == this.E) {
                return;
            }
            this.D = w03;
            this.E = w04;
            org.telegram.ui.ActionBar.t6.H1(this.w, w03, false);
            org.telegram.ui.ActionBar.t6.H1(this.w, w04, true);
            this.w.invalidateSelf();
            return;
        }
        int i11 = org.telegram.ui.ActionBar.t6.v8;
        int w05 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        if (w05 != this.x || !this.y) {
            this.x = w05;
            this.y = true;
            ei0Var.setColorFilter(w05, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        hi.c cVar = this.n;
        if (cVar != null) {
            cVar.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        }
        e10 e10Var = this.s;
        if (e10Var != null) {
            e10Var.d();
        }
        vg.f fVar = this.r;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
        int L = org.telegram.messenger.i0.L(18.0f);
        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var);
        if (z10) {
            if (w06 != this.E) {
                this.E = w06;
                org.telegram.ui.ActionBar.t6.H1(this.w, w06, true);
                return;
            }
            return;
        }
        this.E = w06;
        int L2 = org.telegram.messenger.i0.L(6.0f);
        org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.t6.Y(L, w06, L2, L2, L2, L2);
        this.w = Y;
        setBackground(Y);
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11 = 0;
        if (i10 == 0) {
            d(this, f7);
            setClickable(f7 >= 0.99f);
            setAdditionalTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(this.h ? 64.0f : 40.0f));
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

    public f10(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 380L, true);
        this.b = new fe.b(1, this, grVar, 380L, false);
        this.e = p6Var;
        this.h = z10;
        ei0 ei0Var = new ei0(context);
        this.c = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ei0Var, w7.b6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.b6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.e6.a(this);
        if (!z10) {
            setOutlineProvider(rf.e0.a);
            setTranslationZ(org.telegram.messenger.i0.N(0.5f));
        }
        if (z10) {
            e10 e10Var = new e10(org.telegram.ui.ActionBar.t6.h5, null);
            this.s = e10Var;
            hi.c cVar = new hi.c();
            this.n = cVar;
            vg.f fVar = new vg.f(cVar);
            this.r = fVar;
            fVar.o(e10Var);
            float N = org.telegram.messenger.i0.N(0.4f);
            float N2 = org.telegram.messenger.i0.N(0.4f);
            vg.e eVar = fVar.M;
            eVar.i = N;
            eVar.j = N2;
            fVar.L = null;
            org.telegram.messenger.z20.u(fVar, org.telegram.messenger.i0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
