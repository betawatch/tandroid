package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
