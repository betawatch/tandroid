package ag;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import f5.y;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import tg.x;
import wf.b;
import zf.c;
import zf.d;
import zf.e;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x xVar;
        e eVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i7 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        c cVar = new c();
                        cVar.a = iBinder;
                        eVar = cVar;
                    } else {
                        eVar = (e) queryLocalInterface;
                    }
                }
                x xVar2 = new x(10, eVar, componentName);
                if (((vf.a) ((WeakReference) this.b).get()) != null) {
                    vf.c.b = xVar2;
                    if (np.s1(m10.t0).O2() && (xVar = vf.c.b) != null) {
                        try {
                            ((c) ((e) xVar.b)).i1();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                d9.c cVar2 = (d9.c) this.b;
                cVar2.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar2.a().post(new d9.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                f5.x xVar3 = (f5.x) this.b;
                int i10 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                }
                xVar3.E = gVar;
                xVar3.D = 2;
                int i11 = y.a;
                i3 c10 = y.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                b bVar = xVar3.h;
                bVar.getClass();
                try {
                    bVar.e0(c10, (p3) bVar.b);
                    break;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                if (((vf.a) ((WeakReference) this.b).get()) != null) {
                    vf.c.b = null;
                    break;
                }
                break;
            case 1:
                d9.c cVar = (d9.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new d9.b(this, i7));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                f5.x xVar = (f5.x) this.b;
                xVar.E = null;
                xVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
