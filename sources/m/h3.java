package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ h3(Toolbar toolbar, int i9) {
        this.a = i9;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b.a0;
                l.m mVar = k3Var == null ? null : k3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
