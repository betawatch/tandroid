package ei;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ t1(v1 v1Var, int i3) {
        this.a = i3;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v1 v1Var = this.b;
                v1Var.invalidate();
                v1Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
