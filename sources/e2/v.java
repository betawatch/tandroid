package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class v {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ w c;

    public v(w wVar, y2.e eVar, Executor executor) {
        this.c = wVar;
        this.a = new WeakReference(eVar);
        this.b = executor;
    }
}
