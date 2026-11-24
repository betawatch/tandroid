// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dje {
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jpb jpbVar, q83 q83Var, Throwable th, px2 px2Var) {
        lm4 lm4Var;
        int i;
        try {
            if (px2Var instanceof lm4) {
                lm4Var = (lm4) px2Var;
                int i2 = lm4Var.c;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    lm4Var.c = i2 - TLObject.FLAG_31;
                    Object obj = lm4Var.b;
                    i = lm4Var.c;
                    if (i != 0) {
                        tue.b(obj);
                        lm4Var.a = th;
                        lm4Var.c = 1;
                        Object a = q83Var.a(jpbVar, th, lm4Var);
                        Object obj2 = ly2.a;
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = lm4Var.a;
                        tue.b(obj);
                    }
                    return g7c.a;
                }
            }
            if (i != 0) {
            }
            return g7c.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                uhe.a(th2, th);
            }
            throw th2;
        }
        lm4Var = new lm4(px2Var);
        Object obj3 = lm4Var.b;
        i = lm4Var.c;
    }
}
