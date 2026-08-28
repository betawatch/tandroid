package androidx.activity;

import android.window.OnBackInvokedCallback;
import ih.m9;
import kh.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                zc.a onBackInvoked = (zc.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((g.q) this.b).t();
                break;
            case 2:
                m9 m9Var = (m9) this.b;
                m9Var.getClass();
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null) {
                    m9Var.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 3:
                ((wb) this.b).M();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
