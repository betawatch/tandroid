package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class cx extends vs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ ex S;

    public cx(ex exVar) {
        this.S = exVar;
    }

    @Override // org.telegram.ui.Components.vs
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        int i11;
        ex exVar = this.S;
        ry ryVar = exVar.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || org.telegram.messenger.bz.o() == 0 || !org.telegram.messenger.pc.e(16388);
        if (!z11) {
            boolean z12 = ryVar.w2 > 0 && SystemClock.elapsedRealtime() - ryVar.w2 < exVar.z1();
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                zx zxVar = (zx) this.P.get(i12);
                if (zxVar.h != 0.0f || zxVar.n != null || ((i11 = zxVar.a) > ryVar.u2 && i11 < ryVar.v2 && z12)) {
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

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            zx zxVar = (zx) arrayList.get(i7);
            o5 o5Var = zxVar.b;
            if (o5Var != null) {
                org.telegram.messenger.gc gcVar = zxVar.f[this.L];
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
    @Override // org.telegram.ui.Components.vs
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
        ex exVar = this.S;
        ry ryVar = exVar.n3;
        if (this.P != null) {
            canvas.save();
            float f14 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i10 = 0;
            float f15 = f10;
            while (i10 < this.P.size()) {
                zx zxVar = (zx) this.P.get(i10);
                if (zxVar.getSpan() == null || (o5Var = (o5) ryVar.e2.get(zxVar.d.getDocumentId())) == null) {
                    f11 = f14;
                    i7 = i10;
                } else {
                    int height = (int) (zxVar.getHeight() * 0.03f);
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(zxVar.getPaddingLeft() + zxVar.getLeft(), height, zxVar.getRight() - zxVar.getPaddingRight(), ((zxVar.getMeasuredHeight() + height) - zxVar.getPaddingBottom()) - zxVar.getPaddingTop());
                    float f16 = zxVar.h;
                    float f17 = f16 != f14 ? (((1.0f - f16) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (ryVar.w2 > 0) {
                        i7 = i10;
                        if (SystemClock.elapsedRealtime() - ryVar.w2 < exVar.z1()) {
                            if (ryVar.u2 >= 0 && ryVar.v2 >= 0 && ryVar.w2 > 0) {
                                int R = RecyclerView.R(zxVar);
                                int i11 = ryVar.u2;
                                int i12 = R - i11;
                                int i13 = ryVar.v2 - i11;
                                if (i12 >= 0 && i12 < i13) {
                                    float max = Math.max(600L, Math.min(55, r7 - i11) * 40);
                                    o5Var2 = o5Var;
                                    f11 = 0.0f;
                                    float a10 = c8.l9.a(com.google.android.gms.internal.vision.e2.w(max, 0.45f, SystemClock.elapsedRealtime() - ryVar.w2, Math.max(400L, Math.min(45, ryVar.v2 - ryVar.u2) * 35)), 0.0f, 1.0f);
                                    float f18 = f17;
                                    float interpolation = lr.g.getInterpolation(c8.l9.a((SystemClock.elapsedRealtime() - ryVar.w2) / max, 0.0f, 1.0f));
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
                                    o5Var2.setColorFilter(ryVar.f2);
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
                            o5Var2.setColorFilter(ryVar.f2);
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
                    o5Var2.setColorFilter(ryVar.f2);
                    if (f13 != 1.0f) {
                    }
                }
                i10 = i7 + 1;
                f14 = f11;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            org.telegram.messenger.gc[] gcVarArr = ((zx) arrayList.get(i7)).f;
            if (gcVarArr != null) {
                gcVarArr[this.L].a();
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void i(long j3) {
        o5 o5Var;
        ry ryVar = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            zx zxVar = (zx) this.P.get(i7);
            x5 span = zxVar.getSpan();
            org.telegram.messenger.gc[] gcVarArr = zxVar.f;
            if (span != null && (o5Var = (o5) ryVar.e2.get(zxVar.d.getDocumentId())) != null && o5Var.k != null) {
                o5Var.s(j3);
                fi.s2 s2Var = o5Var.k;
                int i10 = this.L;
                org.telegram.messenger.gc e02 = s2Var.e0(gcVarArr[i10], i10);
                gcVarArr[i10] = e02;
                e02.c = j3;
                e02.b = 1.0f;
                o5Var.setAlpha(org.telegram.messenger.ks.e4);
                int height = (int) (zxVar.getHeight() * 0.03f);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set((zxVar.getPaddingLeft() + zxVar.getLeft()) - this.O, height, (zxVar.getRight() - zxVar.getPaddingRight()) - this.O, ((zxVar.getMeasuredHeight() + height) - zxVar.getPaddingTop()) - zxVar.getPaddingBottom());
                gcVarArr[i10].b(rect);
                zxVar.b = o5Var;
                gcVarArr[i10].z = o5Var.c() ? ryVar.f2 : null;
                arrayList.add(zxVar);
            }
        }
    }
}
