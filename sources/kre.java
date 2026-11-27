// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class kre implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ccf b;

    public /* synthetic */ kre(ccf ccfVar, byte b) {
        this.a = b;
        this.b = ccfVar;
    }

    private final void a() {
        while (true) {
            ccf ccfVar = this.b;
            synchronized (ccfVar) {
                if (ccfVar.a != 2) {
                    return;
                }
                ArrayDeque arrayDeque = ccfVar.d;
                if (arrayDeque.isEmpty()) {
                    ccfVar.d();
                    return;
                }
                uff uffVar = (uff) arrayDeque.poll();
                SparseArray sparseArray = ccfVar.e;
                int i = uffVar.a;
                sparseArray.put(i, uffVar);
                ((ScheduledExecutorService) ccfVar.f.c).schedule(new xs4((Object) ccfVar, (Object) uffVar, (byte) 22), 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(uffVar)));
                }
                ykf ykfVar = ccfVar.f;
                Messenger messenger = ccfVar.b;
                byte b = uffVar.c;
                Message obtain = Message.obtain();
                obtain.what = b;
                obtain.arg1 = i;
                obtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", uffVar.a());
                bundle.putString("pkg", ((Context) ykfVar.b).getPackageName());
                bundle.putBundle("data", uffVar.d);
                obtain.setData(bundle);
                try {
                    zhc zhcVar = ccfVar.c;
                    Messenger messenger2 = (Messenger) zhcVar.b;
                    if (messenger2 != null) {
                        messenger2.send(obtain);
                    } else {
                        yrd yrdVar = (yrd) zhcVar.c;
                        if (yrdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        yrdVar.a.send(obtain);
                    }
                } catch (RemoteException e) {
                    ccfVar.b(e.getMessage());
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ccf ccfVar = this.b;
                synchronized (ccfVar) {
                    if (ccfVar.a == 1) {
                        ccfVar.b("Timed out while binding");
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
