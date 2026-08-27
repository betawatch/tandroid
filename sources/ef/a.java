package ef;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.u;
import com.google.firebase.messaging.t;
import df.d;
import df.e;
import ia.m;
import id.f0;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import n2.x;
import n2.y;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import rc.c;
import rc.h;
import xe.b;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [df.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [df.e] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        boolean z10 = false;
        int i10 = 2;
        c cVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i11 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        ?? cVar2 = new df.c();
                        cVar2.a = iBinder;
                        cVar = cVar2;
                    } else {
                        cVar = (e) queryLocalInterface;
                    }
                }
                b bVar2 = new b(cVar, componentName, z10, 18);
                if (((we.c) ((WeakReference) this.b).get()) != null) {
                    we.e.b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = we.e.b) != null) {
                        try {
                            ((df.c) ((e) bVar.b)).F0();
                            break;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
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
                f0.q(f0.b((h) tVar.b), new m(tVar, arrayList, cVar, i10));
                break;
            case 2:
                l8.c cVar3 = (l8.c) this.b;
                cVar3.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar3.a().post(new l8.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                x xVar = (x) this.b;
                int i12 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                xVar.E = gVar;
                xVar.D = 2;
                int i13 = y.a;
                h3 c10 = y.c(26, l3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                g5.b bVar3 = xVar.h;
                bVar3.getClass();
                try {
                    bVar3.E(c10, (o3) bVar3.b);
                    break;
                } catch (Throwable th) {
                    u.i("BillingLogger", "Unable to log.", th);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                if (((we.c) ((WeakReference) this.b).get()) != null) {
                    we.e.b = null;
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
                l8.c cVar = (l8.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new l8.b(this, i10));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                x xVar = (x) this.b;
                xVar.E = null;
                xVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
