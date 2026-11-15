package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        Bundle f10 = r.b.f(1, "fatal");
        f10.putLong("timestamp", this.a);
        this.b.k.O(f10);
        return null;
    }
}
