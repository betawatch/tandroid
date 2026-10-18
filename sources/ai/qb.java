package ai;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
