package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7 b;

    public /* synthetic */ o7(q7 q7Var, int i10) {
        this.a = i10;
        this.b = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q7 q7Var = this.b;
                q7Var.r = false;
                q7Var.invalidate();
                q7Var.a();
                q7Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                q7 q7Var2 = this.b;
                q7Var2.setMessageCell(null);
                ArrayList arrayList = q7Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
