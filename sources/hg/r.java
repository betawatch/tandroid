package hg;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                y1.h = null;
                View view2 = this.b;
                if (view2 != null) {
                    view2.requestFocus();
                    break;
                }
                break;
        }
    }
}
