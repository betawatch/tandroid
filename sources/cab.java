// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cab implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ cab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.x(4, false);
                    break;
                }
                break;
            default:
                rbbVar.Y0.x(3, false);
                rbbVar.r0 = null;
                break;
        }
    }
}
