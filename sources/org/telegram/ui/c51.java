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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c51 extends org.telegram.ui.Components.vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final /* synthetic */ d51 P;

    public c51(d51 d51Var) {
        this.P = d51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        boolean z10;
        f2.w0 w0Var;
        int i11;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        this.M = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.K.get(0);
            if (view.getY() > (this.P.getHeight() - this.P.getPaddingBottom()) - view.getHeight()) {
                this.M = (g7.n.a((-((view.getY() - this.P.getHeight()) + this.P.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        d51 d51Var = this.P;
        boolean z11 = true;
        boolean z12 = d51Var.a3.S == 13 || this.M < 1.0f || ((w0Var = d51Var.V) != null && w0Var.k()) || this.K.size() <= 4 || !this.N || b61.c(this.P.a3) || (i11 = this.P.a3.S) == 4 || i11 == 6;
        if (!z12) {
            if (this.P.a3.L1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b61 b61Var = this.P.a3;
                if (elapsedRealtime - b61Var.L1 < b61Var.g()) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.K.size(); i12++) {
                        k51 k51Var = (k51) this.K.get(i12);
                        if (k51Var.J != 0.0f || k51Var.O != 0.0f || k51Var.E != null || k51Var.getTranslationX() != 0.0f || k51Var.getTranslationY() != 0.0f || k51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i13 = k51Var.c;
                            b61 b61Var2 = this.P.a3;
                            if (i13 > b61Var2.J1 && i13 < b61Var2.K1) {
                                break;
                            }
                        }
                        if (k51Var.M) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i12 < this.K.size()) {
            }
        }
        z11 = z12;
        float f11 = hg.h0.b ? 1.0f : f10;
        if (!z11 && !hg.h0.e) {
            super.a(canvas, j10, i9, i10, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.vs
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                return;
            }
            k51 k51Var = (k51) arrayList.get(i9);
            if (!k51Var.b) {
                if (k51Var.a) {
                    k51Var.A.setBounds(k51Var.B);
                    k51Var.A.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = k51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, k51Var.f[this.G]);
                    }
                }
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i9;
        b61 b61Var = this.P.a3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f10;
            int i10 = 0;
            while (i10 < this.K.size()) {
                k51 k51Var = (k51) this.K.get(i10);
                if (!k51Var.b) {
                    float scaleX = k51Var.getScaleX();
                    int i11 = b61Var.S;
                    if (i11 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = k51Var.J;
                    if (f13 != f11 || (k51Var.O > f11 && i11 != 3 && i11 != 4)) {
                        scaleX *= ((1.0f - Math.max((i11 == 3 || i11 == 4) ? 1.0f : k51Var.O * 0.7f, f13)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = b61Var.L1 > 0 && SystemClock.elapsedRealtime() - b61Var.L1 < b61Var.g();
                    if (!z10 || b61Var.J1 < 0 || b61Var.K1 < 0 || b61Var.L1 <= 0) {
                        f12 *= k51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(k51Var);
                        int i12 = b61Var.J1;
                        int i13 = R - i12;
                        int i14 = b61Var.K1 - i12;
                        if (i13 >= 0 && i13 < i14) {
                            float a2 = g7.n.a((SystemClock.elapsedRealtime() - b61Var.L1) / b61Var.f(), 0.0f, 1.0f);
                            float f14 = i13;
                            float f15 = i14;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(k51Var.getPaddingLeft() + ((int) k51Var.getX()), k51Var.getPaddingTop(), (k51Var.getWidth() + ((int) k51Var.getX())) - k51Var.getPaddingRight(), k51Var.getHeight() - k51Var.getPaddingBottom());
                    if (!b61Var.s1 && !z10) {
                        rect.offset(0, (int) k51Var.getTranslationY());
                    }
                    if (k51Var.a) {
                        drawable = b61Var.getPremiumStar();
                        int i15 = b61Var.S;
                        if (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (k51Var.s || k51Var.M) {
                        ImageReceiver imageReceiver = k51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((k51Var.e != null || b61Var.S == 13) && !k51Var.b && (drawable = k51Var.A) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = b61Var.g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = k51Var.A;
                        if (drawable2 instanceof org.telegram.ui.Components.k5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.M;
                    k51Var.K = f17;
                    k51Var.L = i10;
                    if (scaleX != 1.0f || f17 < 1.0f) {
                        canvas.save();
                        float f18 = k51Var.O;
                        if (f18 > 1.0f && (i9 = b61Var.S) != 3 && i9 != 4 && i9 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i16 = b61Var.S;
                        if (i16 == 6 || i16 == 13 || i16 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            k51Var.getHeight();
                            float f19 = this.M;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i10 * 2.0f) / this.K.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, k51Var, f12);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, k51Var, f12);
                    }
                }
                i10++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                this.P.a3.d0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((k51) arrayList.get(i9)).f[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    @Override // org.telegram.ui.Components.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i9;
        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr;
        float f10;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        Drawable premiumStar;
        b61 b61Var = this.P.a3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.K.size()) {
            k51 k51Var = (k51) this.K.get(i12);
            boolean z10 = k51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = k51Var.f;
            if (!z10) {
                if (k51Var.a) {
                    premiumStar = b61Var.getPremiumStar();
                    int i13 = b61Var.S;
                    float f11 = (i13 == 5 || i13 == 10 || i13 == 9 || i13 == 7) ? 1.3f : 1.0f;
                    float f12 = k51Var.J;
                    if (f12 != 0.0f || k51Var.O > 0.0f) {
                        f11 *= ((1.0f - Math.max(k51Var.O * 0.8f, f12)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (k51Var.getWidth() - k51Var.getPaddingLeft()) - k51Var.getPaddingRight();
                        int height = (k51Var.getHeight() - k51Var.getPaddingTop()) - k51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f13 = width / 2.0f;
                        float f14 = height / 2.0f;
                        rect2.set((int) ((k51Var.getWidth() / 2.0f) - ((k51Var.getScaleX() * f13) * f11)), (int) ((k51Var.getHeight() / 2.0f) - ((k51Var.getScaleY() * f14) * f11)), (int) ((k51Var.getScaleX() * f13 * f11) + (k51Var.getWidth() / 2.0f)), (int) ((k51Var.getScaleY() * f14 * f11) + (k51Var.getHeight() / 2.0f)));
                        rect2.offset(k51Var.getLeft() - this.J, i11);
                        if (k51Var.B == null) {
                            k51Var.B = new Rect();
                        }
                        k51Var.B.set(rect2);
                        k51Var.setDrawable(premiumStar);
                        arrayList.add(k51Var);
                    }
                } else {
                    float f15 = k51Var.J;
                    if (f15 != 0.0f || k51Var.O > 0.0f) {
                        Math.max(k51Var.O * 0.8f, f15);
                    }
                    if (b61Var.L1 > 0) {
                        f10 = 4.0f;
                        if (SystemClock.elapsedRealtime() - b61Var.L1 >= b61Var.g() || b61Var.J1 < 0 || b61Var.K1 < 0 || b61Var.L1 <= 0) {
                            i9 = i12;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(k51Var);
                            int i14 = b61Var.J1;
                            int i15 = R - i14;
                            int i16 = b61Var.K1 - i14;
                            if (i15 < 0 || i15 >= i16) {
                                i9 = i12;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i9 = i12;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = g7.n.a((SystemClock.elapsedRealtime() - b61Var.L1) / b61Var.f(), 0.0f, 1.0f);
                                float f16 = i15;
                                float f17 = i16;
                                float f18 = f17 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f16, f17, f18);
                                this.O.getInterpolation(AndroidUtilities.cascade(a2, f16, f17, f18));
                                alpha = cascade * 1.0f;
                            }
                            if (!k51Var.s || k51Var.M) {
                                imageReceiver = k51Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (k51Var.e != null) {
                                    Drawable drawable = k51Var.A;
                                    org.telegram.ui.Components.k5 k5Var = drawable instanceof org.telegram.ui.Components.k5 ? (org.telegram.ui.Components.k5) drawable : null;
                                    if (k5Var != null && (imageReceiver = k5Var.k) != null) {
                                        k5Var.setAlpha((int) (alpha * 255.0f));
                                        k51Var.setDrawable(k5Var);
                                        k51Var.A.setColorFilter(b61Var.g1);
                                    }
                                }
                                i12 = i9 + 1;
                                i11 = 0;
                            }
                            imageReceiver.setEmojiPaused((b61Var.G1 || (b61Var.H1 && k51Var.H)) ? false : true);
                            if (k51Var.H) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                            }
                            int i17 = this.G;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i17], i17);
                            backgroundThreadDrawHolderArr[i17] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            k51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                k51Var.r.getLottieAnimation().S(j10);
                            }
                            if (k51Var.r.getAnimation() != null) {
                                k51Var.r.getAnimation().D(j10);
                            }
                            k51Var.getWidth();
                            k51Var.getPaddingLeft();
                            k51Var.getPaddingRight();
                            k51Var.getHeight();
                            k51Var.getPaddingTop();
                            k51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(k51Var.getPaddingLeft(), k51Var.getPaddingTop(), k51Var.getWidth() - k51Var.getPaddingRight(), k51Var.getHeight() - k51Var.getPaddingBottom());
                            if (k51Var.H && (i10 = b61Var.S) != 3 && i10 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((k51Var.getLeft() + ((int) k51Var.getTranslationX())) - this.J, 0);
                            backgroundThreadDrawHolderArr[i17].setBounds(rect);
                            k51Var.K = 1.0f;
                            k51Var.L = i9;
                            arrayList.add(k51Var);
                            i12 = i9 + 1;
                            i11 = 0;
                        }
                    } else {
                        i9 = i12;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f10 = 4.0f;
                    }
                    alpha = k51Var.getAlpha() * 1.0f;
                    if (k51Var.s) {
                    }
                    imageReceiver = k51Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((b61Var.G1 || (b61Var.H1 && k51Var.H)) ? false : true);
                    if (k51Var.H) {
                    }
                    int i172 = this.G;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i172], i172);
                    backgroundThreadDrawHolderArr[i172] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    k51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (k51Var.r.getAnimation() != null) {
                    }
                    k51Var.getWidth();
                    k51Var.getPaddingLeft();
                    k51Var.getPaddingRight();
                    k51Var.getHeight();
                    k51Var.getPaddingTop();
                    k51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(k51Var.getPaddingLeft(), k51Var.getPaddingTop(), k51Var.getWidth() - k51Var.getPaddingRight(), k51Var.getHeight() - k51Var.getPaddingBottom());
                    if (k51Var.H) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((k51Var.getLeft() + ((int) k51Var.getTranslationX())) - this.J, 0);
                    backgroundThreadDrawHolderArr[i172].setBounds(rect);
                    k51Var.K = 1.0f;
                    k51Var.L = i9;
                    arrayList.add(k51Var);
                    i12 = i9 + 1;
                    i11 = 0;
                }
            }
            i9 = i12;
            i12 = i9 + 1;
            i11 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, k51 k51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.a3.g1);
        } else if ((k51Var.s || k51Var.M) && k51Var.h != null) {
            canvas.save();
            canvas.clipRect(k51Var.h.getImageX(), k51Var.h.getImageY(), k51Var.h.getImageX2(), k51Var.h.getImageY2());
            k51Var.h.setAlpha(f10);
            k51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
