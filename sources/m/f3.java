package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ f3(Toolbar toolbar, int i10) {
        this.a = i10;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i3 i3Var = this.b.e0;
                l.m mVar = i3Var == null ? null : i3Var.b;
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
