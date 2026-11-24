// default package

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hje {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(im4 im4Var, jm4 jm4Var, px2 px2Var) {
        qm4 qm4Var;
        int i;
        e79 e79Var;
        Throwable th;
        av5 av5Var;
        CancellationException cancellationException;
        if (px2Var instanceof qm4) {
            qm4Var = (qm4) px2Var;
            int i2 = qm4Var.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                qm4Var.c = i2 - TLObject.FLAG_31;
                Object obj = qm4Var.b;
                i = qm4Var.c;
                if (i != 0) {
                    tue.b(obj);
                    e79 e79Var2 = new e79();
                    try {
                        jm4 sm4Var = new sm4(jm4Var, e79Var2);
                        qm4Var.a = e79Var2;
                        qm4Var.c = 1;
                        Object g = im4Var.g(sm4Var, qm4Var);
                        ly2 ly2Var = ly2.a;
                        if (g == ly2Var) {
                            return ly2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        e79Var = e79Var2;
                        th = (Throwable) e79Var.a;
                        if (th == null) {
                        }
                        if (th != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e79Var = qm4Var.a;
                    try {
                        tue.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        th = (Throwable) e79Var.a;
                        if ((th == null && th.equals(th)) || ((av5Var = (av5) qm4Var.getContext().get(nf5.c)) != null && av5Var.isCancelled() && (cancellationException = av5Var.getCancellationException()) != null && cancellationException.equals(th))) {
                            throw th;
                        }
                        if (th != null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            uhe.a(th, th);
                            throw th;
                        }
                        uhe.a(th, th);
                        throw th;
                    }
                }
                return null;
            }
        }
        qm4Var = new qm4(px2Var);
        Object obj2 = qm4Var.b;
        i = qm4Var.c;
        if (i != 0) {
        }
        return null;
    }
}
