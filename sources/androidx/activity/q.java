package androidx.activity;

import android.window.OnBackInvokedCallback;
import jh.i9;
import lh.sb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ad.a onBackInvoked = (ad.a) this.b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((g.r) this.b).s();
                break;
            case 2:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null) {
                    i9Var.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 3:
                ((sb) this.b).M();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
