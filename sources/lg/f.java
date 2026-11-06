package lg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.i7;
import org.telegram.messenger.p5;
import org.telegram.messenger.x7;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.l0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f {
    public int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public f(int i7, int i10, p5 p5Var) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = false;
        this.g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.b = i7;
        this.a = i10;
        this.f = p5Var;
    }

    public void a(i7 i7Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i7 = 0;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == i7Var) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (i7Var.W0 > ((i7) arrayList.get(i7)).W0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            arrayList.add(i7, i7Var);
        } else {
            arrayList.add(i7Var);
        }
    }

    public void b(boolean z9) {
        p5 p5Var = (p5) this.f;
        x7 x7Var = (x7) this.h;
        if (z9) {
            p5Var.a(x7Var);
            x7Var.run();
        } else {
            if (this.c) {
                return;
            }
            this.c = true;
            p5Var.a(x7Var);
            p5Var.d(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.g;
        l0 l0Var = (l0) this.h;
        RectF rectF = l0Var.a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        i6 i6Var = (i6) this.d;
        float i7 = i6Var.i();
        i6 i6Var2 = (i6) this.e;
        float i10 = i6Var2.i();
        TextPaint textPaint = i6Var2.a;
        float f13 = i10 * i7;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, l0Var.G, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * l0Var.G;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        i6Var.o(0.0f, 0.0f, f10, f11);
        i6Var.draw(canvas);
        canvas.restore();
        float d = ((w5) this.f).d(this.c);
        canvas.save();
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.v(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - l0Var.G) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * l0Var.G;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        i6Var2.u(i0.a.f(d, this.a, k6.x0(null, k6.q7, false)));
        if (d > 0.0f) {
            if (this.b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f11 - g0.L(16.0f))) / 2, g0.L(16.0f), ((int) (g0.L(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        i6Var2.o(g0.L(20.0f) * d, 0.0f, f10, f11);
        i6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - g0.L(12.0f), 0.0f, f10, f11);
        l0Var.r0.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i7, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.g;
        RectF rectF = (RectF) this.f;
        int w02 = k6.w0(k6.d6, (f6) this.h);
        int i11 = (i7 + i10) << 10;
        if (i11 != this.a || this.c) {
            this.c = false;
            this.a = i11;
            this.d = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            this.e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i7);
            Canvas canvas2 = (Canvas) this.e;
            this.b = w02;
            canvas2.drawColor(w02);
            ((Canvas) this.e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        } else if (w02 != this.b && (canvas = (Canvas) this.e) != null && ((Bitmap) this.d) != null) {
            this.b = w02;
            canvas.drawColor(w02, PorterDuff.Mode.SRC);
            ((Canvas) this.e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(l0 l0Var) {
        this.h = l0Var;
        i6 i6Var = new i6(true, true, true);
        this.d = i6Var;
        i6 i6Var2 = new i6(true, true, true);
        this.e = i6Var2;
        this.f = new w5(l0Var, 0L, 300L, xq.h);
        this.c = false;
        i6Var.K = true;
        i6Var.w(g0.L(18.33f));
        i6Var.A = 0.6f;
        i6Var.x(g0.o());
        i6Var.q(false);
        i6Var.setCallback(l0Var);
        i6Var.M = 9999999;
        i6Var2.K = true;
        i6Var2.w(g0.L(14.0f));
        i6Var2.q(false);
        i6Var2.setCallback(l0Var);
        i6Var2.M = 9999999;
        this.g = l0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public f(f6 f6Var) {
        this.f = new RectF();
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = 0;
        this.c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = f6Var;
    }
}
