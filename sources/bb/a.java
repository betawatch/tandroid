package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public Object a;
    public ie.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, kd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(this);
    }
}
