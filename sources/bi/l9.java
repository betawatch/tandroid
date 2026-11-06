package bi;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.l10;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ l9(int i7, c20 c20Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c20 c20Var;
        c20 c20Var2;
        c20 c20Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (c20Var = this.c) != null) {
                    c20Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (c20Var2 = this.c) != null) {
                    zArr2[0] = true;
                    c20Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new l10(26), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (c20Var3 = this.c) != null) {
                    zArr3[0] = true;
                    c20Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l9(ea eaVar, boolean[] zArr, c20 c20Var) {
        this.a = 0;
        this.b = zArr;
        this.c = c20Var;
    }
}
