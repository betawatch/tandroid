package androidx.activity;

import android.window.OnBackInvokedCallback;
import di.y9;
import fi.sb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
