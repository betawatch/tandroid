package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qw extends hs {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ sw R;

    public qw(sw swVar) {
        this.R = swVar;
    }

    @Override // org.telegram.ui.Components.hs
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        sw swVar = this.R;
        gy gyVar = swVar.m3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = arrayList.size() <= 4 || org.telegram.messenger.iz.o() == 0 || !org.telegram.messenger.sc.e(16388);
        if (!z10) {
            boolean z11 = gyVar.v2 > 0 && SystemClock.elapsedRealtime() - gyVar.v2 < swVar.z1();
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                px pxVar = (px) this.O.get(i12);
                if (pxVar.h != 0.0f || pxVar.n != null || ((i11 = pxVar.a) > gyVar.t2 && i11 < gyVar.u2 && z11)) {
                    break;
                }
            }
        }
        z9 = z10;
        if (!z9) {
            super.a(canvas, j3, i7, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.hs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            px pxVar = (px) arrayList.get(i7);
            h5 h5Var = pxVar.b;
            if (h5Var != null) {
                org.telegram.messenger.ic icVar = pxVar.f[this.K];
                di.z2 z2Var = h5Var.k;
                if (z2Var != null) {
                    z2Var.setAlpha(h5Var.l);
                    h5Var.k.h(canvas, icVar);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.hs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        h5 h5Var;
        h5 h5Var2;
        float f12;
        float f13;
        sw swVar = this.R;
        gy gyVar = swVar.m3;
        if (this.O != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.O.size()) {
                px pxVar = (px) this.O.get(i10);
                if (pxVar.getSpan() == null || (h5Var = (h5) gyVar.d2.get(pxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (pxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(pxVar.getPaddingLeft() + pxVar.getLeft(), height, pxVar.getRight() - pxVar.getPaddingRight(), ((pxVar.getMeasuredHeight() + height) - pxVar.getPaddingBottom()) - pxVar.getPaddingTop());
                    float f16 = pxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (gyVar.v2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - gyVar.v2 < swVar.z1()) {
                            if (gyVar.t2 >= 0 && gyVar.u2 >= 0 && gyVar.v2 > 0) {
                                int R = RecyclerView.R(pxVar);
                                int i11 = gyVar.t2;
                                int i12 = R - i11;
                                int i13 = gyVar.u2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    h5Var2 = h5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.j9.a(com.google.android.recaptcha.internal.a.w(max, 0.45f, SystemClock.elapsedRealtime() - gyVar.v2, Math.max(400L, Math.min(45, gyVar.u2 - gyVar.t2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = wq.g.getInterpolation(c8.j9.a((SystemClock.elapsedRealtime() - gyVar.v2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s5 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.Q.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s5;
                                    h5Var2.setAlpha((int) (255.0f * f15));
                                    h5Var2.setBounds(rect);
                                    h5Var2.setColorFilter(gyVar.e2);
                                    if (f13 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                        h5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        h5Var2.draw(canvas);
                                    }
                                }
                            }
                            h5Var2 = h5Var;
                            f12 = f17;
                            f11 = 0.0f;
                            f13 = f12;
                            h5Var2.setAlpha((int) (255.0f * f15));
                            h5Var2.setBounds(rect);
                            h5Var2.setColorFilter(gyVar.e2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i7 = i10;
                    }
                    h5Var2 = h5Var;
                    f12 = f17;
                    f13 = f12;
                    h5Var2.setAlpha((int) (255.0f * f15));
                    h5Var2.setBounds(rect);
                    h5Var2.setColorFilter(gyVar.e2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.hs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                this.R.m3.P.invalidate();
                return;
            }
            org.telegram.messenger.ic[] icVarArr = ((px) arrayList.get(i7)).f;
            if (icVarArr != null) {
                icVarArr[this.K].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.hs
    public final void i(long j3) {
        h5 h5Var;
        gy gyVar = this.R.m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            px pxVar = (px) this.O.get(i7);
            q5 span = pxVar.getSpan();
            org.telegram.messenger.ic[] icVarArr = pxVar.f;
            if (span != null && (h5Var = (h5) gyVar.d2.get(pxVar.d.getDocumentId())) != null && h5Var.k != null) {
                h5Var.s(j3);
                di.z2 z2Var = h5Var.k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.c = j3;
                e02.b = 1.0f;
                h5Var.setAlpha(org.telegram.messenger.qs.e4);
                int height = (int) (pxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((pxVar.getPaddingLeft() + pxVar.getLeft()) - this.N, height, (pxVar.getRight() - pxVar.getPaddingRight()) - this.N, ((pxVar.getMeasuredHeight() + height) - pxVar.getPaddingTop()) - pxVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                pxVar.b = h5Var;
                icVarArr[i10].z = h5Var.c() ? gyVar.e2 : null;
                arrayList.add(pxVar);
            }
        }
    }
}
