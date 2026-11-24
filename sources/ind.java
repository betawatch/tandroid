// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ind extends PhantomReference {
    public final Set a;
    public final sv b;

    public /* synthetic */ ind(th2 th2Var, ReferenceQueue referenceQueue, Set set, sv svVar) {
        super(th2Var, referenceQueue);
        this.a = set;
        this.b = svVar;
    }
}
