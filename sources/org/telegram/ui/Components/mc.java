package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mc extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ mc(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                nc ncVar = (nc) this.c;
                if (ncVar.c <= 1) {
                    ncVar.c(canvas, (Paint) this.b);
                    break;
                } else {
                    ncVar.c(canvas, ncVar.o);
                    break;
                }
            case 1:
                Paint paint = (Paint) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (chatActivityEnterView.V0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.D3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y9 = (chatActivityEnterView.V0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                    ve veVar = chatActivityEnterView.F0;
                    canvas.drawRect(0.0f, 0.0f, width, y9 + (veVar == null ? 0.0f : veVar.getOffsetY()), paint);
                    break;
                }
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                canvas.drawRect(getBounds(), (Paint) this.b);
                int L = org.telegram.messenger.g0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i3 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    i12++;
                    float f10 = (L * i12) + i3;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (L * i11) + i10;
                    canvas.drawLine(i3, f11, getBounds().width() + i3, f11, paint2);
                }
                break;
            case 3:
                ((ly0) this.b).c(getBounds().centerX() - (((ly0) this.b).c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, (org.telegram.ui.ActionBar.e6) this.c), canvas);
                break;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int z10 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - xq.k.getInterpolation(imageReceiver.i1)) * org.telegram.messenger.g0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                drawable.setBounds(z10, interpolation, intrinsicWidth + z10, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                break;
            default:
                Bitmap bitmap = (Bitmap) this.b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.c, (Paint) null);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 4:
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
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return 0;
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
                return 0;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 4:
                ((ImageReceiver) this.b).y0(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, org.telegram.messenger.camera.q.w(2.0f, rect.left, rect.right - org.telegram.messenger.g0.L(2.0f)), org.telegram.messenger.camera.q.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.g0.L(2.0f)));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        switch (this.a) {
            case 4:
                ((ImageReceiver) this.b).setAlpha(i3 / 255.0f);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.setBounds(i3, i10, i11, i12);
                Bitmap bitmap = (Bitmap) this.b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i13 = i11 - i3;
                    int i14 = i12 - i10;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i13 / width, i14 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i15 = i3 + ((i13 - round) / 2);
                    int i16 = i10 + ((i14 - round2) / 2);
                    ((Rect) this.c).set(i15, i16, round + i15, round2 + i16);
                    break;
                }
                break;
            default:
                super.setBounds(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.a;
    }

    public mc(boolean z10) {
        this.a = 2;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
        } else {
            paint.setColor(-2172970);
            paint2.setColor(-3752002);
        }
    }

    public mc(nc ncVar, Paint paint) {
        this.a = 0;
        this.c = ncVar;
        this.b = paint;
    }

    public mc(Bitmap bitmap) {
        this.a = 5;
        this.c = new Rect();
        this.b = bitmap;
    }

    public mc(ChatActivityEnterView chatActivityEnterView) {
        this.a = 1;
        this.c = chatActivityEnterView;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(0);
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
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
}
