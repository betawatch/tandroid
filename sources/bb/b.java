package bb;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b extends md.c {
    public Map a;
    public Iterator b;
    public d c;
    public ke.d d;
    public Map e;
    public Object f;
    public /* synthetic */ Object h;
    public final /* synthetic */ c n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.n = cVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.b(this);
    }
}
