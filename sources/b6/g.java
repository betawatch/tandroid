package b6;

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
import m.r3;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class g implements com.google.android.gms.common.api.c {
    public static final y5.c[] Q = new y5.c[0];
    public b B;
    public IInterface C;
    public final ArrayList D;
    public d0 E;
    public int F;
    public final n G;
    public final n H;
    public final int I;
    public final String J;
    public volatile String K;
    public y5.a L;
    public boolean M;
    public volatile g0 N;
    public final AtomicInteger O;
    public final Set P;
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

    public g(Context context, Looper looper, int i10, r3 r3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
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
        Object obj = y5.d.c;
        m.h(kVar);
        m.h(lVar);
        n nVar = new n(kVar);
        n nVar2 = new n(lVar);
        String str = (String) r3Var.e;
        Object obj2 = y5.d.c;
        this.f = null;
        this.w = new Object();
        this.x = new Object();
        this.D = new ArrayList();
        this.F = 1;
        this.L = null;
        this.M = false;
        this.N = null;
        this.O = new AtomicInteger(0);
        m.i(context, "Context must not be null");
        this.n = context;
        m.i(looper, "Looper must not be null");
        this.r = looper;
        m.i(k0Var, "Supervisor must not be null");
        this.s = k0Var;
        this.v = new b0(this, looper);
        this.I = i10;
        this.G = nVar;
        this.H = nVar2;
        this.J = str;
        Set set = (Set) r3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.P = set;
    }

    public static /* bridge */ /* synthetic */ void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.w) {
            i10 = gVar.F;
        }
        if (i10 == 3) {
            gVar.M = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(i11, gVar.O.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.w) {
            try {
                if (gVar.F != i10) {
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
        return this instanceof p5.a;
    }

    public final void F(int i10, IInterface iInterface) {
        androidx.activity.o oVar;
        m.b((i10 == 4) == (iInterface != null));
        synchronized (this.w) {
            try {
                this.F = i10;
                this.C = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    d0 d0Var = this.E;
                    if (d0Var != null) {
                        k0 k0Var = this.s;
                        String str = (String) this.h.b;
                        m.h(str);
                        String str2 = (String) this.h.c;
                        if (this.J == null) {
                            this.n.getClass();
                        }
                        k0Var.c(str, str2, d0Var, this.h.a);
                        this.E = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    d0 d0Var2 = this.E;
                    if (d0Var2 != null && (oVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.b) + " on " + ((String) oVar.c));
                        k0 k0Var2 = this.s;
                        String str3 = (String) this.h.b;
                        m.h(str3);
                        String str4 = (String) this.h.c;
                        if (this.J == null) {
                            this.n.getClass();
                        }
                        k0Var2.c(str3, str4, d0Var2, this.h.a);
                        this.O.incrementAndGet();
                    }
                    d0 d0Var3 = new d0(this, this.O.get());
                    this.E = d0Var3;
                    String x10 = x();
                    String w10 = w();
                    boolean y10 = y();
                    androidx.activity.o oVar2 = new androidx.activity.o();
                    oVar2.c = x10;
                    oVar2.b = w10;
                    oVar2.a = y10;
                    this.h = oVar2;
                    if (y10 && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.b)));
                    }
                    k0 k0Var3 = this.s;
                    String str5 = (String) this.h.b;
                    m.h(str5);
                    String str6 = (String) this.h.c;
                    String str7 = this.J;
                    if (str7 == null) {
                        str7 = this.n.getClass().getName();
                    }
                    y5.a b10 = k0Var3.b(new h0(str5, str6, this.h.a), d0Var3, str7);
                    if (!b10.f()) {
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
                        int i12 = this.O.get();
                        f0 f0Var = new f0(this, i11, bundle);
                        b0 b0Var = this.v;
                        b0Var.sendMessage(b0Var.obtainMessage(7, i12, -1, f0Var));
                    }
                } else if (i10 == 4) {
                    m.h(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.common.api.c
    public boolean a() {
        return this instanceof o5.e;
    }

    @Override // com.google.android.gms.common.api.c
    public final Set b() {
        return p() ? this.P : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.c
    public final void c(String str) {
        this.f = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.c
    public final void d(o5.i iVar) {
        ((p0) iVar.b).o.x.post(new androidx.activity.i(iVar, 11));
    }

    @Override // com.google.android.gms.common.api.c
    public void disconnect() {
        this.O.incrementAndGet();
        synchronized (this.D) {
            try {
                int size = this.D.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((x) this.D.get(i10)).c();
                }
                this.D.clear();
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
    public final boolean e() {
        boolean z4;
        synchronized (this.w) {
            int i10 = this.F;
            z4 = true;
            if (i10 != 2 && i10 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.common.api.c
    public final void f(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        z zVar;
        synchronized (this.w) {
            i10 = this.F;
            iInterface = this.C;
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
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) l8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final String g() {
        androidx.activity.o oVar;
        if (!h() || (oVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) oVar.c;
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean h() {
        boolean z4;
        synchronized (this.w) {
            z4 = this.F == 4;
        }
        return z4;
    }

    @Override // com.google.android.gms.common.api.c
    public final void i(i iVar, Set set) {
        Bundle t6 = t();
        String str = Build.VERSION.SDK_INT < 31 ? this.K : this.K;
        int i10 = this.I;
        int i11 = y5.e.a;
        Scope[] scopeArr = f.B;
        Bundle bundle = new Bundle();
        y5.c[] cVarArr = f.C;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.n.getPackageName();
        fVar.h = t6;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                fVar.e = iVar.asBinder();
            }
        } else if (this instanceof s7.b) {
            fVar.n = null;
        }
        fVar.r = Q;
        fVar.s = r();
        if (C()) {
            fVar.x = true;
        }
        try {
            synchronized (this.x) {
                try {
                    z zVar = this.y;
                    if (zVar != null) {
                        zVar.E0(new c0(this, this.O.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i12 = this.O.get();
            b0 b0Var = this.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.O.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.O.get());
        }
    }

    @Override // com.google.android.gms.common.api.c
    public boolean j() {
        return true;
    }

    @Override // com.google.android.gms.common.api.c
    public abstract int k();

    @Override // com.google.android.gms.common.api.c
    public final y5.c[] l() {
        g0 g0Var = this.N;
        if (g0Var == null) {
            return null;
        }
        return g0Var.b;
    }

    @Override // com.google.android.gms.common.api.c
    public final String m() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.c
    public void n(b bVar) {
        m.i(bVar, "Connection progress callbacks cannot be null.");
        this.B = bVar;
        F(2, null);
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

    public y5.c[] r() {
        return Q;
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
                if (this.F == 5) {
                    throw new DeadObjectException();
                }
                if (!h()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.C;
                m.i(iInterface2, "Client is connected but service is null");
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
        return k() >= 211700000;
    }

    public void z(y5.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }
}
