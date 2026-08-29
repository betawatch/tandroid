package md;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends uc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g9.l c;
    public g9.l d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g9.l lVar, uc.c cVar) {
        super(cVar);
        this.c = lVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.e(null, this);
    }
}
