// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ji4 implements ne0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // ne0
    public final void a(boolean z) {
        synchronized (li4.k) {
            ArrayList arrayList = new ArrayList(li4.l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                li4 li4Var = (li4) obj;
                if (li4Var.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it = li4Var.i.iterator();
                    while (it.hasNext()) {
                        li4 li4Var2 = ((ii4) it.next()).a;
                        if (!z) {
                            ((ac3) li4Var2.h.get()).c();
                        }
                    }
                }
            }
        }
    }
}
