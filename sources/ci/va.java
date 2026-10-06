package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
