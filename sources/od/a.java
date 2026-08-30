package od;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends wc.c {
    public pd.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o2.o c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o2.o oVar, wc.c cVar) {
        super(cVar);
        this.c = oVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.z(null, this);
    }
}
