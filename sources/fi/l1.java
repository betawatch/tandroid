package fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l1 extends st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ n1 R;

    public l1(n1 n1Var) {
        this.R = n1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.t5 t5Var, m1 m1Var, float f7) {
        if (t5Var != null) {
            t5Var.setAlpha((int) (f7 * 255.0f));
            t5Var.draw(canvas);
        } else if (m1Var.f != null) {
            canvas.save();
            canvas.clipRect(m1Var.f.getImageX(), m1Var.f.getImageY(), m1Var.f.getImageX2(), m1Var.f.getImageY2());
            m1Var.f.setAlpha(f7);
            m1Var.f.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        if (this.O == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.R.b0() || this.O.size() <= 4 || !this.Q;
        if (!z11) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((m1) this.O.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, f7);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f7);
        k();
    }

    @Override // org.telegram.ui.Components.st
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            m1 m1Var = (m1) arrayList.get(i10);
            m1Var.getClass();
            org.telegram.ui.Components.t5 t5Var = m1Var.d;
            if (t5Var != null) {
                t5Var.setColorFilter(this.R.p3);
            }
            m1Var.r.draw(canvas, m1Var.n[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.t5 t5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                m1 m1Var = (m1) this.O.get(i10);
                m1Var.getClass();
                float scale = m1Var.getScale();
                float alpha = m1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft() + ((int) m1Var.getX()), m1Var.getPaddingTop(), (m1Var.getWidth() + ((int) m1Var.getX())) - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                org.telegram.ui.Components.t5 t5Var2 = m1Var.d;
                if (t5Var2 != null) {
                    t5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = m1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.p3;
                if (porterDuffColorFilter != null && (t5Var = m1Var.d) != null) {
                    t5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, t5Var2, m1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, t5Var2, m1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m1) arrayList.get(i10)).n[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    @Override // org.telegram.ui.Components.st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f7;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            m1 m1Var = (m1) this.O.get(i11);
            m1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = m1Var.n;
            org.telegram.ui.Components.t5 t5Var = m1Var.d;
            ImageReceiver imageReceiver = t5Var != null ? t5Var.k : m1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(m1Var.getAlpha());
                org.telegram.ui.Components.t5 t5Var2 = m1Var.d;
                if (t5Var2 != null) {
                    t5Var2.setColorFilter(this.R.p3);
                }
                int i12 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                m1Var.r = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    m1Var.r.getLottieAnimation().V(j10);
                }
                if (m1Var.r.getAnimation() != null) {
                    m1Var.r.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(m1Var.getPaddingLeft(), m1Var.getPaddingTop(), m1Var.getWidth() - m1Var.getPaddingRight(), m1Var.getHeight() - m1Var.getPaddingBottom());
                yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
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
                                int centerX = (int) (rect.centerX() - height2);
                                rect.left = centerX;
                                rect.right = (int) (rect.centerX() + height2);
                            } else if (intrinsicWidth > 1.0f) {
                                float width2 = (rect.width() / intrinsicWidth) / 2.0f;
                                int centerY = (int) (rect.centerY() - width2);
                                rect.top = centerY;
                                rect.bottom = (int) (rect.centerY() + width2);
                            }
                            rect.offset((m1Var.getLeft() + ((int) m1Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(m1Var);
                        }
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f7 = height;
                } else {
                    width = lottieAnimation.b;
                    f7 = i10;
                }
                intrinsicWidth = width / f7;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((m1Var.getLeft() + ((int) m1Var.getTranslationX())) - this.N, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(m1Var);
            }
        }
    }
}
