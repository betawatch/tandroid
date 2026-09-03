package bg;

import org.telegram.ui.sf1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ c(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                if (xnVar.getParentLayout() != null) {
                    sf1.I0(xnVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
