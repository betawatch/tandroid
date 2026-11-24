// default package

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ghe {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(hk4 hk4Var, ik4 ik4Var, fw2 fw2Var) {
        pk4 pk4Var;
        int i;
        c59 c59Var;
        Throwable th;
        bt5 bt5Var;
        CancellationException cancellationException;
        if (fw2Var instanceof pk4) {
            pk4Var = (pk4) fw2Var;
            int i2 = pk4Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                pk4Var.c = i2 - TLObject.FLAG_31;
                Object obj = pk4Var.b;
                i = pk4Var.c;
                if (i != 0) {
                    qse.b(obj);
                    c59 c59Var2 = new c59();
                    try {
                        ik4 rk4Var = new rk4(ik4Var, c59Var2);
                        pk4Var.a = c59Var2;
                        pk4Var.c = 1;
                        Object h = hk4Var.h(rk4Var, pk4Var);
                        bx2 bx2Var = bx2.a;
                        if (h == bx2Var) {
                            return bx2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c59Var = c59Var2;
                        th = (Throwable) c59Var.a;
                        if (th == null) {
                        }
                        if (th != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c59Var = pk4Var.a;
                    try {
                        qse.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        th = (Throwable) c59Var.a;
                        if ((th == null && th.equals(th)) || ((bt5Var = (bt5) pk4Var.getContext().get(pd5.c)) != null && bt5Var.isCancelled() && (cancellationException = bt5Var.getCancellationException()) != null && cancellationException.equals(th))) {
                            throw th;
                        }
                        if (th != null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            tfe.a(th, th);
                            throw th;
                        }
                        tfe.a(th, th);
                        throw th;
                    }
                }
                return null;
            }
        }
        pk4Var = new pk4(fw2Var);
        Object obj2 = pk4Var.b;
        i = pk4Var.c;
        if (i != 0) {
        }
        return null;
    }
}
