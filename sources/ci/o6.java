package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ o6(q6 q6Var, int i3) {
        this.a = i3;
        this.b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q6 q6Var = this.b;
                q6Var.r = false;
                q6Var.invalidate();
                q6Var.a();
                q6Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                q6 q6Var2 = this.b;
                q6Var2.setMessageCell(null);
                ArrayList arrayList = q6Var2.K;
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
