package androidx.activity;

import android.window.OnBackInvokedCallback;
import oh.i9;
import org.telegram.ui.LaunchActivity;
import qh.ca;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                ((ca) this.b).M();
                break;
        }
    }
}
