package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b0 extends wc.c {
    public d0 a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.e = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.i(null, null, this);
    }
}
