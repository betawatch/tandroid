// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a66 {
    public final Thread a;
    public final cdb b;
    public final y56 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public a66(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, adb adbVar, y56 y56Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = y56Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || adbVar == null || y56Var == null) {
            this.b = null;
        } else {
            this.b = adbVar.a(looper, new zn3(this, (byte) 1));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.d.add(new z56(obj));
        }
    }

    public final void b() {
        if (this.i) {
            gre.p(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            cdb cdbVar = this.b;
            cdbVar.getClass();
            Handler handler = cdbVar.a;
            if (!handler.hasMessages(1)) {
                bdb a = cdbVar.a(1);
                Message message = a.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                a.a();
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

    public final void c(int i, x56 x56Var) {
        if (this.i) {
            gre.p(Thread.currentThread() == this.a);
        }
        this.f.add(new j45((Object) new CopyOnWriteArraySet(this.d), i, (Object) x56Var, (byte) 5));
    }

    public final void d() {
        if (this.i) {
            gre.p(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z56 z56Var = (z56) it.next();
            y56 y56Var = this.c;
            z56Var.d = true;
            if (y56Var != null && z56Var.c) {
                z56Var.c = false;
                y56Var.c(z56Var.a, z56Var.b.f());
            }
        }
        this.d.clear();
    }

    public final void e(int i, x56 x56Var) {
        c(i, x56Var);
        b();
    }

    public a66(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
