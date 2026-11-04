package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public c00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        if (fragmentContextView.h0 == null || !(d2Var instanceof org.telegram.ui.wm)) {
            fragmentContextView.m0 = false;
            return;
        }
        org.telegram.messenger.r3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - d2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.bd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        g6 g6Var = fragmentContextView.k0;
        if (!fragmentContextView.j0) {
            G = org.telegram.messenger.bd.M0(2131743450, null);
        }
        g6Var.t(G, true, true);
        org.telegram.messenger.g0.i3(fragmentContextView.n0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
