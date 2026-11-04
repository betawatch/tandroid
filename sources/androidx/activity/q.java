package androidx.activity;

import android.window.OnBackInvokedCallback;
import ei.r9;
import gi.va;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                od.a onBackInvoked = (od.a) this.b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                r9 r9Var = (r9) this.b;
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity == null) {
                    r9Var.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((g.s) this.b).s();
                break;
            case 3:
                ((va) this.b).L();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
