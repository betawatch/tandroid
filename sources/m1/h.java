package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h extends kd.c {
    public ui.e a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ui.e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ui.e eVar, kd.c cVar) {
        super(cVar);
        this.c = eVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.h(this);
    }
}
