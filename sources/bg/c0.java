package bg;

import android.content.DialogInterface;
import jh.d9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ c0(int i10, d9 d9Var) {
        this.b = i10;
        this.c = d9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.c;
                PhotoViewer photoViewer = ((ws0) g1Var).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.D();
                }
                g1Var.B0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((d9) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ c0(g1 g1Var, int i10) {
        this.c = g1Var;
        this.b = i10;
    }
}
