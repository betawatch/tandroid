package ke;

import com.google.firebase.messaging.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
