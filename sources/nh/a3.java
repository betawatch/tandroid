package nh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class a3 extends zu0 implements org.telegram.ui.ActionBar.t3 {
    public final Paint s0;
    public boolean t0;
    public final RectF u0;
    public final Path v0;
    public final /* synthetic */ b3 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(b3 b3Var, Context context) {
        super(context, null);
        this.w0 = b3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.s0 = new Paint(1);
        this.u0 = new RectF();
        this.v0 = new Path();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        b3 b3Var = this.w0;
        dd0 dd0Var = b3Var.o0;
        Rect rect = b3Var.h;
        Rect rect2 = b3Var.f;
        if (this.t0) {
            return;
        }
        int visibility = dd0Var.getVisibility();
        Paint paint2 = this.s0;
        if (visibility != 0) {
            float f10 = b3Var.b0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(g6.l1(b3Var.J0, b3Var.N));
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
        if (b3Var.s == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - b3Var.b0) * rect.left, 0.0f);
            af.h hVar = b3Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), b3Var.b0);
            getHeight();
            hVar.q(canvas, true, false, lerp, 1.0f - b3Var.b0);
            canvas.translate((1.0f - b3Var.b0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (dd0Var.getVisibility() != 0) {
            paint2.setColor(g6.l1(b3Var.J0, b3Var.N));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - b3Var.b0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - b3Var.b0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                x2 x2Var = b3Var.h0;
                canvas.drawRect(0.0f, height - (f11 * ((x2Var == null || x2Var.getTotalHeight() <= 0) ? 1.0f - b3Var.b0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(pa.b(1.0f, b3Var.b0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.w0;
        Rect rect = b3Var.h;
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - b3Var.b0) * ((int) P.C));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b3 b3Var = this.w0;
        Rect rect = b3Var.h;
        s2 s2Var = b3Var.v;
        Paint paint = b3Var.J;
        y2 y2Var = b3Var.S;
        Drawable drawable = b3Var.U;
        if (this.t0) {
            return;
        }
        super.draw(canvas);
        float f10 = AndroidUtilities.isTablet() ? 0.0f : b3Var.b;
        paint.setColor(b3Var.a);
        paint.setAlpha((int) ((1.0f - b3Var.b0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(s2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, b3Var.b) : AndroidUtilities.lerp(s2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f10) + AndroidUtilities.dp(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (y2Var.getAlpha() * 255.0f));
        float translationY = y2Var.getTranslationY() + y2Var.getY() + y2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        b3 b3Var = this.w0;
        if (view != b3Var.v || !b3Var.d0 || b3Var.f0 <= 0 || b3Var.e0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(b3Var.e0, view.getWidth(), b3Var.c0), view.getY() + AndroidUtilities.lerp(b3Var.f0, view.getHeight(), b3Var.c0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        s2 s2Var = this.w0.v;
        float left = s2Var.getLeft();
        float translationY = s2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = s2Var.getRight();
        float height = getHeight();
        RectF rectF = this.u0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this, new cg.w(7));
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        b3 b3Var = this.w0;
        Paint paint = b3Var.P;
        Paint paint2 = b3Var.L;
        s2 s2Var = b3Var.v;
        if (this.t0) {
            return;
        }
        super.onDraw(canvas);
        if (b3Var.o0.getVisibility() != 0) {
            canvas.save();
            af.h hVar = b3Var.s;
            if (hVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                hVar.q(canvas2, false, false, width, 1.0f - b3Var.b0);
            } else {
                canvas2 = canvas;
            }
            if (!b3Var.R) {
                int v02 = g6.v0(g6.d6, b3Var.A);
                paint2.setColor(v02);
                b3Var.x.setFlickerViewColor(v02);
                org.telegram.ui.h3 h3Var = b3Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    b3Var.Q0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, b3Var.K);
            org.telegram.ui.ActionBar.m3 m3Var = b3Var.r;
            int i10 = m3Var != null ? (int) m3Var.C : 0;
            paint.setColor(b3Var.M);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - b3Var.b);
            rectF.set(AndroidUtilities.lerp(s2Var.getLeft(), 0, b3Var.b0), AndroidUtilities.lerp(s2Var.getTranslationY(), 0.0f, b3Var.b), s2Var.getRight(), s2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(s2Var.getLeft(), 0, b3Var.b0), s2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(s2Var.getRight(), getWidth(), b3Var.b0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.w0;
        s2 s2Var = b3Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(s2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, b3Var.b) && motionEvent.getX() <= s2Var.getRight() && motionEvent.getX() >= s2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        b3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.t0 != z10) {
            this.t0 = z10;
            invalidate();
            b3 b3Var = this.w0;
            b3Var.G();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || !b3Var.Z) {
                return;
            }
            launchActivity.z0(b3Var.N);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        b3 b3Var = this.w0;
        s2 s2Var = b3Var.v;
        float left = s2Var.getLeft();
        float translationY = s2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = s2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.u0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.v0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - b3Var.b), AndroidUtilities.dp(18.0f), f10);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(b3Var.L);
        if (s2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * AndroidUtilities.dp(51.0f)) + Math.max(s2Var.getY(), rectF2.top));
            s2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
