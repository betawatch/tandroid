package m;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final e a;
    public final /* synthetic */ i b;

    public g(i iVar, e eVar) {
        this.b = iVar;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.j jVar;
        i iVar = this.b;
        l.l lVar = iVar.c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.k(lVar);
        }
        View view = (View) iVar.n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.a;
            if (!eVar.b()) {
                if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar.E = eVar;
        }
        iVar.G = null;
    }
}
