package di;

import android.content.DialogInterface;
import org.telegram.messenger.r10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ n7(int i7, r10 r10Var, boolean[] zArr) {
        this.a = i7;
        this.b = r10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r10 r10Var = this.b;
                if (r10Var != null && !this.c[0]) {
                    r10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                r10 r10Var2 = this.b;
                if (r10Var2 != null && !this.c[0]) {
                    r10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                r10 r10Var3 = this.b;
                if (r10Var3 != null && !this.c[0]) {
                    r10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
