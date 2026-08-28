package gh;

import java.util.ArrayList;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ n5(p5 p5Var, int i9) {
        this.a = i9;
        this.b = p5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                p5Var.r = false;
                p5Var.invalidate();
                p5Var.a();
                p5Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                p5 p5Var2 = this.b;
                p5Var2.setMessageCell(null);
                ArrayList arrayList = p5Var2.F;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((mi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
