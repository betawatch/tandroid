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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hl4 extends FrameLayout implements tjb {
    public float E;
    public boolean F;
    public ValueAnimator G;
    public ih2 H;
    public int I;
    public boolean J;
    public Paint a;
    public gn b;
    public gn c;
    public float d;
    public lm e;
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
            ofFloat.addUpdateListener(new fl4(this, (byte) 2));
            this.s.addListener(new id4((byte) 2, this, z));
            this.s.setDuration(320L);
            this.s.setInterpolator(s33.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        gn gnVar = this.b;
        if (z) {
            gnVar.a();
        }
        gnVar.t(charSequence, z, true);
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
        gn gnVar = this.c;
        gn gnVar2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.H == null) {
                this.H = new ih2(gnVar2.a.getColor());
            }
            int L = (int) ((1.0f - this.n) * gl.L(24.0f));
            this.H.setBounds(0, L, getWidth(), getHeight() + L);
            this.H.setAlpha((int) (this.n * 255.0f));
            this.H.draw(canvas);
            invalidate();
        }
        float f = this.n;
        if (f < 1.0f) {
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.n * gl.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.n * 0.4f));
                z = true;
            } else {
                z = false;
            }
            float c = gnVar2.c();
            float e = this.e.e(false, this.d);
            float c2 = ((gnVar.c() + gl.L(15.66f)) * e) + c;
            Rect rect = gl.Q;
            rect.set((int) (((getMeasuredWidth() - c2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - gnVar2.e) / 2.0f) - gl.L(1.0f)), (int) tb4.e(getMeasuredWidth() - c2, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + gnVar2.e) / 2.0f) - gl.L(1.0f)));
            gnVar2.C = (int) (gl.R1(0.5f, 1.0f, this.E) * (1.0f - this.n) * 255.0f);
            gnVar2.setBounds(rect);
            gnVar2.draw(canvas);
            rect.set((int) (oo1.z(getMeasuredWidth(), c2, 2.0f, c) + gl.L(5.0f)), (int) ((getMeasuredHeight() - gl.L(18.0f)) / 2.0f), (int) (Math.max(gl.L(9.0f), gnVar.c()) + oo1.z(getMeasuredWidth(), c2, 2.0f, c) + gl.L(13.0f)), (int) ((gl.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = gl.P;
            rectF.set(rect);
            if (this.w != 1.0f) {
                canvas.save();
                float f2 = this.w;
                canvas.scale(f2, f2, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.n) * 255.0f * e * e));
            canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
            rect.offset(-gl.L(0.3f), -gl.L(0.4f));
            gnVar.C = (int) tb4.z(1.0f, this.n, 255.0f, e);
            gnVar.setBounds(rect);
            gnVar.draw(canvas);
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
        sb.append(this.y > 0 ? ", ".concat(k96.G(this.y, "Chats", new Object[0])) : "");
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
            ofFloat.addUpdateListener(new fl4(this, (byte) 0));
            this.G.addListener(new gl4());
            this.G.start();
        }
    }

    @Override // tjb
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        gn gnVar = this.b;
        Paint paint = this.a;
        if (paint == null || gnVar == null) {
            return;
        }
        int i = bkb.Ei;
        int w0 = bkb.w0(null, i, false);
        if (w0 != this.I || this.J != bkb.I.o()) {
            this.I = w0;
            this.J = bkb.I.o();
            View view = this.f;
            if (view != null) {
                view.setBackground(sjb.d(0, sjb.b(w0), 8.0f));
            }
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(w0);
                shapeDrawable.invalidateSelf();
            }
        }
        int i2 = bkb.Ii;
        paint.setColor(bkb.w0(null, i2, false));
        gnVar.u(bkb.w0(null, i2, false));
        try {
            gn gnVar2 = this.c;
            if (gnVar2 != null) {
                gnVar2.u(bkb.w0(null, i, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
