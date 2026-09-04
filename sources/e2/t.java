package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
