package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m1 extends us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ o1 N;

    public m1(o1 o1Var) {
        this.N = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.k5 k5Var, n1 n1Var, float f10) {
        if (k5Var != null) {
            k5Var.setAlpha((int) (f10 * 255.0f));
            k5Var.draw(canvas);
        } else if (n1Var.e != null) {
            canvas.save();
            canvas.clipRect(n1Var.e.getImageX(), n1Var.e.getImageY(), n1Var.e.getImageX2(), n1Var.e.getImageY2());
            n1Var.e.setAlpha(f10);
            n1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.K == null) {
            return;
        }
        f2.v0 v0Var = this.N.V;
        boolean z10 = true;
        boolean z11 = (v0Var != null && v0Var.k()) || this.K.size() <= 4 || !this.M;
        if (!z11) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                if (((n1) this.K.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            n1 n1Var = (n1) arrayList.get(i10);
            n1Var.getClass();
            org.telegram.ui.Components.k5 k5Var = n1Var.c;
            if (k5Var != null) {
                k5Var.setColorFilter(this.N.d3);
            }
            n1Var.n.draw(canvas, n1Var.h[this.G]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.k5 k5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                n1 n1Var = (n1) this.K.get(i10);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.k5 k5Var2 = n1Var.c;
                if (k5Var2 != null) {
                    k5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.d3;
                if (porterDuffColorFilter != null && (k5Var = n1Var.c) != null) {
                    k5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, k5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, k5Var2, n1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((n1) arrayList.get(i10)).h[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i10;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            n1 n1Var = (n1) this.K.get(i11);
            n1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = n1Var.h;
            org.telegram.ui.Components.k5 k5Var = n1Var.c;
            ImageReceiver imageReceiver = k5Var != null ? k5Var.k : n1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(n1Var.getAlpha());
                org.telegram.ui.Components.k5 k5Var2 = n1Var.c;
                if (k5Var2 != null) {
                    k5Var2.setColorFilter(this.N.d3);
                }
                int i12 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                n1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    n1Var.n.getLottieAnimation().S(j10);
                }
                if (n1Var.n.getAnimation() != null) {
                    n1Var.n.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft(), n1Var.getPaddingTop(), n1Var.getWidth() - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                oi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
                    if (animation == null || animation.getIntrinsicHeight() == 0) {
                        Bitmap bitmap = imageReceiver.getBitmap();
                        if (bitmap != null) {
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                        } else {
                            Drawable staticThumb = imageReceiver.getStaticThumb();
                            intrinsicWidth = (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) ? 1.0f : staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                            if (intrinsicWidth >= 1.0f) {
                                float height2 = (rect.height() * intrinsicWidth) / 2.0f;
                                rect.left = (int) (rect.centerX() - height2);
                                rect.right = (int) (rect.centerX() + height2);
                            } else if (intrinsicWidth > 1.0f) {
                                float width2 = (rect.width() / intrinsicWidth) / 2.0f;
                                rect.top = (int) (rect.centerY() - width2);
                                rect.bottom = (int) (rect.centerY() + width2);
                            }
                            rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(n1Var);
                        }
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = lottieAnimation.b;
                    f10 = i10;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.J, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(n1Var);
            }
        }
    }
}
