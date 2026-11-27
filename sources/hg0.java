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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class hg0 {
    public static final a94[] D = new a94[0];
    public boolean A;
    public volatile ore B;
    public final AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public rx g;
    public final Context h;
    public final Looper i;
    public final aef j;
    public final igd k;
    public final Object l;
    public final Object m;
    public y9d n;
    public fg0 o;
    public IInterface p;
    public final ArrayList q;
    public dyd r;
    public byte s;
    public final i09 t;
    public final k09 u;
    public final short v;
    public final String w;
    public volatile String x;
    public volatile hy y;
    public ws2 z;

    /* JADX WARN: Multi-variable type inference failed */
    public hg0(Context context, Looper looper, aef aefVar, int i, i09 i09Var, k09 k09Var, String str) {
        Object obj = i05.d;
        this.f = null;
        this.l = new Object();
        this.m = new Object();
        this.q = new ArrayList();
        this.s = (byte) 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        xve.i(context, "Context must not be null");
        this.h = context;
        xve.i(looper, "Looper must not be null");
        this.i = looper;
        xve.i(aefVar, "Supervisor must not be null");
        this.j = aefVar;
        this.k = new igd(this, looper);
        this.v = i;
        this.t = i09Var;
        this.u = k09Var;
        this.w = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(int i, IInterface iInterface) {
        rx rxVar;
        xve.b((i == 4) == (iInterface != null));
        synchronized (this.l) {
            this.s = i;
            this.p = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                dyd dydVar = this.r;
                if (dydVar != null) {
                    aef aefVar = this.j;
                    String str = (String) this.g.c;
                    xve.h(str);
                    String str2 = (String) this.g.d;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    aefVar.c(str, str2, dydVar, this.g.b);
                    this.r = null;
                }
            } else if (i == 2 || i == 3) {
                dyd dydVar2 = this.r;
                if (dydVar2 != null && (rxVar = this.g) != null) {
                    String str3 = (String) rxVar.c;
                    String str4 = (String) rxVar.d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    aef aefVar2 = this.j;
                    String str5 = (String) this.g.c;
                    xve.h(str5);
                    String str6 = (String) this.g.d;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    aefVar2.c(str5, str6, dydVar2, this.g.b);
                    this.C.incrementAndGet();
                }
                dyd dydVar3 = new dyd(this, this.C.get());
                this.r = dydVar3;
                String o = o();
                String n = n();
                boolean p = p();
                this.g = new rx(o, n, p);
                if (p && i() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.g.c)));
                }
                aef aefVar3 = this.j;
                String str7 = (String) this.g.c;
                xve.h(str7);
                String str8 = (String) this.g.d;
                String str9 = this.w;
                if (str9 == null) {
                    str9 = this.h.getClass().getName();
                }
                ws2 b = aefVar3.b(new o7f(str7, str8, this.g.b), dydVar3, str9);
                if (!b.c()) {
                    rx rxVar2 = this.g;
                    String str10 = (String) rxVar2.c;
                    String str11 = (String) rxVar2.d;
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
                    vae vaeVar = new vae(this, i2, bundle);
                    igd igdVar = this.k;
                    igdVar.sendMessage(igdVar.obtainMessage(7, i3, -1, vaeVar));
                }
            } else if (i == 4) {
                xve.h(iInterface);
                IInterface iInterface2 = iInterface;
                this.c = System.currentTimeMillis();
            }
        }
    }

    public void a(fg0 fg0Var) {
        xve.i(fg0Var, "Connection progress callbacks cannot be null.");
        this.o = fg0Var;
        A(2, null);
    }

    public IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = lj5.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof mj5 ? (mj5) queryLocalInterface : new kj5(iBinder);
    }

    public void c() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((e9d) arrayList.get(i)).d();
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
        y9d y9dVar;
        long j;
        synchronized (this.l) {
            b = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            y9dVar = this.n;
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
        if (y9dVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(y9dVar.a)));
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
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) qwd.a(this.d));
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

    public a94[] f() {
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

    public void j(wi5 wi5Var, Set set) {
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
        int i = j05.a;
        Scope[] scopeArr = gv4.F;
        Bundle bundle = new Bundle();
        a94[] a94VarArr = gv4.G;
        gv4 gv4Var = new gv4(6, s, i, null, null, scopeArr, bundle, null, a94VarArr, a94VarArr, true, 0, false, str);
        gv4Var.d = this.h.getPackageName();
        gv4Var.h = h;
        if (set != null) {
            gv4Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (w()) {
            gv4Var.n = new Account("<<default account>>", "com.google");
            if (wi5Var != null) {
                gv4Var.e = wi5Var.asBinder();
            }
        } else if (this instanceof nad) {
            gv4Var.n = null;
        }
        gv4Var.r = D;
        gv4Var.s = f();
        if (x()) {
            gv4Var.y = true;
        }
        try {
            synchronized (this.m) {
                y9d y9dVar = this.n;
                if (y9dVar != null) {
                    y9dVar.a(new esd(this, this.C.get()), gv4Var);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.C.get();
            igd igdVar = this.k;
            igdVar.sendMessage(igdVar.obtainMessage(6, i2, 3));
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
            xve.i(iInterface2, "Client is connected but service is null");
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

    public void s(ws2 ws2Var) {
        this.d = ws2Var.b;
        this.e = System.currentTimeMillis();
    }

    public void t(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        k3e k3eVar = new k3e(this, i, iBinder, bundle);
        igd igdVar = this.k;
        igdVar.sendMessage(igdVar.obtainMessage(1, i2, -1, k3eVar));
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return this instanceof be9;
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
        igd igdVar = this.k;
        igdVar.sendMessage(igdVar.obtainMessage(i, this.C.get(), 16));
    }
}
