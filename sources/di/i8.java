package di;

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
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public class i8 extends View {
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.e6 J;
    public final org.telegram.ui.Components.e6 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.e6 f;
    public Utilities.Callback h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final org.telegram.ui.Components.p6 x;
    public final org.telegram.ui.Components.p6 y;

    public i8(Context context, int i10) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        pr prVar = pr.h;
        this.f = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
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
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.x = p6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.K = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.Q = new TextPaint(1);
        this.a = i10;
        p6Var.u(AndroidUtilities.bold());
        p6Var.k(0.3f, 40L, prVar);
        p6Var.setCallback(this);
        p6Var.r(-1);
        p6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            p6Var.t(AndroidUtilities.dp(15.0f));
            this.y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            p6Var.t(AndroidUtilities.dp(14.0f));
            p6Var.b = 5;
            org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, true, false);
            this.y = p6Var2;
            p6Var2.G = AndroidUtilities.displaySize.x;
            p6Var2.t(AndroidUtilities.dp(14.0f));
            p6Var2.u(AndroidUtilities.bold());
            p6Var2.k(0.3f, 40L, prVar);
            p6Var2.setCallback(this);
            p6Var2.r(-1);
            if (i10 == 1) {
                p6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                p6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                p6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        p6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f7) {
        this.e = true;
        float f10 = this.b;
        this.d = (f7 - f10) / (this.c - f10);
        e(f7);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(org.telegram.ui.t3 t3Var) {
        this.h = t3Var;
    }

    public final void d(float f7) {
        float f10 = this.b;
        float f11 = (f7 - f10) / (this.c - f10);
        this.d = f11;
        this.f.d(f11, true);
        e(f7);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f7 = this.N;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        float d = this.e ? this.f.d(this.d, false) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, 255, 31);
        int i10 = this.a;
        org.telegram.ui.Components.p6 p6Var = this.x;
        if (i10 == 0) {
            p6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.O, this.P - AndroidUtilities.dp(1.0f));
            p6Var.draw(canvas);
        } else {
            int dp = AndroidUtilities.dp(12.33f);
            int i11 = -AndroidUtilities.dp(1.0f);
            int d10 = (this.O - ((int) p6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp2 = this.P - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.p6 p6Var2 = this.y;
            p6Var2.setBounds(dp, i11, d10, dp2);
            p6Var2.draw(canvas);
            p6Var.setBounds(this.O - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.O - AndroidUtilities.dp(11.0f), this.P - AndroidUtilities.dp(1.0f));
            p6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.F, this.r);
            canvas.drawPath(this.G, this.s);
            float f10 = this.c;
            float f11 = this.b;
            float f12 = f10 - f11;
            double d11 = f12 != 0.0f ? (f12 * this.d) + f11 : 0.0f;
            float e7 = this.J.e(d11 > 0.25d);
            canvas.save();
            canvas.translate((1.0f - e7) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e7 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            float e10 = this.K.e(d11 > 0.5d);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.w;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * d, this.P, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f7 = this.c;
            float f10 = this.b;
            float z11 = f7 - f10 != 0.0f ? com.google.android.gms.internal.vision.e2.z(f7, f10, this.d, f10) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.M >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.clamp(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.e = false;
                z10 = true;
            } else {
                this.f.d(this.d, true);
                this.d = x10 / this.O;
                this.e = true;
            }
            float f11 = this.c;
            float f12 = this.b;
            float z12 = f11 - f12 != 0.0f ? com.google.android.gms.internal.vision.e2.z(f11, f12, this.d, f12) : 0.0f;
            if (z10) {
                if ((z12 <= f12 && z11 > z12) || (z12 >= f11 && z11 < z12)) {
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
        this.L = x10;
        return true;
    }

    public final void e(float f7) {
        String str = Math.round(100.0f * f7) + "%";
        org.telegram.ui.Components.p6 p6Var = this.x;
        if (!TextUtils.equals(p6Var.g, str)) {
            p6Var.b();
            p6Var.k(0.3f, this.e ? 320L : 40L, pr.h);
            p6Var.q(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(y2.f(f7));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.N = AndroidUtilities.dp(12.0f);
        float dp = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(dp);
        this.x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.R;
        int i13 = this.a;
        if (i12 > 0) {
            this.O = i12;
            this.P = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.O = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.P = AndroidUtilities.dp(48.0f);
        } else {
            this.O = AndroidUtilities.dp(190.0f);
            this.P = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i13 == 0) {
            float dp2 = AndroidUtilities.dp(25.0f);
            float f7 = this.P / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(dp2 - AndroidUtilities.dpf2(8.66f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f7);
            path.lineTo(dp2 - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f7);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(dp2 - AndroidUtilities.dpf2(7.5f), f7);
            path2.lineTo(dp2, f7 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp2, AndroidUtilities.dpf2(7.33f) + f7);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f7 - AndroidUtilities.dp(4.33f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f7);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f7 - AndroidUtilities.dp(8.0f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f7 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.x || drawable == this.y || super.verifyDrawable(drawable);
    }
}
