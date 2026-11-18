package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class m2 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final void a() {
        this.a.add(new n2[]{new p2(4, 2131753063, 0)});
    }

    public final void b(b3.j jVar) {
        if (jVar == null) {
            return;
        }
        n2[][] n2VarArr = (n2[][]) jVar.c;
        int length = n2VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            int length2 = n2VarArr[i7].length;
            n2[] n2VarArr2 = new n2[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                n2VarArr2[i10] = n2VarArr[i7][i10];
            }
            ArrayList arrayList = this.a;
            arrayList.add(n2VarArr2);
            if ((jVar.b & (1 << i7)) != 0 && !arrayList.isEmpty()) {
                this.b = (1 << (arrayList.size() - 1)) | this.b;
            }
        }
    }

    public final b3.j c() {
        ArrayList arrayList = this.a;
        return new b3.j((n2[][]) arrayList.toArray(new n2[arrayList.size()][]), this.b, 7);
    }
}
