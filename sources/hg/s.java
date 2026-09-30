package hg;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ s(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                x.d = null;
                View view = this.b;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                z1.h = null;
                View view2 = this.b;
                if (view2 != null) {
                    view2.requestFocus();
                    break;
                }
                break;
        }
    }
}
