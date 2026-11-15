package androidx.activity;

import android.window.OnBackInvokedCallback;
import fi.i9;
import hi.sa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                i9 i9Var = (i9) this.b;
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null) {
                    i9Var.p();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((g.s) this.b).t();
                break;
            case 3:
                ((sa) this.b).L();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
