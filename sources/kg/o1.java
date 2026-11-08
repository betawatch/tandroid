package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o1 extends ReplacementSpan {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public o1(View[] viewArr) {
        this.a = 2;
        this.b = new xq(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                float N = org.telegram.messenger.g0.N(14.66f);
                float f11 = (i11 + i13) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f12 = N / 2.0f;
                rectF.set(f10, f11 - f12, ((int) (((my0) this.c).c + org.telegram.messenger.g0.L(10.0f))) + f10, f12 + f11);
                Paint paint2 = (Paint) this.b;
                int i14 = k6.z6;
                paint2.setColor(k6.r1(0.15f, k6.x0(null, i14, false)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
                ((my0) this.c).c(f10 + org.telegram.messenger.g0.L(5.0f), f11, Utilities.i((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), k6.x0(null, i14, false), canvas);
                break;
            case 1:
                float f13 = (i11 + i13) / 2.0f;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f13 - org.telegram.messenger.g0.L(7.66f), ((my0) this.c).c + f10 + org.telegram.messenger.g0.L(6.66f), org.telegram.messenger.g0.L(7.66f) + f13);
                canvas.saveLayerAlpha(rectF2, qs.e4, 31);
                Paint paint3 = (Paint) this.b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint3);
                ((my0) this.c).c(f10 + org.telegram.messenger.g0.L(3.33f), f13, 1.0f, -1, canvas);
                canvas.restore();
                break;
            default:
                xq xqVar = (xq) this.b;
                canvas.save();
                canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), i12 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i15 = 0; i15 < 3; i15++) {
                    float min = Math.min(1.0f, (((i15 * 250) + uptimeMillis) % 750) / 667.0f);
                    canvas.drawCircle(org.telegram.messenger.g0.N((xqVar.getInterpolation(min) * 16.0f) + 1.667f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.N((min <= 0.425f ? xqVar.getInterpolation(min / 0.425f) : 1.0f - xqVar.getInterpolation((min - 0.425f) / 0.575f)) * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.c) {
                    view.invalidate();
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (((my0) this.c).c + org.telegram.messenger.g0.L(10.0f));
            case 1:
                return (int) (((my0) this.c).c + org.telegram.messenger.g0.L(6.66f));
            default:
                return org.telegram.messenger.g0.L(20.0f);
        }
    }

    public o1(int i7) {
        this.a = 0;
        this.b = new Paint(1);
        this.c = new my0(id.G(i7, "BusinessRepliesMore", new Object[0]), 9.33f, org.telegram.messenger.g0.o());
    }

    public o1() {
        this.a = 1;
        this.b = new Paint(1);
        my0 my0Var = new my0("x50", 13.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.c = my0Var;
        my0Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
