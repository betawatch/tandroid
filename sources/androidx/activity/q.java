package androidx.activity;

import android.window.OnBackInvokedCallback;
import di.p9;
import fi.va;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                p9 p9Var = (p9) this.b;
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null) {
                    p9Var.p();
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
