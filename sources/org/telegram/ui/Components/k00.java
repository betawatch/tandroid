package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public k00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
        if (fragmentContextView.h0 == null || !(e2Var instanceof org.telegram.ui.an)) {
            fragmentContextView.m0 = false;
            return;
        }
        org.telegram.messenger.r3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - e2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        g6 g6Var = fragmentContextView.k0;
        if (!fragmentContextView.j0) {
            G = org.telegram.messenger.hd.M0(2131743440, null);
        }
        g6Var.t(G, true, true);
        org.telegram.messenger.g0.i3(fragmentContextView.n0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
