package bg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.q01;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                MediaController.forceBroadcastNewPhotos = false;
                break;
            case 1:
                int i10 = nh.k2.C;
                break;
            case 2:
                org.telegram.ui.c.a = false;
                break;
            case 4:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                break;
            case 5:
                int i11 = q01.e;
                break;
            case 6:
                r50 r50Var = r50.z3;
                break;
        }
    }

    public /* synthetic */ f0(boolean[] zArr) {
        this.a = 3;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
