package g9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ p b;

    public o(p pVar, long j10) {
        this.b = pVar;
        this.a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle h = a4.w.h(1, "fatal");
        h.putLong("timestamp", this.a);
        this.b.k.a(h);
        return null;
    }
}
