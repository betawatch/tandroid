package ke;

import com.google.firebase.messaging.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements b {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (o7.a.b == null) {
            o7.a.b = new p();
        }
        synchronized (o7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
