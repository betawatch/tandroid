package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ n b;

    public m(n nVar, long j10) {
        this.b = nVar;
        this.a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle h = android.support.v4.media.a.h(1, "fatal");
        h.putLong("timestamp", this.a);
        this.b.k.q2(h);
        return null;
    }
}
