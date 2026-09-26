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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b61 extends org.telegram.ui.Components.jt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ c61 T;

    public b61(c61 c61Var) {
        this.T = c61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.jt
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
                this.Q = (w7.q.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        c61 c61Var = this.T;
        boolean z11 = true;
        boolean z12 = c61Var.e3.W == 13 || this.Q < 1.0f || ((m0Var = c61Var.c0) != null && m0Var.k()) || this.O.size() <= 4 || !this.R || a71.c(this.T.e3) || (i12 = this.T.e3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.e3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a71 a71Var = this.T.e3;
                if (elapsedRealtime - a71Var.P1 < a71Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        j61 j61Var = (j61) this.O.get(i13);
                        if (j61Var.N != 0.0f || j61Var.S != 0.0f || j61Var.I != null || j61Var.getTranslationX() != 0.0f || j61Var.getTranslationY() != 0.0f || j61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = j61Var.c;
                            a71 a71Var2 = this.T.e3;
                            if (i14 > a71Var2.N1 && i14 < a71Var2.O1) {
                                break;
                            }
                        }
                        if (j61Var.Q) {
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
        float f10 = zg.e0.b ? 1.0f : f7;
        if (!z11 && !zg.e0.e) {
            super.a(canvas, j3, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.jt
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.jt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            j61 j61Var = (j61) arrayList.get(i10);
            if (!j61Var.b) {
                if (j61Var.a) {
                    j61Var.E.setBounds(j61Var.F);
                    j61Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = j61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, j61Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        a71 a71Var = this.T.e3;
        if (this.O != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                j61 j61Var = (j61) this.O.get(i11);
                if (!j61Var.b) {
                    float scaleX = j61Var.getScaleX();
                    int i12 = a71Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = j61Var.N;
                    if (f12 != f10 || (j61Var.S > f10 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : j61Var.S * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = a71Var.P1 > 0 && SystemClock.elapsedRealtime() - a71Var.P1 < a71Var.g();
                    if (!z10 || a71Var.N1 < 0 || a71Var.O1 < 0 || a71Var.P1 <= 0) {
                        f11 *= j61Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(j61Var);
                        int i13 = a71Var.N1;
                        int i14 = R - i13;
                        int i15 = a71Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.q.a((SystemClock.elapsedRealtime() - a71Var.P1) / a71Var.f(), 0.0f, 1.0f);
                            float f13 = i14;
                            float f14 = i15;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j61Var.getPaddingLeft() + ((int) j61Var.getX()), j61Var.getPaddingTop(), (j61Var.getWidth() + ((int) j61Var.getX())) - j61Var.getPaddingRight(), j61Var.getHeight() - j61Var.getPaddingBottom());
                    if (!a71Var.w1 && !z10) {
                        rect.offset(0, (int) j61Var.getTranslationY());
                    }
                    if (j61Var.a) {
                        drawable = a71Var.getPremiumStar();
                        int i16 = a71Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (j61Var.s || j61Var.Q) {
                        ImageReceiver imageReceiver = j61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((j61Var.e != null || a71Var.W == 13) && !j61Var.b && (drawable = j61Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = a71Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = j61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.q5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    j61Var.O = f16;
                    j61Var.P = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = j61Var.S;
                        if (f17 > 1.0f && (i10 = a71Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = a71Var.W;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            j61Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, j61Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, j61Var, f11);
                    }
                }
                i11++;
                f10 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.e3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((j61) arrayList.get(i10)).f[this.K];
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
    @Override // org.telegram.ui.Components.jt
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
        a71 a71Var = this.T.e3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.O.size()) {
            j61 j61Var = (j61) this.O.get(i13);
            boolean z10 = j61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = j61Var.f;
            if (!z10) {
                if (j61Var.a) {
                    premiumStar = a71Var.getPremiumStar();
                    int i14 = a71Var.W;
                    float f10 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f11 = j61Var.N;
                    if (f11 != 0.0f || j61Var.S > 0.0f) {
                        f10 *= ((1.0f - Math.max(j61Var.S * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (j61Var.getWidth() - j61Var.getPaddingLeft()) - j61Var.getPaddingRight();
                        int height = (j61Var.getHeight() - j61Var.getPaddingTop()) - j61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((j61Var.getWidth() / 2.0f) - ((j61Var.getScaleX() * f12) * f10)), (int) ((j61Var.getHeight() / 2.0f) - ((j61Var.getScaleY() * f13) * f10)), (int) ((j61Var.getScaleX() * f12 * f10) + (j61Var.getWidth() / 2.0f)), (int) ((j61Var.getScaleY() * f13 * f10) + (j61Var.getHeight() / 2.0f)));
                        rect2.offset(j61Var.getLeft() - this.N, i12);
                        if (j61Var.F == null) {
                            j61Var.F = new Rect();
                        }
                        j61Var.F.set(rect2);
                        j61Var.setDrawable(premiumStar);
                        arrayList.add(j61Var);
                    }
                } else {
                    float f14 = j61Var.N;
                    if (f14 != 0.0f || j61Var.S > 0.0f) {
                        Math.max(j61Var.S * 0.8f, f14);
                    }
                    if (a71Var.P1 > 0) {
                        f7 = 4.0f;
                        if (SystemClock.elapsedRealtime() - a71Var.P1 >= a71Var.g() || a71Var.N1 < 0 || a71Var.O1 < 0 || a71Var.P1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(j61Var);
                            int i15 = a71Var.N1;
                            int i16 = R - i15;
                            int i17 = a71Var.O1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = w7.q.a((SystemClock.elapsedRealtime() - a71Var.P1) / a71Var.f(), 0.0f, 1.0f);
                                float f15 = i16;
                                float f16 = i17;
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17));
                                alpha = cascade * 1.0f;
                            }
                            if (!j61Var.s || j61Var.Q) {
                                imageReceiver = j61Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (j61Var.e != null) {
                                    Drawable drawable = j61Var.E;
                                    org.telegram.ui.Components.q5 q5Var = drawable instanceof org.telegram.ui.Components.q5 ? (org.telegram.ui.Components.q5) drawable : null;
                                    if (q5Var != null && (imageReceiver = q5Var.k) != null) {
                                        q5Var.setAlpha((int) (alpha * 255.0f));
                                        j61Var.setDrawable(q5Var);
                                        j61Var.E.setColorFilter(a71Var.k1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((a71Var.K1 || (a71Var.L1 && j61Var.L)) ? false : true);
                            if (j61Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                            }
                            int i18 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j3;
                            j61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                j61Var.r.getLottieAnimation().V(j3);
                            }
                            if (j61Var.r.getAnimation() != null) {
                                j61Var.r.getAnimation().D(j3);
                            }
                            j61Var.getWidth();
                            j61Var.getPaddingLeft();
                            j61Var.getPaddingRight();
                            j61Var.getHeight();
                            j61Var.getPaddingTop();
                            j61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(j61Var.getPaddingLeft(), j61Var.getPaddingTop(), j61Var.getWidth() - j61Var.getPaddingRight(), j61Var.getHeight() - j61Var.getPaddingBottom());
                            if (j61Var.L && (i11 = a71Var.W) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((j61Var.getLeft() + ((int) j61Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            j61Var.O = 1.0f;
                            j61Var.P = i10;
                            arrayList.add(j61Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f7 = 4.0f;
                    }
                    alpha = j61Var.getAlpha() * 1.0f;
                    if (j61Var.s) {
                    }
                    imageReceiver = j61Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((a71Var.K1 || (a71Var.L1 && j61Var.L)) ? false : true);
                    if (j61Var.L) {
                    }
                    int i182 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j3;
                    j61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (j61Var.r.getAnimation() != null) {
                    }
                    j61Var.getWidth();
                    j61Var.getPaddingLeft();
                    j61Var.getPaddingRight();
                    j61Var.getHeight();
                    j61Var.getPaddingTop();
                    j61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(j61Var.getPaddingLeft(), j61Var.getPaddingTop(), j61Var.getWidth() - j61Var.getPaddingRight(), j61Var.getHeight() - j61Var.getPaddingBottom());
                    if (j61Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((j61Var.getLeft() + ((int) j61Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    j61Var.O = 1.0f;
                    j61Var.P = i10;
                    arrayList.add(j61Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, j61 j61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.e3.k1);
        } else if ((j61Var.s || j61Var.Q) && j61Var.h != null) {
            canvas.save();
            canvas.clipRect(j61Var.h.getImageX(), j61Var.h.getImageY(), j61Var.h.getImageX2(), j61Var.h.getImageY2());
            j61Var.h.setAlpha(f7);
            j61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
