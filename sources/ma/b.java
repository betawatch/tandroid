package ma;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends wc.c {
    public Map a;
    public Iterator b;
    public d c;
    public ud.d d;
    public Map e;
    public Object f;
    public /* synthetic */ Object h;
    public final /* synthetic */ c n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, wc.c cVar2) {
        super(cVar2);
        this.n = cVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.b(this);
    }
}
