package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class n extends kd.c {
    public o a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.a(null, this);
    }
}
