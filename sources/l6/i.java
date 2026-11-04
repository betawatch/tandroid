package l6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l9.u;
import p4.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(k kVar, int i3) {
        this.a = i3;
        this.b = kVar;
    }

    private final void a() {
        while (true) {
            k kVar = this.b;
            synchronized (kVar) {
                try {
                    if (kVar.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = kVar.d;
                    if (arrayDeque.isEmpty()) {
                        kVar.d();
                        return;
                    }
                    l lVar = (l) arrayDeque.poll();
                    SparseArray sparseArray = kVar.e;
                    int i3 = lVar.a;
                    sparseArray.put(i3, lVar);
                    ((ScheduledExecutorService) kVar.f.c).schedule(new u(17, kVar, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    n nVar = kVar.f;
                    Messenger messenger = kVar.b;
                    int i10 = lVar.c;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = i3;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", ((Context) nVar.b).getPackageName());
                    bundle.putBundle("data", lVar.d);
                    obtain.setData(bundle);
                    try {
                        q qVar = kVar.c;
                        Messenger messenger2 = (Messenger) qVar.a;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) qVar.b;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            fVar.a.send(obtain);
                        }
                    } catch (RemoteException e10) {
                        kVar.b(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                synchronized (kVar) {
                    if (kVar.a == 1) {
                        kVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.b.b("Service disconnected");
                return;
        }
    }
}
