package li;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gs e;

    public /* synthetic */ e(gs gsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.a = i7;
        this.e = gsVar;
        this.b = t1Var;
        this.c = j3;
        this.d = z10;
    }

    @Override // org.telegram.messenger.pr
    public final void run(long j3) {
        switch (this.a) {
            case 0:
                g gVar = (g) this.e;
                gVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    gVar.b = -j3;
                    gVar.c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.e;
                d0Var.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(np.u1(d0Var.a).O0(Long.valueOf(j3)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
