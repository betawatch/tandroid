package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ny0 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public ky0 b;
    public ky0 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public ny0(ProfileActivity profileActivity, ky0 ky0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = ky0Var;
    }

    public final boolean a() {
        ky0 ky0Var = this.b;
        if (!ky0Var.b || this.h < 1.0f) {
            return false;
        }
        if (ky0Var.c.B() != null) {
            this.b.c.B().N(0, false, false);
            this.b.c.B().H(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ky0 ky0Var) {
        if (this.b == ky0Var || ky0Var == null) {
            return;
        }
        ArrayList arrayList = ky0Var.e;
        if (this.r) {
            this.c = ky0Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((my0) this.b.e.get(i10)).H0(null);
            }
            this.f = false;
        }
        ky0 ky0Var2 = this.b;
        ArrayList arrayList2 = ky0Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && ky0Var2.i) {
            ky0Var2.b(true);
            ky0Var2.i = false;
        }
        this.b = ky0Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((my0) arrayList.get(i11)).H0(this);
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
                ((my0) this.b.e.get(i10)).H0(null);
            }
            this.f = false;
        }
        ky0 ky0Var = this.b;
        ArrayList arrayList = ky0Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ky0Var.i) {
            ky0Var.b(true);
            ky0Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z10 = true;
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((my0) this.b.e.get(i10)).H0(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new vv0(this, 7));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.i(this.h + (Utilities.k(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                aw0 aw0Var = profileActivity.a;
                int i11 = profileActivity.T2;
                PointF pointF = this.d;
                float f7 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= aw0Var.getChildCount()) {
                            break;
                        }
                        View childAt = aw0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.z8)) {
                            nh.p pVar = ((org.telegram.ui.Cells.z8) childAt).a;
                            pointF.set(pVar.getX() + childAt.getX() + aw0Var.getX() + org.telegram.messenger.i0.L(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + aw0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = ky.f();
                this.b.c.y0((getWidth() - org.telegram.messenger.i0.L(f10)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.i0.L(f10) * 0.5f)), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                ky0 ky0Var = null;
                this.b.c.h(canvas, null);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int L = org.telegram.messenger.i0.L(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    my0 my0Var = (my0) this.b.d.get(size);
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
                    my0Var.y0(f17 - f18, pow - f18, f19, f19);
                    my0Var.h(canvas, null);
                    size--;
                    ky0Var = null;
                    pointF = pointF2;
                    z10 = z11;
                    f7 = f15;
                }
                ky0 ky0Var2 = ky0Var;
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = ky0Var2;
            }
        }
    }
}
