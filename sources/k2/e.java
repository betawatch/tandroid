package k2;

import android.animation.TypeEvaluator;
import j7.y7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!y7.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!y7.a(this.a, dVarArr)) {
            this.a = y7.e(dVarArr);
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            i0.d dVar = this.a[i10];
            i0.d dVar2 = dVarArr[i10];
            i0.d dVar3 = dVarArr2[i10];
            dVar.getClass();
            dVar.a = dVar2.a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVar2.b;
                if (i11 < fArr.length) {
                    dVar.b[i11] = (dVar3.b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.a;
    }
}
