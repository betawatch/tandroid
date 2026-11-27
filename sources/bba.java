// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bba {
    public final aca a;
    public final aca b;

    public bba(aca acaVar, aca acaVar2) {
        acaVar.getClass();
        acaVar2.getClass();
        this.a = acaVar;
        this.b = acaVar2;
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
    public final Object b(ax2 ax2Var) {
        aba abaVar;
        int i;
        if (ax2Var instanceof aba) {
            abaVar = (aba) ax2Var;
            int i2 = abaVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                abaVar.c = i2 - TLObject.FLAG_31;
                Object obj = abaVar.a;
                i = abaVar.c;
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    abaVar.c = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ixe.b(obj);
                            return f9c.a;
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                abaVar.c = 2;
            }
        }
        abaVar = new aba(this, ax2Var);
        Object obj2 = abaVar.a;
        i = abaVar.c;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
        abaVar.c = 2;
    }
}
