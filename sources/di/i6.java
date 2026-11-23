package di;

import java.util.ArrayList;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ i6(k6 k6Var, int i7) {
        this.a = i7;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k6 k6Var = this.b;
                k6Var.r = false;
                k6Var.invalidate();
                k6Var.a();
                k6Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                k6 k6Var2 = this.b;
                k6Var2.setMessageCell(null);
                ArrayList arrayList = k6Var2.K;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((oh0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
