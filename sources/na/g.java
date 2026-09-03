package na;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends wc.c {
    public h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, wc.c cVar) {
        super(cVar);
        this.c = hVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.b(this);
    }
}
