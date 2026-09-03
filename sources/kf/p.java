package kf;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p {
    public final o a;
    public long b;
    public boolean c;
    public final e3.h d = new e3.h(this, 22);

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
        e3.h hVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        AndroidUtilities.runOnUIThread(hVar, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
