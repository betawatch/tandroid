package c2;

import ag.o1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class r extends s {
    public final Object a = new Object();
    public Executor b;
    public o1 c;
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
