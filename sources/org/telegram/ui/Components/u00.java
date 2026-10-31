package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public u00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(k2Var instanceof org.telegram.ui.un)) {
            fragmentContextView.l0 = false;
            return;
        }
        org.telegram.messenger.u3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - k2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.cd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.i0.j0(currentTime);
        e6 e6Var = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = org.telegram.messenger.cd.L0(2131743466, null);
        }
        e6Var.t(G, true, true);
        org.telegram.messenger.i0.h3(fragmentContextView.m0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
