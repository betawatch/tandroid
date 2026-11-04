package ji;

import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ e0(int i3, wm wmVar, boolean z10) {
        this.d = i3;
        this.b = wmVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i3 = this.d;
                wm wmVar = this.b;
                if (i3 != 2) {
                    wmVar.ua();
                    wmVar.Bc();
                }
                j0.f(fc.a0(wmVar), i3, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.cd(this.d, z10);
                break;
        }
    }

    public /* synthetic */ e0(wm wmVar, boolean z10, int i3) {
        this.b = wmVar;
        this.c = z10;
        this.d = i3;
    }
}
