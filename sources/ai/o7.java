package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                    ((vj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
