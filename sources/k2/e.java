package k2;

import android.animation.TypeEvaluator;
import g7.w7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {
    public i0.e[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (!w7.a(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!w7.a(this.a, eVarArr)) {
            this.a = w7.e(eVarArr);
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = this.a[i10];
            i0.e eVar2 = eVarArr[i10];
            i0.e eVar3 = eVarArr2[i10];
            eVar.getClass();
            eVar.a = eVar2.a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVar2.b;
                if (i11 < fArr.length) {
                    eVar.b[i11] = (eVar3.b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.a;
    }
}
