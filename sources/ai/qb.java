package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ qb(int i10, dc dcVar) {
        this.b = i10;
        this.c = dcVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(this.b).removeObserver((dc) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.c;
                PhotoViewer photoViewer = ((it0) m0Var).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.b);
                break;
        }
    }

    public /* synthetic */ qb(rg.m0 m0Var, int i10) {
        this.c = m0Var;
        this.b = i10;
    }
}
