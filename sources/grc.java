// default package

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class grc implements Runnable {
    public final /* synthetic */ hrc a;

    public grc(hrc hrcVar) {
        this.a = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        hrc hrcVar = this.a;
        WeakHashMap weakHashMap = hrcVar.e;
        Collection.-EL.removeIf(weakHashMap.entrySet(), new hh((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            hrcVar.a();
        } else {
            hrcVar.d.postDelayed(this, 250L);
        }
    }
}
