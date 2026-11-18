package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
