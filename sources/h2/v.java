package h2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
