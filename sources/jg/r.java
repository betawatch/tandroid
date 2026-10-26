package jg;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ r(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                w.e = null;
                View view = this.b;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                z1.f = null;
                View view2 = this.b;
                if (view2 != null) {
                    view2.requestFocus();
                    break;
                }
                break;
        }
    }
}
