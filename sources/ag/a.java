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
import d9.b;
import f5.w;
import f5.x;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import q4.q;
import v6.e;
import zf.c;
import zf.d;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar;
        zf.e eVar2 = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i7 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof zf.e)) {
                        c cVar = new c();
                        cVar.a = iBinder;
                        eVar2 = cVar;
                    } else {
                        eVar2 = (zf.e) queryLocalInterface;
                    }
                }
                e eVar3 = new e(eVar2, componentName);
                if (((vf.a) ((WeakReference) this.b).get()) != null) {
                    vf.c.b = eVar3;
                    if (qp.s1(p10.s0).O2() && (eVar = vf.c.b) != null) {
                        try {
                            ((c) ((zf.e) eVar.a)).i1();
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
                w wVar = (w) this.b;
                int i10 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                }
                wVar.E = gVar;
                wVar.D = 2;
                int i11 = x.a;
                i3 c10 = x.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                q qVar = wVar.h;
                qVar.getClass();
                try {
                    qVar.q(c10, (p3) qVar.b);
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
                cVar.a().post(new b(this, i7));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.b;
                wVar.E = null;
                wVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
