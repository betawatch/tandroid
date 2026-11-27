// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cab implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;

    public /* synthetic */ cab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                hbb hbbVar = sbbVar.Y0;
                if (hbbVar != null) {
                    hbbVar.x(4, false);
                    break;
                }
                break;
            default:
                sbbVar.Y0.x(3, false);
                sbbVar.r0 = null;
                break;
        }
    }
}
