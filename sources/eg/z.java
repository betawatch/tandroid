package eg;

import android.content.DialogInterface;
import mh.e9;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ z(int i10, e9 e9Var) {
        this.b = i10;
        this.c = e9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.c;
                PhotoViewer photoViewer = ((mt0) c1Var).l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.C();
                }
                c1Var.B0(this.b);
                break;
            default:
                NotificationCenter.getInstance(this.b).removeObserver((e9) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
        }
    }

    public /* synthetic */ z(c1 c1Var, int i10) {
        this.c = c1Var;
        this.b = i10;
    }
}
