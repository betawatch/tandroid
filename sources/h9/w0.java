package h9;

import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w0 extends g2 {
    public final /* synthetic */ g9.k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Iterator it, g9.k kVar) {
        super(it);
        this.b = kVar;
    }

    @Override // h9.g2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
