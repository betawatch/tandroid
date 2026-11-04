package g2;

import ai.e3;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b8.zb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s {
    public final Thread a;
    public final j0 b;
    public final q c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public s(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new r(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.i) {
            zb.p(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            j0 j0Var = this.b;
            j0Var.getClass();
            Handler handler = j0Var.a;
            if (!handler.hasMessages(1)) {
                i0 a10 = j0Var.a(1);
                Message message = a10.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                a10.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i3, p pVar) {
        if (this.i) {
            zb.p(Thread.currentThread() == this.a);
        }
        this.f.add(new e3(new CopyOnWriteArraySet(this.d), i3, pVar, 10));
    }

    public final void d() {
        if (this.i) {
            zb.p(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            q qVar = this.c;
            rVar.d = true;
            if (qVar != null && rVar.c) {
                rVar.c = false;
                qVar.e(rVar.a, rVar.b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i3, p pVar) {
        c(i3, pVar);
        b();
    }

    public s(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, h0 h0Var, q qVar, boolean z10) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = qVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || h0Var == null || qVar == null) {
            this.b = null;
        } else {
            this.b = h0Var.a(looper, new o(this, 0));
        }
        this.i = z10;
    }
}
