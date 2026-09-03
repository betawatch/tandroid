package dg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.b11;
import org.telegram.ui.e60;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e0(int i10) {
        this.a = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                MediaController.forceBroadcastNewPhotos = false;
                break;
            case 1:
                org.telegram.ui.c.a = false;
                break;
            case 2:
                break;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            case 4:
                int i10 = b11.e;
                break;
            case 5:
                e60 e60Var = e60.A3;
                break;
            case 6:
                break;
            default:
                int i11 = ph.y1.D;
                break;
        }
    }

    public /* synthetic */ e0(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
