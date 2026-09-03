package eg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.b11;
import org.telegram.ui.d60;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
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
                d60 d60Var = d60.A3;
                break;
            case 6:
                break;
            default:
                int i11 = qh.x1.D;
                break;
        }
    }

    public /* synthetic */ c0(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
