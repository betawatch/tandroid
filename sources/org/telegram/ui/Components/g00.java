package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public g00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(f2Var instanceof org.telegram.ui.cn)) {
            fragmentContextView.l0 = false;
            return;
        }
        org.telegram.messenger.r3 groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.j()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.b.schedule_date - f2Var.getConnectionsManager().getCurrentTime();
        String G = currentTime >= 86400 ? org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        h6 h6Var = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = org.telegram.messenger.id.M0(2131743440, null);
        }
        h6Var.t(G, true, true);
        org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
