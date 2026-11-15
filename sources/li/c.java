package li;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.qr;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements qr {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ is e;

    public /* synthetic */ c(is isVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.a = i7;
        this.e = isVar;
        this.b = t1Var;
        this.c = j3;
        this.d = z10;
    }

    @Override // org.telegram.messenger.qr
    public final void run(long j3) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    eVar.b = -j3;
                    eVar.c = eVar.getMessagesController().M0(Long.valueOf(j3));
                    eVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.e;
                d0Var.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    d0Var.K0(np.s1(d0Var.a).M0(Long.valueOf(j3)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
