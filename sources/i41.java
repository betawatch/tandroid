// default package

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                w09.f = null;
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
