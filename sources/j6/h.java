package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import i9.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.y;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                    ((ScheduledExecutorService) jVar.f.c).schedule(new s(17, jVar, kVar), 30L, TimeUnit.SECONDS);
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
                        y yVar = jVar.c;
                        Messenger messenger2 = (Messenger) yVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) yVar.c;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e7) {
                        jVar.a(e7.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
