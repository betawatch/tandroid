// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class fwe {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(so8 so8Var, ad4 ad4Var, ax2 ax2Var) {
        ro8 ro8Var;
        int i;
        try {
            if (ax2Var instanceof ro8) {
                ro8Var = (ro8) ax2Var;
                int i2 = ro8Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    ro8Var.c = i2 - TLObject.FLAG_31;
                    Object obj = ro8Var.b;
                    i = ro8Var.c;
                    if (i != 0) {
                        ixe.b(obj);
                        if (ro8Var.getContext().get(qf5.c) != so8Var) {
                            grb.i("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        ro8Var.a = ad4Var;
                        ro8Var.c = 1;
                        va1 va1Var = new va1(1, xpe.a(ro8Var));
                        va1Var.s();
                        so8Var.S(new g23(va1Var, (byte) 1));
                        Object q = va1Var.q();
                        vx2 vx2Var = vx2.a;
                        if (q == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ad4Var = ro8Var.a;
                        ixe.b(obj);
                    }
                    ad4Var.invoke();
                    return f9c.a;
                }
            }
            if (i != 0) {
            }
            ad4Var.invoke();
            return f9c.a;
        } catch (Throwable th) {
            ad4Var.invoke();
            throw th;
        }
        ro8Var = new ro8(ax2Var);
        Object obj2 = ro8Var.b;
        i = ro8Var.c;
    }
}
