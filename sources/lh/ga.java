package lh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ga(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.T0.x(3, false);
                sbVar.m0 = null;
                break;
            default:
                hb hbVar = this.b.T0;
                if (hbVar != null) {
                    hbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
