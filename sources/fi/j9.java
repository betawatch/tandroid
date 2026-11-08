package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
