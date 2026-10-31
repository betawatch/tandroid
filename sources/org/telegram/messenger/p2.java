package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p2 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final void a() {
        this.a.add(new q2[]{new s2(4, 2131753065, 0)});
    }

    public final void b(c5.x xVar) {
        if (xVar == null) {
            return;
        }
        q2[][] q2VarArr = (q2[][]) xVar.c;
        int length = q2VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int length2 = q2VarArr[i10].length;
            q2[] q2VarArr2 = new q2[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                q2VarArr2[i11] = q2VarArr[i10][i11];
            }
            ArrayList arrayList = this.a;
            arrayList.add(q2VarArr2);
            if ((xVar.b & (1 << i10)) != 0 && !arrayList.isEmpty()) {
                this.b = (1 << (arrayList.size() - 1)) | this.b;
            }
        }
    }

    public final c5.x c() {
        ArrayList arrayList = this.a;
        return new c5.x((q2[][]) arrayList.toArray(new q2[arrayList.size()][]), this.b, 12);
    }
}
