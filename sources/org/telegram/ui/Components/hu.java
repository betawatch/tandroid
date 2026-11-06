package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hu extends is {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ iu P;

    public hu(iu iuVar) {
        this.P = iuVar;
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = arrayList.size() <= 3 || org.telegram.messenger.iz.o() == 0;
        if (!z10) {
            for (int i11 = 0; i11 < this.N.size(); i11++) {
                ju juVar = (ju) this.N.get(i11);
                if (juVar.e != 0.0f || juVar.d != null || juVar.getTranslationX() != 0.0f || juVar.getTranslationY() != 0.0f || juVar.getAlpha() != 1.0f) {
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
            ArrayList arrayList = this.O;
            if (i7 >= arrayList.size()) {
                return;
            }
            ju juVar = (ju) arrayList.get(i7);
            juVar.b.h(canvas, juVar.a[this.K]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        i5 i5Var;
        if (this.N != null) {
            for (int i7 = 0; i7 < this.N.size(); i7++) {
                ju juVar = (ju) this.N.get(i7);
                r5 r5Var = juVar.c;
                if (r5Var != null && (i5Var = (i5) this.P.D.i1.get(r5Var.getDocumentId())) != null && i5Var.k != null && juVar.b != null) {
                    i5Var.setAlpha((int) (juVar.getAlpha() * 255.0f * f10));
                    float width = ((juVar.getWidth() - juVar.getPaddingLeft()) - juVar.getPaddingRight()) / 2.0f;
                    float height = ((juVar.getHeight() - juVar.getPaddingTop()) - juVar.getPaddingBottom()) / 2.0f;
                    float right = (juVar.getRight() + juVar.getLeft()) / 2.0f;
                    float paddingTop = juVar.getPaddingTop() + height;
                    float f11 = juVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    i5Var.setBounds((int) (right - ((juVar.getScaleX() * width) * f12)), (int) (paddingTop - ((juVar.getScaleY() * height) * f12)), (int) ((juVar.getScaleX() * width * f12) + right), (int) ((juVar.getScaleY() * height * f12) + paddingTop));
                    i5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 >= arrayList.size()) {
                qu quVar = this.P.D;
                Pattern pattern = qu.M1;
                quVar.b.invalidate();
                return;
            }
            ((ju) arrayList.get(i7)).a[this.K].a();
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void i(long j3) {
        i5 i5Var;
        qu quVar = this.P.D;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            ju juVar = (ju) this.N.get(i7);
            r5 r5Var = juVar.c;
            org.telegram.messenger.ic[] icVarArr = juVar.a;
            if (r5Var != null && (i5Var = (i5) quVar.i1.get(r5Var.getDocumentId())) != null && i5Var.k != null) {
                i5Var.s(j3);
                di.z2 z2Var = i5Var.k;
                int i10 = this.K;
                org.telegram.messenger.ic e02 = z2Var.e0(icVarArr[i10], i10);
                icVarArr[i10] = e02;
                e02.c = j3;
                i5Var.setAlpha(org.telegram.messenger.qs.e4);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(juVar.getPaddingLeft() + juVar.getLeft(), juVar.getPaddingTop(), juVar.getRight() - juVar.getPaddingRight(), juVar.getMeasuredHeight() - juVar.getPaddingBottom());
                icVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, quVar.I0);
                if (w02 != quVar.L1 || quVar.K1 == null) {
                    quVar.L1 = w02;
                    quVar.K1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                i5Var.setColorFilter(quVar.K1);
                juVar.b = i5Var.k;
                arrayList.add(juVar);
            }
        }
    }
}
