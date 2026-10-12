package a9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.q3;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d() {
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kd.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.play_billing.g] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x9.l lVar;
        int i10 = 2;
        ?? r22 = 0;
        xf.e eVar = null;
        switch (this.a) {
            case 0:
                e eVar2 = (e) this.b;
                eVar2.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) sVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                sVar.c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                be.f0.q(be.f0.b((kd.h) sVar.b), new ab.l(sVar, arrayList, r22, i10));
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.e0 e0Var = (c5.e0) this.b;
                int i11 = com.google.android.gms.internal.play_billing.f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    r22 = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) queryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                e0Var.E = r22;
                e0Var.D = 2;
                int i12 = c5.f0.a;
                i3 c10 = c5.f0.c(26, n3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                qf.b bVar = e0Var.h;
                bVar.getClass();
                try {
                    bVar.q0(c10, (q3) bVar.b);
                    break;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i13 = xf.d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof xf.e)) {
                        xf.c cVar = new xf.c();
                        cVar.a = iBinder;
                        eVar = cVar;
                    } else {
                        eVar = (xf.e) queryLocalInterface2;
                    }
                }
                x9.l lVar2 = new x9.l(eVar, componentName);
                if (((pf.b) ((WeakReference) this.b).get()) != null) {
                    pf.d.b = lVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (lVar = pf.d.b) != null) {
                        try {
                            ((xf.c) ((xf.e) lVar.a)).G0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                sVar.c = null;
                sVar.getClass();
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.e0 e0Var = (c5.e0) this.b;
                e0Var.E = null;
                e0Var.D = 0;
                break;
            default:
                if (((pf.b) ((WeakReference) this.b).get()) != null) {
                    pf.d.b = null;
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
