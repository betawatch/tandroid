package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r extends uc.c {
    public a0 a;
    public Object b;
    public Serializable c;
    public Object d;
    public t e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ a0 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.n = a0Var;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
