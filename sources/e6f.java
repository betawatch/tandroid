// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class e6f {
    public qdf a(wdf wdfVar) {
        qdf qdfVar;
        qdf qdfVar2 = qdf.d;
        synchronized (wdfVar) {
            qdfVar = wdfVar.b;
            if (qdfVar != qdfVar2) {
                wdfVar.b = qdfVar2;
            }
        }
        return qdfVar;
    }

    public udf b(wdf wdfVar) {
        udf udfVar;
        udf udfVar2 = udf.c;
        synchronized (wdfVar) {
            udfVar = wdfVar.c;
            if (udfVar != udfVar2) {
                wdfVar.c = udfVar2;
            }
        }
        return udfVar;
    }

    public void c(udf udfVar, udf udfVar2) {
        udfVar.b = udfVar2;
    }

    public void d(udf udfVar, Thread thread) {
        udfVar.a = thread;
    }

    public boolean e(wdf wdfVar, qdf qdfVar, qdf qdfVar2) {
        synchronized (wdfVar) {
            if (wdfVar.b != qdfVar) {
                return false;
            }
            wdfVar.b = qdfVar2;
            return true;
        }
    }

    public boolean f(wdf wdfVar, Object obj, Object obj2) {
        synchronized (wdfVar) {
            if (wdfVar.a != obj) {
                return false;
            }
            wdfVar.a = obj2;
            return true;
        }
    }

    public boolean g(wdf wdfVar, udf udfVar, udf udfVar2) {
        synchronized (wdfVar) {
            if (wdfVar.c != udfVar) {
                return false;
            }
            wdfVar.c = udfVar2;
            return true;
        }
    }
}
