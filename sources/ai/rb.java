package ai;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rb implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                jc jcVar = (jc) this.b;
                jcVar.getClass();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null) {
                    jcVar.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 1:
                rd.a onBackInvoked = (rd.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 2:
                ((ci.lc) this.b).M();
                break;
            case 3:
                ((g.s) this.b).s();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
