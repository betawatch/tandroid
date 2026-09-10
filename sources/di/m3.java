package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.fa;
import bi.u6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m3 extends aw0 implements org.telegram.ui.ActionBar.x3 {
    public final /* synthetic */ n3 A0;
    public final Paint w0;
    public boolean x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(n3 n3Var, Context context) {
        super(context, null);
        this.A0 = n3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.w0 = new Paint(1);
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        n3 n3Var = this.A0;
        be0 be0Var = n3Var.s0;
        Rect rect = n3Var.h;
        Rect rect2 = n3Var.f;
        if (this.x0) {
            return;
        }
        int visibility = be0Var.getVisibility();
        Paint paint2 = this.w0;
        if (visibility != 0) {
            float f7 = n3Var.f0;
            if (f7 < 1.0f && f7 > 0.0f) {
                paint2.setColor(j6.l1(n3Var.N0, n3Var.R));
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
        if (n3Var.s == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - n3Var.f0) * rect.left, 0.0f);
            u6 u6Var = n3Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), n3Var.f0);
            getHeight();
            u6Var.n(canvas, true, false, lerp, 1.0f - n3Var.f0);
            canvas.translate((1.0f - n3Var.f0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (be0Var.getVisibility() != 0) {
            paint2.setColor(j6.l1(n3Var.N0, n3Var.R));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - n3Var.f0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - n3Var.f0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                j3 j3Var = n3Var.l0;
                canvas.drawRect(0.0f, height - (f10 * ((j3Var == null || j3Var.getTotalHeight() <= 0) ? 1.0f - n3Var.f0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.vision.e2.a(1.0f, n3Var.f0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n3 n3Var = this.A0;
        Rect rect = n3Var.h;
        LaunchActivity launchActivity = LaunchActivity.G1;
        org.telegram.ui.ActionBar.q3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - n3Var.f0) * ((int) P.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        n3 n3Var = this.A0;
        Rect rect = n3Var.h;
        d3 d3Var = n3Var.v;
        Paint paint = n3Var.N;
        k3 k3Var = n3Var.W;
        Drawable drawable = n3Var.Y;
        if (this.x0) {
            return;
        }
        super.draw(canvas);
        float f7 = AndroidUtilities.isTablet() ? 0.0f : n3Var.b;
        paint.setColor(n3Var.a);
        paint.setAlpha((int) ((1.0f - n3Var.f0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, n3Var.b) : AndroidUtilities.lerp(d3Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (k3Var.getAlpha() * 255.0f));
        float translationY = k3Var.getTranslationY() + k3Var.getY() + k3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        n3 n3Var = this.A0;
        if (view != n3Var.v || !n3Var.h0 || n3Var.j0 <= 0 || n3Var.i0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(n3Var.i0, view.getWidth(), n3Var.g0), view.getY() + AndroidUtilities.lerp(n3Var.j0, view.getHeight(), n3Var.g0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.x3
    public RectF getRect() {
        d3 d3Var = this.A0.v;
        float left = d3Var.getLeft();
        float translationY = d3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = d3Var.getRight();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pc.a(this, new fa(3));
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        n3 n3Var = this.A0;
        Paint paint = n3Var.T;
        Paint paint2 = n3Var.P;
        d3 d3Var = n3Var.v;
        if (this.x0) {
            return;
        }
        super.onDraw(canvas);
        if (n3Var.s0.getVisibility() != 0) {
            canvas.save();
            u6 u6Var = n3Var.s;
            if (u6Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                u6Var.n(canvas2, false, false, width, 1.0f - n3Var.f0);
            } else {
                canvas2 = canvas;
            }
            if (!n3Var.V) {
                int v02 = j6.v0(j6.d6, n3Var.E);
                paint2.setColor(v02);
                n3Var.x.setFlickerViewColor(v02);
                org.telegram.ui.e3 e3Var = n3Var.U0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    n3Var.U0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, n3Var.O);
            org.telegram.ui.ActionBar.q3 q3Var = n3Var.r;
            int i10 = q3Var != null ? (int) q3Var.G : 0;
            paint.setColor(n3Var.Q);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - n3Var.b);
            rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, n3Var.f0), AndroidUtilities.lerp(d3Var.getTranslationY(), 0.0f, n3Var.b), d3Var.getRight(), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, n3Var.f0), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(d3Var.getRight(), getWidth(), n3Var.f0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n3 n3Var = this.A0;
        d3 d3Var = n3Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, n3Var.b) && motionEvent.getX() <= d3Var.getRight() && motionEvent.getX() >= d3Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        n3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.x0 != z10) {
            this.x0 = z10;
            invalidate();
            n3 n3Var = this.A0;
            n3Var.G();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || !n3Var.d0) {
                return;
            }
            launchActivity.z0(n3Var.R);
        }
    }

    @Override // org.telegram.ui.ActionBar.x3
    public final float w(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        n3 n3Var = this.A0;
        d3 d3Var = n3Var.v;
        float left = d3Var.getLeft();
        float translationY = d3Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = d3Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.y0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.z0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - n3Var.b), AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(n3Var.P);
        if (d3Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(d3Var.getY(), rectF2.top));
            d3Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
