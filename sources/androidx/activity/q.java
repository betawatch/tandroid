package androidx.activity;

import android.window.OnBackInvokedCallback;
import fi.f9;
import hi.ta;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((ta) this.b).L();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
