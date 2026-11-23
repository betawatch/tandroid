package hi;

import android.content.DialogInterface;
import org.telegram.ui.Components.du0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ du0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a5(du0 du0Var, Object obj, int i7, int i10) {
        this.a = i10;
        this.c = du0Var;
        this.d = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.c;
                boolean[] zArr = (boolean[]) this.d;
                v5Var.Y1 = null;
                if (zArr[0]) {
                    v5Var.y0(false);
                }
                v5Var.R0(this.b);
                break;
            default:
                tg.l0 l0Var = (tg.l0) this.c;
                if (l0Var.K1 == ((tg.b0) this.d)) {
                    l0Var.K1 = null;
                }
                l0Var.r0(false);
                l0Var.F0(this.b);
                break;
        }
    }
}
