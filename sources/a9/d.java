package a9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d() {
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [cd.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.play_billing.g] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m4.c cVar;
        boolean z10 = false;
        int i10 = 2;
        ?? r42 = 0;
        pf.e eVar = null;
        switch (this.a) {
            case 0:
                e eVar2 = (e) this.b;
                eVar2.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                ji.f fVar = (ji.f) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                td.e0.q(td.e0.b((cd.h) fVar.b), new bb.l(fVar, arrayList, r42, i10));
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.z zVar = (c5.z) this.b;
                int i11 = com.google.android.gms.internal.play_billing.f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    r42 = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) queryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                zVar.E = r42;
                zVar.D = 2;
                int i12 = c5.a0.a;
                i3 c10 = c5.a0.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                hf.b bVar = zVar.h;
                bVar.getClass();
                try {
                    bVar.B0(c10, (p3) bVar.b);
                    break;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i13 = pf.d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof pf.e)) {
                        pf.c cVar2 = new pf.c();
                        cVar2.a = iBinder;
                        eVar = cVar2;
                    } else {
                        eVar = (pf.e) queryLocalInterface2;
                    }
                }
                m4.c cVar3 = new m4.c(eVar, componentName, z10, 21);
                if (((gf.d) ((WeakReference) this.b).get()) != null) {
                    gf.f.b = cVar3;
                    if (vp.r1(d20.s0).M2() && (cVar = gf.f.b) != null) {
                        try {
                            ((pf.c) ((pf.e) cVar.b)).I0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                eVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, i10));
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ji.f fVar = (ji.f) this.b;
                fVar.c = null;
                fVar.getClass();
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.z zVar = (c5.z) this.b;
                zVar.E = null;
                zVar.D = 0;
                break;
            default:
                if (((gf.d) ((WeakReference) this.b).get()) != null) {
                    gf.f.b = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
