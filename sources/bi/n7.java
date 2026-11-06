package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;

    public /* synthetic */ n7(p7 p7Var, int i7) {
        this.a = i7;
        this.b = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p7 p7Var = this.b;
                p7Var.r = false;
                p7Var.invalidate();
                p7Var.a();
                p7Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                p7 p7Var2 = this.b;
                p7Var2.setMessageCell(null);
                ArrayList arrayList = p7Var2.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((zg0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
