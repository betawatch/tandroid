package gf;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q {
    public final p a;
    public long b;
    public boolean c;
    public final f2.r d = new f2.r(this, 3);

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
        f2.r rVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(rVar);
        AndroidUtilities.runOnUIThread(rVar, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
