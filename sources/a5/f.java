package a5;

import android.animation.TypeEvaluator;
import c8.j0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {
    public i0.e[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (!j0.a(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!j0.a(this.a, eVarArr)) {
            this.a = j0.e(eVarArr);
        }
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            i0.e eVar = this.a[i7];
            i0.e eVar2 = eVarArr[i7];
            i0.e eVar3 = eVarArr2[i7];
            eVar.getClass();
            eVar.a = eVar2.a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVar2.b;
                if (i10 < fArr.length) {
                    eVar.b[i10] = (eVar3.b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.a;
    }
}
