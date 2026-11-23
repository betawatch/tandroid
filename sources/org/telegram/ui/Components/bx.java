package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bx extends us {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ dx S;

    public bx(dx dxVar) {
        this.S = dxVar;
    }

    @Override // org.telegram.ui.Components.us
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        dx dxVar = this.S;
        qy qyVar = dxVar.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.bz.o() == 0 || !org.telegram.messenger.pc.e(16388);
        if (!z11) {
            boolean z12 = qyVar.w2 > 0 && SystemClock.elapsedRealtime() - qyVar.w2 < dxVar.z1();
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                yx yxVar = (yx) this.P.get(i12);
                if (yxVar.h != 0.0f || yxVar.n != null || ((i11 = yxVar.a) > qyVar.u2 && i11 < qyVar.v2 && z12)) {
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

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            yx yxVar = (yx) arrayList.get(i7);
            o5 o5Var = yxVar.b;
            if (o5Var != null) {
                org.telegram.messenger.gc gcVar = yxVar.f[this.L];
                fi.s2 s2Var = o5Var.k;
                if (s2Var != null) {
                    s2Var.setAlpha(o5Var.l);
                    o5Var.k.h(canvas, gcVar);
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        o5 o5Var;
        o5 o5Var2;
        float f12;
        float f13;
        dx dxVar = this.S;
        qy qyVar = dxVar.n3;
        if (this.P != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.P.size()) {
                yx yxVar = (yx) this.P.get(i10);
                if (yxVar.getSpan() == null || (o5Var = (o5) qyVar.e2.get(yxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (yxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(yxVar.getPaddingLeft() + yxVar.getLeft(), height, yxVar.getRight() - yxVar.getPaddingRight(), ((yxVar.getMeasuredHeight() + height) - yxVar.getPaddingBottom()) - yxVar.getPaddingTop());
                    float f16 = yxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (qyVar.w2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - qyVar.w2 < dxVar.z1()) {
                            if (qyVar.u2 >= 0 && qyVar.v2 >= 0 && qyVar.w2 > 0) {
                                int R = RecyclerView.R(yxVar);
                                int i11 = qyVar.u2;
                                int i12 = R - i11;
                                int i13 = qyVar.v2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    o5Var2 = o5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.m9.a(com.google.android.gms.internal.vision.e2.w(max, 0.45f, SystemClock.elapsedRealtime() - qyVar.w2, Math.max(400L, Math.min(45, qyVar.v2 - qyVar.u2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = kr.g.getInterpolation(c8.m9.a((SystemClock.elapsedRealtime() - qyVar.w2) / max, 0.0f, 1.0f));
                                    float f19 = i12;
                                    float f20 = i13;
                                    org.telegram.messenger.g0.s(a10, f19, f20, f20 / 5.0f);
                                    float f21 = f20 / 4.0f;
                                    float s5 = org.telegram.messenger.g0.s(interpolation, f19, f20, f21);
                                    int i14 = i13 / 4;
                                    f13 = ((this.R.getInterpolation(org.telegram.messenger.g0.s(interpolation, i12 + i14, i13 + i14, f21)) * 0.5f) + 0.5f) * f18;
                                    f15 *= s5;
                                    o5Var2.setAlpha((int) (255.0f * f15));
                                    o5Var2.setBounds(rect);
                                    o5Var2.setColorFilter(qyVar.f2);
                                    if (f13 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                        o5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        o5Var2.draw(canvas);
                                    }
                                }
                            }
                            o5Var2 = o5Var;
                            f12 = f17;
                            f11 = 0.0f;
                            f13 = f12;
                            o5Var2.setAlpha((int) (255.0f * f15));
                            o5Var2.setBounds(rect);
                            o5Var2.setColorFilter(qyVar.f2);
                            if (f13 != 1.0f) {
                            }
                        } else {
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = f14;
                        i7 = i10;
                    }
                    o5Var2 = o5Var;
                    f12 = f17;
                    f13 = f12;
                    o5Var2.setAlpha((int) (255.0f * f15));
                    o5Var2.setBounds(rect);
                    o5Var2.setColorFilter(qyVar.f2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            org.telegram.messenger.gc[] gcVarArr = ((yx) arrayList.get(i7)).f;
            if (gcVarArr != null) {
                gcVarArr[this.L].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void i(long j3) {
        o5 o5Var;
        qy qyVar = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            yx yxVar = (yx) this.P.get(i7);
            x5 span = yxVar.getSpan();
            org.telegram.messenger.gc[] gcVarArr = yxVar.f;
            if (span != null && (o5Var = (o5) qyVar.e2.get(yxVar.d.getDocumentId())) != null && o5Var.k != null) {
                o5Var.s(j3);
                fi.s2 s2Var = o5Var.k;
                int i10 = this.L;
                org.telegram.messenger.gc f02 = s2Var.f0(gcVarArr[i10], i10);
                gcVarArr[i10] = f02;
                f02.c = j3;
                f02.b = 1.0f;
                o5Var.setAlpha(org.telegram.messenger.ks.e4);
                int height = (int) (yxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((yxVar.getPaddingLeft() + yxVar.getLeft()) - this.O, height, (yxVar.getRight() - yxVar.getPaddingRight()) - this.O, ((yxVar.getMeasuredHeight() + height) - yxVar.getPaddingTop()) - yxVar.getPaddingBottom());
                gcVarArr[i10].b(rect);
                yxVar.b = o5Var;
                gcVarArr[i10].z = o5Var.c() ? qyVar.f2 : null;
                arrayList.add(yxVar);
            }
        }
    }
}
