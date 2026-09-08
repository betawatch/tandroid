package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ e3(Toolbar toolbar, int i10) {
        this.a = i10;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b.e0;
                l.n nVar = g3Var == null ? null : g3Var.b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
