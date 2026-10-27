package ii;

import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ n0(int i10, wn wnVar, boolean z10) {
        this.d = i10;
        this.b = wnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                wn wnVar = this.b;
                if (i10 != 2) {
                    wnVar.ha();
                    wnVar.oc();
                }
                s0.f(wc.b0(wnVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Pc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ n0(wn wnVar, boolean z10, int i10) {
        this.b = wnVar;
        this.c = z10;
        this.d = i10;
    }
}
