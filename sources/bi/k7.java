package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ k7(m7 m7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.r = false;
                m7Var.invalidate();
                m7Var.a();
                m7Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                m7 m7Var2 = this.b;
                m7Var2.setMessageCell(null);
                ArrayList arrayList = m7Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
