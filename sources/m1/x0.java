package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
