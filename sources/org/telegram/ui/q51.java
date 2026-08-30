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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q51 extends org.telegram.ui.Components.et {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public float N = 1.0f;
    public final boolean O = LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
    public final OvershootInterpolator P = new OvershootInterpolator(3.0f);
    public final /* synthetic */ r51 Q;

    public q51(r51 r51Var) {
        this.Q = r51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    @Override // org.telegram.ui.Components.et
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        f2.t0 t0Var;
        int i12;
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        this.N = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.L.get(0);
            if (view.getY() > (this.Q.getHeight() - this.Q.getPaddingBottom()) - view.getHeight()) {
                this.N = (k7.n.a((-((view.getY() - this.Q.getHeight()) + this.Q.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        r51 r51Var = this.Q;
        boolean z10 = true;
        boolean z11 = r51Var.b3.T == 13 || this.N < 1.0f || ((t0Var = r51Var.W) != null && t0Var.k()) || this.L.size() <= 4 || !this.O || q61.c(this.Q.b3) || (i12 = this.Q.b3.T) == 4 || i12 == 6;
        if (!z11) {
            if (this.Q.b3.M1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                q61 q61Var = this.Q.b3;
                if (elapsedRealtime - q61Var.M1 < q61Var.g()) {
                    z4 = true;
                    for (int i13 = 0; i13 < this.L.size(); i13++) {
                        y51 y51Var = (y51) this.L.get(i13);
                        if (y51Var.K != 0.0f || y51Var.P != 0.0f || y51Var.F != null || y51Var.getTranslationX() != 0.0f || y51Var.getTranslationY() != 0.0f || y51Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z4) {
                            int i14 = y51Var.c;
                            q61 q61Var2 = this.Q.b3;
                            if (i14 > q61Var2.K1 && i14 < q61Var2.L1) {
                                break;
                            }
                        }
                        if (y51Var.N) {
                            break;
                        }
                    }
                }
            }
            z4 = false;
            while (i13 < this.L.size()) {
            }
        }
        z10 = z11;
        float f11 = mg.g0.b ? 1.0f : f10;
        if (!z10 && !mg.g0.e) {
            super.a(canvas, j10, i10, i11, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.et
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.et
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            y51 y51Var = (y51) arrayList.get(i10);
            if (!y51Var.b) {
                if (y51Var.a) {
                    y51Var.B.setBounds(y51Var.C);
                    y51Var.B.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = y51Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.draw(canvas, y51Var.f[this.H]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i10;
        q61 q61Var = this.Q.b3;
        if (this.L != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                y51 y51Var = (y51) this.L.get(i11);
                if (!y51Var.b) {
                    float scaleX = y51Var.getScaleX();
                    int i12 = q61Var.T;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = y51Var.K;
                    if (f13 != f11 || (y51Var.P > f11 && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : y51Var.P * 0.7f, f13)) * 0.2f) + 0.8f;
                    }
                    boolean z4 = q61Var.M1 > 0 && SystemClock.elapsedRealtime() - q61Var.M1 < q61Var.g();
                    if (!z4 || q61Var.K1 < 0 || q61Var.L1 < 0 || q61Var.M1 <= 0) {
                        f12 *= y51Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(y51Var);
                        int i13 = q61Var.K1;
                        int i14 = R - i13;
                        int i15 = q61Var.L1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = k7.n.a((SystemClock.elapsedRealtime() - q61Var.M1) / q61Var.f(), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.P.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(y51Var.getPaddingLeft() + ((int) y51Var.getX()), y51Var.getPaddingTop(), (y51Var.getWidth() + ((int) y51Var.getX())) - y51Var.getPaddingRight(), y51Var.getHeight() - y51Var.getPaddingBottom());
                    if (!q61Var.t1 && !z4) {
                        rect.offset(0, (int) y51Var.getTranslationY());
                    }
                    if (y51Var.a) {
                        drawable = q61Var.getPremiumStar();
                        int i16 = q61Var.T;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (y51Var.s || y51Var.N) {
                        ImageReceiver imageReceiver = y51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    } else if ((y51Var.e != null || q61Var.T == 13) && !y51Var.b && (drawable = y51Var.B) != null) {
                        drawable.setAlpha(255);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = q61Var.h1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = y51Var.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.N;
                    y51Var.L = f17;
                    y51Var.M = i11;
                    if (scaleX != 1.0f || f17 < 1.0f) {
                        canvas.save();
                        float f18 = y51Var.P;
                        if (f18 > 1.0f && (i10 = q61Var.T) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = q61Var.T;
                        if (i17 == 6 || i17 == 13 || i17 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            y51Var.getHeight();
                            float f19 = this.N;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.N) * (1.0f - ((i11 * 2.0f) / this.L.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, y51Var, f12);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, y51Var, f12);
                    }
                }
                i11++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.Q.b3.e0.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((y51) arrayList.get(i10)).f[this.H];
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
    @Override // org.telegram.ui.Components.et
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
        q61 q61Var = this.Q.b3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.L.size()) {
            y51 y51Var = (y51) this.L.get(i13);
            boolean z4 = y51Var.b;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = y51Var.f;
            if (!z4) {
                if (y51Var.a) {
                    premiumStar = q61Var.getPremiumStar();
                    int i14 = q61Var.T;
                    float f11 = (i14 == 5 || i14 == 10 || i14 == 9 || i14 == 7) ? 1.3f : 1.0f;
                    float f12 = y51Var.K;
                    if (f12 != 0.0f || y51Var.P > 0.0f) {
                        f11 *= ((1.0f - Math.max(y51Var.P * 0.8f, f12)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(255);
                        int width = (y51Var.getWidth() - y51Var.getPaddingLeft()) - y51Var.getPaddingRight();
                        int height = (y51Var.getHeight() - y51Var.getPaddingTop()) - y51Var.getPaddingBottom();
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        float f13 = width / 2.0f;
                        float f14 = height / 2.0f;
                        rect2.set((int) ((y51Var.getWidth() / 2.0f) - ((y51Var.getScaleX() * f13) * f11)), (int) ((y51Var.getHeight() / 2.0f) - ((y51Var.getScaleY() * f14) * f11)), (int) ((y51Var.getScaleX() * f13 * f11) + (y51Var.getWidth() / 2.0f)), (int) ((y51Var.getScaleY() * f14 * f11) + (y51Var.getHeight() / 2.0f)));
                        rect2.offset(y51Var.getLeft() - this.K, i12);
                        if (y51Var.C == null) {
                            y51Var.C = new Rect();
                        }
                        y51Var.C.set(rect2);
                        y51Var.setDrawable(premiumStar);
                        arrayList.add(y51Var);
                    }
                } else {
                    float f15 = y51Var.K;
                    if (f15 != 0.0f || y51Var.P > 0.0f) {
                        Math.max(y51Var.P * 0.8f, f15);
                    }
                    if (q61Var.M1 > 0) {
                        f10 = 4.0f;
                        if (SystemClock.elapsedRealtime() - q61Var.M1 >= q61Var.g() || q61Var.K1 < 0 || q61Var.L1 < 0 || q61Var.M1 <= 0) {
                            i10 = i13;
                            backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        } else {
                            int R = RecyclerView.R(y51Var);
                            int i15 = q61Var.K1;
                            int i16 = R - i15;
                            int i17 = q61Var.L1 - i15;
                            if (i16 < 0 || i16 >= i17) {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                alpha = 1.0f;
                            } else {
                                i10 = i13;
                                backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                                float a2 = k7.n.a((SystemClock.elapsedRealtime() - q61Var.M1) / q61Var.f(), 0.0f, 1.0f);
                                float f16 = i16;
                                float f17 = i17;
                                float f18 = f17 / 4.0f;
                                float cascade = AndroidUtilities.cascade(a2, f16, f17, f18);
                                this.P.getInterpolation(AndroidUtilities.cascade(a2, f16, f17, f18));
                                alpha = cascade * 1.0f;
                            }
                            if (!y51Var.s || y51Var.N) {
                                imageReceiver = y51Var.h;
                                imageReceiver.setAlpha(alpha);
                            } else {
                                if (y51Var.e != null) {
                                    Drawable drawable = y51Var.B;
                                    org.telegram.ui.Components.l5 l5Var = drawable instanceof org.telegram.ui.Components.l5 ? (org.telegram.ui.Components.l5) drawable : null;
                                    if (l5Var != null && (imageReceiver = l5Var.k) != null) {
                                        l5Var.setAlpha((int) (alpha * 255.0f));
                                        y51Var.setDrawable(l5Var);
                                        y51Var.B.setColorFilter(q61Var.h1);
                                    }
                                }
                                i13 = i10 + 1;
                                i12 = 0;
                            }
                            imageReceiver.setEmojiPaused((q61Var.H1 || (q61Var.I1 && y51Var.I)) ? false : true);
                            if (y51Var.I) {
                                imageReceiver.setRoundRadius(0);
                            } else {
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                            }
                            int i18 = this.H;
                            ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i18], i18);
                            backgroundThreadDrawHolderArr[i18] = drawInBackgroundThread;
                            drawInBackgroundThread.time = j10;
                            y51Var.r = imageReceiver;
                            if (imageReceiver.getLottieAnimation() != null) {
                                y51Var.r.getLottieAnimation().S(j10);
                            }
                            if (y51Var.r.getAnimation() != null) {
                                y51Var.r.getAnimation().D(j10);
                            }
                            y51Var.getWidth();
                            y51Var.getPaddingLeft();
                            y51Var.getPaddingRight();
                            y51Var.getHeight();
                            y51Var.getPaddingTop();
                            y51Var.getPaddingBottom();
                            rect = AndroidUtilities.rectTmp2;
                            rect.set(y51Var.getPaddingLeft(), y51Var.getPaddingTop(), y51Var.getWidth() - y51Var.getPaddingRight(), y51Var.getHeight() - y51Var.getPaddingBottom());
                            if (y51Var.I && (i11 = q61Var.T) != 3 && i11 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            rect.offset((y51Var.getLeft() + ((int) y51Var.getTranslationX())) - this.K, 0);
                            backgroundThreadDrawHolderArr[i18].setBounds(rect);
                            y51Var.L = 1.0f;
                            y51Var.M = i10;
                            arrayList.add(y51Var);
                            i13 = i10 + 1;
                            i12 = 0;
                        }
                    } else {
                        i10 = i13;
                        backgroundThreadDrawHolderArr = backgroundThreadDrawHolderArr2;
                        f10 = 4.0f;
                    }
                    alpha = y51Var.getAlpha() * 1.0f;
                    if (y51Var.s) {
                    }
                    imageReceiver = y51Var.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.setEmojiPaused((q61Var.H1 || (q61Var.I1 && y51Var.I)) ? false : true);
                    if (y51Var.I) {
                    }
                    int i182 = this.H;
                    ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread2 = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i182], i182);
                    backgroundThreadDrawHolderArr[i182] = drawInBackgroundThread2;
                    drawInBackgroundThread2.time = j10;
                    y51Var.r = imageReceiver;
                    if (imageReceiver.getLottieAnimation() != null) {
                    }
                    if (y51Var.r.getAnimation() != null) {
                    }
                    y51Var.getWidth();
                    y51Var.getPaddingLeft();
                    y51Var.getPaddingRight();
                    y51Var.getHeight();
                    y51Var.getPaddingTop();
                    y51Var.getPaddingBottom();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(y51Var.getPaddingLeft(), y51Var.getPaddingTop(), y51Var.getWidth() - y51Var.getPaddingRight(), y51Var.getHeight() - y51Var.getPaddingBottom());
                    if (y51Var.I) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    rect.offset((y51Var.getLeft() + ((int) y51Var.getTranslationX())) - this.K, 0);
                    backgroundThreadDrawHolderArr[i182].setBounds(rect);
                    y51Var.L = 1.0f;
                    y51Var.M = i10;
                    arrayList.add(y51Var);
                    i13 = i10 + 1;
                    i12 = 0;
                }
            }
            i10 = i13;
            i13 = i10 + 1;
            i12 = 0;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, y51 y51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.Q.b3.h1);
        } else if ((y51Var.s || y51Var.N) && y51Var.h != null) {
            canvas.save();
            canvas.clipRect(y51Var.h.getImageX(), y51Var.h.getImageY(), y51Var.h.getImageX2(), y51Var.h.getImageY2());
            y51Var.h.setAlpha(f10);
            y51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
