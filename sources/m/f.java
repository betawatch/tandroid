package m;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            iVar.b(kVar);
        }
        View view = (View) hVar.n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.a;
            if (!dVar.b()) {
                if (dVar.e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
