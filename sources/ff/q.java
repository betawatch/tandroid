package ff;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public final p a;
    public long b;
    public boolean c;
    public final af.e d = new af.e(this, 26);

    public q(p pVar) {
        this.a = pVar;
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
        af.e eVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
