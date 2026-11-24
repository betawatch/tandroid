// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eua implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ eua(byte b, jac jacVar, boolean[] zArr) {
        this.a = b;
        this.b = jacVar;
        this.c = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    jacVar.a(0L, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                if (!zArr[0]) {
                    jacVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    jacVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }
}
