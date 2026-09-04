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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d() {
        this.a = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [id.c] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.g] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0.a aVar;
        ?? r12 = 0;
        vf.e eVar = null;
        switch (this.a) {
            case 0:
                e eVar2 = (e) this.b;
                eVar2.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                break;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.b;
                int i10 = com.google.android.gms.internal.play_billing.f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    r12 = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g ? (com.google.android.gms.internal.play_billing.g) queryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                d0Var.E = r12;
                d0Var.D = 2;
                int i11 = c5.e0.a;
                i3 c10 = c5.e0.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                pf.b bVar = d0Var.h;
                bVar.getClass();
                try {
                    bVar.t0(c10, (p3) bVar.b);
                    break;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = vf.d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof vf.e)) {
                        vf.c cVar = new vf.c();
                        cVar.a = iBinder;
                        eVar = cVar;
                    } else {
                        eVar = (vf.e) queryLocalInterface2;
                    }
                }
                o0.a aVar2 = new o0.a(19, eVar, componentName);
                if (((of.d) ((WeakReference) this.b).get()) != null) {
                    of.f.b = aVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (aVar = of.f.b) != null) {
                        try {
                            ((vf.c) ((vf.e) aVar.b)).H0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                fg.f fVar = (fg.f) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.a), new bb.j(fVar, arrayList, r12, 6));
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
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.b;
                d0Var.E = null;
                d0Var.D = 0;
                break;
            case 2:
                if (((of.d) ((WeakReference) this.b).get()) != null) {
                    of.f.b = null;
                    break;
                }
                break;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                fg.f fVar = (fg.f) this.b;
                fVar.b = null;
                fVar.getClass();
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
