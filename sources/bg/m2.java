package bg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m2(q2 q2Var, boolean z10, int i9) {
        this.a = i9;
        this.b = q2Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                q2 q2Var = this.b;
                ArrayList arrayList = q2Var.c0;
                if (this.c) {
                    q2Var.d0.addAll(list);
                }
                if (q2Var.n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    q2Var.a0(true, true);
                    q2Var.W(true);
                    break;
                }
                break;
            default:
                q2.O(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
