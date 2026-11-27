// default package

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
