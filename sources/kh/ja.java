package kh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ja(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wb wbVar = this.b;
                wbVar.T0.x(3, false);
                wbVar.m0 = null;
                break;
            default:
                kb kbVar = this.b.T0;
                if (kbVar != null) {
                    kbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
