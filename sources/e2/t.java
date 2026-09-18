package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class t {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ u c;

    public t(u uVar, y2.e eVar, Executor executor) {
        this.c = uVar;
        this.a = new WeakReference(eVar);
        this.b = executor;
    }
}
