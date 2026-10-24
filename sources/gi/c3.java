package gi;

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
import com.google.android.gms.internal.cast.z5;
import ei.o8;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class c3 extends ow0 implements org.telegram.ui.ActionBar.x3 {
    public final /* synthetic */ d3 A0;
    public final Paint w0;
    public boolean x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, Context context) {
        super(context, null);
        this.A0 = d3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.w0 = new Paint(1);
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.b6
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

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        d3 d3Var = this.A0;
        pe0 pe0Var = d3Var.t0;
        Rect rect = d3Var.n;
        Rect rect2 = d3Var.h;
        if (this.x0) {
            return;
        }
        int visibility = pe0Var.getVisibility();
        Paint paint2 = this.w0;
        if (visibility != 0) {
            float f7 = d3Var.g0;
            if (f7 < 1.0f && f7 > 0.0f) {
                paint2.setColor(k6.o1(d3Var.R0, d3Var.S));
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
        if (d3Var.v == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - d3Var.g0) * rect.left, 0.0f);
            z5 z5Var = d3Var.v;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), d3Var.g0);
            getHeight();
            z5Var.n(canvas, true, false, lerp, 1.0f - d3Var.g0);
            canvas.translate((1.0f - d3Var.g0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (pe0Var.getVisibility() != 0) {
            paint2.setColor(k6.o1(d3Var.R0, d3Var.S));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - d3Var.g0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - d3Var.g0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                z2 z2Var = d3Var.m0;
                canvas.drawRect(0.0f, height - (f10 * ((z2Var == null || z2Var.getTotalHeight() <= 0) ? 1.0f - d3Var.g0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(com.google.android.gms.internal.play_billing.k3.D(1.0f, d3Var.g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.A0;
        Rect rect = d3Var.n;
        LaunchActivity launchActivity = LaunchActivity.J1;
        org.telegram.ui.ActionBar.q3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - d3Var.g0) * ((int) P.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        d3 d3Var = this.A0;
        Rect rect = d3Var.n;
        u2 u2Var = d3Var.w;
        Paint paint = d3Var.O;
        a3 a3Var = d3Var.X;
        Drawable drawable = d3Var.Z;
        if (this.x0) {
            return;
        }
        super.draw(canvas);
        float f7 = AndroidUtilities.isTablet() ? 0.0f : d3Var.c;
        paint.setColor(d3Var.a);
        paint.setAlpha((int) ((1.0f - d3Var.g0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, d3Var.c) : AndroidUtilities.lerp(u2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (a3Var.getAlpha() * 255.0f));
        float translationY = a3Var.getTranslationY() + a3Var.getY() + a3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        d3 d3Var = this.A0;
        if (view != d3Var.w || !d3Var.i0 || d3Var.k0 <= 0 || d3Var.j0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(d3Var.j0, view.getWidth(), d3Var.h0), view.getY() + AndroidUtilities.lerp(d3Var.k0, view.getHeight(), d3Var.h0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.x3
    public RectF getRect() {
        u2 u2Var = this.A0.w;
        float left = u2Var.getLeft();
        float translationY = u2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = u2Var.getRight();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new o8(3));
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        d3 d3Var = this.A0;
        Paint paint = d3Var.U;
        Paint paint2 = d3Var.Q;
        u2 u2Var = d3Var.w;
        if (this.x0) {
            return;
        }
        super.onDraw(canvas);
        if (d3Var.t0.getVisibility() != 0) {
            canvas.save();
            z5 z5Var = d3Var.v;
            if (z5Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                z5Var.n(canvas2, false, false, width, 1.0f - d3Var.g0);
            } else {
                canvas2 = canvas;
            }
            if (!d3Var.W) {
                int w02 = k6.w0(k6.d6, d3Var.F);
                paint2.setColor(w02);
                d3Var.y.setFlickerViewColor(w02);
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    d3Var.Y0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, d3Var.P);
            org.telegram.ui.ActionBar.q3 q3Var = d3Var.s;
            int i10 = q3Var != null ? (int) q3Var.G : 0;
            paint.setColor(d3Var.R);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - d3Var.c);
            rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.g0), AndroidUtilities.lerp(u2Var.getTranslationY(), 0.0f, d3Var.c), u2Var.getRight(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.g0), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(u2Var.getRight(), getWidth(), d3Var.g0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.w;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, d3Var.c) && motionEvent.getX() <= u2Var.getRight() && motionEvent.getX() >= u2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        d3Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.x0 != z10) {
            this.x0 = z10;
            invalidate();
            d3 d3Var = this.A0;
            d3Var.H();
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity == null || !d3Var.e0) {
                return;
            }
            launchActivity.E0(d3Var.S);
        }
    }

    @Override // org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        d3 d3Var = this.A0;
        Paint paint = d3Var.Q;
        c3 c3Var = d3Var.f;
        a3 a3Var = d3Var.X;
        g6 g6Var = d3Var.F;
        if (a3Var == null || c3Var == null) {
            return;
        }
        try {
            if (d3Var.y != null && paint != null) {
                if (!d3Var.V) {
                    int i10 = d3Var.v0;
                    if (i10 < 0) {
                        i10 = k6.d6;
                    }
                    int w03 = k6.w0(i10, g6Var);
                    int i11 = d3Var.R;
                    if (w03 != i11) {
                        d3Var.R = w03;
                        if ((a3Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) a3Var.getBackground()).getColor() == i11) {
                            a3Var.setBackgroundColor(d3Var.R);
                        }
                    }
                }
                if (d3Var.I0 && d3Var.m0 != null && (w02 = k6.w0(k6.a7, g6Var)) != d3Var.S) {
                    d3Var.z(w02, false);
                    d3Var.I0 = true;
                }
                if (d3Var.a == d3Var.b) {
                    int x02 = k6.x0(null, k6.Ii, false);
                    d3Var.b = x02;
                    d3Var.a = x02;
                }
                int color = paint.getColor();
                if (!d3Var.V) {
                    color = (((((((((((color * 31) + k6.w0(k6.G6, g6Var)) * 31) + k6.w0(k6.u8, g6Var)) * 31) + k6.w0(k6.G8, g6Var)) * 31) + k6.w0(k6.E8, g6Var)) * 31) + k6.w0(k6.F8, g6Var)) * 31) + k6.w0(k6.I5, g6Var);
                }
                if (!d3Var.J0 || color != d3Var.K0) {
                    d3Var.J0 = true;
                    d3Var.K0 = color;
                    d3Var.B();
                }
                d3Var.F();
                c3Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.x3
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.w;
        float left = u2Var.getLeft();
        float translationY = u2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = u2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.y0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.z0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - d3Var.c), AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(d3Var.Q);
        if (u2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(u2Var.getY(), rectF2.top));
            u2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
