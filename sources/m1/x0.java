package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class x0 extends kd.c {
    public ui.e a;
    public ie.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ui.e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ui.e eVar, kd.c cVar) {
        super(cVar);
        this.d = eVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.V(this);
    }
}
