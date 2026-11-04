package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public cp H;
    public int I;
    public boolean J;
    public Paint a;
    public g6 b;
    public g6 c;
    public float d;
    public u5 e;
    public View f;
    public ShapeDrawable h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public float w;
    public ValueAnimator x;
    public int y;

    public final void a(boolean z10) {
        if (this.r != z10) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.s = null;
            }
            float f10 = this.n;
            this.r = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new mz(this, 2));
            this.s.addListener(new s9(9, this, z10));
            this.s.setDuration(320L);
            this.s.setInterpolator(xq.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        g6 g6Var = this.b;
        if (z10) {
            g6Var.a();
        }
        g6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.a;
        g6 g6Var = this.c;
        g6 g6Var2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.H == null) {
                this.H = new cp(g6Var2.a.getColor());
            }
            int L = (int) ((1.0f - this.n) * org.telegram.messenger.g0.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f10 = this.n;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.n * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c2 = g6Var2.c();
            float e10 = this.e.e(false, this.d);
            float c10 = ((g6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c2;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var2.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - c10, getWidth(), 2.0f, c2), (int) (((getMeasuredHeight() + g6Var2.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            g6Var2.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E) * (1.0f - this.n) * 255.0f);
            g6Var2.setBounds(rect);
            g6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), c10, 2.0f, c2) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), g6Var.c()) + com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), c10, 2.0f, c2) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.w != 1.0f) {
                canvas.save();
                float f11 = this.w;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.n) * 255.0f * e10 * e10));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.3f), -org.telegram.messenger.g0.L(0.4f));
            g6Var.B = (int) org.telegram.messenger.k5.A(1.0f, this.n, 255.0f, e10);
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
            if (this.w != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.i);
        if (this.y > 0) {
            str = ", " + org.telegram.messenger.bd.G(this.y, "Chats", new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        if (this.F != z10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            float f10 = this.E;
            this.F = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new mz(this, 0));
            this.G.addListener(new ei.m1(1));
            this.G.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        g6 g6Var = this.b;
        Paint paint = this.a;
        if (paint == null || g6Var == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        if (x02 != this.I || this.J != org.telegram.ui.ActionBar.k6.I.q()) {
            this.I = x02;
            this.J = org.telegram.ui.ActionBar.k6.I.q();
            View view = this.f;
            if (view != null) {
                view.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(x02), 8.0f));
            }
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(x02);
                shapeDrawable.invalidateSelf();
            }
        }
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        try {
            g6 g6Var2 = this.c;
            if (g6Var2 != null) {
                g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
