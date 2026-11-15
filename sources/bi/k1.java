package bi;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ k1(s2 s2Var, z10 z10Var, int i7) {
        this.a = i7;
        this.b = s2Var;
        this.c = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                z10 z10Var = this.c;
                if (z10Var != null) {
                    s2Var.getClass();
                    z10Var.a(Boolean.FALSE);
                }
                s2Var.dismiss();
                break;
            case 1:
                s2 s2Var2 = this.b;
                z10 z10Var2 = this.c;
                if (z10Var2 != null) {
                    s2Var2.getClass();
                    z10Var2.a(Boolean.FALSE);
                }
                s2Var2.dismiss();
                break;
            default:
                s2 s2Var3 = this.b;
                z10 z10Var3 = this.c;
                if (z10Var3 != null) {
                    s2Var3.getClass();
                    z10Var3.a(Boolean.FALSE);
                }
                s2Var3.dismiss();
                break;
        }
    }
}
