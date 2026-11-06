package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        if (fragmentContextView.g0 == null || !(f2Var instanceof org.telegram.ui.an)) {
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
        String G = currentTime >= 86400 ? org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        i6 i6Var = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = org.telegram.messenger.hd.M0(2131743441, null);
        }
        i6Var.t(G, true, true);
        org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
