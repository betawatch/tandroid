// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hf8 implements pr4 {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ hf8() {
    }

    @Override // pr4
    public final Object invoke() {
        y6a[] y6aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return (arrayList == null || (y6aVarArr = (y6a[]) arrayList.toArray(new y6a[0])) == null) ? zdd.a : y6aVarArr;
            default:
                ebb ebbVar = ebb.a;
                return new q66(vm8.a);
        }
    }

    public /* synthetic */ hf8(if8 if8Var) {
    }
}
