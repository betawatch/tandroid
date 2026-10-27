package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
