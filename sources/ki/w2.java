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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class w2 extends st0 implements org.telegram.ui.ActionBar.h3 {
    public final Paint g0;
    public boolean h0;
    public final RectF i0;
    public final Path j0;
    public final /* synthetic */ x2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context) {
        super(context, null);
        this.k0 = x2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.g0 = new Paint(1);
        this.i0 = new RectF();
        this.j0 = new Path();
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.d6));
        hashSet.add(Integer.valueOf(j6.a7));
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.u8));
        hashSet.add(Integer.valueOf(j6.G8));
        hashSet.add(Integer.valueOf(j6.E8));
        hashSet.add(Integer.valueOf(j6.F8));
        hashSet.add(Integer.valueOf(j6.I5));
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        x2 x2Var = this.k0;
        fc0 fc0Var = x2Var.u0;
        Rect rect = x2Var.n;
        Rect rect2 = x2Var.h;
        if (this.h0) {
            return;
        }
        int visibility = fc0Var.getVisibility();
        Paint paint2 = this.g0;
        if (visibility != 0) {
            float f10 = x2Var.h0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(j6.r1(x2Var.S0, x2Var.T));
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
        if (x2Var.w == null || org.telegram.messenger.g0.Q1()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - x2Var.h0) * rect.left, 0.0f);
            r7 r7Var = x2Var.w;
            int W1 = org.telegram.messenger.g0.W1(x2Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            r7Var.k(canvas, true, false, W1, 1.0f - x2Var.h0);
            canvas.translate((1.0f - x2Var.h0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (fc0Var.getVisibility() != 0) {
            paint2.setColor(j6.r1(x2Var.S0, x2Var.T));
            int i10 = rect2.left;
            if (i10 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - x2Var.h0) * i10, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - x2Var.h0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                t2 t2Var = x2Var.n0;
                canvas.drawRect(0.0f, height - (f11 * ((t2Var == null || t2Var.getTotalHeight() <= 0) ? 1.0f - x2Var.h0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, x2Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        x2 x2Var = this.k0;
        Rect rect = x2Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.c3 N = launchActivity != null ? launchActivity.N() : null;
        if (N != null && rect != null) {
            int i7 = (int) ((1.0f - x2Var.h0) * ((int) N.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return N.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        x2 x2Var = this.k0;
        Rect rect = x2Var.n;
        o2 o2Var = x2Var.x;
        Paint paint = x2Var.P;
        u2 u2Var = x2Var.Y;
        Drawable drawable = x2Var.a0;
        if (this.h0) {
            return;
        }
        super.draw(canvas);
        float f10 = org.telegram.messenger.g0.Q1() ? 0.0f : x2Var.c;
        paint.setColor(x2Var.a);
        paint.setAlpha((int) ((1.0f - x2Var.h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float T1 = org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.T1(o2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.m / 2.0f, x2Var.c) : org.telegram.messenger.g0.T1(o2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.m, f10) + org.telegram.messenger.g0.L(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (u2Var.getAlpha() * 255.0f));
        float translationY = u2Var.getTranslationY() + u2Var.getY() + u2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        x2 x2Var = this.k0;
        if (view != x2Var.x || !x2Var.j0 || x2Var.l0 <= 0 || x2Var.k0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(x2Var.i0, x2Var.k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(x2Var.i0, x2Var.l0, view.getHeight()));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public RectF getRect() {
        o2 o2Var = this.k0.x;
        float left = o2Var.getLeft();
        float translationY = o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = o2Var.getRight();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.t(4));
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        x2 x2Var = this.k0;
        Paint paint = x2Var.V;
        Paint paint2 = x2Var.R;
        o2 o2Var = x2Var.x;
        if (this.h0) {
            return;
        }
        super.onDraw(canvas);
        if (x2Var.u0.getVisibility() != 0) {
            canvas.save();
            r7 r7Var = x2Var.w;
            if (r7Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                r7Var.k(canvas2, false, false, width, 1.0f - x2Var.h0);
            } else {
                canvas2 = canvas;
            }
            if (!x2Var.X) {
                int w02 = j6.w0(j6.d6, x2Var.G);
                paint2.setColor(w02);
                x2Var.E.setFlickerViewColor(w02);
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                    x2Var.Z0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, x2Var.Q);
            org.telegram.ui.ActionBar.c3 c3Var = x2Var.s;
            int i7 = c3Var != null ? (int) c3Var.H : 0;
            paint.setColor(x2Var.S);
            float L = org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - x2Var.c);
            rectF.set(org.telegram.messenger.g0.W1(x2Var.h0, o2Var.getLeft(), 0), org.telegram.messenger.g0.T1(o2Var.getTranslationY(), 0.0f, x2Var.c), o2Var.getRight(), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(org.telegram.messenger.g0.W1(x2Var.h0, o2Var.getLeft(), 0), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(x2Var.h0, o2Var.getRight(), getWidth()), getHeight() - i7);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x2 x2Var = this.k0;
        o2 o2Var = x2Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.g0.T1(o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, x2Var.c) && motionEvent.getX() <= o2Var.getRight() && motionEvent.getX() >= o2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        x2Var.o(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.h0 != z10) {
            this.h0 = z10;
            invalidate();
            x2 x2Var = this.k0;
            x2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || !x2Var.f0) {
                return;
            }
            launchActivity.D0(x2Var.T);
        }
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        x2 x2Var = this.k0;
        Paint paint = x2Var.R;
        w2 w2Var = x2Var.f;
        u2 u2Var = x2Var.Y;
        e6 e6Var = x2Var.G;
        if (u2Var == null || w2Var == null) {
            return;
        }
        try {
            if (x2Var.E != null && paint != null) {
                if (!x2Var.W) {
                    int i7 = x2Var.w0;
                    if (i7 < 0) {
                        i7 = j6.d6;
                    }
                    int w03 = j6.w0(i7, e6Var);
                    int i10 = x2Var.S;
                    if (w03 != i10) {
                        x2Var.S = w03;
                        if ((u2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) u2Var.getBackground()).getColor() == i10) {
                            u2Var.setBackgroundColor(x2Var.S);
                        }
                    }
                }
                if (x2Var.J0 && x2Var.n0 != null && (w02 = j6.w0(j6.a7, e6Var)) != x2Var.T) {
                    x2Var.D(w02, false);
                    x2Var.J0 = true;
                }
                if (x2Var.a == x2Var.b) {
                    int x02 = j6.x0(null, j6.zj, false);
                    x2Var.b = x02;
                    x2Var.a = x02;
                }
                int color = paint.getColor();
                if (!x2Var.W) {
                    color = (((((((((((color * 31) + j6.w0(j6.G6, e6Var)) * 31) + j6.w0(j6.u8, e6Var)) * 31) + j6.w0(j6.G8, e6Var)) * 31) + j6.w0(j6.E8, e6Var)) * 31) + j6.w0(j6.F8, e6Var)) * 31) + j6.w0(j6.I5, e6Var);
                }
                if (!x2Var.K0 || color != x2Var.L0) {
                    x2Var.K0 = true;
                    x2Var.L0 = color;
                    x2Var.F();
                }
                x2Var.J();
                w2Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        x2 x2Var = this.k0;
        o2 o2Var = x2Var.x;
        float left = o2Var.getLeft();
        float translationY = o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f);
        float right = o2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.i0;
        rectF3.set(left, translationY, right, height);
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.j0;
        path.rewind();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f) * (org.telegram.messenger.g0.Q1() ? 1.0f : 1.0f - x2Var.c), org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(x2Var.R);
        if (o2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(o2Var.getY(), rectF2.top));
            o2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
