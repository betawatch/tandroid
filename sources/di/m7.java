package di;

import android.content.DialogInterface;
import org.telegram.messenger.s10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ m7(s10 s10Var, boolean[] zArr, int i7) {
        this.a = i7;
        this.b = s10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s10 s10Var = this.b;
                if (s10Var != null && !this.c[0]) {
                    s10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                s10 s10Var2 = this.b;
                if (s10Var2 != null && !this.c[0]) {
                    s10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                s10 s10Var3 = this.b;
                if (s10Var3 != null && !this.c[0]) {
                    s10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
