package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o1 extends vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ q1 N;

    public o1(q1 q1Var) {
        this.N = q1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.k5 k5Var, p1 p1Var, float f10) {
        if (k5Var != null) {
            k5Var.setAlpha((int) (f10 * 255.0f));
            k5Var.draw(canvas);
        } else if (p1Var.e != null) {
            canvas.save();
            canvas.clipRect(p1Var.e.getImageX(), p1Var.e.getImageY(), p1Var.e.getImageX2(), p1Var.e.getImageY2());
            p1Var.e.setAlpha(f10);
            p1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        if (this.K == null) {
            return;
        }
        f2.w0 w0Var = this.N.V;
        boolean z10 = true;
        boolean z11 = (w0Var != null && w0Var.k()) || this.K.size() <= 4 || !this.M;
        if (!z11) {
            for (int i11 = 0; i11 < this.K.size(); i11++) {
                if (((p1) this.K.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i9, i10, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                return;
            }
            p1 p1Var = (p1) arrayList.get(i9);
            p1Var.getClass();
            org.telegram.ui.Components.k5 k5Var = p1Var.c;
            if (k5Var != null) {
                k5Var.setColorFilter(this.N.d3);
            }
            p1Var.n.draw(canvas, p1Var.h[this.G]);
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.k5 k5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i9 = 0; i9 < this.K.size(); i9++) {
                p1 p1Var = (p1) this.K.get(i9);
                p1Var.getClass();
                float scale = p1Var.getScale();
                float alpha = p1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(p1Var.getPaddingLeft() + ((int) p1Var.getX()), p1Var.getPaddingTop(), (p1Var.getWidth() + ((int) p1Var.getX())) - p1Var.getPaddingRight(), p1Var.getHeight() - p1Var.getPaddingBottom());
                org.telegram.ui.Components.k5 k5Var2 = p1Var.c;
                if (k5Var2 != null) {
                    k5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = p1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.d3;
                if (porterDuffColorFilter != null && (k5Var = p1Var.c) != null) {
                    k5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, k5Var2, p1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, k5Var2, p1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                this.N.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((p1) arrayList.get(i9)).h[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i9;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            p1 p1Var = (p1) this.K.get(i10);
            p1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = p1Var.h;
            org.telegram.ui.Components.k5 k5Var = p1Var.c;
            ImageReceiver imageReceiver = k5Var != null ? k5Var.k : p1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(p1Var.getAlpha());
                org.telegram.ui.Components.k5 k5Var2 = p1Var.c;
                if (k5Var2 != null) {
                    k5Var2.setColorFilter(this.N.d3);
                }
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                p1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    p1Var.n.getLottieAnimation().S(j10);
                }
                if (p1Var.n.getAnimation() != null) {
                    p1Var.n.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(p1Var.getPaddingLeft(), p1Var.getPaddingTop(), p1Var.getWidth() - p1Var.getPaddingRight(), p1Var.getHeight() - p1Var.getPaddingBottom());
                mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i9 = lottieAnimation.c) == 0) {
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
                            rect.offset((p1Var.getLeft() + ((int) p1Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i11].setBounds(rect);
                            arrayList.add(p1Var);
                        }
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = lottieAnimation.b;
                    f10 = i9;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((p1Var.getLeft() + ((int) p1Var.getTranslationX())) - this.J, 0);
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                arrayList.add(p1Var);
            }
        }
    }
}
