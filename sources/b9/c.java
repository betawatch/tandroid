package b9;

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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c() {
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ld.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.play_billing.g] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yf.c cVar;
        int i10 = 2;
        ?? r22 = 0;
        yf.f fVar = null;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                dVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new a(this, iBinder));
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) qVar.c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                qVar.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                ce.f0.q(ce.f0.b((ld.h) qVar.a), new bb.l(qVar, arrayList, r22, i10));
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                d5.b0 b0Var = (d5.b0) this.b;
                int i11 = com.google.android.gms.internal.play_billing.f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    r22 = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) queryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                }
                b0Var.E = r22;
                b0Var.D = 2;
                int i12 = d5.c0.a;
                i3 c10 = d5.c0.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                rf.b bVar = b0Var.h;
                bVar.getClass();
                try {
                    bVar.b0(c10, (p3) bVar.b);
                    break;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i13 = yf.e.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof yf.f)) {
                        yf.d dVar2 = new yf.d();
                        dVar2.a = iBinder;
                        fVar = dVar2;
                    } else {
                        fVar = (yf.f) queryLocalInterface2;
                    }
                }
                yf.c cVar2 = new yf.c(fVar, componentName);
                if (((qf.b) ((WeakReference) this.b).get()) != null) {
                    qf.d.b = cVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (cVar = qf.d.b) != null) {
                        try {
                            ((yf.d) ((yf.f) cVar.a)).G0();
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
                d dVar = (d) this.b;
                dVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new b(this, i10));
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                qVar.b = null;
                qVar.getClass();
                break;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                d5.b0 b0Var = (d5.b0) this.b;
                b0Var.E = null;
                b0Var.D = 0;
                break;
            default:
                if (((qf.b) ((WeakReference) this.b).get()) != null) {
                    qf.d.b = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
