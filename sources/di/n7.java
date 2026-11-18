package di;

import android.content.DialogInterface;
import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
