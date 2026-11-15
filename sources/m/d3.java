package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ d3(Toolbar toolbar, int i7) {
        this.a = i7;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b.f0;
                l.m mVar = f3Var == null ? null : f3Var.b;
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
