package gh;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ y8(int i9, i9 i9Var) {
        this.b = i9;
        this.c = i9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(this.b).removeObserver((i9) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.c;
                PhotoViewer photoViewer = ((xs0) l0Var).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.t0();
                    photoViewer.B2.D();
                }
                l0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ y8(yf.l0 l0Var, int i9) {
        this.c = l0Var;
        this.b = i9;
    }
}
