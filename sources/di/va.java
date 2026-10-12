package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ va(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                kc kcVar = this.b;
                kcVar.X0.x(3, false);
                kcVar.q0 = null;
                break;
            default:
                yb ybVar = this.b.X0;
                if (ybVar != null) {
                    ybVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
