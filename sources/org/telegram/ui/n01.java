package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n01 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public k01 b;
    public k01 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public n01(ProfileActivity profileActivity, k01 k01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = k01Var;
    }

    public final boolean a() {
        k01 k01Var = this.b;
        if (!k01Var.b || this.h < 1.0f) {
            return false;
        }
        if (k01Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().L(0, false, false);
            this.b.c.getLottieAnimation().F(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(k01 k01Var) {
        if (this.b == k01Var || k01Var == null) {
            return;
        }
        ArrayList arrayList = k01Var.e;
        if (this.r) {
            this.c = k01Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((m01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        k01 k01Var2 = this.b;
        ArrayList arrayList2 = k01Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && k01Var2.i) {
            k01Var2.b(true);
            k01Var2.i = false;
        }
        this.b = k01Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((m01) arrayList.get(i11)).setParentView(this);
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
                ((m01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        k01 k01Var = this.b;
        ArrayList arrayList = k01Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && k01Var.i) {
            k01Var.b(true);
            k01Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((m01) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new ky0(this, 4));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                by0 by0Var = profileActivity.a;
                int i11 = profileActivity.Q2;
                PointF pointF = this.d;
                float f9 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= by0Var.getChildCount()) {
                            break;
                        }
                        View childAt = by0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.w8)) {
                            gh.s sVar = ((org.telegram.ui.Cells.w8) childAt).a;
                            pointF.set(sVar.getX() + childAt.getX() + by0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + by0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = ry.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    m01 m01Var = (m01) this.b.d.get(size);
                    float f11 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f11, this.b.d.size(), 1.8f);
                    float f12 = dp;
                    float f13 = 0.88f * f12;
                    float w10 = com.google.android.recaptcha.internal.a.w(f13, this.b.d.size() - 1, getWidth(), f9);
                    float f14 = pointF.x;
                    float f15 = pointF.y;
                    float f16 = ((w10 - f14) * cascade) + (f13 * f11) + f14;
                    float pow = f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.jr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f17 = (f12 / 2.0f) * interpolation;
                    float f18 = f12 * interpolation;
                    m01Var.setImageCoords(f16 - f17, pow - f17, f18, f18);
                    m01Var.draw(canvas);
                    size--;
                    f9 = 2.0f;
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
