package m;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final d a;
    public final /* synthetic */ h b;

    public f(h hVar, d dVar) {
        this.b = hVar;
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.i iVar;
        h hVar = this.b;
        l.k kVar = hVar.c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.n(kVar);
        }
        View view = (View) hVar.n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.a;
            if (!dVar.b()) {
                if (dVar.e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
