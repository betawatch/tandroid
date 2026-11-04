package ji;

import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ long c;

    public /* synthetic */ f(n nVar, long j10, int i3) {
        this.a = i3;
        this.b = nVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n.c0(this.b, this.c);
                break;
            default:
                n nVar = this.b;
                nVar.getClass();
                nVar.presentFragment(wm.ra(this.c));
                break;
        }
    }
}
