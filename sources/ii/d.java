package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ls e;

    public /* synthetic */ d(ls lsVar, u1 u1Var, long j3, boolean z9, int i7) {
        this.a = i7;
        this.e = lsVar;
        this.b = u1Var;
        this.c = j3;
        this.d = z9;
    }

    @Override // org.telegram.messenger.tr
    public final void run(long j3) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    fVar.b = -j3;
                    fVar.c = fVar.getMessagesController().M0(Long.valueOf(j3));
                    fVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.e;
                d0Var.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    d0Var.K0(qp.s1(d0Var.a).M0(Long.valueOf(j3)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
