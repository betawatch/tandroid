package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ wa(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                lc lcVar = this.b;
                lcVar.X0.x(3, false);
                lcVar.q0 = null;
                break;
            default:
                zb zbVar = this.b.X0;
                if (zbVar != null) {
                    zbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
