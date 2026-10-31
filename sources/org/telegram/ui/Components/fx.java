package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fx extends ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ hx R;

    public fx(hx hxVar) {
        this.R = hxVar;
    }

    @Override // org.telegram.ui.Components.ts
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        int i12;
        hx hxVar = this.R;
        vy vyVar = hxVar.m3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.tz.o() == 0 || !org.telegram.messenger.sc.e(16388);
        if (!z11) {
            boolean z12 = vyVar.v2 > 0 && SystemClock.elapsedRealtime() - vyVar.v2 < hxVar.z1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ey eyVar = (ey) this.O.get(i13);
                if (eyVar.h != 0.0f || eyVar.n != null || ((i12 = eyVar.a) > vyVar.t2 && i12 < vyVar.u2 && z12)) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.ts
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ey eyVar = (ey) arrayList.get(i10);
            f5 f5Var = eyVar.b;
            if (f5Var != null) {
                org.telegram.messenger.jc jcVar = eyVar.f[this.K];
                ag.c2 c2Var = f5Var.k;
                if (c2Var != null) {
                    c2Var.setAlpha(f5Var.l);
                    f5Var.k.h(canvas, jcVar);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.ts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        f5 f5Var;
        f5 f5Var2;
        float f11;
        float f12;
        hx hxVar = this.R;
        vy vyVar = hxVar.m3;
        if (this.O != null) {
            canvas.save();
            float f13 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f14 = f7;
            while (i11 < this.O.size()) {
                ey eyVar = (ey) this.O.get(i11);
                if (eyVar.getSpan() == null || (f5Var = (f5) vyVar.d2.get(eyVar.d.getDocumentId())) == null) {
                    f10 = f13;
                    i10 = i11;
                } else {
                    int height = (int) (eyVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.i0.Q;
                    rect.set(eyVar.getPaddingLeft() + eyVar.getLeft(), height, eyVar.getRight() - eyVar.getPaddingRight(), ((eyVar.getMeasuredHeight() + height) - eyVar.getPaddingBottom()) - eyVar.getPaddingTop());
                    float f15 = eyVar.h;
                    float f16 = f15 != f13 ? (((1.0f - f15) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (vyVar.v2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - vyVar.v2 < hxVar.z1()) {
                            if (vyVar.t2 >= 0 && vyVar.u2 >= 0 && vyVar.v2 > 0) {
                                int R = RecyclerView.R(eyVar);
                                int i12 = vyVar.t2;
                                int i13 = R - i12;
                                int i14 = vyVar.u2 - i12;
                                if (i13 >= 0 && i13 < i14) {
                                    float max = Math.max(600L, Math.min(55, r7 - i12) * 40);
                                    f5Var2 = f5Var;
                                    f10 = 0.0f;
                                    float a2 = w7.u.a(c3.i0.g(max, 0.45f, SystemClock.elapsedRealtime() - vyVar.v2, Math.max(400L, Math.min(45, vyVar.u2 - vyVar.t2) * 35)), 0.0f, 1.0f);
                                    float f17 = f16;
                                    float interpolation = gr.g.getInterpolation(w7.u.a((SystemClock.elapsedRealtime() - vyVar.v2) / max, 0.0f, 1.0f));
                                    float f18 = i13;
                                    float f19 = i14;
                                    org.telegram.messenger.i0.s(a2, f18, f19, f19 / 5.0f);
                                    float f20 = f19 / 4.0f;
                                    float s10 = org.telegram.messenger.i0.s(interpolation, f18, f19, f20);
                                    int i15 = i14 / 4;
                                    f12 = ((this.Q.getInterpolation(org.telegram.messenger.i0.s(interpolation, i13 + i15, i14 + i15, f20)) * 0.5f) + 0.5f) * f17;
                                    f14 *= s10;
                                    f5Var2.setAlpha((int) (255.0f * f14));
                                    f5Var2.setBounds(rect);
                                    f5Var2.setColorFilter(vyVar.e2);
                                    if (f12 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f12, f12, rect.centerX(), rect.centerY());
                                        f5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        f5Var2.draw(canvas);
                                    }
                                }
                            }
                            f5Var2 = f5Var;
                            f11 = f16;
                            f10 = 0.0f;
                            f12 = f11;
                            f5Var2.setAlpha((int) (255.0f * f14));
                            f5Var2.setBounds(rect);
                            f5Var2.setColorFilter(vyVar.e2);
                            if (f12 != 1.0f) {
                            }
                        } else {
                            f10 = 0.0f;
                        }
                    } else {
                        f10 = f13;
                        i10 = i11;
                    }
                    f5Var2 = f5Var;
                    f11 = f16;
                    f12 = f11;
                    f5Var2.setAlpha((int) (255.0f * f14));
                    f5Var2.setBounds(rect);
                    f5Var2.setColorFilter(vyVar.e2);
                    if (f12 != 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f13 = f10;
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
                this.R.m3.P.invalidate();
                return;
            }
            org.telegram.messenger.jc[] jcVarArr = ((ey) arrayList.get(i10)).f;
            if (jcVarArr != null) {
                jcVarArr[this.K].a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void i(long j10) {
        f5 f5Var;
        vy vyVar = this.R.m3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ey eyVar = (ey) this.O.get(i10);
            o5 span = eyVar.getSpan();
            org.telegram.messenger.jc[] jcVarArr = eyVar.f;
            if (span != null && (f5Var = (f5) vyVar.d2.get(eyVar.d.getDocumentId())) != null && f5Var.k != null) {
                f5Var.s(j10);
                ag.c2 c2Var = f5Var.k;
                int i11 = this.K;
                org.telegram.messenger.jc e02 = c2Var.e0(jcVarArr[i11], i11);
                jcVarArr[i11] = e02;
                e02.c = j10;
                e02.b = 1.0f;
                f5Var.setAlpha(org.telegram.messenger.zs.e4);
                int height = (int) (eyVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set((eyVar.getPaddingLeft() + eyVar.getLeft()) - this.N, height, (eyVar.getRight() - eyVar.getPaddingRight()) - this.N, ((eyVar.getMeasuredHeight() + height) - eyVar.getPaddingTop()) - eyVar.getPaddingBottom());
                jcVarArr[i11].b(rect);
                eyVar.b = f5Var;
                jcVarArr[i11].z = f5Var.c() ? vyVar.e2 : null;
                arrayList.add(eyVar);
            }
        }
    }
}
