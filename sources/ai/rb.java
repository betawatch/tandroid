package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class rb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ rb(int i10, ec ecVar) {
        this.b = i10;
        this.c = ecVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(this.b).removeObserver((ec) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.c;
                PhotoViewer photoViewer = ((jt0) m0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                m0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ rb(rg.m0 m0Var, int i10) {
        this.c = m0Var;
        this.b = i10;
    }
}
