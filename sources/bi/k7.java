package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    ((yj0) obj).C(true);
                }
                arrayList.clear();
                break;
        }
    }
}
