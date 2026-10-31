package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import c3.i0;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c8;
import org.telegram.messenger.m7;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.m0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h {
    public int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public h(int i10, int i11, r5 r5Var) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = false;
        this.g = new c8(this, 0);
        this.h = new c8(this, 1);
        this.b = i10;
        this.a = i11;
        this.f = r5Var;
    }

    public void a(m7 m7Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i10 = 0;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == m7Var) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (m7Var.W0 > ((m7) arrayList.get(i10)).W0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.add(i10, m7Var);
        } else {
            arrayList.add(m7Var);
        }
    }

    public void b(boolean z10) {
        r5 r5Var = (r5) this.f;
        c8 c8Var = (c8) this.h;
        if (z10) {
            r5Var.a(c8Var);
            c8Var.run();
        } else {
            if (this.c) {
                return;
            }
            this.c = true;
            r5Var.a(c8Var);
            r5Var.d(c8Var, 20L);
        }
    }

    public void c(Canvas canvas, float f7, float f10, float f11) {
        Drawable drawable = (Drawable) this.g;
        m0 m0Var = (m0) this.h;
        RectF rectF = m0Var.a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        e6 e6Var = (e6) this.d;
        float i10 = e6Var.i();
        e6 e6Var2 = (e6) this.e;
        float i11 = e6Var2.i();
        TextPaint textPaint = e6Var2.a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, i0.z(1.0f, m0Var.G, f13, -org.telegram.messenger.i0.L(1.0f)));
        canvas.translate(0.0f, (-org.telegram.messenger.i0.L(4.0f)) * f12);
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.86f, f12) * m0Var.G;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        e6Var.o(0.0f, 0.0f, f7, f10);
        e6Var.draw(canvas);
        canvas.restore();
        float d = ((t5) this.f).d(this.c);
        canvas.save();
        canvas.translate(0.0f, sc.e.z(1.0f, f12, org.telegram.messenger.i0.L(4.0f), (org.telegram.messenger.i0.L(14.0f) * f12) + ((1.0f - m0Var.G) * f13 * f12) + (-org.telegram.messenger.i0.L(1.0f))));
        float T12 = org.telegram.messenger.i0.T1(1.15f, 0.9f, f12) * m0Var.G;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        e6Var2.u(i0.b.f(d, this.a, t6.x0(null, t6.q7, false)));
        if (d > 0.0f) {
            if (this.b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f10 - org.telegram.messenger.i0.L(16.0f))) / 2, org.telegram.messenger.i0.L(16.0f), ((int) (org.telegram.messenger.i0.L(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        e6Var2.o(org.telegram.messenger.i0.L(20.0f) * d, 0.0f, f7, f10);
        e6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - org.telegram.messenger.i0.L(12.0f), 0.0f, f7, f10);
        m0Var.r0.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i10, int i11) {
        Canvas canvas;
        Paint paint = (Paint) this.g;
        RectF rectF = (RectF) this.f;
        int w02 = t6.w0(t6.d6, (p6) this.h);
        int i12 = (i10 + i11) << 10;
        if (i12 != this.a || this.c) {
            this.c = false;
            this.a = i12;
            this.d = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i11, i10);
            Canvas canvas2 = (Canvas) this.e;
            this.b = w02;
            canvas2.drawColor(w02);
            ((Canvas) this.e).drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        } else if (w02 != this.b && (canvas = (Canvas) this.e) != null && ((Bitmap) this.d) != null) {
            this.b = w02;
            canvas.drawColor(w02, PorterDuff.Mode.SRC);
            ((Canvas) this.e).drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public h(m0 m0Var) {
        this.h = m0Var;
        e6 e6Var = new e6(true, true, true);
        this.d = e6Var;
        e6 e6Var2 = new e6(true, true, true);
        this.e = e6Var2;
        this.f = new t5(m0Var, 0L, 300L, gr.h);
        this.c = false;
        e6Var.K = true;
        e6Var.w(org.telegram.messenger.i0.L(18.33f));
        e6Var.A = 0.6f;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.q(false);
        e6Var.setCallback(m0Var);
        e6Var.M = 9999999;
        e6Var2.K = true;
        e6Var2.w(org.telegram.messenger.i0.L(14.0f));
        e6Var2.q(false);
        e6Var2.setCallback(m0Var);
        e6Var2.M = 9999999;
        this.g = m0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public h(p6 p6Var) {
        this.f = new RectF();
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = 0;
        this.c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = p6Var;
    }
}
