package androidx.activity;

import android.window.OnBackInvokedCallback;
import ci.aa;
import ei.vb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                aa aaVar = (aa) this.b;
                aaVar.getClass();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    aaVar.onAttachedBackPressed();
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
