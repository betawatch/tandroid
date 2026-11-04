package ji;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.ui.ActionBar.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cs e;

    public /* synthetic */ c(cs csVar, s1 s1Var, long j10, boolean z10, int i3) {
        this.a = i3;
        this.e = csVar;
        this.b = s1Var;
        this.c = j10;
        this.d = z10;
    }

    @Override // org.telegram.messenger.lr
    public final void run(long j10) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    eVar.b = -j10;
                    eVar.c = eVar.getMessagesController().M0(Long.valueOf(j10));
                    eVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                b0 b0Var = (b0) this.e;
                b0Var.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    b0Var.K0(hp.s1(b0Var.a).M0(Long.valueOf(j10)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
