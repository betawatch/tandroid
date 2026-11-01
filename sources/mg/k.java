package mg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ gf.e c;

    public /* synthetic */ k(AtomicBoolean atomicBoolean, gf.e eVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = eVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        gf.e eVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (eVar = this.c) != null) {
                    eVar.b();
                    break;
                }
                break;
        }
    }
}
