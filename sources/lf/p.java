package lf;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p {
    public final o a;
    public long b;
    public boolean c;
    public final eh.m d = new eh.m(this, 23);

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
        eh.m mVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(mVar);
        AndroidUtilities.runOnUIThread(mVar, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
