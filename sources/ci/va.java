package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
