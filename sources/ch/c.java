package ch;

import cg.h0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
