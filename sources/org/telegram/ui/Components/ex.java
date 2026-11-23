package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ex extends xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ gx S;

    public ex(gx gxVar) {
        this.S = gxVar;
    }

    @Override // org.telegram.ui.Components.xs
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        gx gxVar = this.S;
        ty tyVar = gxVar.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.cz.o() == 0 || !org.telegram.messenger.qc.e(16388);
        if (!z11) {
            boolean z12 = tyVar.w2 > 0 && SystemClock.elapsedRealtime() - tyVar.w2 < gxVar.z1();
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                cy cyVar = (cy) this.P.get(i12);
                if (cyVar.h != 0.0f || cyVar.n != null || ((i11 = cyVar.a) > tyVar.u2 && i11 < tyVar.v2 && z12)) {
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

    @Override // org.telegram.ui.Components.xs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            cy cyVar = (cy) arrayList.get(i7);
            p5 p5Var = cyVar.b;
            if (p5Var != null) {
                org.telegram.messenger.hc hcVar = cyVar.f[this.L];
                fi.s2 s2Var = p5Var.k;
                if (s2Var != null) {
                    s2Var.setAlpha(p5Var.l);
                    p5Var.k.h(canvas, hcVar);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.xs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        p5 p5Var;
        p5 p5Var2;
        float f12;
        float f13;
        gx gxVar = this.S;
        ty tyVar = gxVar.n3;
        if (this.P != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.P.size()) {
                cy cyVar = (cy) this.P.get(i10);
                if (cyVar.getSpan() == null || (p5Var = (p5) tyVar.e2.get(cyVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (cyVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(cyVar.getPaddingLeft() + cyVar.getLeft(), height, cyVar.getRight() - cyVar.getPaddingRight(), ((cyVar.getMeasuredHeight() + height) - cyVar.getPaddingBottom()) - cyVar.getPaddingTop());
                    float f16 = cyVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (tyVar.w2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - tyVar.w2 < gxVar.z1()) {
                            if (tyVar.u2 >= 0 && tyVar.v2 >= 0 && tyVar.w2 > 0) {
                                int R = RecyclerView.R(cyVar);
                                int i11 = tyVar.u2;
                                int i12 = R - i11;
                                int i13 = tyVar.v2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    p5Var2 = p5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.l9.a(com.google.android.gms.internal.vision.e2.w(max, 0.45f, SystemClock.elapsedRealtime() - tyVar.w2, Math.max(400L, Math.min(45, tyVar.v2 - tyVar.u2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = nr.g.getInterpolation(c8.l9.a((SystemClock.elapsedRealtime() - tyVar.w2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s5 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.R.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s5;
                                    p5Var2.setAlpha((int) (255.0f * f15));
                                    p5Var2.setBounds(rect);
                                    p5Var2.setColorFilter(tyVar.f2);
                                    if (f13 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                        p5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        p5Var2.draw(canvas);
                                    }
                                }
                            }
                            p5Var2 = p5Var;
                            f12 = f17;
                            f11 = 0.0f;
                            f13 = f12;
                            p5Var2.setAlpha((int) (255.0f * f15));
                            p5Var2.setBounds(rect);
                            p5Var2.setColorFilter(tyVar.f2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i7 = i10;
                    }
                    p5Var2 = p5Var;
                    f12 = f17;
                    f13 = f12;
                    p5Var2.setAlpha((int) (255.0f * f15));
                    p5Var2.setBounds(rect);
                    p5Var2.setColorFilter(tyVar.f2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.xs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            org.telegram.messenger.hc[] hcVarArr = ((cy) arrayList.get(i7)).f;
            if (hcVarArr != null) {
                hcVarArr[this.L].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.xs
    public final void i(long j3) {
        p5 p5Var;
        ty tyVar = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            cy cyVar = (cy) this.P.get(i7);
            y5 span = cyVar.getSpan();
            org.telegram.messenger.hc[] hcVarArr = cyVar.f;
            if (span != null && (p5Var = (p5) tyVar.e2.get(cyVar.d.getDocumentId())) != null && p5Var.k != null) {
                p5Var.s(j3);
                fi.s2 s2Var = p5Var.k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = s2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.c = j3;
                e02.b = 1.0f;
                p5Var.setAlpha(org.telegram.messenger.ls.e4);
                int height = (int) (cyVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((cyVar.getPaddingLeft() + cyVar.getLeft()) - this.O, height, (cyVar.getRight() - cyVar.getPaddingRight()) - this.O, ((cyVar.getMeasuredHeight() + height) - cyVar.getPaddingTop()) - cyVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                cyVar.b = p5Var;
                hcVarArr[i10].z = p5Var.c() ? tyVar.f2 : null;
                arrayList.add(cyVar);
            }
        }
    }
}
