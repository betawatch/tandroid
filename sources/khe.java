// default package

import java.util.NoSuchElementException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class khe {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hk4 hk4Var, gw2 gw2Var) {
        zk4 zk4Var;
        int i;
        lo5 lo5Var;
        c59 c59Var;
        i1 e;
        yk4 yk4Var;
        Object obj;
        if (gw2Var instanceof zk4) {
            zk4Var = (zk4) gw2Var;
            int i2 = zk4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zk4Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = zk4Var.c;
                i = zk4Var.d;
                lo5Var = zad.a;
                if (i != 0) {
                    qse.b(obj2);
                    c59 c59Var2 = new c59();
                    c59Var2.a = lo5Var;
                    yk4 yk4Var2 = new yk4(c59Var2, (byte) 0);
                    try {
                        zk4Var.a = c59Var2;
                        zk4Var.b = yk4Var2;
                        zk4Var.d = 1;
                        Object h = hk4Var.h(yk4Var2, zk4Var);
                        Object obj3 = bx2.a;
                        if (h == obj3) {
                            return obj3;
                        }
                        c59Var = c59Var2;
                    } catch (i1 e2) {
                        c59Var = c59Var2;
                        e = e2;
                        yk4Var = yk4Var2;
                        if (e.a != yk4Var) {
                        }
                        obj = c59Var.a;
                        if (obj == lo5Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yk4Var = zk4Var.b;
                    c59Var = zk4Var.a;
                    try {
                        qse.b(obj2);
                    } catch (i1 e3) {
                        e = e3;
                        if (e.a != yk4Var) {
                            throw e;
                        }
                        obj = c59Var.a;
                        if (obj == lo5Var) {
                        }
                    }
                }
                obj = c59Var.a;
                if (obj == lo5Var) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        zk4Var = new zk4(gw2Var);
        Object obj22 = zk4Var.c;
        i = zk4Var.d;
        lo5Var = zad.a;
        if (i != 0) {
        }
        obj = c59Var.a;
        if (obj == lo5Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(hk4 hk4Var, gw2 gw2Var) {
        al4 al4Var;
        int i;
        c59 c59Var;
        i1 e;
        yk4 yk4Var;
        if (gw2Var instanceof al4) {
            al4Var = (al4) gw2Var;
            int i2 = al4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                al4Var.d = i2 - TLObject.FLAG_31;
                Object obj = al4Var.c;
                i = al4Var.d;
                if (i != 0) {
                    qse.b(obj);
                    c59 c59Var2 = new c59();
                    yk4 yk4Var2 = new yk4(c59Var2, (byte) 1);
                    try {
                        al4Var.a = c59Var2;
                        al4Var.b = yk4Var2;
                        al4Var.d = 1;
                        Object h = hk4Var.h(yk4Var2, al4Var);
                        Object obj2 = bx2.a;
                        if (h == obj2) {
                            return obj2;
                        }
                        c59Var = c59Var2;
                    } catch (i1 e2) {
                        c59Var = c59Var2;
                        e = e2;
                        yk4Var = yk4Var2;
                        if (e.a != yk4Var) {
                        }
                        return c59Var.a;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yk4Var = al4Var.b;
                    c59Var = al4Var.a;
                    try {
                        qse.b(obj);
                    } catch (i1 e3) {
                        e = e3;
                        if (e.a != yk4Var) {
                            throw e;
                        }
                        return c59Var.a;
                    }
                }
                return c59Var.a;
            }
        }
        al4Var = new al4(gw2Var);
        Object obj3 = al4Var.c;
        i = al4Var.d;
        if (i != 0) {
        }
        return c59Var.a;
    }
}
