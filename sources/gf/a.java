package gf;

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
import com.google.firebase.messaging.s;
import ff.d;
import ff.e;
import j$.util.Objects;
import ja.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import jd.e0;
import oc.i;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import p2.w;
import p2.x;
import sc.c;
import sc.h;
import ze.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ff.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ff.e] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        int i10 = 2;
        c cVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i11 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        ?? cVar2 = new ff.c();
                        cVar2.a = iBinder;
                        cVar = cVar2;
                    } else {
                        cVar = (e) queryLocalInterface;
                    }
                }
                b bVar2 = new b(cVar, componentName);
                if (((ye.b) ((WeakReference) this.b).get()) != null) {
                    ye.d.b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = ye.d.b) != null) {
                        try {
                            ((ff.c) ((e) bVar.a)).F0();
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
                s sVar = (s) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) sVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                sVar.c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                e0.q(e0.b((h) sVar.b), new l(sVar, arrayList, cVar, i10));
                break;
            case 2:
                m8.c cVar3 = (m8.c) this.b;
                cVar3.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar3.a().post(new m8.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                w wVar = (w) this.b;
                int i12 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                wVar.E = gVar;
                wVar.D = 2;
                int i13 = x.a;
                h3 c3 = x.c(26, l3.b);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                i iVar = wVar.h;
                iVar.getClass();
                try {
                    iVar.A2(c3, (o3) iVar.b);
                    break;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                if (((ye.b) ((WeakReference) this.b).get()) != null) {
                    ye.d.b = null;
                    break;
                }
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                s sVar = (s) this.b;
                sVar.c = null;
                sVar.getClass();
                break;
            case 2:
                m8.c cVar = (m8.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new m8.b(this, i10));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.b;
                wVar.E = null;
                wVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
