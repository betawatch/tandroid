// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gwa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ gwa(byte b, icc iccVar, boolean[] zArr) {
        this.a = b;
        this.b = iccVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    iccVar.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                if (!zArr[0]) {
                    iccVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    iccVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
