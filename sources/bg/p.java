package bg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ ve.d c;

    public /* synthetic */ p(AtomicBoolean atomicBoolean, ve.d dVar, int i9) {
        this.a = i9;
        this.b = atomicBoolean;
        this.c = dVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ve.d dVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (dVar = this.c) != null) {
                    dVar.b();
                    break;
                }
                break;
        }
    }
}
