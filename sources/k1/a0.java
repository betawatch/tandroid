package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a0 extends wc.c {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.h(this);
    }
}
