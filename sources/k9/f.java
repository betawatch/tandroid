package k9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        synchronized (h.k) {
            try {
                ArrayList arrayList = new ArrayList(h.l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h hVar = (h) obj;
                    if (hVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).a;
                            if (!z10) {
                                ((na.c) hVar2.h.get()).c();
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
