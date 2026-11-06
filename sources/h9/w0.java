package h9;

import java.util.Iterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
