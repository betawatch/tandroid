// default package

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hi4 implements pd0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // pd0
    public final void a(boolean z) {
        synchronized (ji4.k) {
            ArrayList arrayList = new ArrayList(ji4.l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ji4 ji4Var = (ji4) obj;
                if (ji4Var.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it = ji4Var.i.iterator();
                    while (it.hasNext()) {
                        ji4 ji4Var2 = ((gi4) it.next()).a;
                        if (!z) {
                            ((hb3) ji4Var2.h.get()).c();
                        }
                    }
                }
            }
        }
    }
}
