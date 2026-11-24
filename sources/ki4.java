// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ki4 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ki4(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (li4.k) {
            Iterator it = ((kt) li4.l.values()).iterator();
            while (it.hasNext()) {
                ((li4) it.next()).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}
