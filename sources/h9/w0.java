package h9;

import java.util.Iterator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
