package jf;

import cg.m2;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p {
    public final o a;
    public long b;
    public boolean c;
    public final m2 d = new m2(this, 28);

    public p(o oVar) {
        this.a = oVar;
    }

    public final void a(long j10) {
        if (this.c && this.b == j10) {
            return;
        }
        this.b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.c = true;
        m2 m2Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(m2Var);
        AndroidUtilities.runOnUIThread(m2Var, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
