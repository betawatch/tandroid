package ld;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends tc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g5.b c;
    public g5.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g5.b bVar, tc.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.q(null, this);
    }
}
