package m;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        l.i iVar;
        i iVar2 = this.b;
        l.k kVar = iVar2.c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.b(kVar);
        }
        View view = (View) iVar2.n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.a;
            if (!eVar.b()) {
                if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
