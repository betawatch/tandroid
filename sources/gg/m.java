package gg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ ze.c c;

    public /* synthetic */ m(AtomicBoolean atomicBoolean, ze.c cVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ze.c cVar;
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
