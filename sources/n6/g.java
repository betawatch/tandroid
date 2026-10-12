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
import m.q3;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class g implements com.google.android.gms.common.api.c {
    public static final k6.c[] T = new k6.c[0];
    public b E;
    public IInterface F;
    public final ArrayList G;
    public d0 H;
    public int I;
    public final m J;
    public final m K;
    public final int L;
    public final String M;
    public volatile String N;
    public k6.a O;
    public boolean P;
    public volatile g0 Q;
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
    public final k0 s;
    public final b0 v;
    public final Object w;
    public final Object x;
    public z y;

    public g(Context context, Looper looper, int i10, q3 q3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (k0.g) {
            try {
                if (k0.h == null) {
                    k0.h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k0 k0Var = k0.h;
        Object obj = k6.d.c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        String str = (String) q3Var.e;
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
        l.i(k0Var, "Supervisor must not be null");
        this.s = k0Var;
        this.v = new b0(this, looper);
        this.L = i10;
        this.J = mVar;
        this.K = mVar2;
        this.M = str;
        Set set = (Set) q3Var.b;
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
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(i11, gVar.R.get(), 16));
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
        e0 e0Var = new e0(this, i10, iBinder, bundle);
        b0 b0Var = this.v;
        b0Var.sendMessage(b0Var.obtainMessage(1, i11, -1, e0Var));
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
                    d0 d0Var = this.H;
                    if (d0Var != null) {
                        k0 k0Var = this.s;
                        String str = (String) this.h.b;
                        l.h(str);
                        String str2 = (String) this.h.c;
                        if (this.M == null) {
                            this.n.getClass();
                        }
                        k0Var.c(str, str2, d0Var, this.h.a);
                        this.H = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    d0 d0Var2 = this.H;
                    if (d0Var2 != null && (oVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.b) + " on " + ((String) oVar.c));
                        k0 k0Var2 = this.s;
                        String str3 = (String) this.h.b;
                        l.h(str3);
                        String str4 = (String) this.h.c;
                        if (this.M == null) {
                            this.n.getClass();
                        }
                        k0Var2.c(str3, str4, d0Var2, this.h.a);
                        this.R.incrementAndGet();
                    }
                    d0 d0Var3 = new d0(this, this.R.get());
                    this.H = d0Var3;
                    String x10 = x();
                    String w9 = w();
                    boolean y3 = y();
                    androidx.activity.o oVar2 = new androidx.activity.o();
                    oVar2.c = x10;
                    oVar2.b = w9;
                    oVar2.a = y3;
                    this.h = oVar2;
                    if (y3 && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.b)));
                    }
                    k0 k0Var3 = this.s;
                    String str5 = (String) this.h.b;
                    l.h(str5);
                    String str6 = (String) this.h.c;
                    String str7 = this.M;
                    if (str7 == null) {
                        str7 = this.n.getClass().getName();
                    }
                    k6.a b10 = k0Var3.b(new h0(str5, str6, this.h.a), d0Var3, str7);
                    if (!b10.c()) {
                        androidx.activity.o oVar3 = this.h;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) oVar3.b) + " on " + ((String) oVar3.c));
                        int i11 = b10.b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b10.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.c);
                        }
                        int i12 = this.R.get();
                        f0 f0Var = new f0(this, i11, bundle);
                        b0 b0Var = this.v;
                        b0Var.sendMessage(b0Var.obtainMessage(7, i12, -1, f0Var));
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
                    z zVar = this.y;
                    if (zVar != null) {
                        zVar.F0(new c0(this, this.R.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.R.get();
            b0 b0Var = this.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
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
                    ((x) this.G.get(i10)).c();
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
    public final void e(a6.i iVar) {
        ((p0) iVar.b).o.x.post(new androidx.activity.i((Object) iVar, 14));
    }

    @Override // com.google.android.gms.common.api.c
    public void f(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.E = bVar;
        F(2, null);
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean g() {
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
    public final void h(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        z zVar;
        synchronized (this.w) {
            i10 = this.I;
            iInterface = this.F;
        }
        synchronized (this.x) {
            zVar = this.y;
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
            printWriter.append(BuildConfig.BETA_URL);
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zVar == null) {
            printWriter.println(BuildConfig.BETA_URL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.c;
            append.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
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
            long j11 = this.b;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final String i() {
        androidx.activity.o oVar;
        if (!j() || (oVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) oVar.c;
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
        g0 g0Var = this.Q;
        if (g0Var == null) {
            return null;
        }
        return g0Var.b;
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
