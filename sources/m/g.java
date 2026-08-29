package m;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            iVar.i(kVar);
        }
        View view = (View) iVar2.n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.a;
            if (!eVar.b()) {
                if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.E = eVar;
        }
        iVar2.G = null;
    }
}
