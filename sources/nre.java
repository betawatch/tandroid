// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class nre {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(fl8 fl8Var, db4 db4Var, gw2 gw2Var) {
        el8 el8Var;
        int i;
        try {
            if (gw2Var instanceof el8) {
                el8Var = (el8) gw2Var;
                int i2 = el8Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    el8Var.c = i2 - TLObject.FLAG_31;
                    Object obj = el8Var.b;
                    i = el8Var.c;
                    if (i != 0) {
                        qse.b(obj);
                        if (el8Var.getContext().get(pd5.c) != fl8Var) {
                            sc8.j("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        el8Var.a = db4Var;
                        el8Var.c = 1;
                        na1 na1Var = new na1(1, dle.a(el8Var));
                        na1Var.s();
                        fl8Var.S(new n13(na1Var, (byte) 1));
                        Object q = na1Var.q();
                        bx2 bx2Var = bx2.a;
                        if (q == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (i != 1) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        db4Var = el8Var.a;
                        qse.b(obj);
                    }
                    db4Var.invoke();
                    return g5c.a;
                }
            }
            if (i != 0) {
            }
            db4Var.invoke();
            return g5c.a;
        } catch (Throwable th) {
            db4Var.invoke();
            throw th;
        }
        el8Var = new el8(gw2Var);
        Object obj2 = el8Var.b;
        i = el8Var.c;
    }
}
