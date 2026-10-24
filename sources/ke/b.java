package ke;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements l {
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.b = i10;
        this.c = dVar;
    }

    @Override // td.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
                d dVar = this.c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return id.i.a;
    }
}
