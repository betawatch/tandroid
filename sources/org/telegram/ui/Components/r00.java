package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public r00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = fragmentContextView.h;
        if (fragmentContextView.h0 == null || !(h2Var instanceof org.telegram.ui.bn)) {
            fragmentContextView.m0 = false;
            return;
        }
        org.telegram.messenger.t3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.i0 = false;
            fragmentContextView.m0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - h2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.gd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        m6 m6Var = fragmentContextView.k0;
        if (!fragmentContextView.j0) {
            G = org.telegram.messenger.gd.M0(2131743203, null);
        }
        m6Var.t(G, true, true);
        org.telegram.messenger.g0.h3(fragmentContextView.n0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
