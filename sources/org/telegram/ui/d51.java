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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d51 extends org.telegram.ui.Components.st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ e51 T;

    public d51(e51 e51Var) {
        this.T = e51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        int i12;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        this.Q = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.O.get(0);
            if (view.getY() > (this.T.getHeight() - this.T.getPaddingBottom()) - view.getHeight()) {
                this.Q = (a8.ee.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        e51 e51Var = this.T;
        boolean z11 = true;
        boolean z12 = e51Var.m3.W == 13 || this.Q < 1.0f || e51Var.b0() || this.O.size() <= 4 || !this.R || c61.c(this.T.m3) || (i12 = this.T.m3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.m3.Q1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c61 c61Var = this.T.m3;
                if (elapsedRealtime - c61Var.Q1 < c61Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        l51 l51Var = (l51) this.O.get(i13);
                        if (l51Var.N != 0.0f || l51Var.S != 0.0f || l51Var.I != null || l51Var.getTranslationX() != 0.0f || l51Var.getTranslationY() != 0.0f || l51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = l51Var.c;
                            c61 c61Var2 = this.T.m3;
                            if (i14 > c61Var2.O1 && i14 < c61Var2.P1) {
                                break;
                            }
                        }
                        if (l51Var.Q) {
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
        float f10 = bh.m0.b ? 1.0f : f7;
        if (!z11 && !bh.m0.e) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.st
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.st
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            l51 l51Var = (l51) arrayList.get(i10);
            if (!l51Var.b) {
                if (l51Var.a) {
                    l51Var.E.setBounds(l51Var.F);
                    l51Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = l51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, l51Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        c61 c61Var = this.T.m3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f10 = f7;
            int i12 = 0;
            while (i12 < this.O.size()) {
                l51 l51Var = (l51) this.O.get(i12);
                if (!l51Var.b) {
                    float scaleX = l51Var.getScaleX();
                    int i13 = c61Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f11 = l51Var.N;
                    if (f11 != 0.0f || (l51Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        scaleX *= ((1.0f - Math.max((i13 == 3 || i13 == 4) ? 1.0f : l51Var.S * 0.7f, f11)) * 0.2f) + 0.8f;
                    }
                    int i14 = (c61Var.Q1 <= 0 || SystemClock.elapsedRealtime() - c61Var.Q1 >= c61Var.g()) ? i11 : 1;
                    if (i14 == 0 || c61Var.O1 < 0 || c61Var.P1 < 0 || c61Var.Q1 <= 0) {
                        f10 *= l51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(l51Var);
                        int i15 = c61Var.O1;
                        int i16 = R - i15;
                        int i17 = c61Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = a8.ee.a((SystemClock.elapsedRealtime() - c61Var.Q1) / c61Var.f(), 0.0f, 1.0f);
                            float f12 = i16;
                            float f13 = i17;
                            float f14 = f13 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f12, f13, f14);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f12, f13, f14)) * 0.5f) + 0.5f;
                            f10 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(l51Var.getPaddingLeft() + ((int) l51Var.getX()), l51Var.getPaddingTop(), (l51Var.getWidth() + ((int) l51Var.getX())) - l51Var.getPaddingRight(), l51Var.getHeight() - l51Var.getPaddingBottom());
                    if (!c61Var.x1 && i14 == 0) {
                        rect.offset(i11, (int) l51Var.getTranslationY());
                    }
                    if (l51Var.a) {
                        drawable = c61Var.getPremiumStar();
                        int i18 = c61Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (l51Var.s || l51Var.Q) {
                        ImageReceiver imageReceiver = l51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((l51Var.e != null || c61Var.W == 13) && !l51Var.b && (drawable = l51Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = c61Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = l51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.t5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f15 = this.Q;
                    l51Var.O = f15;
                    l51Var.P = i12;
                    if (scaleX != 1.0f || f15 < 1.0f) {
                        canvas.save();
                        float f16 = l51Var.S;
                        if (f16 > 1.0f && (i10 = c61Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f16);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = c61Var.W;
                        if (i19 == 6 || i19 == 13 || i19 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            l51Var.getHeight();
                            float f17 = this.Q;
                            if (f17 < 1.0f) {
                                canvas.scale(1.0f, f17, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, l51Var, f10);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, l51Var, f10);
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.m3.h0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((l51) arrayList.get(i10)).f[this.K];
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
    @Override // org.telegram.ui.Components.st
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
        c61 c61Var = this.T.m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.O.size()) {
            l51 l51Var = (l51) this.O.get(i15);
            boolean z10 = l51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = l51Var.f;
            if (!z10) {
                if (l51Var.a) {
                    premiumStar = c61Var.getPremiumStar();
                    int i16 = c61Var.W;
                    float f7 = (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) ? 1.3f : 1.0f;
                    float f10 = l51Var.N;
                    if (f10 != 0.0f || l51Var.S > 0.0f) {
                        f7 *= ((1.0f - Math.max(l51Var.S * 0.8f, f10)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (l51Var.getWidth() - l51Var.getPaddingLeft()) - l51Var.getPaddingRight();
                        int height = (l51Var.getHeight() - l51Var.getPaddingTop()) - l51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f11 = width / 2.0f;
                        float f12 = height / 2.0f;
                        rect2.set((int) ((l51Var.getWidth() / 2.0f) - ((l51Var.getScaleX() * f11) * f7)), (int) ((l51Var.getHeight() / 2.0f) - ((l51Var.getScaleY() * f12) * f7)), (int) ((l51Var.getScaleX() * f11 * f7) + (l51Var.getWidth() / 2.0f)), (int) ((l51Var.getScaleY() * f12 * f7) + (l51Var.getHeight() / 2.0f)));
                        rect2.offset(l51Var.getLeft() - this.N, i14);
                        if (l51Var.F == null) {
                            l51Var.F = new Rect();
                        }
                        l51Var.F.set(rect2);
                        l51Var.setDrawable(premiumStar);
                        arrayList.add(l51Var);
                    }
                } else {
                    float f13 = l51Var.N;
                    if (f13 != 0.0f || l51Var.S > 0.0f) {
                        Math.max(l51Var.S * 0.8f, f13);
                    }
                    if (c61Var.Q1 > 0) {
                        int i17 = i15;
                        if (SystemClock.elapsedRealtime() - c61Var.Q1 >= c61Var.g() || c61Var.O1 < 0 || c61Var.P1 < 0 || c61Var.Q1 <= 0) {
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                            i10 = i17;
                        } else {
                            int R = RecyclerView.R(l51Var);
                            int i18 = c61Var.O1;
                            int i19 = R - i18;
                            int i20 = c61Var.P1 - i18;
                            if (i19 < 0 || i19 >= i20) {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                alpha = 1.0f;
                            } else {
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                i10 = i17;
                                float a2 = a8.ee.a((SystemClock.elapsedRealtime() - c61Var.Q1) / c61Var.f(), 0.0f, 1.0f);
                                float f14 = i19;
                                float f15 = i20;
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16));
                                alpha = cascade * 1.0f;
                            }
                            if (!l51Var.s || l51Var.Q) {
                                ImageReceiver imageReceiver2 = l51Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (l51Var.e != null) {
                                    Drawable drawable = l51Var.E;
                                    org.telegram.ui.Components.t5 t5Var = drawable instanceof org.telegram.ui.Components.t5 ? (org.telegram.ui.Components.t5) drawable : null;
                                    if (t5Var != null && (imageReceiver2 = t5Var.k) != null) {
                                        t5Var.setAlpha((int) (alpha * 255.0f));
                                        l51Var.setDrawable(t5Var);
                                        l51Var.E.setColorFilter(c61Var.k1);
                                    }
                                }
                                i12 = i10;
                                i11 = 0;
                                i15 = i12 + 1;
                                i14 = i11;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.setEmojiPaused((c61Var.L1 || (c61Var.M1 && l51Var.L)) ? false : true);
                            if (l51Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
                            }
                            int i21 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i21], i21);
                            backgroundThreadDrawHolderArr[i21] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            l51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                l51Var.r.getLottieAnimation().V(j10);
                            }
                            if (l51Var.r.getAnimation() != null) {
                                l51Var.r.getAnimation().D(j10);
                            }
                            l51Var.getWidth();
                            l51Var.getPaddingLeft();
                            l51Var.getPaddingRight();
                            l51Var.getHeight();
                            l51Var.getPaddingTop();
                            l51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(l51Var.getPaddingLeft(), l51Var.getPaddingTop(), l51Var.getWidth() - l51Var.getPaddingRight(), l51Var.getHeight() - l51Var.getPaddingBottom());
                            if (l51Var.L && (i13 = c61Var.W) != 3 && i13 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i11 = 0;
                            rect.offset((l51Var.getLeft() + ((int) l51Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i21].setBounds(rect);
                            l51Var.O = 1.0f;
                            i12 = i10;
                            l51Var.P = i12;
                            arrayList.add(l51Var);
                            i15 = i12 + 1;
                            i14 = i11;
                        }
                    } else {
                        i10 = i15;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                    }
                    alpha = l51Var.getAlpha() * 1.0f;
                    if (l51Var.s) {
                    }
                    ImageReceiver imageReceiver22 = l51Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.setEmojiPaused((c61Var.L1 || (c61Var.M1 && l51Var.L)) ? false : true);
                    if (l51Var.L) {
                    }
                    int i212 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i212], i212);
                    backgroundThreadDrawHolderArr[i212] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    l51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (l51Var.r.getAnimation() != null) {
                    }
                    l51Var.getWidth();
                    l51Var.getPaddingLeft();
                    l51Var.getPaddingRight();
                    l51Var.getHeight();
                    l51Var.getPaddingTop();
                    l51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(l51Var.getPaddingLeft(), l51Var.getPaddingTop(), l51Var.getWidth() - l51Var.getPaddingRight(), l51Var.getHeight() - l51Var.getPaddingBottom());
                    if (l51Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i11 = 0;
                    rect.offset((l51Var.getLeft() + ((int) l51Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i212].setBounds(rect);
                    l51Var.O = 1.0f;
                    i12 = i10;
                    l51Var.P = i12;
                    arrayList.add(l51Var);
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

    public final void m(Canvas canvas, Drawable drawable, l51 l51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.m3.k1);
        } else if ((l51Var.s || l51Var.Q) && l51Var.h != null) {
            canvas.save();
            canvas.clipRect(l51Var.h.getImageX(), l51Var.h.getImageY(), l51Var.h.getImageX2(), l51Var.h.getImageY2());
            l51Var.h.setAlpha(f7);
            l51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
