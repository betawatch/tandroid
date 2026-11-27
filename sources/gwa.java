// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
