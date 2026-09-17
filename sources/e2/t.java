package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
