// default package

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i41 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ i41(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                n41.e = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            case 1:
                q84.i = null;
                view.requestFocus();
                break;
            case 2:
                x09.f = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                ow9.I = null;
                view.requestFocus();
                break;
        }
    }
}
