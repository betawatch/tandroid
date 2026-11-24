// default package

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
