package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ j9(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.X0.x(3, false);
                vaVar.q0 = null;
                break;
            default:
                ja jaVar = this.b.X0;
                if (jaVar != null) {
                    jaVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
