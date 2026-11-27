// default package

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class bme {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(mm4 mm4Var, nm4 nm4Var, zw2 zw2Var) {
        vm4 vm4Var;
        int i;
        p89 p89Var;
        Throwable th;
        ev5 ev5Var;
        CancellationException cancellationException;
        if (zw2Var instanceof vm4) {
            vm4Var = (vm4) zw2Var;
            int i2 = vm4Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                vm4Var.c = i2 - TLObject.FLAG_31;
                Object obj = vm4Var.b;
                i = vm4Var.c;
                if (i != 0) {
                    ixe.b(obj);
                    p89 p89Var2 = new p89();
                    try {
                        nm4 xm4Var = new xm4(nm4Var, p89Var2);
                        vm4Var.a = p89Var2;
                        vm4Var.c = 1;
                        Object k = mm4Var.k(xm4Var, vm4Var);
                        vx2 vx2Var = vx2.a;
                        if (k == vx2Var) {
                            return vx2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        p89Var = p89Var2;
                        th = (Throwable) p89Var.a;
                        if (th == null) {
                        }
                        if (th != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p89Var = vm4Var.a;
                    try {
                        ixe.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        th = (Throwable) p89Var.a;
                        if ((th == null && th.equals(th)) || ((ev5Var = (ev5) vm4Var.getContext().get(qf5.c)) != null && ev5Var.isCancelled() && (cancellationException = ev5Var.getCancellationException()) != null && cancellationException.equals(th))) {
                            throw th;
                        }
                        if (th != null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            kke.a(th, th);
                            throw th;
                        }
                        kke.a(th, th);
                        throw th;
                    }
                }
                return null;
            }
        }
        vm4Var = new vm4(zw2Var);
        Object obj2 = vm4Var.b;
        i = vm4Var.c;
        if (i != 0) {
        }
        return null;
    }
}
