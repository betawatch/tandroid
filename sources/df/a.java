package df;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import cf.d;
import cf.e;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.firebase.messaging.t;
import ha.l;
import hd.f0;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import n2.y;
import n2.z;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import qc.c;
import qc.h;
import we.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [cf.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [cf.e] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        boolean z10 = false;
        int i9 = 2;
        c cVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i10 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        ?? cVar2 = new cf.c();
                        cVar2.a = iBinder;
                        cVar = cVar2;
                    } else {
                        cVar = (e) queryLocalInterface;
                    }
                }
                b bVar2 = new b(cVar, componentName, z10, 10);
                if (((ve.c) ((WeakReference) this.b).get()) != null) {
                    ve.e.b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = ve.e.b) != null) {
                        try {
                            ((cf.c) ((e) bVar.b)).F0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                t tVar = (t) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) tVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                tVar.c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                f0.q(f0.b((h) tVar.b), new l(tVar, arrayList, cVar, i9));
                break;
            case 2:
                k8.c cVar3 = (k8.c) this.b;
                cVar3.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar3.a().post(new k8.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                y yVar = (y) this.b;
                int i11 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                }
                yVar.E = gVar;
                yVar.D = 2;
                int i12 = z.a;
                i3 c10 = z.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                g5.b bVar3 = yVar.h;
                bVar3.getClass();
                try {
                    bVar3.F(c10, (p3) bVar3.b);
                    break;
                } catch (Throwable th) {
                    u.i("BillingLogger", "Unable to log.", th);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i9 = 0;
        switch (this.a) {
            case 0:
                if (((ve.c) ((WeakReference) this.b).get()) != null) {
                    ve.e.b = null;
                    break;
                }
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                t tVar = (t) this.b;
                tVar.c = null;
                tVar.getClass();
                break;
            case 2:
                k8.c cVar = (k8.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new k8.b(this, i9));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                y yVar = (y) this.b;
                yVar.E = null;
                yVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
