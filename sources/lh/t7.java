package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public class t7 extends View {
    public final Path A;
    public final Path B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final org.telegram.ui.Components.y5 F;
    public final org.telegram.ui.Components.y5 G;
    public float H;
    public long I;
    public float J;
    public int K;
    public int L;
    public final TextPaint M;
    public int N;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.y5 f;
    public Utilities.Callback h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final org.telegram.ui.Components.i6 x;
    public final org.telegram.ui.Components.i6 y;

    public t7(Context context, int i10) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        er erVar = er.h;
        this.f = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.w = paint5;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.x = i6Var;
        this.A = new Path();
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
        this.F = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.G = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.M = new TextPaint(1);
        this.a = i10;
        i6Var.u(AndroidUtilities.bold());
        i6Var.k(0.3f, 40L, erVar);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            i6Var.t(AndroidUtilities.dp(15.0f));
            this.y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            i6Var.t(AndroidUtilities.dp(14.0f));
            i6Var.b = 5;
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
            this.y = i6Var2;
            i6Var2.G = AndroidUtilities.displaySize.x;
            i6Var2.t(AndroidUtilities.dp(14.0f));
            i6Var2.u(AndroidUtilities.bold());
            i6Var2.k(0.3f, 40L, erVar);
            i6Var2.setCallback(this);
            i6Var2.r(-1);
            if (i10 == 1) {
                i6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                i6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                i6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        i6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.e = true;
        float f11 = this.b;
        this.d = (f10 - f11) / (this.c - f11);
        e(f10);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(org.telegram.ui.x3 x3Var) {
        this.h = x3Var;
    }

    public final void d(float f10) {
        float f11 = this.b;
        float f12 = (f10 - f11) / (this.c - f11);
        this.d = f12;
        this.f.d(f12, true);
        e(f10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.K, this.L);
        Path path = this.A;
        path.rewind();
        float f10 = this.J;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        float d = this.e ? this.f.d(this.d, false) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.K, this.L, 255, 31);
        int i10 = this.a;
        org.telegram.ui.Components.i6 i6Var = this.x;
        if (i10 == 0) {
            i6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.K, this.L - AndroidUtilities.dp(1.0f));
            i6Var.draw(canvas);
        } else {
            int dp = AndroidUtilities.dp(12.33f);
            int i11 = -AndroidUtilities.dp(1.0f);
            int d10 = (this.K - ((int) i6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp2 = this.L - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.i6 i6Var2 = this.y;
            i6Var2.setBounds(dp, i11, d10, dp2);
            i6Var2.draw(canvas);
            i6Var.setBounds(this.K - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.K - AndroidUtilities.dp(11.0f), this.L - AndroidUtilities.dp(1.0f));
            i6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.B, this.r);
            canvas.drawPath(this.C, this.s);
            float f11 = this.c;
            float f12 = this.b;
            float f13 = f11 - f12;
            double d11 = f13 != 0.0f ? (f13 * this.d) + f12 : 0.0f;
            float e9 = this.F.e(d11 > 0.25d);
            canvas.save();
            canvas.translate((1.0f - e9) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e9 * 255.0f));
            canvas.drawPath(this.D, paint);
            canvas.restore();
            float e10 = this.G.e(d11 > 0.5d);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.w;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.E, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.K * d, this.L, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.K <= 0) {
            return false;
        }
        float x8 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.I = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.c;
            float f11 = this.b;
            float z11 = f10 - f11 != 0.0f ? com.google.android.recaptcha.internal.a.z(f10, f11, this.d, f11) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.I >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.clamp(((x8 - this.H) / this.K) + this.d, 1.0f, 0.0f);
                this.e = false;
                z10 = true;
            } else {
                this.f.d(this.d, true);
                this.d = x8 / this.K;
                this.e = true;
            }
            float f12 = this.c;
            float f13 = this.b;
            float z12 = f12 - f13 != 0.0f ? com.google.android.recaptcha.internal.a.z(f12, f13, this.d, f13) : 0.0f;
            if (z10) {
                if ((z12 <= f13 && z11 > z12) || (z12 >= f12 && z11 < z12)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(z11 * 5.0f) != Math.floor(5.0f * z12)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(z12);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(z12));
            }
        }
        this.H = x8;
        return true;
    }

    public final void e(float f10) {
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.i6 i6Var = this.x;
        if (!TextUtils.equals(i6Var.g, str)) {
            i6Var.b();
            i6Var.k(0.3f, this.e ? 320L : 40L, er.h);
            i6Var.q(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(r2.f(f10));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.J = AndroidUtilities.dp(12.0f);
        float dp = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(dp);
        this.x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.N;
        int i13 = this.a;
        if (i12 > 0) {
            this.K = i12;
            this.L = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.K = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.L = AndroidUtilities.dp(48.0f);
        } else {
            this.K = AndroidUtilities.dp(190.0f);
            this.L = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.K, this.L);
        if (i13 == 0) {
            float dp2 = AndroidUtilities.dp(25.0f);
            float f10 = this.L / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.B;
            path.rewind();
            path.moveTo(dp2 - AndroidUtilities.dpf2(8.66f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f10);
            path.lineTo(dp2 - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f10);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.C;
            path2.rewind();
            path2.moveTo(dp2 - AndroidUtilities.dpf2(7.5f), f10);
            path2.lineTo(dp2, f10 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp2, AndroidUtilities.dpf2(7.33f) + f10);
            path2.close();
            Path path3 = this.D;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f10 - AndroidUtilities.dp(4.33f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.E;
            path4.rewind();
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f10 - AndroidUtilities.dp(8.0f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f10 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.x || drawable == this.y || super.verifyDrawable(drawable);
    }
}
