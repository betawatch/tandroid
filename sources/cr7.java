// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cr7 extends n29 implements sp3 {
    public static final Paint I;
    public static final Paint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final TextPaint P;
    public static final DecelerateInterpolator Q;
    public String E;
    public String F;
    public String G;
    public String H;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public boolean h;
    public View n;
    public k27 r;
    public int s;
    public boolean w;
    public boolean x;
    public Drawable y;

    static {
        Paint paint = new Paint();
        I = paint;
        Paint paint2 = new Paint(1);
        J = paint2;
        TextPaint textPaint = new TextPaint(1);
        K = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        L = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        M = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        N = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        O = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        P = textPaint6;
        Q = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(gl.o());
        textPaint2.setTypeface(gl.o());
        textPaint4.setTypeface(gl.o());
        textPaint5.setTypeface(gl.o());
        textPaint6.setTypeface(gl.o());
    }

    @Override // sp3
    public final void B(boolean z) {
        a();
    }

    @Override // sp3
    public final void N(String str) {
        b(true, 1.0f);
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        String r;
        k27 k27Var = this.r;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message.media != null) {
                if (TextUtils.isEmpty(message.attachPath) || !new File(this.r.k.attachPath).exists()) {
                    ba4.G(y6c.t0);
                    if (!ba4.M(this.r.k, false, true).exists()) {
                        r = ba4.r(null, this.r.F0());
                        this.x = false;
                        if (r != null) {
                            this.h = false;
                            this.w = false;
                            this.x = true;
                            up3.q(this.r.K1).v(this);
                        } else {
                            up3.q(this.r.K1).a(r, null, this);
                            boolean S = ba4.G(this.r.K1).S(r);
                            this.w = S;
                            if (S) {
                                this.h = true;
                                Float s = fl5.z().s(r);
                                if (s == null) {
                                    s = Float.valueOf(0.0f);
                                }
                                b(false, s.floatValue());
                            } else {
                                this.h = false;
                            }
                        }
                        this.n.invalidate();
                    }
                }
                r = null;
                this.x = false;
                if (r != null) {
                }
                this.n.invalidate();
            }
        }
        this.w = false;
        this.x = true;
        this.h = false;
        b(false, 0.0f);
        up3.q(this.r.K1).v(this);
        this.n.invalidate();
    }

    public final void b(boolean z, float f) {
        if (z) {
            this.c = this.e;
        } else {
            this.e = f;
            this.c = f;
        }
        this.H = String.format("%d%%", Integer.valueOf((int) (100.0f * f)));
        if (f != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        this.n.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String upperCase;
        int L2;
        TextPaint textPaint;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, I);
        int D = ug8.D(240.0f, height, 2);
        int D2 = ug8.D(48.0f, width, 2);
        Drawable drawable = this.y;
        drawable.setBounds(D2, D, gl.L(48.0f) + D2, gl.L(48.0f) + D);
        drawable.draw(canvas);
        canvas.drawText(this.E, (width - ((int) Math.ceil(r5.measureText(r4)))) / 2, gl.L(31.0f) + D, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(r5.measureText(r4)))) / 2, gl.L(96.0f) + D, L);
        canvas.drawText(this.G, (width - ((int) Math.ceil(r5.measureText(r4)))) / 2, gl.L(125.0f) + D, M);
        if (this.x) {
            upperCase = k96.M0(2131747613, null);
            textPaint = P;
            L2 = 0;
        } else {
            upperCase = this.w ? k96.M0(2131752577, null).toUpperCase() : k96.M0(2131744017, null);
            L2 = gl.L(28.0f);
            textPaint = N;
        }
        canvas.drawText(upperCase, (width - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, de9.w(235.0f, D, L2), textPaint);
        if (this.h) {
            if (this.H != null) {
                canvas.drawText(this.H, (width - ((int) Math.ceil(r5.measureText(r4)))) / 2, gl.L(210.0f) + D, O);
            }
            int D3 = ug8.D(240.0f, width, 2);
            int L3 = gl.L(232.0f) + D;
            Paint paint = J;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f * 255.0f));
            float f = L3;
            canvas.drawRect(((int) (gl.L(240.0f) * this.e)) + D3, f, gl.L(240.0f) + D3, gl.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f * 255.0f));
            float f2 = D3;
            canvas.drawRect(f2, f, (gl.L(240.0f) * this.e) + f2, gl.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            float f3 = this.e;
            if (f3 != 1.0f) {
                float f4 = this.b;
                if (f3 != f4) {
                    float f5 = this.c;
                    float f6 = f4 - f5;
                    if (f6 > 0.0f) {
                        long j2 = this.d + j;
                        this.d = j2;
                        if (j2 >= 300) {
                            this.e = f4;
                            this.c = f4;
                            this.d = 0L;
                        } else {
                            this.e = (Q.getInterpolation(j2 / 300.0f) * f6) + f5;
                        }
                    }
                    this.n.invalidate();
                }
            }
            float f7 = this.e;
            if (f7 >= 1.0f && f7 == 1.0f) {
                float f8 = this.f;
                if (f8 != 0.0f) {
                    float f9 = f8 - (j / 200.0f);
                    this.f = f9;
                    if (f9 <= 0.0f) {
                        this.f = 0.0f;
                    }
                    this.n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // sp3
    public final int getObserverTag() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, j / j2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        I.setAlpha(i);
        K.setAlpha(i);
        L.setAlpha(i);
        M.setAlpha(i);
        N.setAlpha(i);
        O.setAlpha(i);
        P.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
