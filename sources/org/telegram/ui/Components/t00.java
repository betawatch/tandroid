package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public t00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
        if (fragmentContextView.h0 == null || !(g2Var instanceof org.telegram.ui.bn)) {
            fragmentContextView.m0 = false;
            return;
        }
        org.telegram.messenger.t3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - g2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        n6 n6Var = fragmentContextView.k0;
        if (!fragmentContextView.j0) {
            G = org.telegram.messenger.hd.N0(2131743195, null);
        }
        n6Var.t(G, true, true);
        org.telegram.messenger.g0.h3(fragmentContextView.n0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
