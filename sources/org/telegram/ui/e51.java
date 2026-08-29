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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e51 extends org.telegram.ui.Components.at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final /* synthetic */ f51 P;

    public e51(f51 f51Var) {
        this.P = f51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        boolean z10;
        f2.u0 u0Var;
        int i12;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        this.M = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.K.get(0);
            if (view.getY() > (this.P.getHeight() - this.P.getPaddingBottom()) - view.getHeight()) {
                this.M = (i7.w.a((-((view.getY() - this.P.getHeight()) + this.P.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        f51 f51Var = this.P;
        boolean z11 = true;
        boolean z12 = f51Var.a3.S == 13 || this.M < 1.0f || ((u0Var = f51Var.V) != null && u0Var.k()) || this.K.size() <= 4 || !this.N || d61.c(this.P.a3) || (i12 = this.P.a3.S) == 4 || i12 == 6;
        if (!z12) {
            if (this.P.a3.L1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                d61 d61Var = this.P.a3;
                if (elapsedRealtime - d61Var.L1 < d61Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.K.size(); i13++) {
                        m51 m51Var = (m51) this.K.get(i13);
                        if (m51Var.J != 0.0f || m51Var.O != 0.0f || m51Var.E != null || m51Var.getTranslationX() != 0.0f || m51Var.getTranslationY() != 0.0f || m51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = m51Var.c;
                            d61 d61Var2 = this.P.a3;
                            if (i14 > d61Var2.J1 && i14 < d61Var2.K1) {
                                break;
                            }
                        }
                        if (m51Var.M) {
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
        float f10 = kg.g0.b ? 1.0f : f9;
        if (!z11 && !kg.g0.e) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.at
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.at
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            m51 m51Var = (m51) arrayList.get(i10);
            if (!m51Var.b) {
                if (m51Var.a) {
                    m51Var.A.setBounds(m51Var.B);
                    m51Var.A.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = m51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, m51Var.f[this.G]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void d(Canvas canvas, float f9) {
        Drawable drawable;
        int i10;
        d61 d61Var = this.P.a3;
        if (this.K != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f11 = f9;
            int i11 = 0;
            while (i11 < this.K.size()) {
                m51 m51Var = (m51) this.K.get(i11);
                if (!m51Var.b) {
                    float scaleX = m51Var.getScaleX();
                    int i12 = d61Var.S;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = m51Var.J;
                    if (f12 != f10 || (m51Var.O > f10 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : m51Var.O * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = d61Var.L1 > 0 && SystemClock.elapsedRealtime() - d61Var.L1 < d61Var.g();
                    if (!z10 || d61Var.J1 < 0 || d61Var.K1 < 0 || d61Var.L1 <= 0) {
                        f11 *= m51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(m51Var);
                        int i13 = d61Var.J1;
                        int i14 = R - i13;
                        int i15 = d61Var.K1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = i7.w.a((SystemClock.elapsedRealtime() - d61Var.L1) / d61Var.f(), 0.0f, 1.0f);
                            float f13 = i14;
                            float f14 = i15;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(m51Var.getPaddingLeft() + ((int) m51Var.getX()), m51Var.getPaddingTop(), (m51Var.getWidth() + ((int) m51Var.getX())) - m51Var.getPaddingRight(), m51Var.getHeight() - m51Var.getPaddingBottom());
                    if (!d61Var.s1 && !z10) {
                        rect.offset(0, (int) m51Var.getTranslationY());
                    }
                    if (m51Var.a) {
                        drawable = d61Var.getPremiumStar();
                        int i16 = d61Var.S;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (m51Var.s || m51Var.M) {
                        ImageReceiver imageReceiver = m51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((m51Var.e != null || d61Var.S == 13) && !m51Var.b && (drawable = m51Var.A) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = d61Var.g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = m51Var.A;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.M;
                    m51Var.K = f16;
                    m51Var.L = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = m51Var.O;
                        if (f17 > 1.0f && (i10 = d61Var.S) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = d61Var.S;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            m51Var.getHeight();
                            float f18 = this.M;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i11 * 2.0f) / this.K.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, m51Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, m51Var, f11);
                    }
                }
                i11++;
                f10 = 0.0f;
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
                this.P.a3.d0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m51) arrayList.get(i10)).f[this.G];
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
    @Override // org.telegram.ui.Components.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f9;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        Drawable premiumStar;
        d61 d61Var = this.P.a3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.K.size()) {
            m51 m51Var = (m51) this.K.get(i13);
            boolean z10 = m51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = m51Var.f;
            if (!z10) {
                if (m51Var.a) {
                    premiumStar = d61Var.getPremiumStar();
                    int i14 = d61Var.S;
                    float f10 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f11 = m51Var.J;
                    if (f11 != 0.0f || m51Var.O > 0.0f) {
                        f10 *= ((1.0f - Math.max(m51Var.O * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (m51Var.getWidth() - m51Var.getPaddingLeft()) - m51Var.getPaddingRight();
                        int height = (m51Var.getHeight() - m51Var.getPaddingTop()) - m51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((m51Var.getWidth() / 2.0f) - ((m51Var.getScaleX() * f12) * f10)), (int) ((m51Var.getHeight() / 2.0f) - ((m51Var.getScaleY() * f13) * f10)), (int) ((m51Var.getScaleX() * f12 * f10) + (m51Var.getWidth() / 2.0f)), (int) ((m51Var.getScaleY() * f13 * f10) + (m51Var.getHeight() / 2.0f)));
                        rect2.offset(m51Var.getLeft() - this.J, i12);
                        if (m51Var.B == null) {
                            m51Var.B = new Rect();
                        }
                        m51Var.B.set(rect2);
                        m51Var.setDrawable(premiumStar);
                        arrayList.add(m51Var);
                    }
                } else {
                    float f14 = m51Var.J;
                    if (f14 != 0.0f || m51Var.O > 0.0f) {
                        Math.max(m51Var.O * 0.8f, f14);
                    }
                    if (d61Var.L1 > 0) {
                        f9 = 4.0f;
                        if (SystemClock.elapsedRealtime() - d61Var.L1 >= d61Var.g() || d61Var.J1 < 0 || d61Var.K1 < 0 || d61Var.L1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(m51Var);
                            int i15 = d61Var.J1;
                            int i16 = R - i15;
                            int i17 = d61Var.K1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = i7.w.a((SystemClock.elapsedRealtime() - d61Var.L1) / d61Var.f(), 0.0f, 1.0f);
                                float f15 = i16;
                                float f16 = i17;
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                                this.O.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17));
                                alpha = cascade * 1.0f;
                            }
                            if (!m51Var.s || m51Var.M) {
                                imageReceiver = m51Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (m51Var.e != null) {
                                    Drawable drawable = m51Var.A;
                                    org.telegram.ui.Components.p5 p5Var = drawable instanceof org.telegram.ui.Components.p5 ? (org.telegram.ui.Components.p5) drawable : null;
                                    if (p5Var != null && (imageReceiver = p5Var.k) != null) {
                                        p5Var.setAlpha((int) (alpha * 255.0f));
                                        m51Var.setDrawable(p5Var);
                                        m51Var.A.setColorFilter(d61Var.g1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((d61Var.G1 || (d61Var.H1 && m51Var.H)) ? false : true);
                            if (m51Var.H) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f9));
                            }
                            int i18 = this.G;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            m51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                m51Var.r.getLottieAnimation().S(j10);
                            }
                            if (m51Var.r.getAnimation() != null) {
                                m51Var.r.getAnimation().D(j10);
                            }
                            m51Var.getWidth();
                            m51Var.getPaddingLeft();
                            m51Var.getPaddingRight();
                            m51Var.getHeight();
                            m51Var.getPaddingTop();
                            m51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(m51Var.getPaddingLeft(), m51Var.getPaddingTop(), m51Var.getWidth() - m51Var.getPaddingRight(), m51Var.getHeight() - m51Var.getPaddingBottom());
                            if (m51Var.H && (i11 = d61Var.S) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((m51Var.getLeft() + ((int) m51Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            m51Var.K = 1.0f;
                            m51Var.L = i10;
                            arrayList.add(m51Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f9 = 4.0f;
                    }
                    alpha = m51Var.getAlpha() * 1.0f;
                    if (m51Var.s) {
                    }
                    imageReceiver = m51Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((d61Var.G1 || (d61Var.H1 && m51Var.H)) ? false : true);
                    if (m51Var.H) {
                    }
                    int i182 = this.G;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    m51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (m51Var.r.getAnimation() != null) {
                    }
                    m51Var.getWidth();
                    m51Var.getPaddingLeft();
                    m51Var.getPaddingRight();
                    m51Var.getHeight();
                    m51Var.getPaddingTop();
                    m51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(m51Var.getPaddingLeft(), m51Var.getPaddingTop(), m51Var.getWidth() - m51Var.getPaddingRight(), m51Var.getHeight() - m51Var.getPaddingBottom());
                    if (m51Var.H) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((m51Var.getLeft() + ((int) m51Var.getTranslationX())) - this.J, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    m51Var.K = 1.0f;
                    m51Var.L = i10;
                    arrayList.add(m51Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, m51 m51Var, float f9) {
        if (drawable != null) {
            drawable.setAlpha((int) (f9 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.a3.g1);
        } else if ((m51Var.s || m51Var.M) && m51Var.h != null) {
            canvas.save();
            canvas.clipRect(m51Var.h.getImageX(), m51Var.h.getImageY(), m51Var.h.getImageX2(), m51Var.h.getImageY2());
            m51Var.h.setAlpha(f9);
            m51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
