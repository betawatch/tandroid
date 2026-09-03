package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        this.b.k.A(h);
        return null;
    }
}
