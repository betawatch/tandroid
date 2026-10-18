package e2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
