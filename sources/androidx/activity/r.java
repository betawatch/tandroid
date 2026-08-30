package androidx.activity;

import android.window.OnBackInvokedCallback;
import nh.i9;
import org.telegram.ui.LaunchActivity;
import ph.da;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                dd.a onBackInvoked = (dd.a) this.b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((g.q) this.b).t();
                break;
            case 2:
                ((Runnable) this.b).run();
                break;
            case 3:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null) {
                    i9Var.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            default:
                ((da) this.b).M();
                break;
        }
    }
}
