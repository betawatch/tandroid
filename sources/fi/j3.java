package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import di.c9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j3 extends ov0 implements org.telegram.ui.ActionBar.v3 {
    public final /* synthetic */ k3 A0;
    public final Paint w0;
    public boolean x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(k3 k3Var, Context context) {
        super(context, null);
        this.A0 = k3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.w0 = new Paint(1);
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        k3 k3Var = this.A0;
        sd0 sd0Var = k3Var.s0;
        Rect rect = k3Var.h;
        Rect rect2 = k3Var.f;
        if (this.x0) {
            return;
        }
        int visibility = sd0Var.getVisibility();
        Paint paint2 = this.w0;
        if (visibility != 0) {
            float f7 = k3Var.f0;
            if (f7 < 1.0f && f7 > 0.0f) {
                paint2.setColor(j6.l1(k3Var.N0, k3Var.R));
                int i10 = rect2.left;
                if (i10 > 0) {
                    canvas.drawRect(0.0f, 0.0f, i10, getHeight(), paint2);
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
        if (k3Var.s == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - k3Var.f0) * rect.left, 0.0f);
            cf.c cVar = k3Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), k3Var.f0);
            getHeight();
            cVar.m(canvas, true, false, lerp, 1.0f - k3Var.f0);
            canvas.translate((1.0f - k3Var.f0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (sd0Var.getVisibility() != 0) {
            paint2.setColor(j6.l1(k3Var.N0, k3Var.R));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - k3Var.f0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - k3Var.f0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                g3 g3Var = k3Var.l0;
                canvas.drawRect(0.0f, height - (f10 * ((g3Var == null || g3Var.getTotalHeight() <= 0) ? 1.0f - k3Var.f0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.vision.e2.b(1.0f, k3Var.f0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k3 k3Var = this.A0;
        Rect rect = k3Var.h;
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.o3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - k3Var.f0) * ((int) P.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        k3 k3Var = this.A0;
        Rect rect = k3Var.h;
        a3 a3Var = k3Var.v;
        Paint paint = k3Var.N;
        h3 h3Var = k3Var.W;
        Drawable drawable = k3Var.Y;
        if (this.x0) {
            return;
        }
        super.draw(canvas);
        float f7 = AndroidUtilities.isTablet() ? 0.0f : k3Var.b;
        paint.setColor(k3Var.a);
        paint.setAlpha((int) ((1.0f - k3Var.f0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(a3Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, k3Var.b) : AndroidUtilities.lerp(a3Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (h3Var.getAlpha() * 255.0f));
        float translationY = h3Var.getTranslationY() + h3Var.getY() + h3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        k3 k3Var = this.A0;
        if (view != k3Var.v || !k3Var.h0 || k3Var.j0 <= 0 || k3Var.i0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(k3Var.i0, view.getWidth(), k3Var.g0), view.getY() + AndroidUtilities.lerp(k3Var.j0, view.getHeight(), k3Var.g0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public RectF getRect() {
        a3 a3Var = this.A0.v;
        float left = a3Var.getLeft();
        float translationY = a3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = a3Var.getRight();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new c9(3));
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k3 k3Var = this.A0;
        Paint paint = k3Var.T;
        Paint paint2 = k3Var.P;
        a3 a3Var = k3Var.v;
        if (this.x0) {
            return;
        }
        super.onDraw(canvas);
        if (k3Var.s0.getVisibility() != 0) {
            canvas.save();
            cf.c cVar = k3Var.s;
            if (cVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                cVar.m(canvas2, false, false, width, 1.0f - k3Var.f0);
            } else {
                canvas2 = canvas;
            }
            if (!k3Var.V) {
                int v02 = j6.v0(j6.d6, k3Var.E);
                paint2.setColor(v02);
                k3Var.x.setFlickerViewColor(v02);
                org.telegram.ui.d3 d3Var = k3Var.U0;
                if (d3Var != null) {
                    d3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, k3Var.O);
            org.telegram.ui.ActionBar.o3 o3Var = k3Var.r;
            int i10 = o3Var != null ? (int) o3Var.G : 0;
            paint.setColor(k3Var.Q);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - k3Var.b);
            rectF.set(AndroidUtilities.lerp(a3Var.getLeft(), 0, k3Var.f0), AndroidUtilities.lerp(a3Var.getTranslationY(), 0.0f, k3Var.b), a3Var.getRight(), a3Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(a3Var.getLeft(), 0, k3Var.f0), a3Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(a3Var.getRight(), getWidth(), k3Var.f0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k3 k3Var = this.A0;
        a3 a3Var = k3Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(a3Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, k3Var.b) && motionEvent.getX() <= a3Var.getRight() && motionEvent.getX() >= a3Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        k3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.x0 != z10) {
            this.x0 = z10;
            invalidate();
            k3 k3Var = this.A0;
            k3Var.G();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || !k3Var.d0) {
                return;
            }
            launchActivity.z0(k3Var.R);
        }
    }

    @Override // org.telegram.ui.ActionBar.v3
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        k3 k3Var = this.A0;
        a3 a3Var = k3Var.v;
        float left = a3Var.getLeft();
        float translationY = a3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = a3Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.y0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.z0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - k3Var.b), AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(k3Var.P);
        if (a3Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(a3Var.getY(), rectF2.top));
            a3Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
