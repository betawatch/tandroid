package md;

import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends uc.c {
    public q a;
    public /* synthetic */ Object b;
    public int c;

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return n.a(null, null, this);
    }
}
