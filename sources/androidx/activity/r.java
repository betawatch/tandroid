package androidx.activity;

import android.window.OnBackInvokedCallback;
import bi.pb;
import di.pc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                rd.a onBackInvoked = (rd.a) this.b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                pb pbVar = (pb) this.b;
                pbVar.getClass();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null) {
                    pbVar.onAttachedBackPressed();
                    break;
                } else {
                    launchActivity.onBackPressed();
                    break;
                }
            case 2:
                ((pc) this.b).M();
                break;
            case 3:
                ((g.s) this.b).t();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
