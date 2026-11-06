package gb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e1 extends kd.c {
    public String a;
    public c1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, id.c cVar) {
        super(cVar);
        this.d = f1Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return f1.a(this.d, null, null, this);
    }
}
