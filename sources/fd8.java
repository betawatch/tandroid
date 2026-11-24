// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class fd8 implements op4 {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ fd8() {
    }

    @Override // op4
    public final Object invoke() {
        w4a[] w4aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return (arrayList == null || (w4aVarArr = (w4a[]) arrayList.toArray(new w4a[0])) == null) ? xbd.a : w4aVarArr;
            default:
                c9b c9bVar = c9b.a;
                return new q46(tk8.a);
        }
    }

    public /* synthetic */ fd8(gd8 gd8Var) {
    }
}
