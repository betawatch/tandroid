package hg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ af.f c;

    public /* synthetic */ m(AtomicBoolean atomicBoolean, af.f fVar, int i10) {
        this.a = i10;
        this.b = atomicBoolean;
        this.c = fVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        af.f fVar;
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    this.c.b();
                    break;
                }
                break;
            default:
                if (!this.b.get() && (fVar = this.c) != null) {
                    fVar.b();
                    break;
                }
                break;
        }
    }
}
