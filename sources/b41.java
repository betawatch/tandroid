// default package

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b41 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ b41(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                f41.e = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            case 1:
                v74.i = null;
                view.requestFocus();
                break;
            case 2:
                kx8.f = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                vs9.I = null;
                view.requestFocus();
                break;
        }
    }
}
