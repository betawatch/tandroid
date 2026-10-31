package mg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ gf.e c;

    public /* synthetic */ k(AtomicBoolean atomicBoolean, gf.e eVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = eVar;
    }

    @Override // org.telegram.messenger.q20
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
