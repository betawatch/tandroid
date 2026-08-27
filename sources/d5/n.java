package d5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n {
    public final b0 a;
    public final d0 b;
    public final l c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public n(Looper looper, b0 b0Var, l lVar) {
        this(new CopyOnWriteArraySet(), looper, b0Var, lVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new m(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        d0 d0Var = this.b;
        if (!d0Var.a.hasMessages(0)) {
            d0Var.getClass();
            c0 b10 = d0.b();
            Message obtainMessage = d0Var.a.obtainMessage(0);
            b10.a = obtainMessage;
            Handler handler = d0Var.a;
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

    public final void c(int i10, k kVar) {
        f();
        this.f.add(new i(new CopyOnWriteArraySet(this.d), i10, kVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            l lVar = this.c;
            mVar.d = true;
            if (mVar.c) {
                mVar.c = false;
                lVar.e(mVar.a, mVar.b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, k kVar) {
        c(i10, kVar);
        b();
    }

    public final void f() {
        if (this.i) {
            a.i(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, b0 b0Var, l lVar) {
        this.a = b0Var;
        this.d = copyOnWriteArraySet;
        this.c = lVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = b0Var.a(looper, new Handler.Callback() { // from class: d5.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                n nVar = n.this;
                Iterator it = nVar.d.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    l lVar2 = nVar.c;
                    if (!mVar.d && mVar.c) {
                        g c10 = mVar.b.c();
                        mVar.b = new c2.t();
                        mVar.c = false;
                        lVar2.e(mVar.a, c10);
                    }
                    if (nVar.b.a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = true;
    }
}
