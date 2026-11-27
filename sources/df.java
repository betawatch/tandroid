// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class df implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij b;

    public /* synthetic */ df(ij ijVar, byte b) {
        this.a = b;
        this.b = ijVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        ij ijVar = this.b;
        switch (b) {
            case 0:
                ijVar.requestFocus();
                hl.E3(ijVar);
                break;
            case 1:
                ijVar.requestFocus();
                hl.E3(ijVar);
                break;
            default:
                hl.c3(new c1(ijVar, (byte) 10));
                break;
        }
    }
}
