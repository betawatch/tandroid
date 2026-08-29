package jh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ k5(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.r = false;
                m5Var.invalidate();
                m5Var.a();
                m5Var.c();
                break;
            case 1:
                this.b.invalidate();
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.setMessageCell(null);
                ArrayList arrayList = m5Var2.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
