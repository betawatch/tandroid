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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b51 extends org.telegram.ui.Components.us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final /* synthetic */ c51 P;

    public b51(c51 c51Var) {
        this.P = c51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z10;
        f2.v0 v0Var;
        int i12;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        this.M = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.K.get(0);
            if (view.getY() > (this.P.getHeight() - this.P.getPaddingBottom()) - view.getHeight()) {
                this.M = (h7.n.a((-((view.getY() - this.P.getHeight()) + this.P.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        c51 c51Var = this.P;
        boolean z11 = true;
        boolean z12 = c51Var.a3.S == 13 || this.M < 1.0f || ((v0Var = c51Var.V) != null && v0Var.k()) || this.K.size() <= 4 || !this.N || a61.c(this.P.a3) || (i12 = this.P.a3.S) == 4 || i12 == 6;
        if (!z12) {
            if (this.P.a3.L1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a61 a61Var = this.P.a3;
                if (elapsedRealtime - a61Var.L1 < a61Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.K.size(); i13++) {
                        j51 j51Var = (j51) this.K.get(i13);
                        if (j51Var.J != 0.0f || j51Var.O != 0.0f || j51Var.E != null || j51Var.getTranslationX() != 0.0f || j51Var.getTranslationY() != 0.0f || j51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = j51Var.c;
                            a61 a61Var2 = this.P.a3;
                            if (i14 > a61Var2.J1 && i14 < a61Var2.K1) {
                                break;
                            }
                        }
                        if (j51Var.M) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.K.size()) {
            }
        }
        z11 = z12;
        float f11 = ig.g0.b ? 1.0f : f10;
        if (!z11 && !ig.g0.e) {
            super.a(canvas, j10, i10, i11, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.us
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            j51 j51Var = (j51) arrayList.get(i10);
            if (!j51Var.b) {
                if (j51Var.a) {
                    j51Var.A.setBounds(j51Var.B);
                    j51Var.A.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = j51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, j51Var.f[this.G]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i10;
        a61 a61Var = this.P.a3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.K.size()) {
                j51 j51Var = (j51) this.K.get(i11);
                if (!j51Var.b) {
                    float scaleX = j51Var.getScaleX();
                    int i12 = a61Var.S;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = j51Var.J;
                    if (f13 != f11 || (j51Var.O > f11 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : j51Var.O * 0.7f, f13)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = a61Var.L1 > 0 && SystemClock.elapsedRealtime() - a61Var.L1 < a61Var.g();
                    if (!z10 || a61Var.J1 < 0 || a61Var.K1 < 0 || a61Var.L1 <= 0) {
                        f12 *= j51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(j51Var);
                        int i13 = a61Var.J1;
                        int i14 = R - i13;
                        int i15 = a61Var.K1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = h7.n.a((SystemClock.elapsedRealtime() - a61Var.L1) / a61Var.f(), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j51Var.getPaddingLeft() + ((int) j51Var.getX()), j51Var.getPaddingTop(), (j51Var.getWidth() + ((int) j51Var.getX())) - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                    if (!a61Var.s1 && !z10) {
                        rect.offset(0, (int) j51Var.getTranslationY());
                    }
                    if (j51Var.a) {
                        drawable = a61Var.getPremiumStar();
                        int i16 = a61Var.S;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (j51Var.s || j51Var.M) {
                        ImageReceiver imageReceiver = j51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((j51Var.e != null || a61Var.S == 13) && !j51Var.b && (drawable = j51Var.A) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = a61Var.g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = j51Var.A;
                        if (drawable2 instanceof org.telegram.ui.Components.k5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.M;
                    j51Var.K = f17;
                    j51Var.L = i11;
                    if (scaleX != 1.0f || f17 < 1.0f) {
                        canvas.save();
                        float f18 = j51Var.O;
                        if (f18 > 1.0f && (i10 = a61Var.S) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = a61Var.S;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            j51Var.getHeight();
                            float f19 = this.M;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i11 * 2.0f) / this.K.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, j51Var, f12);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, j51Var, f12);
                    }
                }
                i11++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.P.a3.d0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((j51) arrayList.get(i10)).f[this.G];
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
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f10;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        Drawable premiumStar;
        a61 a61Var = this.P.a3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.K.size()) {
            j51 j51Var = (j51) this.K.get(i13);
            boolean z10 = j51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = j51Var.f;
            if (!z10) {
                if (j51Var.a) {
                    premiumStar = a61Var.getPremiumStar();
                    int i14 = a61Var.S;
                    float f11 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f12 = j51Var.J;
                    if (f12 != 0.0f || j51Var.O > 0.0f) {
                        f11 *= ((1.0f - Math.max(j51Var.O * 0.8f, f12)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (j51Var.getWidth() - j51Var.getPaddingLeft()) - j51Var.getPaddingRight();
                        int height = (j51Var.getHeight() - j51Var.getPaddingTop()) - j51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f13 = width / 2.0f;
                        float f14 = height / 2.0f;
                        rect2.set((int) ((j51Var.getWidth() / 2.0f) - ((j51Var.getScaleX() * f13) * f11)), (int) ((j51Var.getHeight() / 2.0f) - ((j51Var.getScaleY() * f14) * f11)), (int) ((j51Var.getScaleX() * f13 * f11) + (j51Var.getWidth() / 2.0f)), (int) ((j51Var.getScaleY() * f14 * f11) + (j51Var.getHeight() / 2.0f)));
                        rect2.offset(j51Var.getLeft() - this.J, i12);
                        if (j51Var.B == null) {
                            j51Var.B = new Rect();
                        }
                        j51Var.B.set(rect2);
                        j51Var.setDrawable(premiumStar);
                        arrayList.add(j51Var);
                    }
                } else {
                    float f15 = j51Var.J;
                    if (f15 != 0.0f || j51Var.O > 0.0f) {
                        Math.max(j51Var.O * 0.8f, f15);
                    }
                    if (a61Var.L1 > 0) {
                        f10 = 4.0f;
                        if (SystemClock.elapsedRealtime() - a61Var.L1 >= a61Var.g() || a61Var.J1 < 0 || a61Var.K1 < 0 || a61Var.L1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(j51Var);
                            int i15 = a61Var.J1;
                            int i16 = R - i15;
                            int i17 = a61Var.K1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = h7.n.a((SystemClock.elapsedRealtime() - a61Var.L1) / a61Var.f(), 0.0f, 1.0f);
                                float f16 = i16;
                                float f17 = i17;
                                float f18 = f17 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f16, f17, f18);
                                this.O.getInterpolation(AndroidUtilities.cascade(a2, f16, f17, f18));
                                alpha = cascade * 1.0f;
                            }
                            if (!j51Var.s || j51Var.M) {
                                imageReceiver = j51Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (j51Var.e != null) {
                                    Drawable drawable = j51Var.A;
                                    org.telegram.ui.Components.k5 k5Var = drawable instanceof org.telegram.ui.Components.k5 ? (org.telegram.ui.Components.k5) drawable : null;
                                    if (k5Var != null && (imageReceiver = k5Var.k) != null) {
                                        k5Var.setAlpha((int) (alpha * 255.0f));
                                        j51Var.setDrawable(k5Var);
                                        j51Var.A.setColorFilter(a61Var.g1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((a61Var.G1 || (a61Var.H1 && j51Var.H)) ? false : true);
                            if (j51Var.H) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                            }
                            int i18 = this.G;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            j51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                j51Var.r.getLottieAnimation().S(j10);
                            }
                            if (j51Var.r.getAnimation() != null) {
                                j51Var.r.getAnimation().D(j10);
                            }
                            j51Var.getWidth();
                            j51Var.getPaddingLeft();
                            j51Var.getPaddingRight();
                            j51Var.getHeight();
                            j51Var.getPaddingTop();
                            j51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(j51Var.getPaddingLeft(), j51Var.getPaddingTop(), j51Var.getWidth() - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                            if (j51Var.H && (i11 = a61Var.S) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((j51Var.getLeft() + ((int) j51Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            j51Var.K = 1.0f;
                            j51Var.L = i10;
                            arrayList.add(j51Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f10 = 4.0f;
                    }
                    alpha = j51Var.getAlpha() * 1.0f;
                    if (j51Var.s) {
                    }
                    imageReceiver = j51Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((a61Var.G1 || (a61Var.H1 && j51Var.H)) ? false : true);
                    if (j51Var.H) {
                    }
                    int i182 = this.G;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    j51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (j51Var.r.getAnimation() != null) {
                    }
                    j51Var.getWidth();
                    j51Var.getPaddingLeft();
                    j51Var.getPaddingRight();
                    j51Var.getHeight();
                    j51Var.getPaddingTop();
                    j51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(j51Var.getPaddingLeft(), j51Var.getPaddingTop(), j51Var.getWidth() - j51Var.getPaddingRight(), j51Var.getHeight() - j51Var.getPaddingBottom());
                    if (j51Var.H) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((j51Var.getLeft() + ((int) j51Var.getTranslationX())) - this.J, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    j51Var.K = 1.0f;
                    j51Var.L = i10;
                    arrayList.add(j51Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, j51 j51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.a3.g1);
        } else if ((j51Var.s || j51Var.M) && j51Var.h != null) {
            canvas.save();
            canvas.clipRect(j51Var.h.getImageX(), j51Var.h.getImageY(), j51Var.h.getImageX2(), j51Var.h.getImageY2());
            j51Var.h.setAlpha(f10);
            j51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
