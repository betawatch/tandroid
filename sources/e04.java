// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e04 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final OvershootInterpolator R = new OvershootInterpolator(3.0f);
    public final /* synthetic */ g04 S;

    public e04(g04 g04Var) {
        this.S = g04Var;
    }

    @Override // oq3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        int i3;
        g04 g04Var = this.S;
        t14 t14Var = g04Var.n3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        boolean z = true;
        boolean z2 = arrayList.size() <= 4 || gba.o() == 0 || !e66.e(16388);
        if (!z2) {
            boolean z3 = t14Var.v2 > 0 && SystemClock.elapsedRealtime() - t14Var.v2 < g04Var.z1();
            for (int i4 = 0; i4 < this.P.size(); i4++) {
                c14 c14Var = (c14) this.P.get(i4);
                if (c14Var.h != 0.0f || c14Var.n != null || ((i3 = c14Var.a) > t14Var.t2 && i3 < t14Var.u2 && z3)) {
                    break;
                }
            }
        }
        z = z2;
        if (!z) {
            super.a(canvas, j, i, i2, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // oq3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            c14 c14Var = (c14) arrayList.get(i);
            vl vlVar = c14Var.b;
            if (vlVar != null) {
                il5 il5Var = c14Var.f[this.L];
                ml mlVar = vlVar.k;
                if (mlVar != null) {
                    mlVar.setAlpha(vlVar.l);
                    vlVar.k.h(canvas, il5Var);
                }
            }
            i++;
        }
    }

    @Override // oq3
    public final void d(Canvas canvas, float f) {
        int i;
        float f2;
        vl vlVar;
        g04 g04Var = this.S;
        t14 t14Var = g04Var.n3;
        if (this.P != null) {
            canvas.save();
            float f3 = 0.0f;
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f4 = f;
            while (i2 < this.P.size()) {
                c14 c14Var = (c14) this.P.get(i2);
                if (c14Var.getSpan() == null || (vlVar = (vl) t14Var.e2.get(c14Var.d.getDocumentId())) == null) {
                    i = i2;
                    f2 = f3;
                } else {
                    int height = (int) (c14Var.getHeight() * 0.03f);
                    Rect rect = gl.Q;
                    rect.set(c14Var.getPaddingLeft() + c14Var.getLeft(), height, c14Var.getRight() - c14Var.getPaddingRight(), ((c14Var.getMeasuredHeight() + height) - c14Var.getPaddingBottom()) - c14Var.getPaddingTop());
                    float f5 = c14Var.h;
                    float f6 = f5 != f3 ? (((1.0f - f5) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (t14Var.v2 > 0) {
                        i = i2;
                        if (SystemClock.elapsedRealtime() - t14Var.v2 < g04Var.z1() && t14Var.t2 >= 0 && t14Var.u2 >= 0 && t14Var.v2 > 0) {
                            int R = RecyclerView.R(c14Var);
                            int i3 = t14Var.t2;
                            int i4 = R - i3;
                            int i5 = t14Var.u2 - i3;
                            if (i4 >= 0 && i4 < i5) {
                                float max = Math.max(600L, Math.min(55, r7 - i3) * 40);
                                SystemClock.elapsedRealtime();
                                float elapsedRealtime = (SystemClock.elapsedRealtime() - t14Var.v2) / max;
                                f2 = 0.0f;
                                float interpolation = s33.g.getInterpolation(moe.a(elapsedRealtime, 0.0f, 1.0f));
                                float f7 = i5;
                                float f8 = f7 / 4.0f;
                                float s = gl.s(interpolation, i4, f7, f8);
                                int i6 = i5 / 4;
                                f6 *= (this.R.getInterpolation(gl.s(interpolation, i4 + i6, i5 + i6, f8)) * 0.5f) + 0.5f;
                                f4 *= s;
                            }
                        }
                        f2 = 0.0f;
                    } else {
                        i = i2;
                        f2 = f3;
                    }
                    vlVar.setAlpha((int) (255.0f * f4));
                    vlVar.setBounds(rect);
                    vlVar.setColorFilter(t14Var.f2);
                    if (f6 != 1.0f) {
                        canvas.save();
                        canvas.scale(f6, f6, rect.centerX(), rect.centerY());
                        vlVar.draw(canvas);
                        canvas.restore();
                    } else {
                        vlVar.draw(canvas);
                    }
                }
                float f9 = f2;
                i2 = i + 1;
                f3 = f9;
            }
            canvas.restore();
        }
    }

    @Override // oq3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.n3.Q.invalidate();
                return;
            }
            il5[] il5VarArr = ((c14) arrayList.get(i)).f;
            if (il5VarArr != null) {
                il5VarArr[this.L].a();
            }
            i++;
        }
    }

    @Override // oq3
    public final void i(long j) {
        vl vlVar;
        t14 t14Var = this.S.n3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i = 0; i < this.P.size(); i++) {
            c14 c14Var = (c14) this.P.get(i);
            gm span = c14Var.getSpan();
            il5[] il5VarArr = c14Var.f;
            if (span != null && (vlVar = (vl) t14Var.e2.get(c14Var.d.getDocumentId())) != null && vlVar.k != null) {
                vlVar.s(j);
                ml mlVar = vlVar.k;
                int i2 = this.L;
                il5 Q = mlVar.Q(il5VarArr[i2], i2);
                il5VarArr[i2] = Q;
                Q.c = j;
                Q.b = 1.0f;
                vlVar.setAlpha(kk7.d4);
                int height = (int) (c14Var.getHeight() * 0.03f);
                Rect rect = gl.Q;
                rect.set((c14Var.getPaddingLeft() + c14Var.getLeft()) - this.O, height, (c14Var.getRight() - c14Var.getPaddingRight()) - this.O, ((c14Var.getMeasuredHeight() + height) - c14Var.getPaddingTop()) - c14Var.getPaddingBottom());
                il5VarArr[i2].b(rect);
                c14Var.b = vlVar;
                il5VarArr[i2].z = vlVar.c() ? t14Var.f2 : null;
                arrayList.add(c14Var);
            }
        }
    }
}
