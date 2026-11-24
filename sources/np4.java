// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class np4 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public np4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        d dVar = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(dVar instanceof yv1)) {
            fragmentContextView.l0 = false;
            return;
        }
        qd2 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.k()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - dVar.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? jb6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : gm.j0(currentTime);
        ho hoVar = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = jb6.M0(2131743124, null);
        }
        hoVar.t(G, true, true);
        gm.d3(fragmentContextView.m0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
