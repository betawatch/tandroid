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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class etd {
    public static final he6 j = new he6("ConnectivityMonitor", null);
    public final dhf a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final Object h = new Object();
    public final Set i = DesugarCollections.synchronizedSet(new HashSet());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final xsd b = new xsd(this);

    public etd(Context context, dhf dhfVar) {
        this.a = dhfVar;
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
                    this.a.execute(new bva((Object) this, (byte) 29));
                }
            }
        }
    }
}
