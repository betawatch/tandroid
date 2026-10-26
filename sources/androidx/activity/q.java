package androidx.activity;

import android.window.OnBackInvokedCallback;
import di.y9;
import fi.sb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ud.a onBackInvoked = (ud.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null) {
                    y9Var.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((sb) this.b).L();
                break;
            case 3:
                ((g.r) this.b).s();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
