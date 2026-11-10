package androidx.activity;

import android.window.OnBackInvokedCallback;
import di.q9;
import fi.va;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                rd.a onBackInvoked = (rd.a) this.b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                q9 q9Var = (q9) this.b;
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null) {
                    q9Var.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((va) this.b).L();
                break;
            case 3:
                ((g.s) this.b).r();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
