package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ o0(int i10, qn qnVar, boolean z10) {
        this.d = i10;
        this.b = qnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                qn qnVar = this.b;
                if (i10 != 2) {
                    qnVar.Z9();
                    qnVar.cc();
                }
                t0.f(xc.a0(qnVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Cc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ o0(qn qnVar, boolean z10, int i10) {
        this.b = qnVar;
        this.c = z10;
        this.d = i10;
    }
}
