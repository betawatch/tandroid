package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j9.u;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.s;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    private final void a() {
        j jVar = this.b;
        synchronized (jVar) {
            if (jVar.a == 1) {
                jVar.a("Timed out while binding");
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
            j jVar = this.b;
            synchronized (jVar) {
                try {
                    if (jVar.a != 2) {
                        return;
                    }
                    if (jVar.d.isEmpty()) {
                        jVar.c();
                        return;
                    }
                    k kVar = (k) jVar.d.poll();
                    jVar.e.put(kVar.a, kVar);
                    ((ScheduledExecutorService) jVar.f.c).schedule(new u(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar.f;
                    Messenger messenger = jVar.b;
                    int i10 = kVar.c;
                    Context context = (Context) lVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = kVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kVar.d);
                    obtain.setData(bundle);
                    try {
                        s sVar = jVar.c;
                        Messenger messenger2 = (Messenger) sVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) sVar.c;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        jVar.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
