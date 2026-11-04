package bg;

import ag.c;
import ag.d;
import ag.e;
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
import e5.w;
import e5.x;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import p4.q;
import tf.b;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q qVar;
        e eVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i3 = d.a;
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
                q qVar2 = new q(eVar, componentName);
                if (((sf.a) ((WeakReference) this.b).get()) != null) {
                    sf.c.b = qVar2;
                    if (hp.s1(h10.t0).O2() && (qVar = sf.c.b) != null) {
                        try {
                            ((c) ((e) qVar.a)).I0();
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
                c9.c cVar2 = (c9.c) this.b;
                cVar2.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar2.a().post(new c9.a(this, iBinder));
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
                i3 c2 = x.c(26, m3.b);
                Objects.requireNonNull(c2, "ApiSuccess should not be null");
                b bVar = wVar.h;
                bVar.getClass();
                try {
                    bVar.N(c2, (p3) bVar.a);
                    break;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i3 = 0;
        switch (this.a) {
            case 0:
                if (((sf.a) ((WeakReference) this.b).get()) != null) {
                    sf.c.b = null;
                    break;
                }
                break;
            case 1:
                c9.c cVar = (c9.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new c9.b(this, i3));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.b;
                wVar.E = null;
                wVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
