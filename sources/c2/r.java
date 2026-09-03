package c2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class r extends s {
    public final Object a = new Object();
    public Executor b;
    public androidx.biometric.e0 c;
    public n d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(n nVar, ArrayList arrayList) {
        if (nVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            try {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new p(this, this.c, nVar, arrayList, 1));
                    } else {
                        this.d = nVar;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
