package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
