package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ b(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                if (xnVar.getParentLayout() != null) {
                    wf1.I0(xnVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
