package ch;

import cg.h0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c {
    public final h0 a;
    public b c = b.a;
    public final ag.d d = new ag.d(this, 16);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(h0 h0Var) {
        this.a = h0Var;
    }

    public final void a(b bVar, boolean z4) {
        if (this.c != bVar) {
            ag.d dVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.c = bVar;
            if (z4) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(dVar, this.b);
            }
        }
    }
}
