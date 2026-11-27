// default package

import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ord {
    public static final Object a(rd3[] rd3VarArr, yfb yfbVar) {
        if (rd3VarArr.length == 0) {
            return x24.a;
        }
        yc0 yc0Var = new yc0(rd3VarArr);
        va1 va1Var = new va1(1, xpe.a(yfbVar));
        va1Var.s();
        int length = rd3VarArr.length;
        wc0[] wc0VarArr = new wc0[length];
        for (int i = 0; i < length; i++) {
            rd3 rd3Var = rd3VarArr[i];
            rd3Var.start();
            wc0 wc0Var = new wc0(yc0Var, va1Var);
            wc0Var.f = gqe.c(rd3Var, true, wc0Var);
            wc0VarArr[i] = wc0Var;
        }
        xc0 xc0Var = new xc0(wc0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            wc0 wc0Var2 = wc0VarArr[i2];
            wc0Var2.getClass();
            fx.a.putObjectVolatile(wc0Var2, wc0.n, xc0Var);
        }
        if (va1Var.r() instanceof sm7) {
            va1Var.v(xc0Var);
        } else {
            xc0Var.b();
        }
        return va1Var.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Collection collection, ax2 ax2Var) {
        ad0 ad0Var;
        int i;
        Iterator it;
        if (ax2Var instanceof ad0) {
            ad0Var = (ad0) ax2Var;
            int i2 = ad0Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                ad0Var.c = i2 - TLObject.FLAG_31;
                Object obj = ad0Var.b;
                i = ad0Var.c;
                if (i != 0) {
                    ixe.b(obj);
                    it = collection.iterator();
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = ad0Var.a;
                    ixe.b(obj);
                }
                while (it.hasNext()) {
                    ev5 ev5Var = (ev5) it.next();
                    ad0Var.a = it;
                    ad0Var.c = 1;
                    Object join = ev5Var.join(ad0Var);
                    vx2 vx2Var = vx2.a;
                    if (join == vx2Var) {
                        return vx2Var;
                    }
                }
                return g9c.a;
            }
        }
        ad0Var = new ad0(ax2Var);
        Object obj2 = ad0Var.b;
        i = ad0Var.c;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return g9c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ev5[] ev5VarArr, ax2 ax2Var) {
        zc0 zc0Var;
        int i;
        int i2;
        ev5[] ev5VarArr2;
        int length;
        if (ax2Var instanceof zc0) {
            zc0Var = (zc0) ax2Var;
            int i3 = zc0Var.e;
            if ((i3 & TLObject.FLAG_31) != 0) {
                zc0Var.e = i3 - TLObject.FLAG_31;
                Object obj = zc0Var.d;
                i = zc0Var.e;
                if (i != 0) {
                    ixe.b(obj);
                    i2 = 0;
                    ev5VarArr2 = ev5VarArr;
                    length = ev5VarArr.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = zc0Var.c;
                    i2 = zc0Var.b;
                    ev5[] ev5VarArr3 = (ev5[]) zc0Var.a;
                    ixe.b(obj);
                    ev5VarArr2 = ev5VarArr3;
                    i2++;
                    if (i2 < length) {
                        ev5 ev5Var = ev5VarArr2[i2];
                        zc0Var.a = ev5VarArr2;
                        zc0Var.b = i2;
                        zc0Var.c = length;
                        zc0Var.e = 1;
                        Object join = ev5Var.join(zc0Var);
                        vx2 vx2Var = vx2.a;
                        if (join == vx2Var) {
                            return vx2Var;
                        }
                        i2++;
                        if (i2 < length) {
                            return g9c.a;
                        }
                    }
                }
            }
        }
        zc0Var = new zc0(ax2Var);
        Object obj2 = zc0Var.d;
        i = zc0Var.e;
        if (i != 0) {
        }
    }
}
