// default package

import android.view.View;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dx8 implements t69, fd {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ dx8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i < proxyListActivity.n || i >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.P(i);
        return true;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.e0();
    }
}
