package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class e extends kd.c {
    public kotlin.jvm.internal.p a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return o.a(null, null, this);
    }
}
