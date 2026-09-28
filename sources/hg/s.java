package hg;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
