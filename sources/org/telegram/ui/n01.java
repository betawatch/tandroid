package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                float f10 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= by0Var.getChildCount()) {
                            break;
                        }
                        View childAt = by0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.v8)) {
                            eh.s sVar = ((org.telegram.ui.Cells.v8) childAt).a;
                            pointF.set(sVar.getX() + childAt.getX() + by0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + by0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f11 = sy.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    m01 m01Var = (m01) this.b.d.get(size);
                    float f12 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f12, this.b.d.size(), 1.8f);
                    float f13 = dp;
                    float f14 = 0.88f * f13;
                    float w10 = com.google.android.recaptcha.internal.a.w(f14, this.b.d.size() - 1, getWidth(), f10);
                    float f15 = pointF.x;
                    float f16 = pointF.y;
                    float f17 = ((w10 - f15) * cascade) + (f14 * f12) + f15;
                    float pow = f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.er.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f18 = (f13 / 2.0f) * interpolation;
                    float f19 = f13 * interpolation;
                    m01Var.setImageCoords(f17 - f18, pow - f18, f19, f19);
                    m01Var.draw(canvas);
                    size--;
                    f10 = 2.0f;
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
