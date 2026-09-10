package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bi.g3;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p {
    public final x a;
    public final z b;
    public final n c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new o(obj));
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
        z zVar = this.b;
        if (!zVar.a.hasMessages(1)) {
            zVar.getClass();
            y b10 = z.b();
            Message obtainMessage = zVar.a.obtainMessage(1);
            b10.a = obtainMessage;
            Handler handler = zVar.a;
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

    public final void c(int i10, m mVar) {
        f();
        this.f.add(new g3(new CopyOnWriteArraySet(this.d), i10, mVar, 7));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.c;
            oVar.d = true;
            if (oVar.c) {
                oVar.c = false;
                nVar.a(oVar.a, oVar.b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, m mVar) {
        c(i10, mVar);
        b();
    }

    public final void f() {
        if (this.i) {
            d.g(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.a = xVar;
        this.d = copyOnWriteArraySet;
        this.c = nVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = xVar.a(looper, new Handler.Callback() { // from class: e2.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.c;
                    if (!oVar.d && oVar.c) {
                        b2.q d = oVar.b.d();
                        oVar.b = new b2.p();
                        oVar.c = false;
                        nVar2.a(oVar.a, d);
                    }
                    if (pVar.b.a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.i = z10;
    }
}
