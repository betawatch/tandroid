package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.nt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u1 extends nt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ w1 R;

    public u1(w1 w1Var) {
        this.R = w1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.p5 p5Var, v1 v1Var, float f7) {
        if (p5Var != null) {
            p5Var.setAlpha((int) (f7 * 255.0f));
            p5Var.draw(canvas);
        } else if (v1Var.e != null) {
            canvas.save();
            canvas.clipRect(v1Var.e.getImageX(), v1Var.e.getImageY(), v1Var.e.getImageX2(), v1Var.e.getImageY2());
            v1Var.e.setAlpha(f7);
            v1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.nt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.O == null) {
            return;
        }
        s4.m0 m0Var = this.R.c0;
        boolean z10 = true;
        boolean z11 = (m0Var != null && m0Var.k()) || this.O.size() <= 4 || !this.Q;
        if (!z11) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((v1) this.O.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i10, i11, f7);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f7);
        k();
    }

    @Override // org.telegram.ui.Components.nt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            v1 v1Var = (v1) arrayList.get(i10);
            v1Var.getClass();
            org.telegram.ui.Components.p5 p5Var = v1Var.c;
            if (p5Var != null) {
                p5Var.setColorFilter(this.R.h3);
            }
            v1Var.n.draw(canvas, v1Var.h[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.nt
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.p5 p5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                v1 v1Var = (v1) this.O.get(i10);
                v1Var.getClass();
                float scale = v1Var.getScale();
                float alpha = v1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(v1Var.getPaddingLeft() + ((int) v1Var.getX()), v1Var.getPaddingTop(), (v1Var.getWidth() + ((int) v1Var.getX())) - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                org.telegram.ui.Components.p5 p5Var2 = v1Var.c;
                if (p5Var2 != null) {
                    p5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = v1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.h3;
                if (porterDuffColorFilter != null && (p5Var = v1Var.c) != null) {
                    p5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, p5Var2, v1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, p5Var2, v1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.nt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((v1) arrayList.get(i10)).h[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.nt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        float intrinsicWidth;
        float width;
        int height;
        float f7;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            v1 v1Var = (v1) this.O.get(i11);
            v1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = v1Var.h;
            org.telegram.ui.Components.p5 p5Var = v1Var.c;
            ImageReceiver imageReceiver = p5Var != null ? p5Var.k : v1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(v1Var.getAlpha());
                org.telegram.ui.Components.p5 p5Var2 = v1Var.c;
                if (p5Var2 != null) {
                    p5Var2.setColorFilter(this.R.h3);
                }
                int i12 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                v1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    v1Var.n.getLottieAnimation().U(j3);
                }
                if (v1Var.n.getAnimation() != null) {
                    v1Var.n.getAnimation().D(j3);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(v1Var.getPaddingLeft(), v1Var.getPaddingTop(), v1Var.getWidth() - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                hj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                            rect.offset((v1Var.getLeft() + ((int) v1Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(v1Var);
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
                rect.offset((v1Var.getLeft() + ((int) v1Var.getTranslationX())) - this.N, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(v1Var);
            }
        }
    }
}
