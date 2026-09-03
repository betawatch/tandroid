package na;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends wc.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, wc.c cVar) {
        super(cVar);
        this.b = kVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, null, this);
    }
}
