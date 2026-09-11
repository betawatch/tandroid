package di;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class n1 extends gt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final /* synthetic */ p1 R;

    public n1(p1 p1Var) {
        this.R = p1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.q5 q5Var, o1 o1Var, float f7) {
        if (q5Var != null) {
            q5Var.setAlpha((int) (f7 * 255.0f));
            q5Var.draw(canvas);
        } else if (o1Var.e != null) {
            canvas.save();
            canvas.clipRect(o1Var.e.getImageX(), o1Var.e.getImageY(), o1Var.e.getImageX2(), o1Var.e.getImageY2());
            o1Var.e.setAlpha(f7);
            o1Var.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        if (this.O == null) {
            return;
        }
        s4.m0 m0Var = this.R.c0;
        boolean z10 = true;
        boolean z11 = (m0Var != null && m0Var.k()) || this.O.size() <= 4 || !this.Q;
        if (!z11) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((o1) this.O.get(i12)).getScale() != 1.0f) {
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

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            o1 o1Var = (o1) arrayList.get(i10);
            o1Var.getClass();
            org.telegram.ui.Components.q5 q5Var = o1Var.c;
            if (q5Var != null) {
                q5Var.setColorFilter(this.R.h3);
            }
            o1Var.n.draw(canvas, o1Var.h[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.q5 q5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                o1 o1Var = (o1) this.O.get(i10);
                o1Var.getClass();
                float scale = o1Var.getScale();
                float alpha = o1Var.getAlpha() * f7;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(o1Var.getPaddingLeft() + ((int) o1Var.getX()), o1Var.getPaddingTop(), (o1Var.getWidth() + ((int) o1Var.getX())) - o1Var.getPaddingRight(), o1Var.getHeight() - o1Var.getPaddingBottom());
                org.telegram.ui.Components.q5 q5Var2 = o1Var.c;
                if (q5Var2 != null) {
                    q5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = o1Var.e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.h3;
                if (porterDuffColorFilter != null && (q5Var = o1Var.c) != null) {
                    q5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, q5Var2, o1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, q5Var2, o1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((o1) arrayList.get(i10)).h[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    @Override // org.telegram.ui.Components.gt
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
            o1 o1Var = (o1) this.O.get(i11);
            o1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = o1Var.h;
            org.telegram.ui.Components.q5 q5Var = o1Var.c;
            ImageReceiver imageReceiver = q5Var != null ? q5Var.k : o1Var.e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(o1Var.getAlpha());
                org.telegram.ui.Components.q5 q5Var2 = o1Var.c;
                if (q5Var2 != null) {
                    q5Var2.setColorFilter(this.R.h3);
                }
                int i12 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                o1Var.n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    o1Var.n.getLottieAnimation().S(j3);
                }
                if (o1Var.n.getAnimation() != null) {
                    o1Var.n.getAnimation().D(j3);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(o1Var.getPaddingLeft(), o1Var.getPaddingTop(), o1Var.getWidth() - o1Var.getPaddingRight(), o1Var.getHeight() - o1Var.getPaddingBottom());
                xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.c) == 0) {
                    org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
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
                            rect.offset((o1Var.getLeft() + ((int) o1Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i12].setBounds(rect);
                            arrayList.add(o1Var);
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
                rect.offset((o1Var.getLeft() + ((int) o1Var.getTranslationX())) - this.N, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(o1Var);
            }
        }
    }
}
