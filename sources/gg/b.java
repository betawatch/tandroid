package gg;

import org.telegram.ui.nb1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    nb1.M0(unVar);
                    break;
                }
                break;
            default:
                this.b.wc();
                break;
        }
    }
}
