// default package

import java.util.NoSuchElementException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class lje {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(im4 im4Var, qx2 qx2Var) {
        zm4 zm4Var;
        int i;
        du2 du2Var;
        e79 e79Var;
        i1 e;
        ym4 ym4Var;
        Object obj;
        if (qx2Var instanceof zm4) {
            zm4Var = (zm4) qx2Var;
            int i2 = zm4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zm4Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = zm4Var.c;
                i = zm4Var.d;
                du2Var = bdd.a;
                if (i != 0) {
                    tue.b(obj2);
                    e79 e79Var2 = new e79();
                    e79Var2.a = du2Var;
                    ym4 ym4Var2 = new ym4(e79Var2, (byte) 0);
                    try {
                        zm4Var.a = e79Var2;
                        zm4Var.b = ym4Var2;
                        zm4Var.d = 1;
                        Object g = im4Var.g(ym4Var2, zm4Var);
                        Object obj3 = ly2.a;
                        if (g == obj3) {
                            return obj3;
                        }
                        e79Var = e79Var2;
                    } catch (i1 e2) {
                        e79Var = e79Var2;
                        e = e2;
                        ym4Var = ym4Var2;
                        if (e.a != ym4Var) {
                        }
                        obj = e79Var.a;
                        if (obj == du2Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ym4Var = zm4Var.b;
                    e79Var = zm4Var.a;
                    try {
                        tue.b(obj2);
                    } catch (i1 e3) {
                        e = e3;
                        if (e.a != ym4Var) {
                            throw e;
                        }
                        obj = e79Var.a;
                        if (obj == du2Var) {
                        }
                    }
                }
                obj = e79Var.a;
                if (obj == du2Var) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        zm4Var = new zm4(qx2Var);
        Object obj22 = zm4Var.c;
        i = zm4Var.d;
        du2Var = bdd.a;
        if (i != 0) {
        }
        obj = e79Var.a;
        if (obj == du2Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(im4 im4Var, qx2 qx2Var) {
        an4 an4Var;
        int i;
        e79 e79Var;
        i1 e;
        ym4 ym4Var;
        if (qx2Var instanceof an4) {
            an4Var = (an4) qx2Var;
            int i2 = an4Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                an4Var.d = i2 - TLObject.FLAG_31;
                Object obj = an4Var.c;
                i = an4Var.d;
                if (i != 0) {
                    tue.b(obj);
                    e79 e79Var2 = new e79();
                    ym4 ym4Var2 = new ym4(e79Var2, (byte) 1);
                    try {
                        an4Var.a = e79Var2;
                        an4Var.b = ym4Var2;
                        an4Var.d = 1;
                        Object g = im4Var.g(ym4Var2, an4Var);
                        Object obj2 = ly2.a;
                        if (g == obj2) {
                            return obj2;
                        }
                        e79Var = e79Var2;
                    } catch (i1 e2) {
                        e79Var = e79Var2;
                        e = e2;
                        ym4Var = ym4Var2;
                        if (e.a != ym4Var) {
                        }
                        return e79Var.a;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ym4Var = an4Var.b;
                    e79Var = an4Var.a;
                    try {
                        tue.b(obj);
                    } catch (i1 e3) {
                        e = e3;
                        if (e.a != ym4Var) {
                            throw e;
                        }
                        return e79Var.a;
                    }
                }
                return e79Var.a;
            }
        }
        an4Var = new an4(qx2Var);
        Object obj3 = an4Var.c;
        i = an4Var.d;
        if (i != 0) {
        }
        return e79Var.a;
    }
}
