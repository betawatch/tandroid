package bi;

import android.content.DialogInterface;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ q8(c20 c20Var, boolean[] zArr) {
        this.c = c20Var;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c20 c20Var = this.c;
                if (c20Var != null && !this.b[0]) {
                    c20Var.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    this.c.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q8(boolean[] zArr, c20 c20Var) {
        this.b = zArr;
        this.c = c20Var;
    }
}
