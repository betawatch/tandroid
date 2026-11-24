// default package

import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class apd {
    public static final Object a(le3[] le3VarArr, eeb eebVar) {
        if (le3VarArr.length == 0) {
            return n34.a;
        }
        wd0 wd0Var = new wd0(le3VarArr);
        vb1 vb1Var = new vb1(1, fne.a(eebVar));
        vb1Var.s();
        int length = le3VarArr.length;
        ud0[] ud0VarArr = new ud0[length];
        for (int i = 0; i < length; i++) {
            le3 le3Var = le3VarArr[i];
            le3Var.start();
            ud0 ud0Var = new ud0(wd0Var, vb1Var);
            ud0Var.f = pne.c(le3Var, true, ud0Var);
            ud0VarArr[i] = ud0Var;
        }
        vd0 vd0Var = new vd0(ud0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ud0 ud0Var2 = ud0VarArr[i2];
            ud0Var2.getClass();
            fy.a.putObjectVolatile(ud0Var2, ud0.n, vd0Var);
        }
        if (vb1Var.r() instanceof wl7) {
            vb1Var.v(vd0Var);
        } else {
            vd0Var.b();
        }
        return vb1Var.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Collection collection, qx2 qx2Var) {
        yd0 yd0Var;
        int i;
        Iterator it;
        if (qx2Var instanceof yd0) {
            yd0Var = (yd0) qx2Var;
            int i2 = yd0Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                yd0Var.c = i2 - TLObject.FLAG_31;
                Object obj = yd0Var.b;
                i = yd0Var.c;
                if (i != 0) {
                    tue.b(obj);
                    it = collection.iterator();
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = yd0Var.a;
                    tue.b(obj);
                }
                while (it.hasNext()) {
                    av5 av5Var = (av5) it.next();
                    yd0Var.a = it;
                    yd0Var.c = 1;
                    Object join = av5Var.join(yd0Var);
                    ly2 ly2Var = ly2.a;
                    if (join == ly2Var) {
                        return ly2Var;
                    }
                }
                return g7c.a;
            }
        }
        yd0Var = new yd0(qx2Var);
        Object obj2 = yd0Var.b;
        i = yd0Var.c;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return g7c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(av5[] av5VarArr, qx2 qx2Var) {
        xd0 xd0Var;
        int i;
        int i2;
        av5[] av5VarArr2;
        int length;
        if (qx2Var instanceof xd0) {
            xd0Var = (xd0) qx2Var;
            int i3 = xd0Var.e;
            if ((i3 & TLObject.FLAG_31) != 0) {
                xd0Var.e = i3 - TLObject.FLAG_31;
                Object obj = xd0Var.d;
                i = xd0Var.e;
                if (i != 0) {
                    tue.b(obj);
                    i2 = 0;
                    av5VarArr2 = av5VarArr;
                    length = av5VarArr.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = xd0Var.c;
                    i2 = xd0Var.b;
                    av5[] av5VarArr3 = (av5[]) xd0Var.a;
                    tue.b(obj);
                    av5VarArr2 = av5VarArr3;
                    i2++;
                    if (i2 < length) {
                        av5 av5Var = av5VarArr2[i2];
                        xd0Var.a = av5VarArr2;
                        xd0Var.b = i2;
                        xd0Var.c = length;
                        xd0Var.e = 1;
                        Object join = av5Var.join(xd0Var);
                        ly2 ly2Var = ly2.a;
                        if (join == ly2Var) {
                            return ly2Var;
                        }
                        i2++;
                        if (i2 < length) {
                            return g7c.a;
                        }
                    }
                }
            }
        }
        xd0Var = new xd0(qx2Var);
        Object obj2 = xd0Var.d;
        i = xd0Var.e;
        if (i != 0) {
        }
    }
}
