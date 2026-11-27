// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a6d implements g6d {
    public boolean E;
    public wi5 F;
    public boolean G;
    public boolean H;
    public final oxb I;
    public final qs J;
    public final rr5 K;
    public final i6d a;
    public final ReentrantLock b;
    public final Context c;
    public final j05 d;
    public ws2 e;
    public int f;
    public int n;
    public xka w;
    public boolean x;
    public boolean y;
    public boolean h = false;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList L = new ArrayList();

    public a6d(i6d i6dVar, oxb oxbVar, qs qsVar, j05 j05Var, rr5 rr5Var, ReentrantLock reentrantLock, Context context) {
        this.a = i6dVar;
        this.I = oxbVar;
        this.J = qsVar;
        this.d = j05Var;
        this.K = rr5Var;
        this.b = reentrantLock;
        this.c = context;
    }

    @Override // g6d
    public final void F0(int i) {
        g(new ws2(8, null, null));
    }

    @Override // g6d
    public final void H1() {
        i6d i6dVar = this.a;
        HashMap hashMap = i6dVar.i;
        qs qsVar = i6dVar.f;
        hashMap.clear();
        this.y = false;
        this.e = null;
        this.h = false;
        this.x = true;
        this.E = false;
        this.G = false;
        HashMap hashMap2 = new HashMap();
        qs qsVar2 = this.J;
        Iterator it = ((os) qsVar2.keySet()).iterator();
        while (it.hasNext()) {
            zn znVar = (zn) it.next();
            d05 d05Var = (d05) qsVar.get(znVar.b);
            xve.h(d05Var);
            boolean booleanValue = ((Boolean) qsVar2.get(znVar)).booleanValue();
            if (d05Var.w()) {
                this.y = true;
                if (booleanValue) {
                    this.s.add(znVar.b);
                } else {
                    this.x = false;
                }
            }
            hashMap2.put(d05Var, new v5d(this, znVar, booleanValue));
        }
        if (this.y) {
            oxb oxbVar = this.I;
            xve.h(oxbVar);
            rr5 rr5Var = this.K;
            xve.h(rr5Var);
            d6d d6dVar = i6dVar.o;
            oxbVar.h = Integer.valueOf(System.identityHashCode(d6dVar));
            z5d z5dVar = new z5d(this);
            this.w = (xka) rr5Var.a(this.c, d6dVar.h, oxbVar, (zka) oxbVar.f, z5dVar, z5dVar);
        }
        this.n = qsVar.c;
        this.L.add(j6d.a.submit(new x5d(this, hashMap2, (byte) 0)));
    }

    @Override // g6d
    public final void J(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (j()) {
                d();
            }
        }
    }

    public final void b() {
        if (this.n == 0) {
            if (!this.y || this.E) {
                ArrayList arrayList = new ArrayList();
                this.h = true;
                i6d i6dVar = this.a;
                qs qsVar = i6dVar.f;
                this.n = qsVar.c;
                Iterator it = ((os) qsVar.keySet()).iterator();
                while (it.hasNext()) {
                    xn xnVar = (xn) it.next();
                    if (!i6dVar.i.containsKey(xnVar)) {
                        arrayList.add((d05) qsVar.get(xnVar));
                    } else if (j()) {
                        d();
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.L.add(j6d.a.submit(new x5d(this, arrayList, (byte) 1)));
            }
        }
    }

    @Override // g6d
    public final jg0 c(jg0 jg0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void d() {
        i6d i6dVar = this.a;
        i6dVar.a.lock();
        try {
            i6dVar.o.e();
            i6dVar.m = new u5d(i6dVar);
            i6dVar.m.H1();
            i6dVar.b.signalAll();
            i6dVar.a.unlock();
            j6d.a.execute(new bva(this, (byte) 18));
            xka xkaVar = this.w;
            if (xkaVar != null) {
                if (this.G) {
                    wi5 wi5Var = this.F;
                    xve.h(wi5Var);
                    boolean z = this.H;
                    try {
                        i7d i7dVar = (i7d) xkaVar.k();
                        Integer num = xkaVar.I;
                        xve.h(num);
                        int intValue = num.intValue();
                        Parcel c = i7dVar.c();
                        v6d.c(c, wi5Var);
                        c.writeInt(intValue);
                        c.writeInt(z ? 1 : 0);
                        i7dVar.d(c, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                h(false);
            }
            Iterator it = i6dVar.i.keySet().iterator();
            while (it.hasNext()) {
                d05 d05Var = (d05) i6dVar.f.get((xn) it.next());
                xve.h(d05Var);
                d05Var.c();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            i6dVar.p.g1(bundle);
        } catch (Throwable th) {
            i6dVar.a.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.d.a(r3.b, null, null) != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ws2 ws2Var, zn znVar, boolean z) {
        rr5 rr5Var = znVar.a;
        if (z && !ws2Var.b()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = ws2Var;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(znVar.b, ws2Var);
    }

    public final void f() {
        this.y = false;
        i6d i6dVar = this.a;
        i6dVar.o.G = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            xn xnVar = (xn) it.next();
            HashMap hashMap = i6dVar.i;
            if (!hashMap.containsKey(xnVar)) {
                hashMap.put(xnVar, new ws2(17, null, null));
            }
        }
    }

    public final void g(ws2 ws2Var) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        h(!ws2Var.b());
        i6d i6dVar = this.a;
        i6dVar.h();
        i6dVar.p.w(ws2Var);
    }

    public final void h(boolean z) {
        xka xkaVar = this.w;
        if (xkaVar != null) {
            if (xkaVar.q() && z) {
                try {
                    i7d i7dVar = (i7d) xkaVar.k();
                    Integer num = xkaVar.I;
                    xve.h(num);
                    int intValue = num.intValue();
                    Parcel c = i7dVar.c();
                    c.writeInt(intValue);
                    i7dVar.d(c, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            xkaVar.c();
            xve.h(this.I);
            this.F = null;
        }
    }

    public final boolean i(int i) {
        if (this.h == i) {
            return true;
        }
        d6d d6dVar = this.a.o;
        d6dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(d6dVar.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(d6dVar.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(d6dVar.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) d6dVar.N.b).size());
        q6d q6dVar = d6dVar.d;
        if (q6dVar != null) {
            q6dVar.e("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String str = this.h ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        g(new ws2(8, null, null));
        return false;
    }

    public final boolean j() {
        i6d i6dVar = this.a;
        int i = this.n - 1;
        this.n = i;
        if (i > 0) {
            return false;
        }
        if (i >= 0) {
            ws2 ws2Var = this.e;
            if (ws2Var == null) {
                return true;
            }
            i6dVar.n = this.f;
            g(ws2Var);
            return false;
        }
        d6d d6dVar = i6dVar.o;
        d6dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(d6dVar.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(d6dVar.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(d6dVar.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) d6dVar.N.b).size());
        q6d q6dVar = d6dVar.d;
        if (q6dVar != null) {
            q6dVar.e("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        g(new ws2(8, null, null));
        return false;
    }

    @Override // g6d
    public final boolean m1() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        h(true);
        this.a.h();
        return true;
    }

    @Override // g6d
    public final void x1(ws2 ws2Var, zn znVar, boolean z) {
        if (i(1)) {
            e(ws2Var, znVar, z);
            if (j()) {
                d();
            }
        }
    }

    @Override // g6d
    public final void a() {
    }
}
