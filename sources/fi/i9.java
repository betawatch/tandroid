package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ i9(va vaVar, int i7) {
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
