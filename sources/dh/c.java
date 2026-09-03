package dh;

import dg.h0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c {
    public final h0 a;
    public b c = b.a;
    public final ag.e d = new ag.e(this, 21);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(h0 h0Var) {
        this.a = h0Var;
    }

    public final void a(b bVar, boolean z4) {
        if (this.c != bVar) {
            ag.e eVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(eVar);
            this.c = bVar;
            if (z4) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(eVar, this.b);
            }
        }
    }
}
