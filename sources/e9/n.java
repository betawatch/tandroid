package e9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ o b;

    public n(o oVar, long j10) {
        this.b = oVar;
        this.a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle h = aa.d.h(1, "fatal");
        h.putLong("timestamp", this.a);
        this.b.k.V1(h);
        return null;
    }
}
