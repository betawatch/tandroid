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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a61 extends org.telegram.ui.Components.jt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ b61 T;

    public a61(b61 b61Var) {
        this.T = b61Var;
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
                this.Q = (w7.p.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        b61 b61Var = this.T;
        boolean z11 = true;
        boolean z12 = b61Var.e3.W == 13 || this.Q < 1.0f || ((m0Var = b61Var.c0) != null && m0Var.k()) || this.O.size() <= 4 || !this.R || z61.c(this.T.e3) || (i12 = this.T.e3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.e3.P1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z61 z61Var = this.T.e3;
                if (elapsedRealtime - z61Var.P1 < z61Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        i61 i61Var = (i61) this.O.get(i13);
                        if (i61Var.N != 0.0f || i61Var.S != 0.0f || i61Var.I != null || i61Var.getTranslationX() != 0.0f || i61Var.getTranslationY() != 0.0f || i61Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = i61Var.c;
                            z61 z61Var2 = this.T.e3;
                            if (i14 > z61Var2.N1 && i14 < z61Var2.O1) {
                                break;
                            }
                        }
                        if (i61Var.Q) {
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
            i61 i61Var = (i61) arrayList.get(i10);
            if (!i61Var.b) {
                if (i61Var.a) {
                    i61Var.E.setBounds(i61Var.F);
                    i61Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = i61Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, i61Var.f[this.K]);
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
        z61 z61Var = this.T.e3;
        if (this.O != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                i61 i61Var = (i61) this.O.get(i11);
                if (!i61Var.b) {
                    float scaleX = i61Var.getScaleX();
                    int i12 = z61Var.W;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = i61Var.N;
                    if (f12 != f10 || (i61Var.S > f10 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : i61Var.S * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    boolean z10 = z61Var.P1 > 0 && SystemClock.elapsedRealtime() - z61Var.P1 < z61Var.g();
                    if (!z10 || z61Var.N1 < 0 || z61Var.O1 < 0 || z61Var.P1 <= 0) {
                        f11 *= i61Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(i61Var);
                        int i13 = z61Var.N1;
                        int i14 = R - i13;
                        int i15 = z61Var.O1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = w7.p.a((SystemClock.elapsedRealtime() - z61Var.P1) / z61Var.f(), 0.0f, 1.0f);
                            float f13 = i14;
                            float f14 = i15;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i61Var.getPaddingLeft() + ((int) i61Var.getX()), i61Var.getPaddingTop(), (i61Var.getWidth() + ((int) i61Var.getX())) - i61Var.getPaddingRight(), i61Var.getHeight() - i61Var.getPaddingBottom());
                    if (!z61Var.w1 && !z10) {
                        rect.offset(0, (int) i61Var.getTranslationY());
                    }
                    if (i61Var.a) {
                        drawable = z61Var.getPremiumStar();
                        int i16 = z61Var.W;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (i61Var.s || i61Var.Q) {
                        ImageReceiver imageReceiver = i61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((i61Var.e != null || z61Var.W == 13) && !i61Var.b && (drawable = i61Var.E) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = z61Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = i61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.q5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    i61Var.O = f16;
                    i61Var.P = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = i61Var.S;
                        if (f17 > 1.0f && (i10 = z61Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = z61Var.W;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            i61Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i11 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, i61Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, i61Var, f11);
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
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((i61) arrayList.get(i10)).f[this.K];
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
        z61 z61Var = this.T.e3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.O.size()) {
            i61 i61Var = (i61) this.O.get(i13);
            boolean z10 = i61Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = i61Var.f;
            if (!z10) {
                if (i61Var.a) {
                    premiumStar = z61Var.getPremiumStar();
                    int i14 = z61Var.W;
                    float f10 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f11 = i61Var.N;
                    if (f11 != 0.0f || i61Var.S > 0.0f) {
                        f10 *= ((1.0f - Math.max(i61Var.S * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (i61Var.getWidth() - i61Var.getPaddingLeft()) - i61Var.getPaddingRight();
                        int height = (i61Var.getHeight() - i61Var.getPaddingTop()) - i61Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((i61Var.getWidth() / 2.0f) - ((i61Var.getScaleX() * f12) * f10)), (int) ((i61Var.getHeight() / 2.0f) - ((i61Var.getScaleY() * f13) * f10)), (int) ((i61Var.getScaleX() * f12 * f10) + (i61Var.getWidth() / 2.0f)), (int) ((i61Var.getScaleY() * f13 * f10) + (i61Var.getHeight() / 2.0f)));
                        rect2.offset(i61Var.getLeft() - this.N, i12);
                        if (i61Var.F == null) {
                            i61Var.F = new Rect();
                        }
                        i61Var.F.set(rect2);
                        i61Var.setDrawable(premiumStar);
                        arrayList.add(i61Var);
                    }
                } else {
                    float f14 = i61Var.N;
                    if (f14 != 0.0f || i61Var.S > 0.0f) {
                        Math.max(i61Var.S * 0.8f, f14);
                    }
                    if (z61Var.P1 > 0) {
                        f7 = 4.0f;
                        if (SystemClock.elapsedRealtime() - z61Var.P1 >= z61Var.g() || z61Var.N1 < 0 || z61Var.O1 < 0 || z61Var.P1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(i61Var);
                            int i15 = z61Var.N1;
                            int i16 = R - i15;
                            int i17 = z61Var.O1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = w7.p.a((SystemClock.elapsedRealtime() - z61Var.P1) / z61Var.f(), 0.0f, 1.0f);
                                float f15 = i16;
                                float f16 = i17;
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                                this.S.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17));
                                alpha = cascade * 1.0f;
                            }
                            if (!i61Var.s || i61Var.Q) {
                                imageReceiver = i61Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (i61Var.e != null) {
                                    Drawable drawable = i61Var.E;
                                    org.telegram.ui.Components.q5 q5Var = drawable instanceof org.telegram.ui.Components.q5 ? (org.telegram.ui.Components.q5) drawable : null;
                                    if (q5Var != null && (imageReceiver = q5Var.k) != null) {
                                        q5Var.setAlpha((int) (alpha * 255.0f));
                                        i61Var.setDrawable(q5Var);
                                        i61Var.E.setColorFilter(z61Var.k1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((z61Var.K1 || (z61Var.L1 && i61Var.L)) ? false : true);
                            if (i61Var.L) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                            }
                            int i18 = this.K;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j3;
                            i61Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                i61Var.r.getLottieAnimation().V(j3);
                            }
                            if (i61Var.r.getAnimation() != null) {
                                i61Var.r.getAnimation().D(j3);
                            }
                            i61Var.getWidth();
                            i61Var.getPaddingLeft();
                            i61Var.getPaddingRight();
                            i61Var.getHeight();
                            i61Var.getPaddingTop();
                            i61Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(i61Var.getPaddingLeft(), i61Var.getPaddingTop(), i61Var.getWidth() - i61Var.getPaddingRight(), i61Var.getHeight() - i61Var.getPaddingBottom());
                            if (i61Var.L && (i11 = z61Var.W) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((i61Var.getLeft() + ((int) i61Var.getTranslationX())) - this.N, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            i61Var.O = 1.0f;
                            i61Var.P = i10;
                            arrayList.add(i61Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f7 = 4.0f;
                    }
                    alpha = i61Var.getAlpha() * 1.0f;
                    if (i61Var.s) {
                    }
                    imageReceiver = i61Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((z61Var.K1 || (z61Var.L1 && i61Var.L)) ? false : true);
                    if (i61Var.L) {
                    }
                    int i182 = this.K;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j3;
                    i61Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (i61Var.r.getAnimation() != null) {
                    }
                    i61Var.getWidth();
                    i61Var.getPaddingLeft();
                    i61Var.getPaddingRight();
                    i61Var.getHeight();
                    i61Var.getPaddingTop();
                    i61Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(i61Var.getPaddingLeft(), i61Var.getPaddingTop(), i61Var.getWidth() - i61Var.getPaddingRight(), i61Var.getHeight() - i61Var.getPaddingBottom());
                    if (i61Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((i61Var.getLeft() + ((int) i61Var.getTranslationX())) - this.N, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    i61Var.O = 1.0f;
                    i61Var.P = i10;
                    arrayList.add(i61Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, i61 i61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.e3.k1);
        } else if ((i61Var.s || i61Var.Q) && i61Var.h != null) {
            canvas.save();
            canvas.clipRect(i61Var.h.getImageX(), i61Var.h.getImageY(), i61Var.h.getImageX2(), i61Var.h.getImageY2());
            i61Var.h.setAlpha(f7);
            i61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
