package bi;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ w10 c;

    public /* synthetic */ j2(p3 p3Var, w10 w10Var, int i7) {
        this.a = i7;
        this.b = p3Var;
        this.c = w10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                w10 w10Var = this.c;
                if (w10Var != null) {
                    p3Var.getClass();
                    w10Var.a(Boolean.FALSE);
                }
                p3Var.dismiss();
                break;
            case 1:
                p3 p3Var2 = this.b;
                w10 w10Var2 = this.c;
                if (w10Var2 != null) {
                    p3Var2.getClass();
                    w10Var2.a(Boolean.FALSE);
                }
                p3Var2.dismiss();
                break;
            default:
                p3 p3Var3 = this.b;
                w10 w10Var3 = this.c;
                if (w10Var3 != null) {
                    p3Var3.getClass();
                    w10Var3.a(Boolean.FALSE);
                }
                p3Var3.dismiss();
                break;
        }
    }
}
