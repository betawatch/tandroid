package ab;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b extends kd.c {
    public Map a;
    public Iterator b;
    public d c;
    public ie.d d;
    public Map e;
    public Object f;
    public /* synthetic */ Object h;
    public final /* synthetic */ c n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.n = cVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.b(this);
    }
}
