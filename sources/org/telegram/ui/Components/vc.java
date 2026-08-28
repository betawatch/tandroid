package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vc extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public vc(boolean z10) {
        this.a = 2;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
        } else {
            paint.setColor(-2172970);
            paint2.setColor(-3752002);
        }
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float round = Math.round(f10 * 10.0f) / 10.0f;
        long j10 = (long) round;
        if (round == j10) {
            return aa.d.m(j10, "");
        }
        return "" + round;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                wc wcVar = (wc) this.c;
                if (wcVar.c <= 1) {
                    wcVar.c(canvas, (Paint) this.b);
                    break;
                } else {
                    wcVar.c(canvas, wcVar.o);
                    break;
                }
            case 1:
                Paint paint = (Paint) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (chatActivityEnterView.Q0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.x3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.Q0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.f6.i3.getIntrinsicHeight();
                    ff ffVar = chatActivityEnterView.A0;
                    canvas.drawRect(0.0f, 0.0f, width, y10 + (ffVar == null ? 0.0f : ffVar.getOffsetY()), paint);
                    break;
                }
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                canvas.drawRect(getBounds(), (Paint) this.b);
                int dp = AndroidUtilities.dp(9.0f);
                int width2 = getBounds().width() / dp;
                int height = getBounds().height() / dp;
                int i9 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    int i13 = i12 + 1;
                    float f10 = (dp * i13) + i9;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                    i12 = i13;
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (dp * i11) + i10;
                    canvas.drawLine(i9, f11, getBounds().width() + i9, f11, paint2);
                }
                break;
            case 3:
                i6 i6Var = (i6) this.c;
                Paint paint3 = (Paint) this.b;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - i6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - i6Var.e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((i6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + i6Var.e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                i6Var.a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                i6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - i6Var.e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + i6Var.e) / 2.0f));
                i6Var.draw(canvas);
                break;
            case 4:
                Bitmap bitmap = (Bitmap) this.b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.c, (Paint) null);
                    break;
                }
                break;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - gr.k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 5:
                return (int) (((ImageReceiver) this.b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return 0;
            case 3:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return 0;
            case 3:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            case 4:
                return -3;
            default:
                return 0;
        }
    }

    public void l(float f10, boolean z10) {
        i6 i6Var = (i6) this.c;
        String str = a(f10) + "X";
        if (z10 && TextUtils.equals(i6Var.g, str)) {
            return;
        }
        i6Var.b();
        i6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 5:
                ((ImageReceiver) this.b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.messenger.ll.w(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.messenger.ll.w(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                ((i6) this.c).w = i9;
                Paint paint = (Paint) this.b;
                if (paint != null) {
                    paint.setAlpha(i9);
                    break;
                }
                break;
            case 4:
                break;
            default:
                ((ImageReceiver) this.b).setAlpha(i9 / 255.0f);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.setBounds(i9, i10, i11, i12);
                Bitmap bitmap = (Bitmap) this.b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i13 = i11 - i9;
                    int i14 = i12 - i10;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i13 / width, i14 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i15 = i9 + ((i13 - round) / 2);
                    int i16 = i10 + ((i14 - round2) / 2);
                    ((Rect) this.c).set(i15, i16, round + i15, round2 + i16);
                    break;
                }
                break;
            default:
                super.setBounds(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.a;
    }

    public vc() {
        this.a = 3;
        eg.a aVar = new eg.a(this, 8);
        i6 i6Var = new i6(false, true, true, false);
        this.c = i6Var;
        i6Var.setCallback(aVar);
        i6Var.k(0.3f, 165L, gr.h);
        i6Var.b = 1;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public vc(wc wcVar, Paint paint) {
        this.a = 0;
        this.c = wcVar;
        this.b = paint;
    }

    public vc(Bitmap bitmap) {
        this.a = 4;
        this.c = new Rect();
        this.b = bitmap;
    }

    private final void b(int i9) {
    }

    private final void c(int i9) {
    }

    private final void d(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(ColorFilter colorFilter) {
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

    public vc(ImageReceiver imageReceiver, Drawable drawable) {
        this.a = 5;
        this.b = imageReceiver;
        this.c = drawable;
    }

    public vc(ChatActivityEnterView chatActivityEnterView) {
        this.a = 1;
        this.c = chatActivityEnterView;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(0);
    }
}
