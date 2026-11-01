package androidx.activity;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;
import th.o7;
import vh.o8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ld.a onBackInvoked = (ld.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((g.r) this.b).s();
                break;
            case 2:
                ((Runnable) this.b).run();
                break;
            case 3:
                o7 o7Var = (o7) this.b;
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null) {
                    o7Var.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            default:
                ((o8) this.b).L();
                break;
        }
    }
}
