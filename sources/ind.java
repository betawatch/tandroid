// default package

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
