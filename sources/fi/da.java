package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ da(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.X0.x(3, false);
                sbVar.q0 = null;
                break;
            default:
                gb gbVar = this.b.X0;
                if (gbVar != null) {
                    gbVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
