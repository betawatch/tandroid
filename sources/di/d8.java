package di;

import org.telegram.messenger.z10;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ d8(int i7, z10 z10Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z10 z10Var;
        z10 z10Var2;
        z10 z10Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (z10Var = this.c) != null) {
                    z10Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (z10Var2 = this.c) != null) {
                    zArr2[0] = true;
                    z10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new ah0(2), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (z10Var3 = this.c) != null) {
                    zArr3[0] = true;
                    z10Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d8(v8 v8Var, boolean[] zArr, z10 z10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = z10Var;
    }
}
