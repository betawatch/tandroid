package bi;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                sg.m0 m0Var = (sg.m0) this.c;
                PhotoViewer photoViewer = ((pt0) m0Var).d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.C();
                }
                m0Var.A0(this.b);
                break;
        }
    }

    public /* synthetic */ pb(sg.m0 m0Var, int i10) {
        this.c = m0Var;
        this.b = i10;
    }
}
