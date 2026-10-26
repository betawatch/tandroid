package e2;

import android.content.Context;
import di.b4;
import di.s8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class w {
    public static w f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w(bi.a aVar, com.google.android.gms.common.api.internal.p pVar, l6.c[] cVarArr, boolean z10, int i10) {
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
                    vVar2.b.execute(new s8(vVar2, 6));
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
        e.execute(new b4(26, this, context));
    }
}
