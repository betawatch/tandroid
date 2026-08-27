package hh;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class x8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ x8(int i10, h9 h9Var) {
        this.b = i10;
        this.c = h9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(this.b).removeObserver((h9) this.c, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.c;
                PhotoViewer photoViewer = ((ys0) l0Var).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.D();
                }
                l0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ x8(zf.l0 l0Var, int i10) {
        this.c = l0Var;
        this.b = i10;
    }
}
