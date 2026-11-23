package di;

import android.content.DialogInterface;
import org.telegram.messenger.p10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ n7(int i7, p10 p10Var, boolean[] zArr) {
        this.a = i7;
        this.b = p10Var;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                p10 p10Var = this.b;
                if (p10Var != null && !this.c[0]) {
                    p10Var.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                p10 p10Var2 = this.b;
                if (p10Var2 != null && !this.c[0]) {
                    p10Var2.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                p10 p10Var3 = this.b;
                if (p10Var3 != null && !this.c[0]) {
                    p10Var3.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
