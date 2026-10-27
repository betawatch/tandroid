package k6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k9.u;
import n4.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    private final void a() {
        k kVar = this.b;
        synchronized (kVar) {
            if (kVar.a == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.b;
            synchronized (kVar) {
                try {
                    if (kVar.a != 2) {
                        return;
                    }
                    if (kVar.d.isEmpty()) {
                        kVar.c();
                        return;
                    }
                    l lVar = (l) kVar.d.poll();
                    kVar.e.put(lVar.a, lVar);
                    ((ScheduledExecutorService) kVar.f.c).schedule(new u(18, kVar, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    m mVar = kVar.f;
                    Messenger messenger = kVar.b;
                    int i10 = lVar.c;
                    Context context = (Context) mVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = lVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.d);
                    obtain.setData(bundle);
                    try {
                        s sVar = kVar.c;
                        Messenger messenger2 = (Messenger) sVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) sVar.c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        kVar.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
