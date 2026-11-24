// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ks1 implements Runnable {
    public final /* synthetic */ yv1 a;

    public ks1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yv1 yv1Var = this.a;
        k47 k47Var = yv1Var.v5;
        if (k47Var == null || yv1Var.l9 == null) {
            return;
        }
        int max = Math.max(0, k47Var.k.ttl_period - (yv1Var.getConnectionsManager().getCurrentTime() - yv1Var.v5.k.date));
        yv1Var.l9.setSubtext(jb6.a0(null, null, 2131753818, max < 86400 ? gm.g0(max, false, true) : jb6.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        gm.d3(yv1Var.m9, 1000L);
    }
}
