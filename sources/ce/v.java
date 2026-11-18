package ce;

import org.telegram.tgnet.TLObject;
import zd.a1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
