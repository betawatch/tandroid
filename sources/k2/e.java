package k2;

import android.animation.TypeEvaluator;
import f7.i8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.d[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (!i8.a(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!i8.a(this.a, dVarArr)) {
            this.a = i8.e(dVarArr);
        }
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            i0.d dVar = this.a[i9];
            i0.d dVar2 = dVarArr[i9];
            i0.d dVar3 = dVarArr2[i9];
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
