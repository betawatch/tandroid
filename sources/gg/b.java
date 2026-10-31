package gg;

import org.telegram.ui.pb1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ b(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                if (unVar.getParentLayout() != null) {
                    pb1.L0(unVar);
                    break;
                }
                break;
            default:
                this.b.rc();
                break;
        }
    }
}
