// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l9a {
    public final kaa a;
    public final kaa b;

    public l9a(kaa kaaVar, kaa kaaVar2) {
        kaaVar.getClass();
        kaaVar2.getClass();
        this.a = kaaVar;
        this.b = kaaVar2;
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
    public final Object b(qx2 qx2Var) {
        k9a k9aVar;
        int i;
        if (qx2Var instanceof k9a) {
            k9aVar = (k9a) qx2Var;
            int i2 = k9aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                k9aVar.c = i2 - TLObject.FLAG_31;
                Object obj = k9aVar.a;
                i = k9aVar.c;
                ly2 ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    k9aVar.c = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            tue.b(obj);
                            return g7c.a;
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                k9aVar.c = 2;
            }
        }
        k9aVar = new k9a(this, qx2Var);
        Object obj2 = k9aVar.a;
        i = k9aVar.c;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
        k9aVar.c = 2;
    }
}
