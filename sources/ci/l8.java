package ci;

import org.telegram.messenger.u10;
import org.telegram.ui.Components.go;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ u10 c;

    public /* synthetic */ l8(int i3, u10 u10Var, boolean[] zArr) {
        this.a = i3;
        this.b = zArr;
        this.c = u10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u10 u10Var;
        u10 u10Var2;
        u10 u10Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (u10Var = this.c) != null) {
                    u10Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (u10Var2 = this.c) != null) {
                    zArr2[0] = true;
                    u10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new go(27), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (u10Var3 = this.c) != null) {
                    zArr3[0] = true;
                    u10Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l8(e9 e9Var, boolean[] zArr, u10 u10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = u10Var;
    }
}
