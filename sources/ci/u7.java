package ci;

import android.content.DialogInterface;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ u7(n10 n10Var, boolean[] zArr, int i3) {
        this.a = i3;
        this.b = n10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                n10 n10Var = this.b;
                if (n10Var != null && !this.c[0]) {
                    n10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                n10 n10Var2 = this.b;
                if (n10Var2 != null && !this.c[0]) {
                    n10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                n10 n10Var3 = this.b;
                if (n10Var3 != null && !this.c[0]) {
                    n10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
