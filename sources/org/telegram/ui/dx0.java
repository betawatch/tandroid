package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dx0 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public ax0 b;
    public ax0 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public dx0(ProfileActivity profileActivity, ax0 ax0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = ax0Var;
    }

    public final boolean a() {
        ax0 ax0Var = this.b;
        if (!ax0Var.b || this.h < 1.0f) {
            return false;
        }
        if (ax0Var.c.B() != null) {
            this.b.c.B().N(0, false, false);
            this.b.c.B().H(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ax0 ax0Var) {
        if (this.b == ax0Var || ax0Var == null) {
            return;
        }
        ArrayList arrayList = ax0Var.e;
        if (this.r) {
            this.c = ax0Var;
            return;
        }
        if (this.f) {
            for (int i7 = 0; i7 < this.b.e.size(); i7++) {
                ((cx0) this.b.e.get(i7)).H0(null);
            }
            this.f = false;
        }
        ax0 ax0Var2 = this.b;
        ArrayList arrayList2 = ax0Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && ax0Var2.i) {
            ax0Var2.b(true);
            ax0Var2.i = false;
        }
        this.b = ax0Var;
        if (this.f) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((cx0) arrayList.get(i10)).H0(this);
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
            for (int i7 = 0; i7 < this.b.e.size(); i7++) {
                ((cx0) this.b.e.get(i7)).H0(null);
            }
            this.f = false;
        }
        ax0 ax0Var = this.b;
        ArrayList arrayList = ax0Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ax0Var.i) {
            ax0Var.b(true);
            ax0Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z10 = true;
            if (!this.f) {
                for (int i7 = 0; i7 < this.b.e.size(); i7++) {
                    ((cx0) this.b.e.get(i7)).H0(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new ru0(this, 5));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.i(this.h + (Utilities.k(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                qu0 qu0Var = profileActivity.a;
                int i10 = profileActivity.V2;
                PointF pointF = this.d;
                float f10 = 2.0f;
                if (i10 >= 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= qu0Var.getChildCount()) {
                            break;
                        }
                        View childAt = qu0Var.getChildAt(i11);
                        if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.x8)) {
                            xh.l lVar = ((org.telegram.ui.Cells.x8) childAt).a;
                            pointF.set(lVar.getX() + childAt.getX() + qu0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + qu0Var.getY());
                            break;
                        }
                        i11++;
                    }
                }
                float f11 = nx.f();
                this.b.c.y0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                ax0 ax0Var = null;
                this.b.c.h(canvas, null);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int L = org.telegram.messenger.g0.L(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    cx0 cx0Var = (cx0) this.b.d.get(size);
                    float f12 = size;
                    float s5 = org.telegram.messenger.g0.s(this.h, f12, this.b.d.size(), 1.8f);
                    float f13 = L;
                    boolean z11 = z10;
                    float f14 = f13 * 0.88f;
                    float w10 = com.google.android.gms.internal.vision.e2.w(f14, this.b.d.size() - 1, getWidth(), f10);
                    float f15 = pointF.x;
                    float f16 = f10;
                    float f17 = pointF.y;
                    float f18 = ((w10 - f15) * s5) + (f14 * f12) + f15;
                    PointF pointF2 = pointF;
                    float pow = f17 - ((f17 + f13) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.lr.h.getInterpolation(Utilities.i(s5 / 0.4f, 1.0f, 0.0f));
                    float f19 = (f13 / f16) * interpolation;
                    float f20 = f13 * interpolation;
                    cx0Var.y0(f18 - f19, pow - f19, f20, f20);
                    cx0Var.h(canvas, null);
                    size--;
                    ax0Var = null;
                    pointF = pointF2;
                    z10 = z11;
                    f10 = f16;
                }
                ax0 ax0Var2 = ax0Var;
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = ax0Var2;
            }
        }
    }
}
