package g2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ x c;

    public w(x xVar, a3.f fVar, Executor executor) {
        this.c = xVar;
        this.a = new WeakReference(fVar);
        this.b = executor;
    }
}
