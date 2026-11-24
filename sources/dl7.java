// default package

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dl7 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ ow2 c;

    public dl7(ow2 ow2Var, db3 db3Var, Executor executor) {
        this.c = ow2Var;
        this.a = new WeakReference(db3Var);
        this.b = executor;
    }
}
