package ki;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class r2 extends du0 implements org.telegram.ui.ActionBar.k3 {
    public final Paint g0;
    public boolean h0;
    public final RectF i0;
    public final Path j0;
    public final /* synthetic */ s2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, Context context) {
        super(context, null);
        this.k0 = s2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.g0 = new Paint(1);
        this.i0 = new RectF();
        this.j0 = new Path();
    }

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.d6));
        hashSet.add(Integer.valueOf(m6.a7));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.u8));
        hashSet.add(Integer.valueOf(m6.G8));
        hashSet.add(Integer.valueOf(m6.E8));
        hashSet.add(Integer.valueOf(m6.F8));
        hashSet.add(Integer.valueOf(m6.I5));
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        s2 s2Var = this.k0;
        qc0 qc0Var = s2Var.u0;
        Rect rect = s2Var.n;
        Rect rect2 = s2Var.h;
        if (this.h0) {
            return;
        }
        int visibility = qc0Var.getVisibility();
        Paint paint2 = this.g0;
        if (visibility != 0) {
            float f10 = s2Var.h0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(m6.r1(s2Var.S0, s2Var.T));
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
        if (s2Var.w == null || org.telegram.messenger.g0.Q1()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - s2Var.h0) * rect.left, 0.0f);
            r7 r7Var = s2Var.w;
            int W1 = org.telegram.messenger.g0.W1(s2Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            r7Var.k(canvas, true, false, W1, 1.0f - s2Var.h0);
            canvas.translate((1.0f - s2Var.h0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (qc0Var.getVisibility() != 0) {
            paint2.setColor(m6.r1(s2Var.S0, s2Var.T));
            int i10 = rect2.left;
            if (i10 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - s2Var.h0) * i10, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - s2Var.h0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                o2 o2Var = s2Var.n0;
                canvas.drawRect(0.0f, height - (f11 * ((o2Var == null || o2Var.getTotalHeight() <= 0) ? 1.0f - s2Var.h0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, s2Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s2 s2Var = this.k0;
        Rect rect = s2Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.f3 N = launchActivity != null ? launchActivity.N() : null;
        if (N != null && rect != null) {
            int i7 = (int) ((1.0f - s2Var.h0) * ((int) N.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return N.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        s2 s2Var = this.k0;
        Rect rect = s2Var.n;
        j2 j2Var = s2Var.x;
        Paint paint = s2Var.P;
        p2 p2Var = s2Var.Y;
        Drawable drawable = s2Var.a0;
        if (this.h0) {
            return;
        }
        super.draw(canvas);
        float f10 = org.telegram.messenger.g0.Q1() ? 0.0f : s2Var.c;
        paint.setColor(s2Var.a);
        paint.setAlpha((int) ((1.0f - s2Var.h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float T1 = org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.m / 2.0f, s2Var.c) : org.telegram.messenger.g0.T1(j2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.m, f10) + org.telegram.messenger.g0.L(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (p2Var.getAlpha() * 255.0f));
        float translationY = p2Var.getTranslationY() + p2Var.getY() + p2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        s2 s2Var = this.k0;
        if (view != s2Var.x || !s2Var.j0 || s2Var.l0 <= 0 || s2Var.k0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(s2Var.i0, s2Var.k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(s2Var.i0, s2Var.l0, view.getHeight()));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public RectF getRect() {
        j2 j2Var = this.k0.x;
        float left = j2Var.getLeft();
        float translationY = j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = j2Var.getRight();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.t(4));
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        s2 s2Var = this.k0;
        Paint paint = s2Var.V;
        Paint paint2 = s2Var.R;
        j2 j2Var = s2Var.x;
        if (this.h0) {
            return;
        }
        super.onDraw(canvas);
        if (s2Var.u0.getVisibility() != 0) {
            canvas.save();
            r7 r7Var = s2Var.w;
            if (r7Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                r7Var.k(canvas2, false, false, width, 1.0f - s2Var.h0);
            } else {
                canvas2 = canvas;
            }
            if (!s2Var.X) {
                int w02 = m6.w0(m6.d6, s2Var.G);
                paint2.setColor(w02);
                s2Var.E.setFlickerViewColor(w02);
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                    s2Var.Z0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, s2Var.Q);
            org.telegram.ui.ActionBar.f3 f3Var = s2Var.s;
            int i7 = f3Var != null ? (int) f3Var.H : 0;
            paint.setColor(s2Var.S);
            float L = org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - s2Var.c);
            rectF.set(org.telegram.messenger.g0.W1(s2Var.h0, j2Var.getLeft(), 0), org.telegram.messenger.g0.T1(j2Var.getTranslationY(), 0.0f, s2Var.c), j2Var.getRight(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(org.telegram.messenger.g0.W1(s2Var.h0, j2Var.getLeft(), 0), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(s2Var.h0, j2Var.getRight(), getWidth()), getHeight() - i7);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s2 s2Var = this.k0;
        j2 j2Var = s2Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, s2Var.c) && motionEvent.getX() <= j2Var.getRight() && motionEvent.getX() >= j2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        s2Var.o(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.h0 != z10) {
            this.h0 = z10;
            invalidate();
            s2 s2Var = this.k0;
            s2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || !s2Var.f0) {
                return;
            }
            launchActivity.D0(s2Var.T);
        }
    }

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        s2 s2Var = this.k0;
        Paint paint = s2Var.R;
        r2 r2Var = s2Var.f;
        p2 p2Var = s2Var.Y;
        h6 h6Var = s2Var.G;
        if (p2Var == null || r2Var == null) {
            return;
        }
        try {
            if (s2Var.E != null && paint != null) {
                if (!s2Var.W) {
                    int i7 = s2Var.w0;
                    if (i7 < 0) {
                        i7 = m6.d6;
                    }
                    int w03 = m6.w0(i7, h6Var);
                    int i10 = s2Var.S;
                    if (w03 != i10) {
                        s2Var.S = w03;
                        if ((p2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) p2Var.getBackground()).getColor() == i10) {
                            p2Var.setBackgroundColor(s2Var.S);
                        }
                    }
                }
                if (s2Var.J0 && s2Var.n0 != null && (w02 = m6.w0(m6.a7, h6Var)) != s2Var.T) {
                    s2Var.D(w02, false);
                    s2Var.J0 = true;
                }
                if (s2Var.a == s2Var.b) {
                    int x02 = m6.x0(null, m6.zj, false);
                    s2Var.b = x02;
                    s2Var.a = x02;
                }
                int color = paint.getColor();
                if (!s2Var.W) {
                    color = (((((((((((color * 31) + m6.w0(m6.G6, h6Var)) * 31) + m6.w0(m6.u8, h6Var)) * 31) + m6.w0(m6.G8, h6Var)) * 31) + m6.w0(m6.E8, h6Var)) * 31) + m6.w0(m6.F8, h6Var)) * 31) + m6.w0(m6.I5, h6Var);
                }
                if (!s2Var.K0 || color != s2Var.L0) {
                    s2Var.K0 = true;
                    s2Var.L0 = color;
                    s2Var.F();
                }
                s2Var.J();
                r2Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        s2 s2Var = this.k0;
        j2 j2Var = s2Var.x;
        float left = j2Var.getLeft();
        float translationY = j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = j2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.i0;
        rectF3.set(left, translationY, right, height);
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.j0;
        path.rewind();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - s2Var.c), org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(s2Var.R);
        if (j2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(j2Var.getY(), rectF2.top));
            j2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
