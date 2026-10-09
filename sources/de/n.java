package de;

import ae.h1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class n extends ld.c {
    public o a;
    public c b;
    public q c;
    public h1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ld.c cVar) {
        super(cVar);
        this.h = oVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.z(null, this);
        return kd.a.a;
    }
}
