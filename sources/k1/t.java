package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t extends wc.c {
    public Object a;
    public d0 b;
    public ld.t c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.e = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return d0.a(this.e, null, this);
    }
}
