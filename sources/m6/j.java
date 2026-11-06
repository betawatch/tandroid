package m6;

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
import m9.u;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ j(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    private final void a() {
        while (true) {
            l lVar = this.b;
            synchronized (lVar) {
                try {
                    if (lVar.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = lVar.d;
                    if (arrayDeque.isEmpty()) {
                        lVar.d();
                        return;
                    }
                    m mVar = (m) arrayDeque.poll();
                    SparseArray sparseArray = lVar.e;
                    int i7 = mVar.a;
                    sparseArray.put(i7, mVar);
                    ((ScheduledExecutorService) lVar.f.c).schedule(new u(23, lVar, mVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                    }
                    n nVar = lVar.f;
                    Messenger messenger = lVar.b;
                    int i10 = mVar.c;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = i7;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", mVar.a());
                    bundle.putString("pkg", ((Context) nVar.b).getPackageName());
                    bundle.putBundle("data", mVar.d);
                    obtain.setData(bundle);
                    try {
                        j2.n nVar2 = lVar.c;
                        Messenger messenger2 = (Messenger) nVar2.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) nVar2.c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            gVar.a.send(obtain);
                        }
                    } catch (RemoteException e10) {
                        lVar.b(e10.getMessage());
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
                l lVar = this.b;
                synchronized (lVar) {
                    if (lVar.a == 1) {
                        lVar.b("Timed out while binding");
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
