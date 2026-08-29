package eg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ ye.c c;

    public /* synthetic */ m(AtomicBoolean atomicBoolean, ye.c cVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ye.c cVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (cVar = this.c) != null) {
                    cVar.b();
                    break;
                }
                break;
        }
    }
}
