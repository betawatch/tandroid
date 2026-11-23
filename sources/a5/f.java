package a5;

import android.animation.TypeEvaluator;
import c8.l0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!l0.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!l0.a(this.a, dVarArr)) {
            this.a = l0.e(dVarArr);
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            i0.d dVar = this.a[i7];
            i0.d dVar2 = dVarArr[i7];
            i0.d dVar3 = dVarArr2[i7];
            dVar.getClass();
            dVar.a = dVar2.a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVar2.b;
                if (i10 < fArr.length) {
                    dVar.b[i10] = (dVar3.b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.a;
    }
}
