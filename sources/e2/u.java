package e2;

import android.content.Context;
import ci.b9;
import ci.uc;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u {
    public static u f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.c = pVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f == null) {
                    f = new u(context);
                }
                uVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
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
            t tVar = (t) it.next();
            if (tVar.a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
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
                    t tVar2 = (t) it2.next();
                    tVar2.b.execute(new uc(tVar2, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.c = g10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        g10.execute(new b9(12, this, context));
    }
}
