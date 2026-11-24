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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m5d implements b4d {
    public final Context a;
    public final o3d b;
    public final Looper c;
    public final t3d d;
    public final t3d e;
    public final Map f;
    public final zz4 j;
    public Bundle k;
    public final ReentrantLock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public ot2 l = null;
    public ot2 m = null;
    public boolean n = false;
    public byte p = 0;

    public m5d(Context context, o3d o3dVar, ReentrantLock reentrantLock, Looper looper, e05 e05Var, qt qtVar, qt qtVar2, ovb ovbVar, or5 or5Var, zz4 zz4Var, ArrayList arrayList, ArrayList arrayList2, qt qtVar3, qt qtVar4) {
        this.a = context;
        this.b = o3dVar;
        this.o = reentrantLock;
        this.c = looper;
        this.j = zz4Var;
        byte b = 26;
        this.d = new t3d(context, o3dVar, reentrantLock, looper, e05Var, qtVar2, null, qtVar4, null, arrayList2, new oo8(this, b));
        this.e = new t3d(context, o3dVar, reentrantLock, looper, e05Var, qtVar, ovbVar, qtVar3, or5Var, arrayList, new et8(this, b));
        qt qtVar5 = new qt(0);
        Iterator it = ((ot) qtVar2.keySet()).iterator();
        while (it.hasNext()) {
            qtVar5.put((xo) it.next(), this.d);
        }
        Iterator it2 = ((ot) qtVar.keySet()).iterator();
        while (it2.hasNext()) {
            qtVar5.put((xo) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(qtVar5);
    }

    @Override // b4d
    public final void a() {
        this.p = (byte) 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    @Override // b4d
    public final boolean b(x5d x5dVar) {
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
                    t3d t3dVar = this.e;
                    if (!(t3dVar.m instanceof f3d)) {
                        this.i.add(x5dVar);
                        if (this.p == 0) {
                            this.p = (byte) 1;
                        }
                        this.m = null;
                        t3dVar.a();
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

    @Override // b4d
    public final void c() {
        this.m = null;
        this.l = null;
        this.p = (byte) 0;
        this.d.c();
        this.e.c();
        h();
    }

    @Override // b4d
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.d(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.d(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // b4d
    public final jh0 e(jh0 jh0Var) {
        t3d t3dVar = (t3d) this.f.get(jh0Var.o);
        ite.i(t3dVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (t3dVar != this.e) {
            t3d t3dVar2 = this.d;
            t3dVar2.getClass();
            jh0Var.l();
            return t3dVar2.m.e(jh0Var);
        }
        if (i()) {
            zz4 zz4Var = this.j;
            jh0Var.o(new Status(4, null, zz4Var == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), zz4Var.m(), d5d.a | TLObject.FLAG_27), null));
            return jh0Var;
        }
        t3d t3dVar3 = this.e;
        t3dVar3.getClass();
        jh0Var.l();
        return t3dVar3.m.e(jh0Var);
    }

    @Override // b4d
    public final void f() {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            boolean z = this.p == 2;
            reentrantLock.unlock();
            this.e.c();
            this.m = new ot2(4, null, null);
            if (z) {
                new q79(this.c, (byte) 1).post(new zka((Object) this, (byte) 24));
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
    @Override // b4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.o.lock();
        try {
            boolean z = false;
            if (this.d.m instanceof f3d) {
                if (!(this.e.m instanceof f3d) && !i()) {
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
            ((x5d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean i() {
        ot2 ot2Var = this.m;
        return ot2Var != null && ot2Var.b == 4;
    }

    public final void j() {
        ot2 ot2Var;
        ot2 ot2Var2;
        ot2 ot2Var3 = this.l;
        t3d t3dVar = this.d;
        if (ot2Var3 == null || !ot2Var3.c()) {
            ot2 ot2Var4 = this.l;
            t3d t3dVar2 = this.e;
            if (ot2Var4 != null && (ot2Var2 = this.m) != null && ot2Var2.c()) {
                t3dVar2.c();
                ot2 ot2Var5 = this.l;
                ite.h(ot2Var5);
                k(ot2Var5);
                return;
            }
            ot2 ot2Var6 = this.l;
            if (ot2Var6 == null || (ot2Var = this.m) == null) {
                return;
            }
            if (t3dVar2.n < t3dVar.n) {
                ot2Var6 = ot2Var;
            }
            k(ot2Var6);
            return;
        }
        ot2 ot2Var7 = this.m;
        if ((ot2Var7 == null || !ot2Var7.c()) && !i()) {
            ot2 ot2Var8 = this.m;
            if (ot2Var8 != null) {
                if (this.p == 1) {
                    h();
                    return;
                } else {
                    k(ot2Var8);
                    t3dVar.c();
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
                o3d o3dVar = this.b;
                ite.h(o3dVar);
                o3dVar.j1(this.k);
            }
        }
        h();
        this.p = (byte) 0;
    }

    public final void k(ot2 ot2Var) {
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = (byte) 0;
            }
            this.b.v(ot2Var);
        }
        h();
        this.p = (byte) 0;
    }
}
