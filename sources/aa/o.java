package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ p b;

    public o(p pVar, long j3) {
        this.b = pVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle f10 = p5.c.f(1, "fatal");
        f10.putLong("timestamp", this.a);
        this.b.k.M(f10);
        return null;
    }
}
