package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h00 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public h00(FragmentContextView fragmentContextView) {
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
        String G = currentTime >= 86400 ? org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]) : org.telegram.messenger.g0.j0(currentTime);
        i6 i6Var = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            G = org.telegram.messenger.id.M0(2131743443, null);
        }
        i6Var.t(G, true, true);
        org.telegram.messenger.g0.i3(fragmentContextView.m0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
