package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import bi.s0;
import c3.i0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.se;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String a(float f7) {
        Math.abs(f7 - 0.25f);
        float round = Math.round(f7 * 10.0f) / 10.0f;
        long j10 = (long) round;
        if (round == j10) {
            return a1.g.l(j10, "");
        }
        return "" + round;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int B = (int) i0.B(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - gr.k.getInterpolation(imageReceiver.h1)) * org.telegram.messenger.i0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.h1 * 5.0f) * 255.0f));
                drawable.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                break;
            case 1:
                Bitmap bitmap = (Bitmap) this.b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.c, (Paint) null);
                    break;
                }
                break;
            case 2:
                jc jcVar = (jc) this.c;
                if (jcVar.c <= 1) {
                    jcVar.c(canvas, (Paint) this.b);
                    break;
                } else {
                    jcVar.c(canvas, jcVar.o);
                    break;
                }
            case 3:
                Paint paint = (Paint) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (chatActivityEnterView.U0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.C3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y3 = (chatActivityEnterView.U0.getY() - chatActivityEnterView.getHeight()) + t6.i3.getIntrinsicHeight();
                    se seVar = chatActivityEnterView.E0;
                    canvas.drawRect(0.0f, 0.0f, width, y3 + (seVar == null ? 0.0f : seVar.getOffsetY()), paint);
                    break;
                }
                break;
            case 4:
                Paint paint2 = (Paint) this.c;
                canvas.drawRect(getBounds(), (Paint) this.b);
                int L = org.telegram.messenger.i0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < width2) {
                    i13++;
                    float f7 = (L * i13) + i10;
                    canvas.drawLine(f7, i11, f7, getBounds().height() + i11, paint2);
                }
                while (i12 < height) {
                    i12++;
                    float f10 = (L * i12) + i11;
                    canvas.drawLine(i10, f10, getBounds().width() + i10, f10, paint2);
                }
                break;
            case 5:
                e6 e6Var = (e6) this.b;
                Paint paint3 = (Paint) this.c;
                if (paint3 != null) {
                    paint3.setStrokeWidth(org.telegram.messenger.i0.N(1.6f));
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(((org.telegram.messenger.i0.L(24.0f) - e6Var.c()) / 2.0f) - org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(0.2f) + ((org.telegram.messenger.i0.L(24.0f) - e6Var.e) / 2.0f), org.telegram.messenger.i0.N(3.0f) + ((e6Var.c() + org.telegram.messenger.i0.L(24.0f)) / 2.0f), (org.telegram.messenger.i0.L(24.0f) + e6Var.e) / 2.0f);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(3.0f), paint3);
                }
                e6Var.a.setStrokeWidth(org.telegram.messenger.i0.N(0.3f));
                e6Var.setBounds(0, (int) ((org.telegram.messenger.i0.L(24.0f) - e6Var.e) / 2.0f), org.telegram.messenger.i0.L(24.0f), (int) ((org.telegram.messenger.i0.L(24.0f) + e6Var.e) / 2.0f));
                e6Var.draw(canvas);
                break;
            default:
                ((qz0) this.b).c(getBounds().centerX() - (((qz0) this.b).c / 2.0f), getBounds().centerY(), 1.0f, t6.w0(t6.G6, (p6) this.c), canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 0:
                return (int) (((ImageReceiver) this.b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 4:
                return 0;
            case 5:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 4:
                return 0;
            case 5:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    public void n(boolean z10, float f7) {
        e6 e6Var = (e6) this.b;
        String str = a(f7) + "X";
        if (z10 && TextUtils.equals(e6Var.i, str)) {
            return;
        }
        e6Var.a();
        e6Var.t(str, z10, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                ((ImageReceiver) this.b).y0(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top, z20.w(2.0f, rect.left, rect.right - org.telegram.messenger.i0.L(2.0f)), z20.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.i0.L(2.0f)));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                ((ImageReceiver) this.b).setAlpha(i10 / 255.0f);
                break;
            case 5:
                ((e6) this.b).B = i10;
                Paint paint = (Paint) this.c;
                if (paint != null) {
                    paint.setAlpha(i10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i14 = i12 - i10;
                    int i15 = i13 - i11;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i14 / width, i15 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i16 = i10 + ((i14 - round) / 2);
                    int i17 = i11 + ((i15 - round2) / 2);
                    ((Rect) this.c).set(i16, i17, round + i16, round2 + i17);
                    break;
                }
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    public g(boolean z10) {
        this.a = 4;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
        } else {
            paint.setColor(-2172970);
            paint2.setColor(-3752002);
        }
    }

    public g() {
        this.a = 5;
        s0 s0Var = new s0(this, 4);
        e6 e6Var = new e6(false, true, true);
        this.b = e6Var;
        e6Var.setCallback(s0Var);
        e6Var.n(0.3f, 165L, gr.h);
        e6Var.b = 1;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = e6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.i0.N(0.6f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public g(jc jcVar, Paint paint) {
        this.a = 2;
        this.c = jcVar;
        this.b = paint;
    }

    public g(Bitmap bitmap) {
        this.a = 1;
        this.c = new Rect();
        this.b = bitmap;
    }

    public g(ChatActivityEnterView chatActivityEnterView) {
        this.a = 3;
        this.c = chatActivityEnterView;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(0);
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    private final void j(ColorFilter colorFilter) {
    }

    private final void k(ColorFilter colorFilter) {
    }

    private final void l(ColorFilter colorFilter) {
    }

    private final void m(ColorFilter colorFilter) {
    }
}
