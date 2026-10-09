package de;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends ld.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pf.b c;
    public pf.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pf.b bVar, ld.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.z(null, this);
    }
}
