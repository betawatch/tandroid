package eg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d2(g2 g2Var, boolean z10, int i10) {
        this.a = i10;
        this.b = g2Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                g2 g2Var = this.b;
                ArrayList arrayList = g2Var.c0;
                if (this.c) {
                    g2Var.d0.addAll(list);
                }
                if (g2Var.n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    g2Var.b0(true, true);
                    g2Var.X(true);
                    break;
                }
                break;
            default:
                g2.P(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
