package jf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.firebase.messaging.r;
import f7.b;
import hf.d;
import hf.e;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import ld.e0;
import n7.qa;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import p2.y;
import p2.z;
import uc.c;
import uc.h;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a() {
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [hf.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [hf.e] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        c cVar = null;
        g gVar = null;
        switch (this.a) {
            case 0:
                int i10 = d.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                        ?? cVar2 = new hf.c();
                        cVar2.a = iBinder;
                        cVar = cVar2;
                    } else {
                        cVar = (e) queryLocalInterface;
                    }
                }
                b bVar2 = new b(8, cVar, componentName);
                if (((af.e) ((WeakReference) this.b).get()) != null) {
                    af.g.b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = af.g.b) != null) {
                        try {
                            ((hf.c) ((e) bVar.b)).F0();
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
            case 1:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                r rVar = (r) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) rVar.d;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                rVar.c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                e0.q(e0.b((h) rVar.b), new k1.c(rVar, arrayList, cVar, 5));
                break;
            case 2:
                o8.c cVar3 = (o8.c) this.b;
                cVar3.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar3.a().post(new o8.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                y yVar = (y) this.b;
                int i11 = f.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                yVar.E = gVar;
                yVar.D = 2;
                int i12 = z.a;
                i3 c3 = z.c(26, m3.b);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                qa qaVar = yVar.h;
                qaVar.getClass();
                try {
                    qaVar.w1(c3, (p3) qaVar.b);
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
                if (((af.e) ((WeakReference) this.b).get()) != null) {
                    af.g.b = null;
                    break;
                }
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                r rVar = (r) this.b;
                rVar.c = null;
                rVar.getClass();
                break;
            case 2:
                o8.c cVar = (o8.c) this.b;
                cVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new o8.b(this, i10));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                y yVar = (y) this.b;
                yVar.E = null;
                yVar.D = 0;
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
