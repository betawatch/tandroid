package hi;

import a8.r7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class z2 extends rt0 implements org.telegram.ui.ActionBar.i3 {
    public final Paint f0;
    public boolean g0;
    public final RectF h0;
    public final Path i0;
    public final /* synthetic */ a3 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, Context context) {
        super(context, null);
        this.j0 = a3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f0 = new Paint(1);
        this.h0 = new RectF();
        this.i0 = new Path();
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.d6));
        hashSet.add(Integer.valueOf(k6.a7));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.u8));
        hashSet.add(Integer.valueOf(k6.G8));
        hashSet.add(Integer.valueOf(k6.E8));
        hashSet.add(Integer.valueOf(k6.F8));
        hashSet.add(Integer.valueOf(k6.I5));
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        Paint paint;
        a3 a3Var = this.j0;
        ec0 ec0Var = a3Var.t0;
        Rect rect = a3Var.n;
        Rect rect2 = a3Var.h;
        if (this.g0) {
            return;
        }
        int visibility = ec0Var.getVisibility();
        Paint paint2 = this.f0;
        if (visibility != 0) {
            float f10 = a3Var.g0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(k6.r1(a3Var.R0, a3Var.S));
                int i7 = rect2.left;
                if (i7 > 0) {
                    canvas.drawRect(0.0f, 0.0f, i7, getHeight(), paint2);
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                }
                if (rect2.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                }
            }
        }
        if (a3Var.w == null || org.telegram.messenger.g0.Q1()) {
            z9 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - a3Var.g0) * rect.left, 0.0f);
            r7 r7Var = a3Var.w;
            int W1 = org.telegram.messenger.g0.W1(a3Var.g0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            r7Var.j(canvas, true, false, W1, 1.0f - a3Var.g0);
            canvas.translate((1.0f - a3Var.g0) * (-rect.left), 0.0f);
            z9 = true;
        }
        super.dispatchDraw(canvas);
        if (z9) {
            canvas.restore();
        }
        if (ec0Var.getVisibility() != 0) {
            paint2.setColor(k6.r1(a3Var.R0, a3Var.S));
            int i10 = rect2.left;
            if (i10 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - a3Var.g0) * i10, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - a3Var.g0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                w2 w2Var = a3Var.m0;
                canvas.drawRect(0.0f, height - (f11 * ((w2Var == null || w2Var.getTotalHeight() <= 0) ? 1.0f - a3Var.g0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.recaptcha.internal.a.v(1.0f, a3Var.g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.j0;
        Rect rect = a3Var.n;
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.d3 O = launchActivity != null ? launchActivity.O() : null;
        if (O != null && rect != null) {
            int i7 = (int) ((1.0f - a3Var.g0) * ((int) O.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return O.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a3 a3Var = this.j0;
        Rect rect = a3Var.n;
        r2 r2Var = a3Var.x;
        Paint paint = a3Var.O;
        x2 x2Var = a3Var.X;
        Drawable drawable = a3Var.Z;
        if (this.g0) {
            return;
        }
        super.draw(canvas);
        float f10 = org.telegram.messenger.g0.Q1() ? 0.0f : a3Var.c;
        paint.setColor(a3Var.a);
        paint.setAlpha((int) ((1.0f - a3Var.g0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float T1 = org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.m / 2.0f, a3Var.c) : org.telegram.messenger.g0.T1(r2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.m, f10) + org.telegram.messenger.g0.L(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (x2Var.getAlpha() * 255.0f));
        float translationY = x2Var.getTranslationY() + x2Var.getY() + x2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        a3 a3Var = this.j0;
        if (view != a3Var.x || !a3Var.i0 || a3Var.k0 <= 0 || a3Var.j0 <= 0) {
            z9 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(a3Var.h0, a3Var.j0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(a3Var.h0, a3Var.k0, view.getHeight()));
            z9 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.i3
    public RectF getRect() {
        r2 r2Var = this.j0.x;
        float left = r2Var.getLeft();
        float translationY = r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = r2Var.getRight();
        float height = getHeight();
        RectF rectF = this.h0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new fi.r7(3));
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        a3 a3Var = this.j0;
        Paint paint = a3Var.U;
        Paint paint2 = a3Var.Q;
        r2 r2Var = a3Var.x;
        if (this.g0) {
            return;
        }
        super.onDraw(canvas);
        if (a3Var.t0.getVisibility() != 0) {
            canvas.save();
            r7 r7Var = a3Var.w;
            if (r7Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                r7Var.j(canvas2, false, false, width, 1.0f - a3Var.g0);
            } else {
                canvas2 = canvas;
            }
            if (!a3Var.W) {
                int w02 = k6.w0(k6.d6, a3Var.F);
                paint2.setColor(w02);
                a3Var.D.setFlickerViewColor(w02);
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                    a3Var.Y0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, a3Var.P);
            org.telegram.ui.ActionBar.d3 d3Var = a3Var.s;
            int i7 = d3Var != null ? (int) d3Var.G : 0;
            paint.setColor(a3Var.R);
            float L = org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - a3Var.c);
            rectF.set(org.telegram.messenger.g0.W1(a3Var.g0, r2Var.getLeft(), 0), org.telegram.messenger.g0.T1(r2Var.getTranslationY(), 0.0f, a3Var.c), r2Var.getRight(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(org.telegram.messenger.g0.W1(a3Var.g0, r2Var.getLeft(), 0), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(a3Var.g0, r2Var.getRight(), getWidth()), getHeight() - i7);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.j0;
        r2 r2Var = a3Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, a3Var.c) && motionEvent.getX() <= r2Var.getRight() && motionEvent.getX() >= r2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        a3Var.o(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.i3
    public void setDrawingFromOverlay(boolean z9) {
        if (this.g0 != z9) {
            this.g0 = z9;
            invalidate();
            a3 a3Var = this.j0;
            a3Var.L();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || !a3Var.e0) {
                return;
            }
            launchActivity.D0(a3Var.S);
        }
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int w02;
        a3 a3Var = this.j0;
        Paint paint = a3Var.Q;
        z2 z2Var = a3Var.f;
        x2 x2Var = a3Var.X;
        f6 f6Var = a3Var.F;
        if (x2Var == null || z2Var == null) {
            return;
        }
        try {
            if (a3Var.D != null && paint != null) {
                if (!a3Var.V) {
                    int i7 = a3Var.v0;
                    if (i7 < 0) {
                        i7 = k6.d6;
                    }
                    int w03 = k6.w0(i7, f6Var);
                    int i10 = a3Var.R;
                    if (w03 != i10) {
                        a3Var.R = w03;
                        if ((x2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) x2Var.getBackground()).getColor() == i10) {
                            x2Var.setBackgroundColor(a3Var.R);
                        }
                    }
                }
                if (a3Var.I0 && a3Var.m0 != null && (w02 = k6.w0(k6.a7, f6Var)) != a3Var.S) {
                    a3Var.D(w02, false);
                    a3Var.I0 = true;
                }
                if (a3Var.a == a3Var.b) {
                    int x02 = k6.x0(null, k6.wj, false);
                    a3Var.b = x02;
                    a3Var.a = x02;
                }
                int color = paint.getColor();
                if (!a3Var.V) {
                    color = (((((((((((color * 31) + k6.w0(k6.G6, f6Var)) * 31) + k6.w0(k6.u8, f6Var)) * 31) + k6.w0(k6.G8, f6Var)) * 31) + k6.w0(k6.E8, f6Var)) * 31) + k6.w0(k6.F8, f6Var)) * 31) + k6.w0(k6.I5, f6Var);
                }
                if (!a3Var.J0 || color != a3Var.K0) {
                    a3Var.J0 = true;
                    a3Var.K0 = color;
                    a3Var.F();
                }
                a3Var.J();
                z2Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.i3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        a3 a3Var = this.j0;
        r2 r2Var = a3Var.x;
        float left = r2Var.getLeft();
        float translationY = r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = r2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.h0;
        rectF3.set(left, translationY, right, height);
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.i0;
        path.rewind();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - a3Var.c), org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(a3Var.Q);
        if (r2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(r2Var.getY(), rectF2.top));
            r2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
