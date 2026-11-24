// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ln4 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public ln4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        d dVar = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(dVar instanceof mu1)) {
            fragmentContextView.l0 = false;
            return;
        }
        fc2 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.k()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - dVar.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? k96.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : gl.j0(currentTime);
        gn gnVar = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = k96.M0(2131743198, null);
        }
        gnVar.t(G, true, true);
        gl.e3(fragmentContextView.m0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
