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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public sp H;
    public int I;
    public boolean J;
    public Paint a;
    public m6 b;
    public m6 c;
    public float d;
    public c6 e;
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
            ofFloat.addUpdateListener(new a00(this, 2));
            this.s.addListener(new org.telegram.ui.on(10, this, z10));
            this.s.setDuration(320L);
            this.s.setInterpolator(lr.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        m6 m6Var = this.b;
        if (z10) {
            m6Var.a();
        }
        m6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.a;
        m6 m6Var = this.c;
        m6 m6Var2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.H == null) {
                this.H = new sp(m6Var2.a.getColor());
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
            float c10 = m6Var2.c();
            float e10 = this.e.e(false, this.d);
            float c11 = ((m6Var.c() + org.telegram.messenger.g0.L(15.66f)) * e10) + c10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - m6Var2.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + m6Var2.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            m6Var2.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E) * (1.0f - this.n) * 255.0f);
            m6Var2.setBounds(rect);
            m6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(5.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), m6Var.c()) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), c11, 2.0f, c10) + org.telegram.messenger.g0.L(13.0f)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
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
            m6Var.C = (int) org.telegram.messenger.f3.A(1.0f, this.n, 255.0f, e10);
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
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
            str = ", " + org.telegram.messenger.gd.G(this.y, "Chats", new Object[0]);
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
            ofFloat.addUpdateListener(new a00(this, 0));
            this.G.addListener(new b00());
            this.G.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        m6 m6Var = this.b;
        Paint paint = this.a;
        if (paint == null || m6Var == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        if (x02 != this.I || this.J != org.telegram.ui.ActionBar.n6.I.q()) {
            this.I = x02;
            this.J = org.telegram.ui.ActionBar.n6.I.q();
            View view = this.f;
            if (view != null) {
                view.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(x02), 8.0f));
            }
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(x02);
                shapeDrawable.invalidateSelf();
            }
        }
        int i10 = org.telegram.ui.ActionBar.n6.Ji;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        try {
            m6 m6Var2 = this.c;
            if (m6Var2 != null) {
                m6Var2.u(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
