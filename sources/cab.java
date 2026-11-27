// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
