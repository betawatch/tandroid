package di;

import org.telegram.messenger.z10;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ z10 c;

    public /* synthetic */ c8(int i7, z10 z10Var, boolean[] zArr) {
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

    public /* synthetic */ c8(u8 u8Var, boolean[] zArr, z10 z10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = z10Var;
    }
}
