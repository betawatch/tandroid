package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rw extends is {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ tw R;

    public rw(tw twVar) {
        this.R = twVar;
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        tw twVar = this.R;
        hy hyVar = twVar.m3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = arrayList.size() <= 4 || org.telegram.messenger.iz.o() == 0 || !org.telegram.messenger.sc.e(16388);
        if (!z10) {
            boolean z11 = hyVar.v2 > 0 && SystemClock.elapsedRealtime() - hyVar.v2 < twVar.z1();
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                qx qxVar = (qx) this.O.get(i12);
                if (qxVar.h != 0.0f || qxVar.n != null || ((i11 = qxVar.a) > hyVar.t2 && i11 < hyVar.u2 && z11)) {
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

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            qx qxVar = (qx) arrayList.get(i7);
            i5 i5Var = qxVar.b;
            if (i5Var != null) {
                org.telegram.messenger.ic icVar = qxVar.f[this.K];
                di.z2 z2Var = i5Var.k;
                if (z2Var != null) {
                    z2Var.setAlpha(i5Var.l);
                    i5Var.k.h(canvas, icVar);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        i5 i5Var;
        i5 i5Var2;
        float f12;
        float f13;
        tw twVar = this.R;
        hy hyVar = twVar.m3;
        if (this.O != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.O.size()) {
                qx qxVar = (qx) this.O.get(i10);
                if (qxVar.getSpan() == null || (i5Var = (i5) hyVar.d2.get(qxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (qxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(qxVar.getPaddingLeft() + qxVar.getLeft(), height, qxVar.getRight() - qxVar.getPaddingRight(), ((qxVar.getMeasuredHeight() + height) - qxVar.getPaddingBottom()) - qxVar.getPaddingTop());
                    float f16 = qxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (hyVar.v2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - hyVar.v2 < twVar.z1()) {
                            if (hyVar.t2 >= 0 && hyVar.u2 >= 0 && hyVar.v2 > 0) {
                                int R = RecyclerView.R(qxVar);
                                int i11 = hyVar.t2;
                                int i12 = R - i11;
                                int i13 = hyVar.u2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    i5Var2 = i5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.j9.a(com.google.android.recaptcha.internal.a.w(max, 0.45f, SystemClock.elapsedRealtime() - hyVar.v2, Math.max(400L, Math.min(45, hyVar.u2 - hyVar.t2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = xq.g.getInterpolation(c8.j9.a((SystemClock.elapsedRealtime() - hyVar.v2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s5 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.Q.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s5;
                                    i5Var2.setAlpha((int) (255.0f * f15));
                                    i5Var2.setBounds(rect);
                                    i5Var2.setColorFilter(hyVar.e2);
                                    if (f13 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                        i5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        i5Var2.draw(canvas);
                                    }
                                }
                            }
                            i5Var2 = i5Var;
                            f12 = f17;
                            f11 = 0.0f;
                            f13 = f12;
                            i5Var2.setAlpha((int) (255.0f * f15));
                            i5Var2.setBounds(rect);
                            i5Var2.setColorFilter(hyVar.e2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i7 = i10;
                    }
                    i5Var2 = i5Var;
                    f12 = f17;
                    f13 = f12;
                    i5Var2.setAlpha((int) (255.0f * f15));
                    i5Var2.setBounds(rect);
                    i5Var2.setColorFilter(hyVar.e2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                this.R.m3.P.invalidate();
                return;
            }
            org.telegram.messenger.ic[] icVarArr = ((qx) arrayList.get(i7)).f;
            if (icVarArr != null) {
                icVarArr[this.K].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void i(long j3) {
        i5 i5Var;
        hy hyVar = this.R.m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            qx qxVar = (qx) this.O.get(i7);
            r5 span = qxVar.getSpan();
            org.telegram.messenger.ic[] icVarArr = qxVar.f;
            if (span != null && (i5Var = (i5) hyVar.d2.get(qxVar.d.getDocumentId())) != null && i5Var.k != null) {
                i5Var.s(j3);
                di.z2 z2Var = i5Var.k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.c = j3;
                e02.b = 1.0f;
                i5Var.setAlpha(org.telegram.messenger.qs.e4);
                int height = (int) (qxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((qxVar.getPaddingLeft() + qxVar.getLeft()) - this.N, height, (qxVar.getRight() - qxVar.getPaddingRight()) - this.N, ((qxVar.getMeasuredHeight() + height) - qxVar.getPaddingTop()) - qxVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                qxVar.b = i5Var;
                icVarArr[i10].z = i5Var.c() ? hyVar.e2 : null;
                arrayList.add(qxVar);
            }
        }
    }
}
