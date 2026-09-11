package n6;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.p3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class g implements com.google.android.gms.common.api.c {
    public static final k6.c[] T = new k6.c[0];
    public b E;
    public IInterface F;
    public final ArrayList G;
    public c0 H;
    public int I;
    public final m J;
    public final m K;
    public final int L;
    public final String M;
    public volatile String N;
    public k6.a O;
    public boolean P;
    public volatile f0 Q;
    public final AtomicInteger R;
    public final Set S;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public androidx.activity.o h;
    public final Context n;
    public final Looper r;
    public final j0 s;
    public final a0 v;
    public final Object w;
    public final Object x;
    public y y;

    public g(Context context, Looper looper, int i10, p3 p3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (j0.g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j0 j0Var = j0.h;
        Object obj = k6.d.c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        String str = (String) p3Var.e;
        Object obj2 = k6.d.c;
        this.f = null;
        this.w = new Object();
        this.x = new Object();
        this.G = new ArrayList();
        this.I = 1;
        this.O = null;
        this.P = false;
        this.Q = null;
        this.R = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.n = context;
        l.i(looper, "Looper must not be null");
        this.r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.s = j0Var;
        this.v = new a0(this, looper);
        this.L = i10;
        this.J = mVar;
        this.K = mVar2;
        this.M = str;
        Set set = (Set) p3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.S = set;
    }

    public static /* bridge */ /* synthetic */ void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.w) {
            i10 = gVar.I;
        }
        if (i10 == 3) {
            gVar.P = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i11, gVar.R.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.w) {
            try {
                if (gVar.I != i10) {
                    return false;
                }
                gVar.F(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A(int i10) {
        this.a = i10;
        this.b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
    }

    public boolean C() {
        return this instanceof b6.a;
    }

    public final void F(int i10, IInterface iInterface) {
        androidx.activity.o oVar;
        l.b((i10 == 4) == (iInterface != null));
        synchronized (this.w) {
            try {
                this.I = i10;
                this.F = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    c0 c0Var = this.H;
                    if (c0Var != null) {
                        j0 j0Var = this.s;
                        String str = (String) this.h.c;
                        l.h(str);
                        String str2 = (String) this.h.d;
                        if (this.M == null) {
                            this.n.getClass();
                        }
                        j0Var.c(str, str2, c0Var, this.h.b);
                        this.H = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    c0 c0Var2 = this.H;
                    if (c0Var2 != null && (oVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.c) + " on " + ((String) oVar.d));
                        j0 j0Var2 = this.s;
                        String str3 = (String) this.h.c;
                        l.h(str3);
                        String str4 = (String) this.h.d;
                        if (this.M == null) {
                            this.n.getClass();
                        }
                        j0Var2.c(str3, str4, c0Var2, this.h.b);
                        this.R.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.R.get());
                    this.H = c0Var3;
                    String x10 = x();
                    String w10 = w();
                    boolean y3 = y();
                    this.h = new androidx.activity.o(x10, w10, y3, 4);
                    if (y3 && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.c)));
                    }
                    j0 j0Var3 = this.s;
                    String str5 = (String) this.h.c;
                    l.h(str5);
                    String str6 = (String) this.h.d;
                    String str7 = this.M;
                    if (str7 == null) {
                        str7 = this.n.getClass().getName();
                    }
                    k6.a b10 = j0Var3.b(new g0(str5, str6, this.h.b), c0Var3, str7);
                    if (!b10.c()) {
                        androidx.activity.o oVar2 = this.h;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.c) + " on " + ((String) oVar2.d));
                        int i11 = b10.b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b10.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.c);
                        }
                        int i12 = this.R.get();
                        e0 e0Var = new e0(this, i11, bundle);
                        a0 a0Var = this.v;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                    }
                } else if (i10 == 4) {
                    l.h(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.common.api.c
    public boolean a() {
        return this instanceof a6.e;
    }

    @Override // com.google.android.gms.common.api.c
    public final void b(h hVar, Set set) {
        Bundle t10 = t();
        String str = Build.VERSION.SDK_INT < 31 ? this.N : this.N;
        int i10 = this.L;
        int i11 = k6.e.a;
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k6.c[] cVarArr = f.F;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.e = hVar.asBinder();
            }
        } else if (this instanceof e8.b) {
            fVar.n = null;
        }
        fVar.r = T;
        fVar.s = r();
        if (C()) {
            fVar.x = true;
        }
        try {
            synchronized (this.x) {
                try {
                    y yVar = this.y;
                    if (yVar != null) {
                        yVar.G0(new b0(this, this.R.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i12 = this.R.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final Set c() {
        return p() ? this.S : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.c
    public final void d(String str) {
        this.f = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.c
    public void disconnect() {
        this.R.incrementAndGet();
        synchronized (this.G) {
            try {
                int size = this.G.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((w) this.G.get(i10)).c();
                }
                this.G.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.x) {
            this.y = null;
        }
        F(1, null);
    }

    @Override // com.google.android.gms.common.api.c
    public void e(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.E = bVar;
        F(2, null);
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean f() {
        boolean z10;
        synchronized (this.w) {
            int i10 = this.I;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public final void g(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.w) {
            i10 = this.I;
            iInterface = this.F;
        }
        synchronized (this.x) {
            yVar = this.y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j3 = this.c;
            append.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.b;
            append2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.e;
            append3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final String h() {
        androidx.activity.o oVar;
        if (!j() || (oVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) oVar.d;
    }

    @Override // com.google.android.gms.common.api.c
    public final void i(a4.m mVar) {
        ((p0) mVar.b).o.x.post(new androidx.activity.i(mVar, 14));
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean j() {
        boolean z10;
        synchronized (this.w) {
            z10 = this.I == 4;
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public boolean k() {
        return true;
    }

    @Override // com.google.android.gms.common.api.c
    public abstract int l();

    @Override // com.google.android.gms.common.api.c
    public final k6.c[] m() {
        f0 f0Var = this.Q;
        if (f0Var == null) {
            return null;
        }
        return f0Var.b;
    }

    @Override // com.google.android.gms.common.api.c
    public final String n() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.c
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override // com.google.android.gms.common.api.c
    public boolean p() {
        return false;
    }

    public abstract IInterface q(IBinder iBinder);

    public k6.c[] r() {
        return T;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.w) {
            try {
                if (this.I == 5) {
                    throw new DeadObjectException();
                }
                if (!j()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.F;
                l.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        return l() >= 211700000;
    }

    public void z(k6.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }
}
