package androidx.activity;

import android.window.OnBackInvokedCallback;
import ci.z9;
import ei.vb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                td.a onBackInvoked = (td.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                z9 z9Var = (z9) this.b;
                z9Var.getClass();
                LaunchActivity launchActivity = LaunchActivity.J1;
                if (launchActivity == null) {
                    z9Var.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((vb) this.b).L();
                break;
            case 3:
                ((g.r) this.b).t();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
