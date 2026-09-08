package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ g2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                k2Var.invalidate();
                k2Var.b();
                break;
            default:
                ArrayList arrayList = this.b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
