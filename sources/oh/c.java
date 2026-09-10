package oh;

import gg.v1;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c {
    public final ai.b a;
    public b c = b.a;
    public final v1 d = new v1(this, 28);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(ai.b bVar) {
        this.a = bVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            v1 v1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(v1Var, this.b);
            }
        }
    }
}
