package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oy0 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public ly0 b;
    public ly0 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public oy0(ProfileActivity profileActivity, ly0 ly0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = ly0Var;
    }

    public final boolean a() {
        ly0 ly0Var = this.b;
        if (!ly0Var.b || this.h < 1.0f) {
            return false;
        }
        if (ly0Var.c.B() != null) {
            this.b.c.B().N(0, false, false);
            this.b.c.B().H(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ly0 ly0Var) {
        if (this.b == ly0Var || ly0Var == null) {
            return;
        }
        ArrayList arrayList = ly0Var.e;
        if (this.r) {
            this.c = ly0Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((ny0) this.b.e.get(i10)).H0(null);
            }
            this.f = false;
        }
        ly0 ly0Var2 = this.b;
        ArrayList arrayList2 = ly0Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && ly0Var2.i) {
            ly0Var2.b(true);
            ly0Var2.i = false;
        }
        this.b = ly0Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ny0) arrayList.get(i11)).H0(this);
        }
        this.f = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.j.add(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((ny0) this.b.e.get(i10)).H0(null);
            }
            this.f = false;
        }
        ly0 ly0Var = this.b;
        ArrayList arrayList = ly0Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ly0Var.i) {
            ly0Var.b(true);
            ly0Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z10 = true;
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((ny0) this.b.e.get(i10)).H0(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new wv0(this, 7));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.i(this.h + (Utilities.k(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                bw0 bw0Var = profileActivity.a;
                int i11 = profileActivity.T2;
                PointF pointF = this.d;
                float f7 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= bw0Var.getChildCount()) {
                            break;
                        }
                        View childAt = bw0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.z8)) {
                            nh.p pVar = ((org.telegram.ui.Cells.z8) childAt).a;
                            pointF.set(pVar.getX() + childAt.getX() + bw0Var.getX() + org.telegram.messenger.i0.L(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + bw0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = ly.f();
                this.b.c.y0((getWidth() - org.telegram.messenger.i0.L(f10)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.i0.L(f10) * 0.5f)), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                ly0 ly0Var = null;
                this.b.c.h(canvas, null);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int L = org.telegram.messenger.i0.L(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    ny0 ny0Var = (ny0) this.b.d.get(size);
                    float f11 = size;
                    float s10 = org.telegram.messenger.i0.s(this.h, f11, this.b.d.size(), 1.8f);
                    float f12 = L;
                    boolean z11 = z10;
                    float f13 = f12 * 0.88f;
                    float g10 = c3.i0.g(f13, this.b.d.size() - 1, getWidth(), f7);
                    float f14 = pointF.x;
                    float f15 = f7;
                    float f16 = pointF.y;
                    float f17 = ((g10 - f14) * s10) + (f13 * f11) + f14;
                    PointF pointF2 = pointF;
                    float pow = f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.gr.h.getInterpolation(Utilities.i(s10 / 0.4f, 1.0f, 0.0f));
                    float f18 = (f12 / f15) * interpolation;
                    float f19 = f12 * interpolation;
                    ny0Var.y0(f17 - f18, pow - f18, f19, f19);
                    ny0Var.h(canvas, null);
                    size--;
                    ly0Var = null;
                    pointF = pointF2;
                    z10 = z11;
                    f7 = f15;
                }
                ly0 ly0Var2 = ly0Var;
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = ly0Var2;
            }
        }
    }
}
