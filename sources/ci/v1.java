package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ v1(x1 x1Var, int i10) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x1 x1Var = this.b;
                x1Var.invalidate();
                x1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((uj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
