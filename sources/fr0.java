// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fr0 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final void a() {
        this.a.add(new gr0[]{new ir0(4, 2131753030, 0)});
    }

    public final void b(de deVar) {
        if (deVar != null) {
            gr0[][] gr0VarArr = (gr0[][]) deVar.c;
            int length = gr0VarArr.length;
            for (int i = 0; i < length; i++) {
                int length2 = gr0VarArr[i].length;
                gr0[] gr0VarArr2 = new gr0[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    gr0VarArr2[i2] = gr0VarArr[i][i2];
                }
                ArrayList arrayList = this.a;
                arrayList.add(gr0VarArr2);
                if ((deVar.b & (1 << i)) != 0 && !arrayList.isEmpty()) {
                    this.b |= 1 << (arrayList.size() - 1);
                }
            }
        }
    }

    public final de c() {
        ArrayList arrayList = this.a;
        return new de((gr0[][]) arrayList.toArray(new gr0[arrayList.size()][]), this.b, (byte) 2);
    }
}
