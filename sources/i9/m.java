package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        this.b.k.K(h);
        return null;
    }
}
