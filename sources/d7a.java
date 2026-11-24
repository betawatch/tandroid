// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d7a implements ServiceConnection {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ d7a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hi2 hi2Var;
        yi5 yi5Var = null;
        bcd bcdVar = null;
        switch (this.a) {
            case 0:
                int i = xi5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof yi5)) {
                        wi5 wi5Var = new wi5();
                        wi5Var.a = iBinder;
                        yi5Var = wi5Var;
                    } else {
                        yi5Var = (yi5) queryLocalInterface;
                    }
                }
                hi2 hi2Var2 = new hi2((Object) yi5Var, (Object) componentName, (byte) 19);
                if (((j11) ((WeakReference) this.b).get()) != null) {
                    l11.b = hi2Var2;
                    if (oc7.r1(z8c.t0).Q2() && (hi2Var = l11.b) != null) {
                        try {
                            ((wi5) ((yi5) hi2Var.b)).b();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                i1d i1dVar = (i1d) this.b;
                i1dVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                i1dVar.a().post(new g1d(this, iBinder));
                break;
            default:
                yid.g("BillingClientTesting", "Billing Override Service connected.");
                nkd nkdVar = (nkd) this.b;
                int i2 = nbd.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    bcdVar = queryLocalInterface2 instanceof bcd ? (bcd) queryLocalInterface2 : new fbd(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                }
                nkdVar.E = bcdVar;
                nkdVar.D = (byte) 2;
                int i3 = ald.a;
                gke c = ald.c(26, fme.b);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                rhb rhbVar = nkdVar.h;
                rhbVar.getClass();
                try {
                    rhbVar.L(c, (nne) rhbVar.b);
                    break;
                } catch (Throwable th) {
                    yid.i("BillingLogger", "Unable to log.", th);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = 0;
        switch (this.a) {
            case 0:
                if (((j11) ((WeakReference) this.b).get()) != null) {
                    l11.b = null;
                    break;
                }
                break;
            case 1:
                i1d i1dVar = (i1d) this.b;
                i1dVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                i1dVar.a().post(new h1d(this, b));
                break;
            default:
                yid.h("BillingClientTesting", "Billing Override Service disconnected.");
                nkd nkdVar = (nkd) this.b;
                nkdVar.E = null;
                nkdVar.D = (byte) 0;
                break;
        }
    }

    public /* synthetic */ d7a() {
        this.a = (byte) 0;
    }
}
