package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
