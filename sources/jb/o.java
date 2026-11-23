package jb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ p b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.b = pVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, this);
    }
}
