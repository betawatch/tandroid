package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a51 extends org.telegram.ui.Components.qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ b51 T;

    public a51(b51 b51Var) {
        this.T = b51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // org.telegram.ui.Components.qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        s4.l0 l0Var;
        int i12;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (w7.r.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        b51 b51Var = this.T;
        boolean z11 = true;
        boolean z12 = b51Var.c3.W == 13 || this.Q < 1.0f || ((l0Var = b51Var.c0) != null && l0Var.k()) || this.O.size() <= 4 || !this.R || z51.c(this.T.c3) || (i12 = this.T.c3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.c3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z51 z51Var = this.T.c3;
                if (elapsedRealtime - z51Var.P1 < z51Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        i51 i51Var = (i51) this.O.get(i13);
                        if (i51Var.N != 0.0f || i51Var.S != 0.0f || i51Var.I != null || i51Var.getTranslationX() != 0.0f || i51Var.getTranslationY() != 0.0f || i51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = i51Var.c;
                            z51 z51Var2 = this.T.c3;
                            if (i14 > z51Var2.N1 && i14 < z51Var2.O1) {
                                break;
                            }
                        }
                        if (i51Var.Q) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.O.size()) {
            }
        }
        z11 = z12;
        float f10 = ah.x0.b ? 1.0f : f7;
        if (!z11 && !ah.x0.e) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.qt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.qt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            i51 i51Var = (i51) arrayList.get(i10);
            if (!i51Var.b) {
                if (i51Var.a) {
                    i51Var.E.setBounds(i51Var.F);
                    i51Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = i51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, i51Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        z51 z51Var = this.T.c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f10 = f7;
            int i12 = 0;
            while (i12 < this.O.size()) {
                i51 i51Var = (i51) this.O.get(i12);
                if (!i51Var.b) {
                    float scaleX = i51Var.getScaleX();
                    int i13 = z51Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f11 = i51Var.N;
                    if (f11 != 0.0f || (i51Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        scaleX *= ((1.0f - Math.max((i13 == 3 || i13 == 4) ? 1.0f : i51Var.S * 0.7f, f11)) * 0.2f) + 0.8f;
                    }
                    int i14 = (z51Var.P1 <= 0 || SystemClock.elapsedRealtime() - z51Var.P1 >= z51Var.g()) ? i11 : 1;
                    if (i14 == 0 || z51Var.N1 < 0 || z51Var.O1 < 0 || z51Var.P1 <= 0) {
                        f10 *= i51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(i51Var);
                        int i15 = z51Var.N1;
                        int i16 = R - i15;
                        int i17 = z51Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a((SystemClock.elapsedRealtime() - z51Var.P1) / z51Var.f(), 0.0f, 1.0f);
                            float f12 = i16;
                            float f13 = i17;
                            float f14 = f13 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f12, f13, f14);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f12, f13, f14)) * 0.5f) + 0.5f;
                            f10 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i51Var.getPaddingLeft() + ((int) i51Var.getX()), i51Var.getPaddingTop(), (i51Var.getWidth() + ((int) i51Var.getX())) - i51Var.getPaddingRight(), i51Var.getHeight() - i51Var.getPaddingBottom());
                    if (!z51Var.w1 && i14 == 0) {
                        rect.offset(i11, (int) i51Var.getTranslationY());
                    }
                    if (i51Var.a) {
                        drawable = z51Var.getPremiumStar();
                        int i18 = z51Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (i51Var.s || i51Var.Q) {
                        ImageReceiver imageReceiver = i51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((i51Var.e != null || z51Var.W == 13) && !i51Var.b && (drawable = i51Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = z51Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = i51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f15 = this.Q;
                    i51Var.O = f15;
                    i51Var.P = i12;
                    if (scaleX != 1.0f || f15 < 1.0f) {
                        canvas.save();
                        float f16 = i51Var.S;
                        if (f16 > 1.0f && (i10 = z51Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f16);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = z51Var.W;
                        if (i19 == 6 || i19 == 13 || i19 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            i51Var.getHeight();
                            float f17 = this.Q;
                            if (f17 < 1.0f) {
                                canvas.scale(1.0f, f17, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, i51Var, f10);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, i51Var, f10);
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.c3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((i51) arrayList.get(i10)).f[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        int i12;
        int i13;
        Drawable premiumStar;
        z51 z51Var = this.T.c3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.O.size()) {
            i51 i51Var = (i51) this.O.get(i15);
            boolean z10 = i51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = i51Var.f;
            if (!z10) {
                if (i51Var.a) {
                    premiumStar = z51Var.getPremiumStar();
                    int i16 = z51Var.W;
                    float f7 = (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) ? 1.3f : 1.0f;
                    float f10 = i51Var.N;
                    if (f10 != 0.0f || i51Var.S > 0.0f) {
                        f7 *= ((1.0f - Math.max(i51Var.S * 0.8f, f10)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (i51Var.getWidth() - i51Var.getPaddingLeft()) - i51Var.getPaddingRight();
                        int height = (i51Var.getHeight() - i51Var.getPaddingTop()) - i51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f11 = width / 2.0f;
                        float f12 = height / 2.0f;
                        rect2.set((int) ((i51Var.getWidth() / 2.0f) - ((i51Var.getScaleX() * f11) * f7)), (int) ((i51Var.getHeight() / 2.0f) - ((i51Var.getScaleY() * f12) * f7)), (int) ((i51Var.getScaleX() * f11 * f7) + (i51Var.getWidth() / 2.0f)), (int) ((i51Var.getScaleY() * f12 * f7) + (i51Var.getHeight() / 2.0f)));
                        rect2.offset(i51Var.getLeft() - this.N, i14);
                        if (i51Var.F == null) {
                            i51Var.F = new Rect();
                        }
                        i51Var.F.set(rect2);
                        i51Var.setDrawable(premiumStar);
                        arrayList.add(i51Var);
                    }
                } else {
                    float f13 = i51Var.N;
                    if (f13 != 0.0f || i51Var.S > 0.0f) {
                        Math.max(i51Var.S * 0.8f, f13);
                    }
                    if (z51Var.P1 > 0) {
                        int i17 = i15;
                        if (SystemClock.elapsedRealtime() - z51Var.P1 >= z51Var.g() || z51Var.N1 < 0 || z51Var.O1 < 0 || z51Var.P1 <= 0) {
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            i10 = i17;
                        } else {
                            int R = RecyclerView.R(i51Var);
                            int i18 = z51Var.N1;
                            int i19 = R - i18;
                            int i20 = z51Var.O1 - i18;
                            if (i19 < 0 || i19 >= i20) {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                alpha = 1.0f;
                            } else {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                float a2 = w7.r.a((SystemClock.elapsedRealtime() - z51Var.P1) / z51Var.f(), 0.0f, 1.0f);
                                float f14 = i19;
                                float f15 = i20;
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16));
                                alpha = cascade * 1.0f;
                            }
                            if (!i51Var.s || i51Var.Q) {
                                ImageReceiver imageReceiver2 = i51Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (i51Var.e != null) {
                                    Drawable drawable = i51Var.E;
                                    org.telegram.ui.Components.r5 r5Var = drawable instanceof org.telegram.ui.Components.r5 ? (org.telegram.ui.Components.r5) drawable : null;
                                    if (r5Var != null && (imageReceiver2 = r5Var.k) != null) {
                                        r5Var.setAlpha((int) (alpha * 255.0f));
                                        i51Var.setDrawable(r5Var);
                                        i51Var.E.setColorFilter(z51Var.k1);
                                    }
                                }
                                i12 = i10;
                                i11 = 0;
                                i15 = i12 + 1;
                                i14 = i11;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.setEmojiPaused((z51Var.K1 || (z51Var.L1 && i51Var.L)) ? false : true);
                            if (i51Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                            }
                            int i21 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i21], i21);
                            backgroundThreadDrawHolderArr[i21] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            i51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                i51Var.r.getLottieAnimation().V(j10);
                            }
                            if (i51Var.r.getAnimation() != null) {
                                i51Var.r.getAnimation().D(j10);
                            }
                            i51Var.getWidth();
                            i51Var.getPaddingLeft();
                            i51Var.getPaddingRight();
                            i51Var.getHeight();
                            i51Var.getPaddingTop();
                            i51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(i51Var.getPaddingLeft(), i51Var.getPaddingTop(), i51Var.getWidth() - i51Var.getPaddingRight(), i51Var.getHeight() - i51Var.getPaddingBottom());
                            if (i51Var.L && (i13 = z51Var.W) != 3 && i13 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i11 = 0;
                            rect.offset((i51Var.getLeft() + ((int) i51Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i21].setBounds(rect);
                            i51Var.O = 1.0f;
                            i12 = i10;
                            i51Var.P = i12;
                            arrayList.add(i51Var);
                            i15 = i12 + 1;
                            i14 = i11;
                        }
                    } else {
                        i10 = i15;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    }
                    alpha = i51Var.getAlpha() * 1.0f;
                    if (i51Var.s) {
                    }
                    ImageReceiver imageReceiver22 = i51Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.setEmojiPaused((z51Var.K1 || (z51Var.L1 && i51Var.L)) ? false : true);
                    if (i51Var.L) {
                    }
                    int i212 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i212], i212);
                    backgroundThreadDrawHolderArr[i212] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    i51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (i51Var.r.getAnimation() != null) {
                    }
                    i51Var.getWidth();
                    i51Var.getPaddingLeft();
                    i51Var.getPaddingRight();
                    i51Var.getHeight();
                    i51Var.getPaddingTop();
                    i51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(i51Var.getPaddingLeft(), i51Var.getPaddingTop(), i51Var.getWidth() - i51Var.getPaddingRight(), i51Var.getHeight() - i51Var.getPaddingBottom());
                    if (i51Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i11 = 0;
                    rect.offset((i51Var.getLeft() + ((int) i51Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i212].setBounds(rect);
                    i51Var.O = 1.0f;
                    i12 = i10;
                    i51Var.P = i12;
                    arrayList.add(i51Var);
                    i15 = i12 + 1;
                    i14 = i11;
                }
            }
            i11 = i14;
            i12 = i15;
            i15 = i12 + 1;
            i14 = i11;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, i51 i51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.c3.k1);
        } else if ((i51Var.s || i51Var.Q) && i51Var.h != null) {
            canvas.save();
            canvas.clipRect(i51Var.h.getImageX(), i51Var.h.getImageY(), i51Var.h.getImageX2(), i51Var.h.getImageY2());
            i51Var.h.setAlpha(f7);
            i51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
