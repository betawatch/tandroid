package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;

    public /* synthetic */ n7(p7 p7Var, int i10) {
        this.a = i10;
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((uj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
