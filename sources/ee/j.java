package ee;

import ab.u;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class j extends md.c {
    public kotlin.jvm.internal.p a;
    public u b;
    public /* synthetic */ Object c;
    public int d;

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return o.b(null, this);
    }
}
