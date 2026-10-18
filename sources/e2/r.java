package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class r {
    public final Thread a;
    public final i0 b;
    public final p c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new q(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.i) {
            u6.p(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            i0 i0Var = this.b;
            i0Var.getClass();
            Handler handler = i0Var.a;
            if (!handler.hasMessages(1)) {
                h0 a2 = i0Var.a(1);
                Message message = a2.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                a2.a();
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

    public final void c(int i10, o oVar) {
        if (this.i) {
            u6.p(Thread.currentThread() == this.a);
        }
        this.f.add(new ah.o(new CopyOnWriteArraySet(this.d), i10, oVar, 8));
    }

    public final void d() {
        if (this.i) {
            u6.p(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.c;
            qVar.d = true;
            if (pVar != null && qVar.c) {
                qVar.c = false;
                pVar.c(qVar.a, qVar.b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, o oVar) {
        c(i10, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = pVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || g0Var == null || pVar == null) {
            this.b = null;
        } else {
            this.b = g0Var.a(looper, new n(this, 0));
        }
        this.i = z10;
    }
}
