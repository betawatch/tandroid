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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j61 extends org.telegram.ui.Components.ht {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ k61 T;

    public j61(k61 k61Var) {
        this.T = k61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.ht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        s4.m0 m0Var;
        int i12;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (w7.p.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        k61 k61Var = this.T;
        boolean z11 = true;
        boolean z12 = k61Var.e3.W == 13 || this.Q < 1.0f || ((m0Var = k61Var.c0) != null && m0Var.k()) || this.O.size() <= 4 || !this.R || i71.c(this.T.e3) || (i12 = this.T.e3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.e3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                i71 i71Var = this.T.e3;
                if (elapsedRealtime - i71Var.P1 < i71Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        r61 r61Var = (r61) this.O.get(i13);
                        if (r61Var.N != 0.0f || r61Var.S != 0.0f || r61Var.I != null || r61Var.getTranslationX() != 0.0f || r61Var.getTranslationY() != 0.0f || r61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = r61Var.c;
                            i71 i71Var2 = this.T.e3;
                            if (i14 > i71Var2.N1 && i14 < i71Var2.O1) {
                                break;
                            }
                        }
                        if (r61Var.Q) {
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
        float f10 = zg.f0.b ? 1.0f : f7;
        if (!z11 && !zg.f0.e) {
            super.a(canvas, j3, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.ht
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.ht
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            r61 r61Var = (r61) arrayList.get(i10);
            if (!r61Var.b) {
                if (r61Var.a) {
                    r61Var.E.setBounds(r61Var.F);
                    r61Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = r61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, r61Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        i71 i71Var = this.T.e3;
        if (this.O != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                r61 r61Var = (r61) this.O.get(i11);
                if (!r61Var.b) {
                    float scaleX = r61Var.getScaleX();
                    int i12 = i71Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = r61Var.N;
                    if (f12 != f10 || (r61Var.S > f10 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : r61Var.S * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = i71Var.P1 > 0 && SystemClock.elapsedRealtime() - i71Var.P1 < i71Var.g();
                    if (!z10 || i71Var.N1 < 0 || i71Var.O1 < 0 || i71Var.P1 <= 0) {
                        f11 *= r61Var.getAlpha();
                    } else {
                        int S = RecyclerView.S(r61Var);
                        int i13 = i71Var.N1;
                        int i14 = S - i13;
                        int i15 = i71Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.p.a((SystemClock.elapsedRealtime() - i71Var.P1) / i71Var.f(), 0.0f, 1.0f);
                            float f13 = i14;
                            float f14 = i15;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(r61Var.getPaddingLeft() + ((int) r61Var.getX()), r61Var.getPaddingTop(), (r61Var.getWidth() + ((int) r61Var.getX())) - r61Var.getPaddingRight(), r61Var.getHeight() - r61Var.getPaddingBottom());
                    if (!i71Var.w1 && !z10) {
                        rect.offset(0, (int) r61Var.getTranslationY());
                    }
                    if (r61Var.a) {
                        drawable = i71Var.getPremiumStar();
                        int i16 = i71Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (r61Var.s || r61Var.Q) {
                        ImageReceiver imageReceiver = r61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((r61Var.e != null || i71Var.W == 13) && !r61Var.b && (drawable = r61Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = i71Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = r61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    r61Var.O = f16;
                    r61Var.P = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = r61Var.S;
                        if (f17 > 1.0f && (i10 = i71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = i71Var.W;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            r61Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, r61Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, r61Var, f11);
                    }
                }
                i11++;
                f10 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.e3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((r61) arrayList.get(i10)).f[this.K];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    @Override // org.telegram.ui.Components.ht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f7;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        Drawable premiumStar;
        i71 i71Var = this.T.e3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.O.size()) {
            r61 r61Var = (r61) this.O.get(i13);
            boolean z10 = r61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = r61Var.f;
            if (!z10) {
                if (r61Var.a) {
                    premiumStar = i71Var.getPremiumStar();
                    int i14 = i71Var.W;
                    float f10 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f11 = r61Var.N;
                    if (f11 != 0.0f || r61Var.S > 0.0f) {
                        f10 *= ((1.0f - Math.max(r61Var.S * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (r61Var.getWidth() - r61Var.getPaddingLeft()) - r61Var.getPaddingRight();
                        int height = (r61Var.getHeight() - r61Var.getPaddingTop()) - r61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((r61Var.getWidth() / 2.0f) - ((r61Var.getScaleX() * f12) * f10)), (int) ((r61Var.getHeight() / 2.0f) - ((r61Var.getScaleY() * f13) * f10)), (int) ((r61Var.getScaleX() * f12 * f10) + (r61Var.getWidth() / 2.0f)), (int) ((r61Var.getScaleY() * f13 * f10) + (r61Var.getHeight() / 2.0f)));
                        rect2.offset(r61Var.getLeft() - this.N, i12);
                        if (r61Var.F == null) {
                            r61Var.F = new Rect();
                        }
                        r61Var.F.set(rect2);
                        r61Var.setDrawable(premiumStar);
                        arrayList.add(r61Var);
                    }
                } else {
                    float f14 = r61Var.N;
                    if (f14 != 0.0f || r61Var.S > 0.0f) {
                        Math.max(r61Var.S * 0.8f, f14);
                    }
                    if (i71Var.P1 > 0) {
                        f7 = 4.0f;
                        if (SystemClock.elapsedRealtime() - i71Var.P1 >= i71Var.g() || i71Var.N1 < 0 || i71Var.O1 < 0 || i71Var.P1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int S = RecyclerView.S(r61Var);
                            int i15 = i71Var.N1;
                            int i16 = S - i15;
                            int i17 = i71Var.O1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = w7.p.a((SystemClock.elapsedRealtime() - i71Var.P1) / i71Var.f(), 0.0f, 1.0f);
                                float f15 = i16;
                                float f16 = i17;
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17));
                                alpha = cascade * 1.0f;
                            }
                            if (!r61Var.s || r61Var.Q) {
                                imageReceiver = r61Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (r61Var.e != null) {
                                    Drawable drawable = r61Var.E;
                                    org.telegram.ui.Components.o5 o5Var = drawable instanceof org.telegram.ui.Components.o5 ? (org.telegram.ui.Components.o5) drawable : null;
                                    if (o5Var != null && (imageReceiver = o5Var.k) != null) {
                                        o5Var.setAlpha((int) (alpha * 255.0f));
                                        r61Var.setDrawable(o5Var);
                                        r61Var.E.setColorFilter(i71Var.k1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((i71Var.K1 || (i71Var.L1 && r61Var.L)) ? false : true);
                            if (r61Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                            }
                            int i18 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j3;
                            r61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                r61Var.r.getLottieAnimation().V(j3);
                            }
                            if (r61Var.r.getAnimation() != null) {
                                r61Var.r.getAnimation().D(j3);
                            }
                            r61Var.getWidth();
                            r61Var.getPaddingLeft();
                            r61Var.getPaddingRight();
                            r61Var.getHeight();
                            r61Var.getPaddingTop();
                            r61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(r61Var.getPaddingLeft(), r61Var.getPaddingTop(), r61Var.getWidth() - r61Var.getPaddingRight(), r61Var.getHeight() - r61Var.getPaddingBottom());
                            if (r61Var.L && (i11 = i71Var.W) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((r61Var.getLeft() + ((int) r61Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            r61Var.O = 1.0f;
                            r61Var.P = i10;
                            arrayList.add(r61Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f7 = 4.0f;
                    }
                    alpha = r61Var.getAlpha() * 1.0f;
                    if (r61Var.s) {
                    }
                    imageReceiver = r61Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((i71Var.K1 || (i71Var.L1 && r61Var.L)) ? false : true);
                    if (r61Var.L) {
                    }
                    int i182 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j3;
                    r61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (r61Var.r.getAnimation() != null) {
                    }
                    r61Var.getWidth();
                    r61Var.getPaddingLeft();
                    r61Var.getPaddingRight();
                    r61Var.getHeight();
                    r61Var.getPaddingTop();
                    r61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(r61Var.getPaddingLeft(), r61Var.getPaddingTop(), r61Var.getWidth() - r61Var.getPaddingRight(), r61Var.getHeight() - r61Var.getPaddingBottom());
                    if (r61Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((r61Var.getLeft() + ((int) r61Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    r61Var.O = 1.0f;
                    r61Var.P = i10;
                    arrayList.add(r61Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, r61 r61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.e3.k1);
        } else if ((r61Var.s || r61Var.Q) && r61Var.h != null) {
            canvas.save();
            canvas.clipRect(r61Var.h.getImageX(), r61Var.h.getImageY(), r61Var.h.getImageX2(), r61Var.h.getImageY2());
            r61Var.h.setAlpha(f7);
            r61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
