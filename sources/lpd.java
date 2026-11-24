// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lpd extends PhantomReference {
    public final Set a;
    public final sw b;

    public /* synthetic */ lpd(hj2 hj2Var, ReferenceQueue referenceQueue, Set set, sw swVar) {
        super(hj2Var, referenceQueue);
        this.a = set;
        this.b = swVar;
    }
}
