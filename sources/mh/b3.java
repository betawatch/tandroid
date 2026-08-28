package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b3 extends xu0 implements org.telegram.ui.ActionBar.t3 {
    public final Paint s0;
    public boolean t0;
    public final RectF u0;
    public final Path v0;
    public final /* synthetic */ c3 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, Context context) {
        super(context, null);
        this.w0 = c3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.s0 = new Paint(1);
        this.u0 = new RectF();
        this.v0 = new Path();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        c3 c3Var = this.w0;
        yc0 yc0Var = c3Var.o0;
        Rect rect = c3Var.h;
        Rect rect2 = c3Var.f;
        if (this.t0) {
            return;
        }
        int visibility = yc0Var.getVisibility();
        Paint paint2 = this.s0;
        if (visibility != 0) {
            float f10 = c3Var.b0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(f6.l1(c3Var.J0, c3Var.N));
                int i9 = rect2.left;
                if (i9 > 0) {
                    canvas.drawRect(0.0f, 0.0f, i9, getHeight(), paint2);
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
        if (c3Var.s == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - c3Var.b0) * rect.left, 0.0f);
            b3.b bVar = c3Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), c3Var.b0);
            getHeight();
            bVar.l(canvas, true, false, lerp, 1.0f - c3Var.b0);
            canvas.translate((1.0f - c3Var.b0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (yc0Var.getVisibility() != 0) {
            paint2.setColor(f6.l1(c3Var.J0, c3Var.N));
            int i10 = rect2.left;
            if (i10 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - c3Var.b0) * i10, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - c3Var.b0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                y2 y2Var = c3Var.h0;
                canvas.drawRect(0.0f, height - (f11 * ((y2Var == null || y2Var.getTotalHeight() <= 0) ? 1.0f - c3Var.b0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(j3.r0.C(1.0f, c3Var.b0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.w0;
        Rect rect = c3Var.h;
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i9 = (int) ((1.0f - c3Var.b0) * ((int) P.C));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i9 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i9), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        c3 c3Var = this.w0;
        Rect rect = c3Var.h;
        t2 t2Var = c3Var.v;
        Paint paint = c3Var.J;
        z2 z2Var = c3Var.S;
        Drawable drawable = c3Var.U;
        if (this.t0) {
            return;
        }
        super.draw(canvas);
        float f10 = AndroidUtilities.isTablet() ? 0.0f : c3Var.b;
        paint.setColor(c3Var.a);
        paint.setAlpha((int) ((1.0f - c3Var.b0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(t2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, c3Var.b) : AndroidUtilities.lerp(t2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f10) + AndroidUtilities.dp(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (z2Var.getAlpha() * 255.0f));
        float translationY = z2Var.getTranslationY() + z2Var.getY() + z2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        c3 c3Var = this.w0;
        if (view != c3Var.v || !c3Var.d0 || c3Var.f0 <= 0 || c3Var.e0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(c3Var.e0, view.getWidth(), c3Var.c0), view.getY() + AndroidUtilities.lerp(c3Var.f0, view.getHeight(), c3Var.c0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        t2 t2Var = this.w0.v;
        float left = t2Var.getLeft();
        float translationY = t2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = t2Var.getRight();
        float height = getHeight();
        RectF rectF = this.u0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this, new bg.z(7));
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        c3 c3Var = this.w0;
        Paint paint = c3Var.P;
        Paint paint2 = c3Var.L;
        t2 t2Var = c3Var.v;
        if (this.t0) {
            return;
        }
        super.onDraw(canvas);
        if (c3Var.o0.getVisibility() != 0) {
            canvas.save();
            b3.b bVar = c3Var.s;
            if (bVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                bVar.l(canvas2, false, false, width, 1.0f - c3Var.b0);
            } else {
                canvas2 = canvas;
            }
            if (!c3Var.R) {
                int v02 = f6.v0(f6.d6, c3Var.A);
                paint2.setColor(v02);
                c3Var.x.setFlickerViewColor(v02);
                org.telegram.ui.g3 g3Var = c3Var.Q0;
                if (g3Var != null) {
                    g3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    c3Var.Q0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, c3Var.K);
            org.telegram.ui.ActionBar.m3 m3Var = c3Var.r;
            int i9 = m3Var != null ? (int) m3Var.C : 0;
            paint.setColor(c3Var.M);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - c3Var.b);
            rectF.set(AndroidUtilities.lerp(t2Var.getLeft(), 0, c3Var.b0), AndroidUtilities.lerp(t2Var.getTranslationY(), 0.0f, c3Var.b), t2Var.getRight(), t2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(t2Var.getLeft(), 0, c3Var.b0), t2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(t2Var.getRight(), getWidth(), c3Var.b0), getHeight() - i9);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.w0;
        t2 t2Var = c3Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(t2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, c3Var.b) && motionEvent.getX() <= t2Var.getRight() && motionEvent.getX() >= t2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        c3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.t0 != z10) {
            this.t0 = z10;
            invalidate();
            c3 c3Var = this.w0;
            c3Var.G();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || !c3Var.Z) {
                return;
            }
            launchActivity.z0(c3Var.N);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        c3 c3Var = this.w0;
        t2 t2Var = c3Var.v;
        float left = t2Var.getLeft();
        float translationY = t2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = t2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.u0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.v0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - c3Var.b), AndroidUtilities.dp(18.0f), f10);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(c3Var.L);
        if (t2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * AndroidUtilities.dp(51.0f)) + Math.max(t2Var.getY(), rectF2.top));
            t2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
