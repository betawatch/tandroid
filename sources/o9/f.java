package o9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public f(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.k) {
            try {
                Iterator it = ((a0.e) g.l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
