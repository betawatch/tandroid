package m;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            iVar.i(kVar);
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
