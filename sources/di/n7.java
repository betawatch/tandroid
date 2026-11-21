package di;

import android.content.DialogInterface;
import org.telegram.messenger.q10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ n7(int i7, q10 q10Var, boolean[] zArr) {
        this.a = i7;
        this.b = q10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                q10 q10Var = this.b;
                if (q10Var != null && !this.c[0]) {
                    q10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                q10 q10Var2 = this.b;
                if (q10Var2 != null && !this.c[0]) {
                    q10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                q10 q10Var3 = this.b;
                if (q10Var3 != null && !this.c[0]) {
                    q10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
