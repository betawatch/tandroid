// default package

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ood {
    public static final dc6 j = new dc6("ConnectivityMonitor", null);
    public final ncf a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final hod b = new hod(this);

    public ood(Context context, ncf ncfVar) {
        this.a = ncfVar;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            if (this.d == null || this.e == null) {
                return;
            }
            j.b("a new network is available", new Object[0]);
            if (this.d.containsKey(network)) {
                this.e.remove(network);
            }
            this.d.put(network, linkProperties);
            this.e.add(network);
            b();
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        synchronized (this.i) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (!this.a.a.isShutdown()) {
                    this.a.execute(new bod((Object) this, (byte) 0));
                }
            }
        }
    }
}
