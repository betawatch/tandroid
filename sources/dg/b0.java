package dg;

import android.content.DialogInterface;
import lh.e9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ b0(int i10, e9 e9Var) {
        this.b = i10;
        this.c = e9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                PhotoViewer photoViewer = ((ft0) e1Var).l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.C();
                }
                e1Var.B0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((e9) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ b0(e1 e1Var, int i10) {
        this.c = e1Var;
        this.b = i10;
    }
}
