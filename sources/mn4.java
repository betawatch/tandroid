// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mn4 extends FrameLayout implements snb {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public di2 H;
    public int I;
    public boolean J;
    public Paint a;
    public hn b;
    public hn c;
    public float d;
    public mm e;
    public View f;
    public ShapeDrawable h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public float w;
    public ValueAnimator x;
    public int y;

    public final void a(boolean z) {
        if (this.r != z) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.s = null;
            }
            float f = this.n;
            this.r = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new kn4(this, (byte) 2));
            this.s.addListener(new gf4((byte) 2, this, z));
            this.s.setDuration(320L);
            this.s.setInterpolator(k43.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        hn hnVar = this.b;
        if (z) {
            hnVar.a();
        }
        hnVar.t(charSequence, z, true);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        Paint paint = this.a;
        hn hnVar = this.c;
        hn hnVar2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.H == null) {
                this.H = new di2(hnVar2.a.getColor());
            }
            int L = (int) ((1.0f - this.n) * hl.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f = this.n;
        if (f < 1.0f) {
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.n * hl.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.n * 0.4f));
                z = true;
            } else {
                z = false;
            }
            float c = hnVar2.c();
            float e = this.e.e(false, this.d);
            float c2 = ((hnVar.c() + hl.L(15.66f)) * e) + c;
            Rect rect = hl.Q;
            rect.set((int) (((getMeasuredWidth() - c2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hnVar2.e) / 2.0f) - hl.L(1.0f)), (int) qd4.e(getMeasuredWidth() - c2, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + hnVar2.e) / 2.0f) - hl.L(1.0f)));
            hnVar2.C = (int) (hl.R1(0.5f, 1.0f, this.E) * (1.0f - this.n) * 255.0f);
            hnVar2.setBounds(rect);
            hnVar2.draw(canvas);
            rect.set((int) (bp1.z(getMeasuredWidth(), c2, 2.0f, c) + hl.L(5.0f)), (int) ((getMeasuredHeight() - hl.L(18.0f)) / 2.0f), (int) (Math.max(hl.L(9.0f), hnVar.c()) + bp1.z(getMeasuredWidth(), c2, 2.0f, c) + hl.L(13.0f)), (int) ((hl.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = hl.P;
            rectF.set(rect);
            if (this.w != 1.0f) {
                canvas.save();
                float f2 = this.w;
                canvas.scale(f2, f2, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.n) * 255.0f * e * e));
            canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
            rect.offset(-hl.L(0.3f), -hl.L(0.4f));
            hnVar.C = (int) qd4.z(1.0f, this.n, 255.0f, e);
            hnVar.setBounds(rect);
            hnVar.draw(canvas);
            if (this.w != 1.0f) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.i);
        sb.append(this.y > 0 ? ", ".concat(ob6.G(this.y, "Chats", new Object[0])) : "");
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (this.F != z) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            float f = this.E;
            this.F = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new kn4(this, (byte) 0));
            this.G.addListener(new ln4());
            this.G.start();
        }
    }

    @Override // snb
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        hn hnVar = this.b;
        Paint paint = this.a;
        if (paint == null || hnVar == null) {
            return;
        }
        int i = aob.Fi;
        int w0 = aob.w0(null, i, false);
        if (w0 != this.I || this.J != aob.I.o()) {
            this.I = w0;
            this.J = aob.I.o();
            View view = this.f;
            if (view != null) {
                view.setBackground(rnb.d(0, rnb.b(w0), 8.0f));
            }
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(w0);
                shapeDrawable.invalidateSelf();
            }
        }
        int i2 = aob.Ji;
        paint.setColor(aob.w0(null, i2, false));
        hnVar.u(aob.w0(null, i2, false));
        try {
            hn hnVar2 = this.c;
            if (hnVar2 != null) {
                hnVar2.u(aob.w0(null, i, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
