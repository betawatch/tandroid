package o9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.internal.b {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z10) {
        synchronized (g.k) {
            try {
                ArrayList arrayList = new ArrayList(g.l.values());
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).a;
                            if (!z10) {
                                ((sa.c) gVar2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
