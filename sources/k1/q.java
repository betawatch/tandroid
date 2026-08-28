package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends sc.c {
    public z a;
    public Object b;
    public Serializable c;
    public Object d;
    public s e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ z n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, sc.c cVar) {
        super(cVar);
        this.n = zVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
