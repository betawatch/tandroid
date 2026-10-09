package ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.yt;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m1 extends yt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ o1 R;

    public m1(o1 o1Var) {
        this.R = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.s5 s5Var, n1 n1Var, float f7) {
        if (s5Var != null) {
            s5Var.setAlpha((int) (f7 * 255.0f));
            s5Var.draw(canvas);
        } else if (n1Var.e != null) {
            canvas.save();
            canvas.clipRect(n1Var.e.getImageX(), n1Var.e.getImageY(), n1Var.e.getImageX2(), n1Var.e.getImageY2());
            n1Var.e.setAlpha(f7);
            n1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.O == null) {
            return;
        }
        s4.n0 n0Var = this.R.c0;
        boolean z10 = true;
        boolean z11 = (n0Var != null && n0Var.k()) || this.O.size() <= 4 || !this.Q;
        if (!z11) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((n1) this.O.get(i12)).getScale() != 1.0f) {
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

    @Override // org.telegram.ui.Components.yt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            n1 n1Var = (n1) arrayList.get(i10);
            n1Var.getClass();
            org.telegram.ui.Components.s5 s5Var = n1Var.c;
            if (s5Var != null) {
                s5Var.setColorFilter(this.R.f3);
            }
            n1Var.n.draw(canvas, n1Var.h[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.s5 s5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                n1 n1Var = (n1) this.O.get(i10);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.s5 s5Var2 = n1Var.c;
                if (s5Var2 != null) {
                    s5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f3;
                if (porterDuffColorFilter != null && (s5Var = n1Var.c) != null) {
                    s5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, s5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, s5Var2, n1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((n1) arrayList.get(i10)).h[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    @Override // org.telegram.ui.Components.yt
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
            n1 n1Var = (n1) this.O.get(i11);
            n1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = n1Var.h;
            org.telegram.ui.Components.s5 s5Var = n1Var.c;
            ImageReceiver imageReceiver = s5Var != null ? s5Var.k : n1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(n1Var.getAlpha());
                org.telegram.ui.Components.s5 s5Var2 = n1Var.c;
                if (s5Var2 != null) {
                    s5Var2.setColorFilter(this.R.f3);
                }
                int i12 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                n1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    n1Var.n.getLottieAnimation().V(j3);
                }
                if (n1Var.n.getAnimation() != null) {
                    n1Var.n.getAnimation().D(j3);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft(), n1Var.getPaddingTop(), n1Var.getWidth() - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                ck0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
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
                            rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(n1Var);
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
                rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.N, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(n1Var);
            }
        }
    }
}
