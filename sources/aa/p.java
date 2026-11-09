package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ q b;

    public p(q qVar, long j3) {
        this.b = qVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle f10 = rf.b.f(1, "fatal");
        f10.putLong("timestamp", this.a);
        this.b.k.a2(f10);
        return null;
    }
}
