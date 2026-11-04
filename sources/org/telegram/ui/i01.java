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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i01 extends org.telegram.ui.Components.is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.lc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ j01 U;

    public i01(j01 j01Var) {
        this.U = j01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
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
                this.R = (b8.be.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        j01 j01Var = this.U;
        boolean z11 = true;
        boolean z12 = j01Var.m3.a0 == 13 || this.R < 1.0f || j01Var.b0() || this.P.size() <= 4 || !this.S || g11.c(this.U.m3) || (i11 = this.U.m3.a0) == 4 || i11 == 6;
        if (!z12) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                g11 g11Var = this.U.m3;
                if (elapsedRealtime - g11Var.R1 < g11Var.g()) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.P.size(); i12++) {
                        q01 q01Var = (q01) this.P.get(i12);
                        if (q01Var.O != 0.0f || q01Var.T != 0.0f || q01Var.J != null || q01Var.getTranslationX() != 0.0f || q01Var.getTranslationY() != 0.0f || q01Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i13 = q01Var.c;
                            g11 g11Var2 = this.U.m3;
                            if (i13 > g11Var2.P1 && i13 < g11Var2.Q1) {
                                break;
                            }
                        }
                        if (q01Var.R) {
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
        float f11 = dh.d0.b ? 1.0f : f10;
        if (!z11 && !dh.d0.e) {
            super.a(canvas, j10, i3, i10, f11);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f11);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 >= arrayList.size()) {
                return;
            }
            q01 q01Var = (q01) arrayList.get(i3);
            if (!q01Var.b) {
                if (q01Var.a) {
                    q01Var.F.setBounds(q01Var.G);
                    q01Var.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = q01Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, q01Var.f[this.L]);
                    }
                }
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        Drawable drawable;
        int i3;
        g11 g11Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f11 = f10;
            int i11 = 0;
            while (i11 < this.P.size()) {
                q01 q01Var = (q01) this.P.get(i11);
                if (!q01Var.b) {
                    float scaleX = q01Var.getScaleX();
                    int i12 = g11Var.a0;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = q01Var.O;
                    if (f12 != 0.0f || (q01Var.T > 0.0f && i12 != 3 && i12 != 4)) {
                        scaleX *= ((1.0f - Math.max((i12 == 3 || i12 == 4) ? 1.0f : q01Var.T * 0.7f, f12)) * 0.2f) + 0.8f;
                    }
                    int i13 = (g11Var.R1 <= 0 || SystemClock.elapsedRealtime() - g11Var.R1 >= g11Var.g()) ? i10 : 1;
                    if (i13 == 0 || g11Var.P1 < 0 || g11Var.Q1 < 0 || g11Var.R1 <= 0) {
                        f11 *= q01Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(q01Var);
                        int i14 = g11Var.P1;
                        int i15 = R - i14;
                        int i16 = g11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = b8.be.a((SystemClock.elapsedRealtime() - g11Var.R1) / g11Var.f(), 0.0f, 1.0f);
                            float f13 = i15;
                            float f14 = i16;
                            float f15 = f14 / 4.0f;
                            float s6 = org.telegram.messenger.g0.s(a10, f13, f14, f15);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s6;
                        }
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(q01Var.getPaddingLeft() + ((int) q01Var.getX()), q01Var.getPaddingTop(), (q01Var.getWidth() + ((int) q01Var.getX())) - q01Var.getPaddingRight(), q01Var.getHeight() - q01Var.getPaddingBottom());
                    if (!g11Var.y1 && i13 == 0) {
                        rect.offset(i10, (int) q01Var.getTranslationY());
                    }
                    if (q01Var.a) {
                        drawable = g11Var.getPremiumStar();
                        int i17 = g11Var.a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.hs.e4);
                    } else if (q01Var.s || q01Var.R) {
                        ImageReceiver imageReceiver = q01Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((q01Var.e != null || g11Var.a0 == 13) && !q01Var.b && (drawable = q01Var.F) != null) {
                        drawable.setAlpha(org.telegram.messenger.hs.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = g11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = q01Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.g5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.R;
                    q01Var.P = f16;
                    q01Var.Q = i11;
                    if (scaleX != 1.0f || f16 < 1.0f) {
                        canvas.save();
                        float f17 = q01Var.T;
                        if (f17 > 1.0f && (i3 = g11Var.a0) != 3 && i3 != 4 && i3 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = g11Var.a0;
                        if (i18 == 6 || i18 == 13 || i18 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            q01Var.getHeight();
                            float f18 = this.R;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i11 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, q01Var, f11);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, q01Var, f11);
                    }
                }
                i11++;
                i10 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 >= arrayList.size()) {
                this.U.m3.i0.invalidate();
                return;
            }
            org.telegram.messenger.bc bcVar = ((q01) arrayList.get(i3)).f[this.L];
            if (bcVar != null) {
                bcVar.a();
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i3;
        org.telegram.messenger.bc[] bcVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i10;
        int i11;
        int i12;
        Drawable premiumStar;
        g11 g11Var = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.P.size()) {
            q01 q01Var = (q01) this.P.get(i14);
            boolean z10 = q01Var.b;
            org.telegram.messenger.bc[] bcVarArr2 = q01Var.f;
            if (!z10) {
                if (q01Var.a) {
                    premiumStar = g11Var.getPremiumStar();
                    int i15 = g11Var.a0;
                    float f10 = (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) ? 1.3f : 1.0f;
                    float f11 = q01Var.O;
                    if (f11 != 0.0f || q01Var.T > 0.0f) {
                        f10 *= ((1.0f - Math.max(q01Var.T * 0.8f, f11)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.hs.e4);
                        int width = (q01Var.getWidth() - q01Var.getPaddingLeft()) - q01Var.getPaddingRight();
                        int height = (q01Var.getHeight() - q01Var.getPaddingTop()) - q01Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        float f12 = width / 2.0f;
                        float f13 = height / 2.0f;
                        rect2.set((int) ((q01Var.getWidth() / 2.0f) - ((q01Var.getScaleX() * f12) * f10)), (int) ((q01Var.getHeight() / 2.0f) - ((q01Var.getScaleY() * f13) * f10)), (int) ((q01Var.getScaleX() * f12 * f10) + (q01Var.getWidth() / 2.0f)), (int) ((q01Var.getScaleY() * f13 * f10) + (q01Var.getHeight() / 2.0f)));
                        rect2.offset(q01Var.getLeft() - this.O, i13);
                        if (q01Var.G == null) {
                            q01Var.G = new Rect();
                        }
                        q01Var.G.set(rect2);
                        q01Var.setDrawable(premiumStar);
                        arrayList.add(q01Var);
                    }
                } else {
                    float f14 = q01Var.O;
                    if (f14 != 0.0f || q01Var.T > 0.0f) {
                        Math.max(q01Var.T * 0.8f, f14);
                    }
                    if (g11Var.R1 > 0) {
                        int i16 = i14;
                        if (SystemClock.elapsedRealtime() - g11Var.R1 >= g11Var.g() || g11Var.P1 < 0 || g11Var.Q1 < 0 || g11Var.R1 <= 0) {
                            bcVarArr = bcVarArr2;
                            i3 = i16;
                        } else {
                            int R = RecyclerView.R(q01Var);
                            int i17 = g11Var.P1;
                            int i18 = R - i17;
                            int i19 = g11Var.Q1 - i17;
                            if (i18 < 0 || i18 >= i19) {
                                bcVarArr = bcVarArr2;
                                i3 = i16;
                                alpha = 1.0f;
                            } else {
                                bcVarArr = bcVarArr2;
                                i3 = i16;
                                float a10 = b8.be.a((SystemClock.elapsedRealtime() - g11Var.R1) / g11Var.f(), 0.0f, 1.0f);
                                float f15 = i18;
                                float f16 = i19;
                                float f17 = f16 / 4.0f;
                                float s6 = org.telegram.messenger.g0.s(a10, f15, f16, f17);
                                this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f15, f16, f17));
                                alpha = s6 * 1.0f;
                            }
                            if (!q01Var.s || q01Var.R) {
                                ImageReceiver imageReceiver2 = q01Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (q01Var.e != null) {
                                    Drawable drawable = q01Var.F;
                                    org.telegram.ui.Components.g5 g5Var = drawable instanceof org.telegram.ui.Components.g5 ? (org.telegram.ui.Components.g5) drawable : null;
                                    if (g5Var != null && (imageReceiver2 = g5Var.k) != null) {
                                        g5Var.setAlpha((int) (alpha * 255.0f));
                                        q01Var.setDrawable(g5Var);
                                        q01Var.F.setColorFilter(g11Var.l1);
                                    }
                                }
                                i11 = i3;
                                i10 = 0;
                                i14 = i11 + 1;
                                i13 = i10;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((g11Var.M1 || (g11Var.N1 && q01Var.M)) ? false : true);
                            if (q01Var.M) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
                            }
                            int i20 = this.L;
                            org.telegram.messenger.bc e02 = imageReceiver.e0(bcVarArr[i20], i20);
                            bcVarArr[i20] = e02;
                            e02.c = j10;
                            q01Var.r = imageReceiver;
                            if (imageReceiver.B() != null) {
                                q01Var.r.B().V(j10);
                            }
                            if (q01Var.r.m() != null) {
                                q01Var.r.m().D(j10);
                            }
                            q01Var.getWidth();
                            q01Var.getPaddingLeft();
                            q01Var.getPaddingRight();
                            q01Var.getHeight();
                            q01Var.getPaddingTop();
                            q01Var.getPaddingBottom();
                            rect = org.telegram.messenger.g0.Q;
                            rect.set(q01Var.getPaddingLeft(), q01Var.getPaddingTop(), q01Var.getWidth() - q01Var.getPaddingRight(), q01Var.getHeight() - q01Var.getPaddingBottom());
                            if (q01Var.M && (i12 = g11Var.a0) != 3 && i12 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i10 = 0;
                            rect.offset((q01Var.getLeft() + ((int) q01Var.getTranslationX())) - this.O, 0);
                            bcVarArr[i20].b(rect);
                            q01Var.P = 1.0f;
                            i11 = i3;
                            q01Var.Q = i11;
                            arrayList.add(q01Var);
                            i14 = i11 + 1;
                            i13 = i10;
                        }
                    } else {
                        i3 = i14;
                        bcVarArr = bcVarArr2;
                    }
                    alpha = q01Var.getAlpha() * 1.0f;
                    if (q01Var.s) {
                    }
                    ImageReceiver imageReceiver22 = q01Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((g11Var.M1 || (g11Var.N1 && q01Var.M)) ? false : true);
                    if (q01Var.M) {
                    }
                    int i202 = this.L;
                    org.telegram.messenger.bc e022 = imageReceiver.e0(bcVarArr[i202], i202);
                    bcVarArr[i202] = e022;
                    e022.c = j10;
                    q01Var.r = imageReceiver;
                    if (imageReceiver.B() != null) {
                    }
                    if (q01Var.r.m() != null) {
                    }
                    q01Var.getWidth();
                    q01Var.getPaddingLeft();
                    q01Var.getPaddingRight();
                    q01Var.getHeight();
                    q01Var.getPaddingTop();
                    q01Var.getPaddingBottom();
                    rect = org.telegram.messenger.g0.Q;
                    rect.set(q01Var.getPaddingLeft(), q01Var.getPaddingTop(), q01Var.getWidth() - q01Var.getPaddingRight(), q01Var.getHeight() - q01Var.getPaddingBottom());
                    if (q01Var.M) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i10 = 0;
                    rect.offset((q01Var.getLeft() + ((int) q01Var.getTranslationX())) - this.O, 0);
                    bcVarArr[i202].b(rect);
                    q01Var.P = 1.0f;
                    i11 = i3;
                    q01Var.Q = i11;
                    arrayList.add(q01Var);
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

    public final void m(Canvas canvas, Drawable drawable, q01 q01Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((q01Var.s || q01Var.R) && q01Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = q01Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), q01Var.h.A());
            q01Var.h.setAlpha(f10);
            q01Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
