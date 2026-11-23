package androidx.activity;

import android.window.OnBackInvokedCallback;
import fi.f9;
import hi.sa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                f9 f9Var = (f9) this.b;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    f9Var.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((g.s) this.b).t();
                break;
            case 3:
                ((sa) this.b).L();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
