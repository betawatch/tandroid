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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i21 extends org.telegram.ui.Components.ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = org.telegram.messenger.tc.e(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final /* synthetic */ j21 T;

    public i21(j21 j21Var) {
        this.T = j21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    @Override // org.telegram.ui.Components.ts
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
                this.Q = (w7.u.a((-((view.getY() - this.T.getHeight()) + this.T.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        j21 j21Var = this.T;
        boolean z11 = true;
        boolean z12 = j21Var.l3.W == 13 || this.Q < 1.0f || j21Var.b0() || this.O.size() <= 4 || !this.R || g31.c(this.T.l3) || (i12 = this.T.l3.W) == 4 || i12 == 6;
        if (!z12) {
            if (this.T.l3.Q1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                g31 g31Var = this.T.l3;
                if (elapsedRealtime - g31Var.Q1 < g31Var.g()) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        q21 q21Var = (q21) this.O.get(i13);
                        if (q21Var.N != 0.0f || q21Var.S != 0.0f || q21Var.I != null || q21Var.getTranslationX() != 0.0f || q21Var.getTranslationY() != 0.0f || q21Var.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z10) {
                            int i14 = q21Var.c;
                            g31 g31Var2 = this.T.l3;
                            if (i14 > g31Var2.O1 && i14 < g31Var2.P1) {
                                break;
                            }
                        }
                        if (q21Var.Q) {
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
        float f10 = sg.e0.b ? 1.0f : f7;
        if (!z11 && !sg.e0.e) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.ts
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.ts
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            q21 q21Var = (q21) arrayList.get(i10);
            if (!q21Var.b) {
                if (q21Var.a) {
                    q21Var.E.setBounds(q21Var.F);
                    q21Var.E.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = q21Var.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, q21Var.f[this.K]);
                    }
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void d(Canvas canvas, float f7) {
        Drawable drawable;
        int i10;
        g31 g31Var = this.T.l3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f10 = f7;
            int i12 = 0;
            while (i12 < this.O.size()) {
                q21 q21Var = (q21) this.O.get(i12);
                if (!q21Var.b) {
                    float scaleX = q21Var.getScaleX();
                    int i13 = g31Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f11 = q21Var.N;
                    if (f11 != 0.0f || (q21Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        scaleX *= ((1.0f - Math.max((i13 == 3 || i13 == 4) ? 1.0f : q21Var.S * 0.7f, f11)) * 0.2f) + 0.8f;
                    }
                    int i14 = (g31Var.Q1 <= 0 || SystemClock.elapsedRealtime() - g31Var.Q1 >= g31Var.g()) ? i11 : 1;
                    if (i14 == 0 || g31Var.O1 < 0 || g31Var.P1 < 0 || g31Var.Q1 <= 0) {
                        f10 *= q21Var.getAlpha();
                    } else {
                        int R = RecyclerView.R(q21Var);
                        int i15 = g31Var.O1;
                        int i16 = R - i15;
                        int i17 = g31Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.u.a((SystemClock.elapsedRealtime() - g31Var.Q1) / g31Var.f(), 0.0f, 1.0f);
                            float f12 = i16;
                            float f13 = i17;
                            float f14 = f13 / 4.0f;
                            float s10 = org.telegram.messenger.i0.s(a2, f12, f13, f14);
                            scaleX *= (this.S.getInterpolation(org.telegram.messenger.i0.s(a2, f12, f13, f14)) * 0.5f) + 0.5f;
                            f10 = s10;
                        }
                    }
                    Rect rect = org.telegram.messenger.i0.Q;
                    rect.set(q21Var.getPaddingLeft() + ((int) q21Var.getX()), q21Var.getPaddingTop(), (q21Var.getWidth() + ((int) q21Var.getX())) - q21Var.getPaddingRight(), q21Var.getHeight() - q21Var.getPaddingBottom());
                    if (!g31Var.x1 && i14 == 0) {
                        rect.offset(i11, (int) q21Var.getTranslationY());
                    }
                    if (q21Var.a) {
                        drawable = g31Var.getPremiumStar();
                        int i18 = g31Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(org.telegram.messenger.at.e4);
                    } else if (q21Var.s || q21Var.Q) {
                        ImageReceiver imageReceiver = q21Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    } else if ((q21Var.e != null || g31Var.W == 13) && !q21Var.b && (drawable = q21Var.E) != null) {
                        drawable.setAlpha(org.telegram.messenger.at.e4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = g31Var.k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = q21Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.f5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f15 = this.Q;
                    q21Var.O = f15;
                    q21Var.P = i12;
                    if (scaleX != 1.0f || f15 < 1.0f) {
                        canvas.save();
                        float f16 = q21Var.S;
                        if (f16 > 1.0f && (i10 = g31Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.85f, f16);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i19 = g31Var.W;
                        if (i19 == 6 || i19 == 13 || i19 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            q21Var.getHeight();
                            float f17 = this.Q;
                            if (f17 < 1.0f) {
                                canvas.scale(1.0f, f17, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, q21Var, f10);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, q21Var, f10);
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.T.l3.h0.invalidate();
                return;
            }
            org.telegram.messenger.kc kcVar = ((q21) arrayList.get(i10)).f[this.K];
            if (kcVar != null) {
                kcVar.a();
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    @Override // org.telegram.ui.Components.ts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        int i10;
        org.telegram.messenger.kc[] kcVarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i11;
        int i12;
        int i13;
        Drawable premiumStar;
        g31 g31Var = this.T.l3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.O.size()) {
            q21 q21Var = (q21) this.O.get(i15);
            boolean z10 = q21Var.b;
            org.telegram.messenger.kc[] kcVarArr2 = q21Var.f;
            if (!z10) {
                if (q21Var.a) {
                    premiumStar = g31Var.getPremiumStar();
                    int i16 = g31Var.W;
                    float f7 = (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) ? 1.3f : 1.0f;
                    float f10 = q21Var.N;
                    if (f10 != 0.0f || q21Var.S > 0.0f) {
                        f7 *= ((1.0f - Math.max(q21Var.S * 0.8f, f10)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(org.telegram.messenger.at.e4);
                        int width = (q21Var.getWidth() - q21Var.getPaddingLeft()) - q21Var.getPaddingRight();
                        int height = (q21Var.getHeight() - q21Var.getPaddingTop()) - q21Var.getPaddingBottom();
                        Rect rect2 = org.telegram.messenger.i0.Q;
                        float f11 = width / 2.0f;
                        float f12 = height / 2.0f;
                        rect2.set((int) ((q21Var.getWidth() / 2.0f) - ((q21Var.getScaleX() * f11) * f7)), (int) ((q21Var.getHeight() / 2.0f) - ((q21Var.getScaleY() * f12) * f7)), (int) ((q21Var.getScaleX() * f11 * f7) + (q21Var.getWidth() / 2.0f)), (int) ((q21Var.getScaleY() * f12 * f7) + (q21Var.getHeight() / 2.0f)));
                        rect2.offset(q21Var.getLeft() - this.N, i14);
                        if (q21Var.F == null) {
                            q21Var.F = new Rect();
                        }
                        q21Var.F.set(rect2);
                        q21Var.setDrawable(premiumStar);
                        arrayList.add(q21Var);
                    }
                } else {
                    float f13 = q21Var.N;
                    if (f13 != 0.0f || q21Var.S > 0.0f) {
                        Math.max(q21Var.S * 0.8f, f13);
                    }
                    if (g31Var.Q1 > 0) {
                        int i17 = i15;
                        if (SystemClock.elapsedRealtime() - g31Var.Q1 >= g31Var.g() || g31Var.O1 < 0 || g31Var.P1 < 0 || g31Var.Q1 <= 0) {
                            kcVarArr = kcVarArr2;
                            i10 = i17;
                        } else {
                            int R = RecyclerView.R(q21Var);
                            int i18 = g31Var.O1;
                            int i19 = R - i18;
                            int i20 = g31Var.P1 - i18;
                            if (i19 < 0 || i19 >= i20) {
                                kcVarArr = kcVarArr2;
                                i10 = i17;
                                alpha = 1.0f;
                            } else {
                                kcVarArr = kcVarArr2;
                                i10 = i17;
                                float a2 = w7.u.a((SystemClock.elapsedRealtime() - g31Var.Q1) / g31Var.f(), 0.0f, 1.0f);
                                float f14 = i19;
                                float f15 = i20;
                                float f16 = f15 / 4.0f;
                                float s10 = org.telegram.messenger.i0.s(a2, f14, f15, f16);
                                this.S.getInterpolation(org.telegram.messenger.i0.s(a2, f14, f15, f16));
                                alpha = s10 * 1.0f;
                            }
                            if (!q21Var.s || q21Var.Q) {
                                ImageReceiver imageReceiver2 = q21Var.h;
                                imageReceiver2.setAlpha(alpha);
                            } else {
                                if (q21Var.e != null) {
                                    Drawable drawable = q21Var.E;
                                    org.telegram.ui.Components.f5 f5Var = drawable instanceof org.telegram.ui.Components.f5 ? (org.telegram.ui.Components.f5) drawable : null;
                                    if (f5Var != null && (imageReceiver2 = f5Var.k) != null) {
                                        f5Var.setAlpha((int) (alpha * 255.0f));
                                        q21Var.setDrawable(f5Var);
                                        q21Var.E.setColorFilter(g31Var.k1);
                                    }
                                }
                                i12 = i10;
                                i11 = 0;
                                i15 = i12 + 1;
                                i14 = i11;
                            }
                            imageReceiver = imageReceiver2;
                            imageReceiver.g0((g31Var.L1 || (g31Var.M1 && q21Var.L)) ? false : true);
                            if (q21Var.L) {
                                imageReceiver.J0(0);
                            } else {
                                imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
                            }
                            int i21 = this.K;
                            org.telegram.messenger.kc e02 = imageReceiver.e0(kcVarArr[i21], i21);
                            kcVarArr[i21] = e02;
                            e02.c = j10;
                            q21Var.r = imageReceiver;
                            if (imageReceiver.B() != null) {
                                q21Var.r.B().V(j10);
                            }
                            if (q21Var.r.m() != null) {
                                q21Var.r.m().D(j10);
                            }
                            q21Var.getWidth();
                            q21Var.getPaddingLeft();
                            q21Var.getPaddingRight();
                            q21Var.getHeight();
                            q21Var.getPaddingTop();
                            q21Var.getPaddingBottom();
                            rect = org.telegram.messenger.i0.Q;
                            rect.set(q21Var.getPaddingLeft(), q21Var.getPaddingTop(), q21Var.getWidth() - q21Var.getPaddingRight(), q21Var.getHeight() - q21Var.getPaddingBottom());
                            if (q21Var.L && (i13 = g31Var.W) != 3 && i13 != 4) {
                                rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                            }
                            i11 = 0;
                            rect.offset((q21Var.getLeft() + ((int) q21Var.getTranslationX())) - this.N, 0);
                            kcVarArr[i21].b(rect);
                            q21Var.O = 1.0f;
                            i12 = i10;
                            q21Var.P = i12;
                            arrayList.add(q21Var);
                            i15 = i12 + 1;
                            i14 = i11;
                        }
                    } else {
                        i10 = i15;
                        kcVarArr = kcVarArr2;
                    }
                    alpha = q21Var.getAlpha() * 1.0f;
                    if (q21Var.s) {
                    }
                    ImageReceiver imageReceiver22 = q21Var.h;
                    imageReceiver22.setAlpha(alpha);
                    imageReceiver = imageReceiver22;
                    imageReceiver.g0((g31Var.L1 || (g31Var.M1 && q21Var.L)) ? false : true);
                    if (q21Var.L) {
                    }
                    int i212 = this.K;
                    org.telegram.messenger.kc e022 = imageReceiver.e0(kcVarArr[i212], i212);
                    kcVarArr[i212] = e022;
                    e022.c = j10;
                    q21Var.r = imageReceiver;
                    if (imageReceiver.B() != null) {
                    }
                    if (q21Var.r.m() != null) {
                    }
                    q21Var.getWidth();
                    q21Var.getPaddingLeft();
                    q21Var.getPaddingRight();
                    q21Var.getHeight();
                    q21Var.getPaddingTop();
                    q21Var.getPaddingBottom();
                    rect = org.telegram.messenger.i0.Q;
                    rect.set(q21Var.getPaddingLeft(), q21Var.getPaddingTop(), q21Var.getWidth() - q21Var.getPaddingRight(), q21Var.getHeight() - q21Var.getPaddingBottom());
                    if (q21Var.L) {
                        rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                    }
                    i11 = 0;
                    rect.offset((q21Var.getLeft() + ((int) q21Var.getTranslationX())) - this.N, 0);
                    kcVarArr[i212].b(rect);
                    q21Var.O = 1.0f;
                    i12 = i10;
                    q21Var.P = i12;
                    arrayList.add(q21Var);
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

    public final void m(Canvas canvas, Drawable drawable, q21 q21Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.l3.k1);
        } else if ((q21Var.s || q21Var.Q) && q21Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = q21Var.h;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), q21Var.h.A());
            q21Var.h.setAlpha(f7);
            q21Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
