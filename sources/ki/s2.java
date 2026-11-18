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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s2 extends au0 implements org.telegram.ui.ActionBar.l3 {
    public final Paint g0;
    public boolean h0;
    public final RectF i0;
    public final Path j0;
    public final /* synthetic */ t2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, Context context) {
        super(context, null);
        this.k0 = t2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.g0 = new Paint(1);
        this.i0 = new RectF();
        this.j0 = new Path();
    }

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.d6));
        hashSet.add(Integer.valueOf(n6.a7));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.u8));
        hashSet.add(Integer.valueOf(n6.G8));
        hashSet.add(Integer.valueOf(n6.E8));
        hashSet.add(Integer.valueOf(n6.F8));
        hashSet.add(Integer.valueOf(n6.I5));
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        t2 t2Var = this.k0;
        pc0 pc0Var = t2Var.u0;
        Rect rect = t2Var.n;
        Rect rect2 = t2Var.h;
        if (this.h0) {
            return;
        }
        int visibility = pc0Var.getVisibility();
        Paint paint2 = this.g0;
        if (visibility != 0) {
            float f10 = t2Var.h0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(n6.r1(t2Var.S0, t2Var.T));
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
        if (t2Var.w == null || org.telegram.messenger.g0.Q1()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - t2Var.h0) * rect.left, 0.0f);
            r7 r7Var = t2Var.w;
            int W1 = org.telegram.messenger.g0.W1(t2Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            r7Var.k(canvas, true, false, W1, 1.0f - t2Var.h0);
            canvas.translate((1.0f - t2Var.h0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (pc0Var.getVisibility() != 0) {
            paint2.setColor(n6.r1(t2Var.S0, t2Var.T));
            int i10 = rect2.left;
            if (i10 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - t2Var.h0) * i10, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - t2Var.h0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                p2 p2Var = t2Var.n0;
                canvas.drawRect(0.0f, height - (f11 * ((p2Var == null || p2Var.getTotalHeight() <= 0) ? 1.0f - t2Var.h0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, t2Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t2 t2Var = this.k0;
        Rect rect = t2Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.g3 N = launchActivity != null ? launchActivity.N() : null;
        if (N != null && rect != null) {
            int i7 = (int) ((1.0f - t2Var.h0) * ((int) N.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return N.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        t2 t2Var = this.k0;
        Rect rect = t2Var.n;
        k2 k2Var = t2Var.x;
        Paint paint = t2Var.P;
        q2 q2Var = t2Var.Y;
        Drawable drawable = t2Var.a0;
        if (this.h0) {
            return;
        }
        super.draw(canvas);
        float f10 = org.telegram.messenger.g0.Q1() ? 0.0f : t2Var.c;
        paint.setColor(t2Var.a);
        paint.setAlpha((int) ((1.0f - t2Var.h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float T1 = org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.T1(k2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.m / 2.0f, t2Var.c) : org.telegram.messenger.g0.T1(k2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.m, f10) + org.telegram.messenger.g0.L(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (q2Var.getAlpha() * 255.0f));
        float translationY = q2Var.getTranslationY() + q2Var.getY() + q2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        t2 t2Var = this.k0;
        if (view != t2Var.x || !t2Var.j0 || t2Var.l0 <= 0 || t2Var.k0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(t2Var.i0, t2Var.k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(t2Var.i0, t2Var.l0, view.getHeight()));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.l3
    public RectF getRect() {
        k2 k2Var = this.k0.x;
        float left = k2Var.getLeft();
        float translationY = k2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = k2Var.getRight();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.t(4));
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        t2 t2Var = this.k0;
        Paint paint = t2Var.V;
        Paint paint2 = t2Var.R;
        k2 k2Var = t2Var.x;
        if (this.h0) {
            return;
        }
        super.onDraw(canvas);
        if (t2Var.u0.getVisibility() != 0) {
            canvas.save();
            r7 r7Var = t2Var.w;
            if (r7Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                r7Var.k(canvas2, false, false, width, 1.0f - t2Var.h0);
            } else {
                canvas2 = canvas;
            }
            if (!t2Var.X) {
                int w02 = n6.w0(n6.d6, t2Var.G);
                paint2.setColor(w02);
                t2Var.E.setFlickerViewColor(w02);
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                    t2Var.Z0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, t2Var.Q);
            org.telegram.ui.ActionBar.g3 g3Var = t2Var.s;
            int i7 = g3Var != null ? (int) g3Var.H : 0;
            paint.setColor(t2Var.S);
            float L = org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - t2Var.c);
            rectF.set(org.telegram.messenger.g0.W1(t2Var.h0, k2Var.getLeft(), 0), org.telegram.messenger.g0.T1(k2Var.getTranslationY(), 0.0f, t2Var.c), k2Var.getRight(), k2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(org.telegram.messenger.g0.W1(t2Var.h0, k2Var.getLeft(), 0), k2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(t2Var.h0, k2Var.getRight(), getWidth()), getHeight() - i7);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t2 t2Var = this.k0;
        k2 k2Var = t2Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.T1(k2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, t2Var.c) && motionEvent.getX() <= k2Var.getRight() && motionEvent.getX() >= k2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        t2Var.o(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.h0 != z10) {
            this.h0 = z10;
            invalidate();
            t2 t2Var = this.k0;
            t2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || !t2Var.f0) {
                return;
            }
            launchActivity.D0(t2Var.T);
        }
    }

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        t2 t2Var = this.k0;
        Paint paint = t2Var.R;
        s2 s2Var = t2Var.f;
        q2 q2Var = t2Var.Y;
        i6 i6Var = t2Var.G;
        if (q2Var == null || s2Var == null) {
            return;
        }
        try {
            if (t2Var.E != null && paint != null) {
                if (!t2Var.W) {
                    int i7 = t2Var.w0;
                    if (i7 < 0) {
                        i7 = n6.d6;
                    }
                    int w03 = n6.w0(i7, i6Var);
                    int i10 = t2Var.S;
                    if (w03 != i10) {
                        t2Var.S = w03;
                        if ((q2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) q2Var.getBackground()).getColor() == i10) {
                            q2Var.setBackgroundColor(t2Var.S);
                        }
                    }
                }
                if (t2Var.J0 && t2Var.n0 != null && (w02 = n6.w0(n6.a7, i6Var)) != t2Var.T) {
                    t2Var.D(w02, false);
                    t2Var.J0 = true;
                }
                if (t2Var.a == t2Var.b) {
                    int x02 = n6.x0(null, n6.zj, false);
                    t2Var.b = x02;
                    t2Var.a = x02;
                }
                int color = paint.getColor();
                if (!t2Var.W) {
                    color = (((((((((((color * 31) + n6.w0(n6.G6, i6Var)) * 31) + n6.w0(n6.u8, i6Var)) * 31) + n6.w0(n6.G8, i6Var)) * 31) + n6.w0(n6.E8, i6Var)) * 31) + n6.w0(n6.F8, i6Var)) * 31) + n6.w0(n6.I5, i6Var);
                }
                if (!t2Var.K0 || color != t2Var.L0) {
                    t2Var.K0 = true;
                    t2Var.L0 = color;
                    t2Var.F();
                }
                t2Var.J();
                s2Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.l3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        t2 t2Var = this.k0;
        k2 k2Var = t2Var.x;
        float left = k2Var.getLeft();
        float translationY = k2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = k2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.i0;
        rectF3.set(left, translationY, right, height);
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.j0;
        path.rewind();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - t2Var.c), org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(t2Var.R);
        if (k2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(k2Var.getY(), rectF2.top));
            k2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
