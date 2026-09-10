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
import n7.a1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        a1 a1Var;
        ?? r12 = 0;
        uf.e eVar = null;
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
                n4.y yVar = d0Var.h;
                yVar.getClass();
                try {
                    yVar.N(c10, (p3) yVar.b);
                    break;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = uf.d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof uf.e)) {
                        uf.c cVar = new uf.c();
                        cVar.a = iBinder;
                        eVar = cVar;
                    } else {
                        eVar = (uf.e) queryLocalInterface2;
                    }
                }
                a1 a1Var2 = new a1(18, eVar, componentName);
                if (((nf.d) ((WeakReference) this.b).get()) != null) {
                    nf.f.b = a1Var2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (a1Var = nf.f.b) != null) {
                        try {
                            ((uf.c) ((uf.e) a1Var.b)).H0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                ki.f fVar = (ki.f) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.a), new bb.i(fVar, arrayList, r12, 6));
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
                if (((nf.d) ((WeakReference) this.b).get()) != null) {
                    nf.f.b = null;
                    break;
                }
                break;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ki.f fVar = (ki.f) this.b;
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
