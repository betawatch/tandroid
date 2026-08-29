package f5;

import ag.v0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m {
    public final y a;
    public final a0 b;
    public final k c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public m(Looper looper, y yVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, kVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        a0 a0Var = this.b;
        if (!a0Var.a.hasMessages(0)) {
            a0Var.getClass();
            z b10 = a0.b();
            Message obtainMessage = a0Var.a.obtainMessage(0);
            b10.a = obtainMessage;
            Handler handler = a0Var.a;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
            b10.a();
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

    public final void c(int i10, j jVar) {
        f();
        this.f.add(new v0(new CopyOnWriteArraySet(this.d), i10, jVar, 3));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k kVar = this.c;
            lVar.d = true;
            if (lVar.c) {
                lVar.c = false;
                kVar.e(lVar.a, lVar.b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, j jVar) {
        c(i10, jVar);
        b();
    }

    public final void f() {
        if (this.i) {
            a.i(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, k kVar) {
        this.a = yVar;
        this.d = copyOnWriteArraySet;
        this.c = kVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = yVar.a(looper, new Handler.Callback() { // from class: f5.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                m mVar = m.this;
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar2 = mVar.c;
                    if (!lVar.d && lVar.c) {
                        g c3 = lVar.b.c();
                        lVar.b = new c2.u();
                        lVar.c = false;
                        kVar2.e(lVar.a, c3);
                    }
                    if (mVar.b.a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = true;
    }
}
