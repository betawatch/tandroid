package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ww extends os {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ yw S;

    public ww(yw ywVar) {
        this.S = ywVar;
    }

    @Override // org.telegram.ui.Components.os
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        yw ywVar = this.S;
        ly lyVar = ywVar.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.gz.o() == 0 || !org.telegram.messenger.qc.e(16388);
        if (!z11) {
            boolean z12 = lyVar.w2 > 0 && SystemClock.elapsedRealtime() - lyVar.w2 < ywVar.z1();
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                ux uxVar = (ux) this.P.get(i12);
                if (uxVar.h != 0.0f || uxVar.n != null || ((i11 = uxVar.a) > lyVar.u2 && i11 < lyVar.v2 && z12)) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i7, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.os
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            ux uxVar = (ux) arrayList.get(i7);
            g5 g5Var = uxVar.b;
            if (g5Var != null) {
                org.telegram.messenger.hc hcVar = uxVar.f[this.L];
                fi.u2 u2Var = g5Var.k;
                if (u2Var != null) {
                    u2Var.setAlpha(g5Var.l);
                    g5Var.k.h(canvas, hcVar);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        g5 g5Var;
        g5 g5Var2;
        float f12;
        float f13;
        yw ywVar = this.S;
        ly lyVar = ywVar.n3;
        if (this.P != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.P.size()) {
                ux uxVar = (ux) this.P.get(i10);
                if (uxVar.getSpan() == null || (g5Var = (g5) lyVar.e2.get(uxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (uxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(uxVar.getPaddingLeft() + uxVar.getLeft(), height, uxVar.getRight() - uxVar.getPaddingRight(), ((uxVar.getMeasuredHeight() + height) - uxVar.getPaddingBottom()) - uxVar.getPaddingTop());
                    float f16 = uxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (lyVar.w2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - lyVar.w2 < ywVar.z1()) {
                            if (lyVar.u2 >= 0 && lyVar.v2 >= 0 && lyVar.w2 > 0) {
                                int R = RecyclerView.R(uxVar);
                                int i11 = lyVar.u2;
                                int i12 = R - i11;
                                int i13 = lyVar.v2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    g5Var2 = g5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.i9.a(com.google.android.gms.internal.vision.e2.w(max, 0.45f, SystemClock.elapsedRealtime() - lyVar.w2, Math.max(400L, Math.min(45, lyVar.v2 - lyVar.u2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = er.g.getInterpolation(c8.i9.a((SystemClock.elapsedRealtime() - lyVar.w2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s5 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.R.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s5;
                                    g5Var2.setAlpha((int) (255.0f * f15));
                                    g5Var2.setBounds(rect);
                                    g5Var2.setColorFilter(lyVar.f2);
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
                            g5Var2.setColorFilter(lyVar.f2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i7 = i10;
                    }
                    g5Var2 = g5Var;
                    f12 = f17;
                    f13 = f12;
                    g5Var2.setAlpha((int) (255.0f * f15));
                    g5Var2.setBounds(rect);
                    g5Var2.setColorFilter(lyVar.f2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
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
                this.S.n3.Q.invalidate();
                return;
            }
            org.telegram.messenger.hc[] hcVarArr = ((ux) arrayList.get(i7)).f;
            if (hcVarArr != null) {
                hcVarArr[this.L].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void i(long j3) {
        g5 g5Var;
        ly lyVar = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            ux uxVar = (ux) this.P.get(i7);
            p5 span = uxVar.getSpan();
            org.telegram.messenger.hc[] hcVarArr = uxVar.f;
            if (span != null && (g5Var = (g5) lyVar.e2.get(uxVar.d.getDocumentId())) != null && g5Var.k != null) {
                g5Var.s(j3);
                fi.u2 u2Var = g5Var.k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = u2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.c = j3;
                e02.b = 1.0f;
                g5Var.setAlpha(org.telegram.messenger.ns.e4);
                int height = (int) (uxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((uxVar.getPaddingLeft() + uxVar.getLeft()) - this.O, height, (uxVar.getRight() - uxVar.getPaddingRight()) - this.O, ((uxVar.getMeasuredHeight() + height) - uxVar.getPaddingTop()) - uxVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                uxVar.b = g5Var;
                hcVarArr[i10].z = g5Var.c() ? lyVar.f2 : null;
                arrayList.add(uxVar);
            }
        }
    }
}
