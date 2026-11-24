// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k7a {
    public final k8a a;
    public final k8a b;

    public k7a(k8a k8aVar, k8a k8aVar2) {
        k8aVar.getClass();
        k8aVar2.getClass();
        this.a = k8aVar;
        this.b = k8aVar2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r5.b.a(r0) != r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.a.a(r0) != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gw2 gw2Var) {
        j7a j7aVar;
        int i;
        if (gw2Var instanceof j7a) {
            j7aVar = (j7a) gw2Var;
            int i2 = j7aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                j7aVar.c = i2 - TLObject.FLAG_31;
                Object obj = j7aVar.a;
                i = j7aVar.c;
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    j7aVar.c = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qse.b(obj);
                            return g5c.a;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                j7aVar.c = 2;
            }
        }
        j7aVar = new j7a(this, gw2Var);
        Object obj2 = j7aVar.a;
        i = j7aVar.c;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
        j7aVar.c = 2;
    }
}
