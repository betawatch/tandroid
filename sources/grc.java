// default package

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
