package l9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                                ((oa.c) hVar2.h.get()).c();
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
