package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class l2 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final void a() {
        this.a.add(new m2[]{new o2(4, 2131753065, 0)});
    }

    public final void b(f5.u uVar) {
        if (uVar == null) {
            return;
        }
        m2[][] m2VarArr = (m2[][]) uVar.c;
        int length = m2VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            int length2 = m2VarArr[i7].length;
            m2[] m2VarArr2 = new m2[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                m2VarArr2[i10] = m2VarArr[i7][i10];
            }
            ArrayList arrayList = this.a;
            arrayList.add(m2VarArr2);
            if ((uVar.b & (1 << i7)) != 0 && !arrayList.isEmpty()) {
                this.b = (1 << (arrayList.size() - 1)) | this.b;
            }
        }
    }

    public final f5.u c() {
        ArrayList arrayList = this.a;
        return new f5.u((m2[][]) arrayList.toArray(new m2[arrayList.size()][]), this.b, 9);
    }
}
