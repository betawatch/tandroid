// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class che {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(inb inbVar, e73 e73Var, Throwable th, fw2 fw2Var) {
        kk4 kk4Var;
        int i;
        try {
            if (fw2Var instanceof kk4) {
                kk4Var = (kk4) fw2Var;
                int i2 = kk4Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    kk4Var.c = i2 - TLObject.FLAG_31;
                    Object obj = kk4Var.b;
                    i = kk4Var.c;
                    if (i != 0) {
                        qse.b(obj);
                        kk4Var.a = th;
                        kk4Var.c = 1;
                        Object a = e73Var.a(inbVar, th, kk4Var);
                        Object obj2 = bx2.a;
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = kk4Var.a;
                        qse.b(obj);
                    }
                    return g5c.a;
                }
            }
            if (i != 0) {
            }
            return g5c.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                tfe.a(th2, th);
            }
            throw th2;
        }
        kk4Var = new kk4(fw2Var);
        Object obj3 = kk4Var.b;
        i = kk4Var.c;
    }
}
