package h2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
