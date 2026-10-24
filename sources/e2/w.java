package e2;

import android.content.Context;
import ci.u7;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class w {
    public static w f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w(ai.a aVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = aVar;
        this.c = pVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f == null) {
                    f = new w(context);
                }
                wVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.a && this.b == i10) {
                    return;
                }
                this.a = true;
                this.b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.b.execute(new com.google.firebase.messaging.s(vVar2, 4));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        e.execute(new u7(17, this, context));
    }
}
