package kh;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.e01;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ g1(int i9) {
        this.a = i9;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                int i9 = n2.C;
                break;
            case 1:
                org.telegram.ui.b.a = false;
                break;
            case 2:
                break;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            case 4:
                int i10 = e01.e;
                break;
            case 5:
                o50 o50Var = o50.z3;
                break;
            case 6:
                break;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                break;
        }
    }

    public /* synthetic */ g1(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
