package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l1 extends at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ n1 N;

    public l1(n1 n1Var) {
        this.N = n1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, m1 m1Var, float f9) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f9 * 255.0f));
            p5Var.draw(canvas);
        } else if (m1Var.e != null) {
            canvas.save();
            canvas.clipRect(m1Var.e.getImageX(), m1Var.e.getImageY(), m1Var.e.getImageX2(), m1Var.e.getImageY2());
            m1Var.e.setAlpha(f9);
            m1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        if (this.K == null) {
            return;
        }
        f2.u0 u0Var = this.N.V;
        boolean z10 = true;
        boolean z11 = (u0Var != null && u0Var.k()) || this.K.size() <= 4 || !this.M;
        if (!z11) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                if (((m1) this.K.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, f9);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f9);
        k();
    }

    @Override // org.telegram.ui.Components.at
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            m1 m1Var = (m1) arrayList.get(i10);
            m1Var.getClass();
            org.telegram.ui.Components.p5 p5Var = m1Var.c;
            if (p5Var != null) {
                p5Var.setColorFilter(this.N.d3);
            }
            m1Var.n.draw(canvas, m1Var.h[this.G]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void d(Canvas canvas, float f9) {
        org.telegram.ui.Components.p5 p5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                m1 m1Var = (m1) this.K.get(i10);
                m1Var.getClass();
                float scale = m1Var.getScale();
                float alpha = m1Var.getAlpha() * f9;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft() + ((int) m1Var.getX()), m1Var.getPaddingTop(), (m1Var.getWidth() + ((int) m1Var.getX())) - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = m1Var.c;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = m1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.d3;
                if (porterDuffColorFilter != null && (p5Var = m1Var.c) != null) {
                    p5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, p5Var2, m1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, p5Var2, m1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m1) arrayList.get(i10)).h[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f9;
        int i10;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            m1 m1Var = (m1) this.K.get(i11);
            m1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = m1Var.h;
            org.telegram.ui.Components.p5 p5Var = m1Var.c;
            ImageReceiver imageReceiver = p5Var != null ? p5Var.k : m1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(m1Var.getAlpha());
                org.telegram.ui.Components.p5 p5Var2 = m1Var.c;
                if (p5Var2 != null) {
                    p5Var2.setColorFilter(this.N.d3);
                }
                int i12 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                m1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    m1Var.n.getLottieAnimation().S(j10);
                }
                if (m1Var.n.getAnimation() != null) {
                    m1Var.n.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft(), m1Var.getPaddingTop(), m1Var.getWidth() - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
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
                            rect.offset((m1Var.getLeft() + ((int) m1Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(m1Var);
                        }
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f9 = height;
                } else {
                    width = lottieAnimation.b;
                    f9 = i10;
                }
                intrinsicWidth = width / f9;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((m1Var.getLeft() + ((int) m1Var.getTranslationX())) - this.J, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(m1Var);
            }
        }
    }
}
