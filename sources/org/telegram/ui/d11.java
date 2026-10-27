package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d11 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public a11 b;
    public a11 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public d11(ProfileActivity profileActivity, a11 a11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = a11Var;
    }

    public final boolean a() {
        a11 a11Var = this.b;
        if (!a11Var.b || this.h < 1.0f) {
            return false;
        }
        if (a11Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().N(0, false, false);
            this.b.c.getLottieAnimation().H(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(a11 a11Var) {
        if (this.b == a11Var || a11Var == null) {
            return;
        }
        ArrayList arrayList = a11Var.e;
        if (this.r) {
            this.c = a11Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((c11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        a11 a11Var2 = this.b;
        ArrayList arrayList2 = a11Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && a11Var2.i) {
            a11Var2.b(true);
            a11Var2.i = false;
        }
        this.b = a11Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((c11) arrayList.get(i11)).setParentView(this);
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
                ((c11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        a11 a11Var = this.b;
        ArrayList arrayList = a11Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && a11Var.i) {
            a11Var.b(true);
            a11Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z10 = true;
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((c11) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new oy0(this, 6));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                ry0 ry0Var = profileActivity.a;
                int i11 = profileActivity.U2;
                PointF pointF = this.d;
                float f7 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= ry0Var.getChildCount()) {
                            break;
                        }
                        View childAt = ry0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.g9)) {
                            xh.n nVar = ((org.telegram.ui.Cells.g9) childAt).a;
                            pointF.set(nVar.getX() + childAt.getX() + ry0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + ry0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = qy.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    c11 c11Var = (c11) this.b.d.get(size);
                    float f11 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f11, this.b.d.size(), 1.8f);
                    float f12 = dp;
                    float f13 = 0.88f * f12;
                    boolean z11 = z10;
                    float f14 = c3.h0.f(f13, this.b.d.size() - 1, getWidth(), f7);
                    float f15 = pointF.x;
                    float f16 = f7;
                    float f17 = pointF.y;
                    float f18 = ((f14 - f15) * cascade) + (f13 * f11) + f15;
                    float pow = f17 - ((f17 + f12) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.ds.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f19 = (f12 / f16) * interpolation;
                    float f20 = f12 * interpolation;
                    c11Var.setImageCoords(f18 - f19, pow - f19, f20, f20);
                    c11Var.draw(canvas);
                    size--;
                    z10 = z11;
                    f7 = f16;
                }
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = null;
            }
        }
    }
}
