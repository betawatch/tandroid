package ci;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.y01;
import org.telegram.ui.i60;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i10) {
        this.a = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                int i10 = t2.G;
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
                int i11 = y01.e;
                break;
            case 5:
                i60 i60Var = i60.D3;
                break;
            case 6:
                break;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                break;
        }
    }

    public /* synthetic */ f1(boolean[] zArr) {
        this.a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
