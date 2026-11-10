package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends kd.c {
    public de.h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d6.i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.c = iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.B(null, this);
    }
}
