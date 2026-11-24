// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hg4 implements nd0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // nd0
    public final void a(boolean z) {
        synchronized (jg4.k) {
            ArrayList arrayList = new ArrayList(jg4.l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jg4 jg4Var = (jg4) obj;
                if (jg4Var.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it = jg4Var.i.iterator();
                    while (it.hasNext()) {
                        jg4 jg4Var2 = ((gg4) it.next()).a;
                        if (!z) {
                            ((oa3) jg4Var2.h.get()).c();
                        }
                    }
                }
            }
        }
    }
}
