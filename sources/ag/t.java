package ag;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t {
    public final s a;
    public long b;
    public boolean c;
    public final a3.d d = new a3.d(this, 4);

    public t(s sVar) {
        this.a = sVar;
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
        a3.d dVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
