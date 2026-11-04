package gi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ j9(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.Y0.x(3, false);
                vaVar.r0 = null;
                break;
            default:
                ja jaVar = this.b.Y0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
