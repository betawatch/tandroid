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
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.Components.os {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.qc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ q01 U;

    public p01(q01 q01Var) {
        this.U = q01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        this.R = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.P.get(0);
            if (view.getY() > (this.U.getHeight() - this.U.getPaddingBottom()) - view.getHeight()) {
                this.R = (c8.i9.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        q01 q01Var = this.U;
        boolean z11 = true;
        boolean z12 = q01Var.m3.a0 == 13 || this.R < 1.0f || q01Var.b0() || this.P.size() <= 4 || !this.S || n11.c(this.U.m3) || (i11 = this.U.m3.a0) == 4 || i11 == 6;
        if (!z12) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                n11 n11Var = this.U.m3;
                if (elapsedRealtime - n11Var.R1 < n11Var.g()) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.P.size(); i12++) {
                        x01 x01Var = (x01) this.P.get(i12);
                        if (x01Var.O != 0.0f || x01Var.T != 0.0f || x01Var.J != null || x01Var.getTranslationX() != 0.0f || x01Var.getTranslationY() != 0.0f || x01Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i13 = x01Var.c;
                            n11 n11Var2 = this.U.m3;
                            if (i13 > n11Var2.P1 && i13 < n11Var2.Q1) {
                                break;
                            }
                        }
                        if (x01Var.R) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i12 < this.P.size()) {
            }
        }
        z11 = z12;
        float f11 = ch.f0.b ? 1.0f : f10;
        if (!z11 && !ch.f0.e) {
            super.a(canvas, j3, i7, i10, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.os
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.os
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            x01 x01Var = (x01) arrayList.get(i7);
            if (!x01Var.b) {
                if (x01Var.a) {
                    x01Var.F.setBounds(x01Var.G);
                    x01Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = x01Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, x01Var.f[this.L]);
                    }
                }
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i7;
        n11 n11Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.P.size()) {
                x01 x01Var = (x01) this.P.get(i11);
                if (!x01Var.b) {
                    float scaleX = x01Var.getScaleX();
                    int i12 = n11Var.a0;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = x01Var.O;
                    if (f12 != 0.0f || (x01Var.T > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : x01Var.T * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (n11Var.R1 <= 0 || SystemClock.elapsedRealtime() - n11Var.R1 >= n11Var.g()) ? i10 : 1;
                    if (i13 == 0 || n11Var.P1 < 0 || n11Var.Q1 < 0 || n11Var.R1 <= 0) {
                        f11 *= x01Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(x01Var);
                        int i14 = n11Var.P1;
                        int i15 = R - i14;
                        int i16 = n11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.i9.a((SystemClock.elapsedRealtime() - n11Var.R1) / n11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s5;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(x01Var.getPaddingLeft() + ((int) x01Var.getX()), x01Var.getPaddingTop(), (x01Var.getWidth() + ((int) x01Var.getX())) - x01Var.getPaddingRight(), x01Var.getHeight() - x01Var.getPaddingBottom());
                    if (!n11Var.y1 && i13 == 0) {
                        rect.offset(i10, (int) x01Var.getTranslationY());
                    }
                    if (x01Var.a) {
                        drawable = n11Var.getPremiumStar();
                        int i17 = n11Var.a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.ns.e4);
                    } else if (x01Var.s || x01Var.R) {
                        ImageReceiver imageReceiver = x01Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((x01Var.e != null || n11Var.a0 == 13) && !x01Var.b && (drawable = x01Var.F) != null) {
                        drawable.setAlpha(org.telegram.messenger.ns.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = n11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = x01Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.g5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.R;
                    x01Var.P = f16;
                    x01Var.Q = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = x01Var.T;
                        if (f17 > 1.0f && (i7 = n11Var.a0) != 3 && i7 != 4 && i7 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = n11Var.a0;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            x01Var.getHeight();
                            float f18 = this.R;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i11 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, x01Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, x01Var, f11);
                    }
                }
                i11++;
                i10 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            org.telegram.messenger.hc hcVar = ((x01) arrayList.get(i7)).f[this.L];
            if (hcVar != null) {
                hcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        int i7;
        org.telegram.messenger.hc[] hcVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        int i11;
        int i12;
        Drawable premiumStar;
        n11 n11Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.P.size()) {
            x01 x01Var = (x01) this.P.get(i14);
            boolean z10 = x01Var.b;
            org.telegram.messenger.hc[] hcVarArr2 = x01Var.f;
            if (!z10) {
                if (x01Var.a) {
                    premiumStar = n11Var.getPremiumStar();
                    int i15 = n11Var.a0;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = x01Var.O;
                    if (f11 != 0.0f || x01Var.T > 0.0f) {
                        f10 *= ((1.0f - Math.max(x01Var.T * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.ns.e4);
                        int width = (x01Var.getWidth() - x01Var.getPaddingLeft()) - x01Var.getPaddingRight();
                        int height = (x01Var.getHeight() - x01Var.getPaddingTop()) - x01Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((x01Var.getWidth() / 2.0f) - ((x01Var.getScaleX() * f12) * f10)), (int) ((x01Var.getHeight() / 2.0f) - ((x01Var.getScaleY() * f13) * f10)), (int) ((x01Var.getScaleX() * f12 * f10) + (x01Var.getWidth() / 2.0f)), (int) ((x01Var.getScaleY() * f13 * f10) + (x01Var.getHeight() / 2.0f)));
                        rect2.offset(x01Var.getLeft() - this.O, i13);
                        if (x01Var.G == null) {
                            x01Var.G = new Rect();
                        }
                        x01Var.G.set(rect2);
                        x01Var.setDrawable(premiumStar);
                        arrayList.add(x01Var);
                    }
                } else {
                    float f14 = x01Var.O;
                    if (f14 != 0.0f || x01Var.T > 0.0f) {
                        Math.max(x01Var.T * 0.8f, f14);
                    }
                    if (n11Var.R1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - n11Var.R1 >= n11Var.g() || n11Var.P1 < 0 || n11Var.Q1 < 0 || n11Var.R1 <= 0) {
                            hcVarArr = hcVarArr2;
                            i7 = i16;
                        } else {
                            int R = RecyclerView.R(x01Var);
                            int i17 = n11Var.P1;
                            int i18 = R - i17;
                            int i19 = n11Var.Q1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                hcVarArr = hcVarArr2;
                                i7 = i16;
                                alpha = 1.0f;
                            } else {
                                hcVarArr = hcVarArr2;
                                i7 = i16;
                                float a10 = c8.i9.a((SystemClock.elapsedRealtime() - n11Var.R1) / n11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s5 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s5 * 1.0f;
                            }
                            if (!x01Var.s || x01Var.R) {
                                ImageReceiver imageReceiver2 = x01Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (x01Var.e != null) {
                                    Drawable drawable = x01Var.F;
                                    org.telegram.ui.Components.g5 g5Var = drawable instanceof org.telegram.ui.Components.g5 ? (org.telegram.ui.Components.g5) drawable : null;
                                    if (g5Var != null && (imageReceiver2 = g5Var.k) != null) {
                                        g5Var.setAlpha((int) (alpha * 255.0f));
                                        x01Var.setDrawable(g5Var);
                                        x01Var.F.setColorFilter(n11Var.l1);
                                    }
                                }
                                i11 = i7;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((n11Var.M1 || (n11Var.N1 && x01Var.M)) ? false : true);
                            if (x01Var.M) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.L;
                            org.telegram.messenger.hc e02 = imageReceiver.e0(hcVarArr[i20], i20);
                            hcVarArr[i20] = e02;
                            e02.c = j3;
                            x01Var.r = imageReceiver;
                            if (imageReceiver.B() != null) {
                                x01Var.r.B().V(j3);
                            }
                            if (x01Var.r.m() != null) {
                                x01Var.r.m().D(j3);
                            }
                            x01Var.getWidth();
                            x01Var.getPaddingLeft();
                            x01Var.getPaddingRight();
                            x01Var.getHeight();
                            x01Var.getPaddingTop();
                            x01Var.getPaddingBottom();
                            rect = org.telegram.messenger.g0.Q;
                            rect.set(x01Var.getPaddingLeft(), x01Var.getPaddingTop(), x01Var.getWidth() - x01Var.getPaddingRight(), x01Var.getHeight() - x01Var.getPaddingBottom());
                            if (x01Var.M && (i12 = n11Var.a0) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((x01Var.getLeft() + ((int) x01Var.getTranslationX())) - this.O, 0);
                            hcVarArr[i20].b(rect);
                            x01Var.P = 1.0f;
                            i11 = i7;
                            x01Var.Q = i11;
                            arrayList.add(x01Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i7 = i14;
                        hcVarArr = hcVarArr2;
                    }
                    alpha = x01Var.getAlpha() * 1.0f;
                    if (x01Var.s) {
                    }
                    ImageReceiver imageReceiver22 = x01Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((n11Var.M1 || (n11Var.N1 && x01Var.M)) ? false : true);
                    if (x01Var.M) {
                    }
                    int i202 = this.L;
                    org.telegram.messenger.hc e022 = imageReceiver.e0(hcVarArr[i202], i202);
                    hcVarArr[i202] = e022;
                    e022.c = j3;
                    x01Var.r = imageReceiver;
                    if (imageReceiver.B() != null) {
                    }
                    if (x01Var.r.m() != null) {
                    }
                    x01Var.getWidth();
                    x01Var.getPaddingLeft();
                    x01Var.getPaddingRight();
                    x01Var.getHeight();
                    x01Var.getPaddingTop();
                    x01Var.getPaddingBottom();
                    rect = org.telegram.messenger.g0.Q;
                    rect.set(x01Var.getPaddingLeft(), x01Var.getPaddingTop(), x01Var.getWidth() - x01Var.getPaddingRight(), x01Var.getHeight() - x01Var.getPaddingBottom());
                    if (x01Var.M) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((x01Var.getLeft() + ((int) x01Var.getTranslationX())) - this.O, 0);
                    hcVarArr[i202].b(rect);
                    x01Var.P = 1.0f;
                    i11 = i7;
                    x01Var.Q = i11;
                    arrayList.add(x01Var);
                    i14 = i11 + 1;
                    i13 = i10;
                }
            }
            i10 = i13;
            i11 = i14;
            i14 = i11 + 1;
            i13 = i10;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, x01 x01Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((x01Var.s || x01Var.R) && x01Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = x01Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), x01Var.h.A());
            x01Var.h.setAlpha(f10);
            x01Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
