package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pw extends is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ rw S;

    public pw(rw rwVar) {
        this.S = rwVar;
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        int i11;
        rw rwVar = this.S;
        ey eyVar = rwVar.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.az.o() == 0 || !org.telegram.messenger.lc.e(16388);
        if (!z11) {
            boolean z12 = eyVar.w2 > 0 && SystemClock.elapsedRealtime() - eyVar.w2 < rwVar.z1();
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                nx nxVar = (nx) this.P.get(i12);
                if (nxVar.h != 0.0f || nxVar.n != null || ((i11 = nxVar.a) > eyVar.u2 && i11 < eyVar.v2 && z12)) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i3, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 >= arrayList.size()) {
                return;
            }
            nx nxVar = (nx) arrayList.get(i3);
            g5 g5Var = nxVar.b;
            if (g5Var != null) {
                org.telegram.messenger.bc bcVar = nxVar.f[this.L];
                ei.c3 c3Var = g5Var.k;
                if (c3Var != null) {
                    c3Var.setAlpha(g5Var.l);
                    g5Var.k.h(canvas, bcVar);
                }
            }
            i3++;
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
        int i3;
        g5 g5Var;
        g5 g5Var2;
        float f12;
        float f13;
        rw rwVar = this.S;
        ey eyVar = rwVar.n3;
        if (this.P != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.P.size()) {
                nx nxVar = (nx) this.P.get(i10);
                if (nxVar.getSpan() == null || (g5Var = (g5) eyVar.e2.get(nxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i3 = i10;
                } else {
                    int height = (int) (nxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(nxVar.getPaddingLeft() + nxVar.getLeft(), height, nxVar.getRight() - nxVar.getPaddingRight(), ((nxVar.getMeasuredHeight() + height) - nxVar.getPaddingBottom()) - nxVar.getPaddingTop());
                    float f16 = nxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (eyVar.w2 > 0) {
                        i3 = i10;
                        if (SystemClock.elapsedRealtime() - eyVar.w2 < rwVar.z1()) {
                            if (eyVar.u2 >= 0 && eyVar.v2 >= 0 && eyVar.w2 > 0) {
                                int R = RecyclerView.R(nxVar);
                                int i11 = eyVar.u2;
                                int i12 = R - i11;
                                int i13 = eyVar.v2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    g5Var2 = g5Var;
                                    f11 = 0.0f;
                                    float a10 = b8.be.a(com.google.android.recaptcha.internal.a.c(max, 0.45f, SystemClock.elapsedRealtime() - eyVar.w2, Math.max(400L, Math.min(45, eyVar.v2 - eyVar.u2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = xq.g.getInterpolation(b8.be.a((SystemClock.elapsedRealtime() - eyVar.w2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s6 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.R.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s6;
                                    g5Var2.setAlpha((int) (255.0f * f15));
                                    g5Var2.setBounds(rect);
                                    g5Var2.setColorFilter(eyVar.f2);
                                    if (f13 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                        g5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        g5Var2.draw(canvas);
                                    }
                                }
                            }
                            g5Var2 = g5Var;
                            f12 = f17;
                            f11 = 0.0f;
                            f13 = f12;
                            g5Var2.setAlpha((int) (255.0f * f15));
                            g5Var2.setBounds(rect);
                            g5Var2.setColorFilter(eyVar.f2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i3 = i10;
                    }
                    g5Var2 = g5Var;
                    f12 = f17;
                    f13 = f12;
                    g5Var2.setAlpha((int) (255.0f * f15));
                    g5Var2.setBounds(rect);
                    g5Var2.setColorFilter(eyVar.f2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i3 + 1;
                f14 = f11;
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
                this.S.n3.Q.invalidate();
                return;
            }
            org.telegram.messenger.bc[] bcVarArr = ((nx) arrayList.get(i3)).f;
            if (bcVarArr != null) {
                bcVarArr[this.L].a();
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void i(long j10) {
        g5 g5Var;
        ey eyVar = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            nx nxVar = (nx) this.P.get(i3);
            p5 span = nxVar.getSpan();
            org.telegram.messenger.bc[] bcVarArr = nxVar.f;
            if (span != null && (g5Var = (g5) eyVar.e2.get(nxVar.d.getDocumentId())) != null && g5Var.k != null) {
                g5Var.s(j10);
                ei.c3 c3Var = g5Var.k;
                int i10 = this.L;
                org.telegram.messenger.bc e02 = c3Var.e0(bcVarArr[i10], i10);
                bcVarArr[i10] = e02;
                e02.c = j10;
                e02.b = 1.0f;
                g5Var.setAlpha(org.telegram.messenger.hs.e4);
                int height = (int) (nxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((nxVar.getPaddingLeft() + nxVar.getLeft()) - this.O, height, (nxVar.getRight() - nxVar.getPaddingRight()) - this.O, ((nxVar.getMeasuredHeight() + height) - nxVar.getPaddingTop()) - nxVar.getPaddingBottom());
                bcVarArr[i10].b(rect);
                nxVar.b = g5Var;
                bcVarArr[i10].z = g5Var.c() ? eyVar.f2 : null;
                arrayList.add(nxVar);
            }
        }
    }
}
