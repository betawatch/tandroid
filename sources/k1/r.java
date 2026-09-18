package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class r extends kd.c {
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
    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.n = a0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.d(this);
    }
}
