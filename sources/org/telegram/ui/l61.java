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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l61 extends org.telegram.ui.Components.yt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ m61 T;

    public l61(m61 m61Var) {
        this.T = m61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // org.telegram.ui.Components.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        s4.n0 n0Var;
        int i12;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (w7.o.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        m61 m61Var = this.T;
        boolean z11 = true;
        boolean z12 = m61Var.c3.W == 13 || this.Q < 1.0f || ((n0Var = m61Var.c0) != null && n0Var.k()) || this.O.size() <= 4 || !this.R || k71.c(this.T.c3) || (i12 = this.T.c3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.c3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                k71 k71Var = this.T.c3;
                if (elapsedRealtime - k71Var.P1 < k71Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        t61 t61Var = (t61) this.O.get(i13);
                        if (t61Var.N != 0.0f || t61Var.S != 0.0f || t61Var.I != null || t61Var.getTranslationX() != 0.0f || t61Var.getTranslationY() != 0.0f || t61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = t61Var.c;
                            k71 k71Var2 = this.T.c3;
                            if (i14 > k71Var2.N1 && i14 < k71Var2.O1) {
                                break;
                            }
                        }
                        if (t61Var.Q) {
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
        float f10 = zg.d0.b ? 1.0f : f7;
        if (!z11 && !zg.d0.e) {
            super.a(canvas, j3, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.yt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.yt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            t61 t61Var = (t61) arrayList.get(i10);
            if (!t61Var.b) {
                if (t61Var.a) {
                    t61Var.E.setBounds(t61Var.F);
                    t61Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = t61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, t61Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        k71 k71Var = this.T.c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f10 = f7;
            int i12 = 0;
            while (i12 < this.O.size()) {
                t61 t61Var = (t61) this.O.get(i12);
                if (!t61Var.b) {
                    float scaleX = t61Var.getScaleX();
                    int i13 = k71Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f11 = t61Var.N;
                    if (f11 != 0.0f || (t61Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        scaleX *= ((1.0f - Math.max((i13 == 3 || i13 == 4) ? 1.0f : t61Var.S * 0.7f, f11)) * 0.2f) + 0.8f;
                    }
                    int i14 = (k71Var.P1 <= 0 || SystemClock.elapsedRealtime() - k71Var.P1 >= k71Var.g()) ? i11 : 1;
                    if (i14 == 0 || k71Var.N1 < 0 || k71Var.O1 < 0 || k71Var.P1 <= 0) {
                        f10 *= t61Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(t61Var);
                        int i15 = k71Var.N1;
                        int i16 = R - i15;
                        int i17 = k71Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.o.a((SystemClock.elapsedRealtime() - k71Var.P1) / k71Var.f(), 0.0f, 1.0f);
                            float f12 = i16;
                            float f13 = i17;
                            float f14 = f13 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f12, f13, f14);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f12, f13, f14)) * 0.5f) + 0.5f;
                            f10 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(t61Var.getPaddingLeft() + ((int) t61Var.getX()), t61Var.getPaddingTop(), (t61Var.getWidth() + ((int) t61Var.getX())) - t61Var.getPaddingRight(), t61Var.getHeight() - t61Var.getPaddingBottom());
                    if (!k71Var.w1 && i14 == 0) {
                        rect.offset(i11, (int) t61Var.getTranslationY());
                    }
                    if (t61Var.a) {
                        drawable = k71Var.getPremiumStar();
                        int i18 = k71Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (t61Var.s || t61Var.Q) {
                        ImageReceiver imageReceiver = t61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((t61Var.e != null || k71Var.W == 13) && !t61Var.b && (drawable = t61Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = k71Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = t61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f15 = this.Q;
                    t61Var.O = f15;
                    t61Var.P = i12;
                    if (scaleX != 1.0f || f15 < 1.0f) {
                        canvas.save();
                        float f16 = t61Var.S;
                        if (f16 > 1.0f && (i10 = k71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f16);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = k71Var.W;
                        if (i19 == 6 || i19 == 13 || i19 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            t61Var.getHeight();
                            float f17 = this.Q;
                            if (f17 < 1.0f) {
                                canvas.scale(1.0f, f17, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, t61Var, f10);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, t61Var, f10);
                    }
                }
                i12++;
                i11 = 0;
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
                this.T.c3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((t61) arrayList.get(i10)).f[this.K];
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
    @Override // org.telegram.ui.Components.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        int i12;
        int i13;
        Drawable premiumStar;
        k71 k71Var = this.T.c3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.O.size()) {
            t61 t61Var = (t61) this.O.get(i15);
            boolean z10 = t61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = t61Var.f;
            if (!z10) {
                if (t61Var.a) {
                    premiumStar = k71Var.getPremiumStar();
                    int i16 = k71Var.W;
                    float f7 = (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) ? 1.3f : 1.0f;
                    float f10 = t61Var.N;
                    if (f10 != 0.0f || t61Var.S > 0.0f) {
                        f7 *= ((1.0f - Math.max(t61Var.S * 0.8f, f10)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (t61Var.getWidth() - t61Var.getPaddingLeft()) - t61Var.getPaddingRight();
                        int height = (t61Var.getHeight() - t61Var.getPaddingTop()) - t61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f11 = width / 2.0f;
                        float f12 = height / 2.0f;
                        rect2.set((int) ((t61Var.getWidth() / 2.0f) - ((t61Var.getScaleX() * f11) * f7)), (int) ((t61Var.getHeight() / 2.0f) - ((t61Var.getScaleY() * f12) * f7)), (int) ((t61Var.getScaleX() * f11 * f7) + (t61Var.getWidth() / 2.0f)), (int) ((t61Var.getScaleY() * f12 * f7) + (t61Var.getHeight() / 2.0f)));
                        rect2.offset(t61Var.getLeft() - this.N, i14);
                        if (t61Var.F == null) {
                            t61Var.F = new Rect();
                        }
                        t61Var.F.set(rect2);
                        t61Var.setDrawable(premiumStar);
                        arrayList.add(t61Var);
                    }
                } else {
                    float f13 = t61Var.N;
                    if (f13 != 0.0f || t61Var.S > 0.0f) {
                        Math.max(t61Var.S * 0.8f, f13);
                    }
                    if (k71Var.P1 > 0) {
                        int i17 = i15;
                        if (SystemClock.elapsedRealtime() - k71Var.P1 >= k71Var.g() || k71Var.N1 < 0 || k71Var.O1 < 0 || k71Var.P1 <= 0) {
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            i10 = i17;
                        } else {
                            int R = RecyclerView.R(t61Var);
                            int i18 = k71Var.N1;
                            int i19 = R - i18;
                            int i20 = k71Var.O1 - i18;
                            if (i19 < 0 || i19 >= i20) {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                alpha = 1.0f;
                            } else {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                float a2 = w7.o.a((SystemClock.elapsedRealtime() - k71Var.P1) / k71Var.f(), 0.0f, 1.0f);
                                float f14 = i19;
                                float f15 = i20;
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16));
                                alpha = cascade * 1.0f;
                            }
                            if (!t61Var.s || t61Var.Q) {
                                ImageReceiver imageReceiver2 = t61Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (t61Var.e != null) {
                                    Drawable drawable = t61Var.E;
                                    org.telegram.ui.Components.s5 s5Var = drawable instanceof org.telegram.ui.Components.s5 ? (org.telegram.ui.Components.s5) drawable : null;
                                    if (s5Var != null && (imageReceiver2 = s5Var.k) != null) {
                                        s5Var.setAlpha((int) (alpha * 255.0f));
                                        t61Var.setDrawable(s5Var);
                                        t61Var.E.setColorFilter(k71Var.k1);
                                    }
                                }
                                i12 = i10;
                                i11 = 0;
                                i15 = i12 + 1;
                                i14 = i11;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.setEmojiPaused((k71Var.K1 || (k71Var.L1 && t61Var.L)) ? false : true);
                            if (t61Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                            }
                            int i21 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i21], i21);
                            backgroundThreadDrawHolderArr[i21] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j3;
                            t61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                t61Var.r.getLottieAnimation().V(j3);
                            }
                            if (t61Var.r.getAnimation() != null) {
                                t61Var.r.getAnimation().D(j3);
                            }
                            t61Var.getWidth();
                            t61Var.getPaddingLeft();
                            t61Var.getPaddingRight();
                            t61Var.getHeight();
                            t61Var.getPaddingTop();
                            t61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(t61Var.getPaddingLeft(), t61Var.getPaddingTop(), t61Var.getWidth() - t61Var.getPaddingRight(), t61Var.getHeight() - t61Var.getPaddingBottom());
                            if (t61Var.L && (i13 = k71Var.W) != 3 && i13 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i11 = 0;
                            rect.offset((t61Var.getLeft() + ((int) t61Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i21].setBounds(rect);
                            t61Var.O = 1.0f;
                            i12 = i10;
                            t61Var.P = i12;
                            arrayList.add(t61Var);
                            i15 = i12 + 1;
                            i14 = i11;
                        }
                    } else {
                        i10 = i15;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    }
                    alpha = t61Var.getAlpha() * 1.0f;
                    if (t61Var.s) {
                    }
                    ImageReceiver imageReceiver22 = t61Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.setEmojiPaused((k71Var.K1 || (k71Var.L1 && t61Var.L)) ? false : true);
                    if (t61Var.L) {
                    }
                    int i212 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i212], i212);
                    backgroundThreadDrawHolderArr[i212] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j3;
                    t61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (t61Var.r.getAnimation() != null) {
                    }
                    t61Var.getWidth();
                    t61Var.getPaddingLeft();
                    t61Var.getPaddingRight();
                    t61Var.getHeight();
                    t61Var.getPaddingTop();
                    t61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(t61Var.getPaddingLeft(), t61Var.getPaddingTop(), t61Var.getWidth() - t61Var.getPaddingRight(), t61Var.getHeight() - t61Var.getPaddingBottom());
                    if (t61Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i11 = 0;
                    rect.offset((t61Var.getLeft() + ((int) t61Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i212].setBounds(rect);
                    t61Var.O = 1.0f;
                    i12 = i10;
                    t61Var.P = i12;
                    arrayList.add(t61Var);
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

    public final void m(Canvas canvas, Drawable drawable, t61 t61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.c3.k1);
        } else if ((t61Var.s || t61Var.Q) && t61Var.h != null) {
            canvas.save();
            canvas.clipRect(t61Var.h.getImageX(), t61Var.h.getImageY(), t61Var.h.getImageX2(), t61Var.h.getImageY2());
            t61Var.h.setAlpha(f7);
            t61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
