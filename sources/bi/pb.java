package bi;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ pb(int i10, xb xbVar) {
        this.b = i10;
        this.c = xbVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(this.b).removeObserver((xb) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                sg.n0 n0Var = (sg.n0) this.c;
                PhotoViewer photoViewer = ((nt0) n0Var).d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                n0Var.A0(this.b);
                break;
        }
    }

    public /* synthetic */ pb(sg.n0 n0Var, int i10) {
        this.c = n0Var;
        this.b = i10;
    }
}
