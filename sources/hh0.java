// default package

import android.accounts.Account;
import android.content.AttributionSource;
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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hh0 {
    public static final o94[] D = new o94[0];
    public boolean A;
    public volatile ape B;
    public final AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public ry g;
    public final Context h;
    public final Looper i;
    public final lbf j;
    public final rdd k;
    public final Object l;
    public final Object m;
    public h7d n;
    public fh0 o;
    public IInterface p;
    public final ArrayList q;
    public qvd r;
    public byte s;
    public final cf9 t;
    public final oo8 u;
    public final short v;
    public final String w;
    public volatile String x;
    public volatile gz y;
    public ot2 z;

    /* JADX WARN: Multi-variable type inference failed */
    public hh0(Context context, Looper looper, lbf lbfVar, int i, cf9 cf9Var, oo8 oo8Var, String str) {
        Object obj = d05.d;
        this.f = null;
        this.l = new Object();
        this.m = new Object();
        this.q = new ArrayList();
        this.s = (byte) 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        ite.i(context, "Context must not be null");
        this.h = context;
        ite.i(looper, "Looper must not be null");
        this.i = looper;
        ite.i(lbfVar, "Supervisor must not be null");
        this.j = lbfVar;
        this.k = new rdd(this, looper);
        this.v = i;
        this.t = cf9Var;
        this.u = oo8Var;
        this.w = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(int i, IInterface iInterface) {
        ry ryVar;
        ite.b((i == 4) == (iInterface != null));
        synchronized (this.l) {
            this.s = i;
            this.p = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                qvd qvdVar = this.r;
                if (qvdVar != null) {
                    lbf lbfVar = this.j;
                    String str = (String) this.g.c;
                    ite.h(str);
                    String str2 = (String) this.g.d;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    lbfVar.c(str, str2, qvdVar, this.g.b);
                    this.r = null;
                }
            } else if (i == 2 || i == 3) {
                qvd qvdVar2 = this.r;
                if (qvdVar2 != null && (ryVar = this.g) != null) {
                    String str3 = (String) ryVar.c;
                    String str4 = (String) ryVar.d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    lbf lbfVar2 = this.j;
                    String str5 = (String) this.g.c;
                    ite.h(str5);
                    String str6 = (String) this.g.d;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    lbfVar2.c(str5, str6, qvdVar2, this.g.b);
                    this.C.incrementAndGet();
                }
                qvd qvdVar3 = new qvd(this, this.C.get());
                this.r = qvdVar3;
                String o = o();
                String n = n();
                boolean p = p();
                this.g = new ry(o, n, p);
                if (p && i() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.g.c)));
                }
                lbf lbfVar3 = this.j;
                String str7 = (String) this.g.c;
                ite.h(str7);
                String str8 = (String) this.g.d;
                String str9 = this.w;
                if (str9 == null) {
                    str9 = this.h.getClass().getName();
                }
                ot2 b = lbfVar3.b(new z4f(str7, str8, this.g.b), qvdVar3, str9);
                if (!b.c()) {
                    ry ryVar2 = this.g;
                    String str10 = (String) ryVar2.c;
                    String str11 = (String) ryVar2.d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 34 + String.valueOf(str11).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str10);
                    sb2.append(" on ");
                    sb2.append(str11);
                    Log.w("GmsClient", sb2.toString());
                    int i2 = b.b;
                    if (i2 == -1) {
                        i2 = 16;
                    }
                    if (b.c != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", b.c);
                    }
                    int i3 = this.C.get();
                    h8e h8eVar = new h8e(this, i2, bundle);
                    rdd rddVar = this.k;
                    rddVar.sendMessage(rddVar.obtainMessage(7, i3, -1, h8eVar));
                }
            } else if (i == 4) {
                ite.h(iInterface);
                IInterface iInterface2 = iInterface;
                this.c = System.currentTimeMillis();
            }
        }
    }

    public void a(fh0 fh0Var) {
        ite.i(fh0Var, "Connection progress callbacks cannot be null.");
        this.o = fh0Var;
        A(2, null);
    }

    public IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = ij5.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof jj5 ? (jj5) queryLocalInterface : new hj5(iBinder);
    }

    public void c() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((p6d) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.m) {
            this.n = null;
        }
        A(1, null);
    }

    public final void d(String str) {
        this.f = str;
        c();
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        byte b;
        IInterface iInterface;
        h7d h7dVar;
        long j;
        synchronized (this.l) {
            b = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            h7dVar = this.n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (b == 1) {
            printWriter.print("DISCONNECTED");
        } else if (b == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (b == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (b == 4) {
            printWriter.print("CONNECTED");
        } else if (b != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) l()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (h7dVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(h7dVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(j2));
            j = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(format).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j = 0;
        }
        if (this.b > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i = this.a;
            if (i == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i != 3) {
                printWriter.append((CharSequence) String.valueOf(i));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format2).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.e > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) dud.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(format3).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public o94[] f() {
        return D;
    }

    public Bundle g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public int i() {
        return 17895000;
    }

    public void j(ti5 ti5Var, Set set) {
        String attributionTag;
        Bundle h = h();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.x;
        } else if (this.y == null) {
            attributionTag = this.x;
        } else {
            AttributionSource attributionSource = this.y.a;
            attributionTag = attributionSource == null ? this.x : attributionSource.getAttributionTag() == null ? this.x : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        short s = this.v;
        int i = e05.a;
        Scope[] scopeArr = dv4.F;
        Bundle bundle = new Bundle();
        o94[] o94VarArr = dv4.G;
        dv4 dv4Var = new dv4(6, s, i, null, null, scopeArr, bundle, null, o94VarArr, o94VarArr, true, 0, false, str);
        dv4Var.d = this.h.getPackageName();
        dv4Var.h = h;
        if (set != null) {
            dv4Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (w()) {
            dv4Var.n = new Account("<<default account>>", "com.google");
            if (ti5Var != null) {
                dv4Var.e = ti5Var.asBinder();
            }
        } else if (this instanceof w7d) {
            dv4Var.n = null;
        }
        dv4Var.r = D;
        dv4Var.s = f();
        if (x()) {
            dv4Var.y = true;
        }
        try {
            synchronized (this.m) {
                h7d h7dVar = this.n;
                if (h7dVar != null) {
                    h7dVar.a(new qpd(this, this.C.get()), dv4Var);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.C.get();
            rdd rddVar = this.k;
            rddVar.sendMessage(rddVar.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.C.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.C.get());
        }
    }

    public final IInterface k() {
        IInterface iInterface;
        synchronized (this.l) {
            if (this.s == 5) {
                throw new DeadObjectException();
            }
            if (!q()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            IInterface iInterface2 = this.p;
            ite.i(iInterface2, "Client is connected but service is null");
            iInterface = iInterface2;
        }
        return iInterface;
    }

    public String l() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    public Intent m() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public String n() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    public String o() {
        return "com.google.android.gms";
    }

    public boolean p() {
        return i() >= 211700000;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.l) {
            z = this.s == 4;
        }
        return z;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.l) {
            byte b = this.s;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public void s(ot2 ot2Var) {
        this.d = ot2Var.b;
        this.e = System.currentTimeMillis();
    }

    public void t(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        x0e x0eVar = new x0e(this, i, iBinder, bundle);
        rdd rddVar = this.k;
        rddVar.sendMessage(rddVar.obtainMessage(1, i2, -1, x0eVar));
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return this instanceof nc9;
    }

    public final /* synthetic */ boolean y(int i, int i2, IInterface iInterface) {
        synchronized (this.l) {
            if (this.s != i) {
                return false;
            }
            A(i2, iInterface);
            return true;
        }
    }

    public final /* synthetic */ void z() {
        byte b;
        int i;
        synchronized (this.l) {
            b = this.s;
        }
        if (b == 3) {
            this.A = true;
            i = 5;
        } else {
            i = 4;
        }
        rdd rddVar = this.k;
        rddVar.sendMessage(rddVar.obtainMessage(i, this.C.get(), 16));
    }
}
