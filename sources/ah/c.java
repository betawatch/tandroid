package ah;

import ag.i0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c {
    public final i0 a;
    public b c = b.a;
    public final a4.g d = new a4.g(this, 5);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(i0 i0Var) {
        this.a = i0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            a4.g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(gVar, this.b);
            }
        }
    }
}
