// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b5a implements ServiceConnection {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ b5a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lv6 lv6Var;
        boolean z = false;
        zg5 zg5Var = null;
        z9d z9dVar = null;
        switch (this.a) {
            case 0:
                int i = yg5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof zg5)) {
                        xg5 xg5Var = new xg5();
                        xg5Var.a = iBinder;
                        zg5Var = xg5Var;
                    } else {
                        zg5Var = (zg5) queryLocalInterface;
                    }
                }
                lv6 lv6Var2 = new lv6(zg5Var, componentName, z, (byte) 17);
                if (((b01) ((WeakReference) this.b).get()) != null) {
                    d01.b = lv6Var2;
                    if (na7.q1(y6c.t0).N2() && (lv6Var = d01.b) != null) {
                        try {
                            ((xg5) ((zg5) lv6Var.b)).b();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                hzc hzcVar = (hzc) this.b;
                hzcVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hzcVar.a().post(new fzc(this, iBinder));
                break;
            default:
                xgd.g("BillingClientTesting", "Billing Override Service connected.");
                lid lidVar = (lid) this.b;
                int i2 = l9d.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    z9dVar = queryLocalInterface2 instanceof z9d ? (z9d) queryLocalInterface2 : new d9d(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                }
                lidVar.E = z9dVar;
                lidVar.D = (byte) 2;
                int i3 = yid.a;
                fie c = yid.c(26, dke.b);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                aec aecVar = lidVar.h;
                aecVar.getClass();
                try {
                    aecVar.t(c, (lle) aecVar.b);
                    break;
                } catch (Throwable th) {
                    xgd.i("BillingLogger", "Unable to log.", th);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = 0;
        switch (this.a) {
            case 0:
                if (((b01) ((WeakReference) this.b).get()) != null) {
                    d01.b = null;
                    break;
                }
                break;
            case 1:
                hzc hzcVar = (hzc) this.b;
                hzcVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hzcVar.a().post(new gzc(this, b));
                break;
            default:
                xgd.h("BillingClientTesting", "Billing Override Service disconnected.");
                lid lidVar = (lid) this.b;
                lidVar.E = null;
                lidVar.D = (byte) 0;
                break;
        }
    }

    public /* synthetic */ b5a() {
        this.a = (byte) 0;
    }
}
