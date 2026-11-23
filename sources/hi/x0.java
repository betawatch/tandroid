package hi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ x0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d1 d1Var = this.b;
        switch (i7) {
            case 0:
                d1Var.b();
                break;
            case 1:
                d1Var.e = false;
                a1 a1Var = d1Var.s;
                if (a1Var != null) {
                    a1Var.a(true);
                    d1Var.s = null;
                }
                c1 c1Var = d1Var.n;
                if (c1Var != null) {
                    c1Var.a();
                }
                d1Var.c = false;
                d1Var.d();
                break;
            default:
                if (d1Var.c && d1Var.r != null) {
                    d1Var.n.b(R.raw.error, 3500, gd.O0("VideoConvertFail"));
                    d1Var.c = false;
                    d1Var.d();
                    break;
                }
                break;
        }
    }
}
