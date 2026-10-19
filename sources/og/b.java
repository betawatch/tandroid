package og;

import org.telegram.ui.qn;
import org.telegram.ui.re1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ b(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                if (qnVar.getParentLayout() != null) {
                    re1.I0(qnVar);
                    break;
                }
                break;
            default:
                this.b.cc();
                break;
        }
    }
}
