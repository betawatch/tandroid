package h2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class v {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ w c;

    public v(w wVar, b3.f fVar, Executor executor) {
        this.c = wVar;
        this.a = new WeakReference(fVar);
        this.b = executor;
    }
}
