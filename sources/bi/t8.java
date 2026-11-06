package bi;

import android.content.DialogInterface;
import org.telegram.messenger.v10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ t8(v10 v10Var, boolean[] zArr, int i7) {
        this.a = i7;
        this.b = v10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                v10 v10Var = this.b;
                if (v10Var != null && !this.c[0]) {
                    v10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                v10 v10Var2 = this.b;
                if (v10Var2 != null && !this.c[0]) {
                    v10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                v10 v10Var3 = this.b;
                if (v10Var3 != null && !this.c[0]) {
                    v10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
