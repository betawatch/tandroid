package ii;

import org.telegram.ui.Components.wc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ n0(int i10, un unVar, boolean z10) {
        this.d = i10;
        this.b = unVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                un unVar = this.b;
                if (i10 != 2) {
                    unVar.ea();
                    unVar.kc();
                }
                s0.f(wc.b0(unVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Lc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ n0(un unVar, boolean z10, int i10) {
        this.b = unVar;
        this.c = z10;
        this.d = i10;
    }
}
