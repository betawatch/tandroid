package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
