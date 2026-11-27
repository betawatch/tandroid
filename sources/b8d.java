// default package

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b8d implements q6d {
    public final Context a;
    public final d6d b;
    public final Looper c;
    public final i6d d;
    public final i6d e;
    public final Map f;
    public final d05 j;
    public Bundle k;
    public final ReentrantLock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public ws2 l = null;
    public ws2 m = null;
    public boolean n = false;
    public byte p = 0;

    public b8d(Context context, d6d d6dVar, ReentrantLock reentrantLock, Looper looper, j05 j05Var, qs qsVar, qs qsVar2, oxb oxbVar, rr5 rr5Var, d05 d05Var, ArrayList arrayList, ArrayList arrayList2, qs qsVar3, qs qsVar4) {
        this.a = context;
        this.b = d6dVar;
        this.o = reentrantLock;
        this.c = looper;
        this.j = d05Var;
        this.d = new i6d(context, d6dVar, reentrantLock, looper, j05Var, qsVar2, null, qsVar4, null, arrayList2, new k09(this, (byte) 23));
        this.e = new i6d(context, d6dVar, reentrantLock, looper, j05Var, qsVar, oxbVar, qsVar3, rr5Var, arrayList, new pq8((Object) this, (byte) 29));
        qs qsVar5 = new qs(0);
        Iterator it = ((os) qsVar2.keySet()).iterator();
        while (it.hasNext()) {
            qsVar5.put((xn) it.next(), this.d);
        }
        Iterator it2 = ((os) qsVar.keySet()).iterator();
        while (it2.hasNext()) {
            qsVar5.put((xn) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(qsVar5);
    }

    @Override // q6d
    public final void a() {
        this.p = (byte) 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    @Override // q6d
    public final boolean b(m8d m8dVar) {
        ReentrantLock reentrantLock;
        this.o.lock();
        try {
            reentrantLock = this.o;
            reentrantLock.lock();
            try {
                boolean z = true;
                boolean z2 = this.p == 2;
                reentrantLock.unlock();
                if (z2 || g()) {
                    i6d i6dVar = this.e;
                    if (!(i6dVar.m instanceof u5d)) {
                        this.i.add(m8dVar);
                        if (this.p == 0) {
                            this.p = (byte) 1;
                        }
                        this.m = null;
                        i6dVar.a();
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock = this.o;
        }
    }

    @Override // q6d
    public final jg0 c(jg0 jg0Var) {
        i6d i6dVar = (i6d) this.f.get(jg0Var.o);
        xve.i(i6dVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (i6dVar != this.e) {
            i6d i6dVar2 = this.d;
            i6dVar2.getClass();
            jg0Var.l();
            return i6dVar2.m.c(jg0Var);
        }
        if (i()) {
            d05 d05Var = this.j;
            jg0Var.o(new Status(4, null, d05Var == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), d05Var.m(), s7d.a | TLObject.FLAG_27), null));
            return jg0Var;
        }
        i6d i6dVar3 = this.e;
        i6dVar3.getClass();
        jg0Var.l();
        return i6dVar3.m.c(jg0Var);
    }

    @Override // q6d
    public final void d() {
        this.m = null;
        this.l = null;
        this.p = (byte) 0;
        this.d.d();
        this.e.d();
        h();
    }

    @Override // q6d
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.e(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // q6d
    public final void f() {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            boolean z = this.p == 2;
            reentrantLock.unlock();
            this.e.d();
            this.m = new ws2(4, null, null);
            if (z) {
                new b99(this.c, (byte) 1).post(new bva((Object) this, (byte) 23));
            } else {
                h();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.p == 1) goto L11;
     */
    @Override // q6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.o.lock();
        try {
            boolean z = false;
            if (this.d.m instanceof u5d) {
                if (!(this.e.m instanceof u5d) && !i()) {
                }
                z = true;
            }
            return z;
        } finally {
            this.o.unlock();
        }
    }

    public final void h() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m8d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean i() {
        ws2 ws2Var = this.m;
        return ws2Var != null && ws2Var.b == 4;
    }

    public final void j() {
        ws2 ws2Var;
        ws2 ws2Var2;
        ws2 ws2Var3 = this.l;
        i6d i6dVar = this.d;
        if (ws2Var3 == null || !ws2Var3.c()) {
            ws2 ws2Var4 = this.l;
            i6d i6dVar2 = this.e;
            if (ws2Var4 != null && (ws2Var2 = this.m) != null && ws2Var2.c()) {
                i6dVar2.d();
                ws2 ws2Var5 = this.l;
                xve.h(ws2Var5);
                k(ws2Var5);
                return;
            }
            ws2 ws2Var6 = this.l;
            if (ws2Var6 == null || (ws2Var = this.m) == null) {
                return;
            }
            if (i6dVar2.n < i6dVar.n) {
                ws2Var6 = ws2Var;
            }
            k(ws2Var6);
            return;
        }
        ws2 ws2Var7 = this.m;
        if ((ws2Var7 == null || !ws2Var7.c()) && !i()) {
            ws2 ws2Var8 = this.m;
            if (ws2Var8 != null) {
                if (this.p == 1) {
                    h();
                    return;
                } else {
                    k(ws2Var8);
                    i6dVar.d();
                    return;
                }
            }
            return;
        }
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.p = (byte) 0;
            } else {
                d6d d6dVar = this.b;
                xve.h(d6dVar);
                d6dVar.g1(this.k);
            }
        }
        h();
        this.p = (byte) 0;
    }

    public final void k(ws2 ws2Var) {
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = (byte) 0;
            }
            this.b.w(ws2Var);
        }
        h();
        this.p = (byte) 0;
    }
}
