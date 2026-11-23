package ce;

import org.telegram.tgnet.TLObject;
import zd.a1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class v extends kd.c {
    public w a;
    public d b;
    public y c;
    public a1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, kd.c cVar) {
        super(cVar);
        this.h = wVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.v(null, this);
        return jd.a.a;
    }
}
