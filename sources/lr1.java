// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lr1 implements Runnable {
    public final /* synthetic */ zu1 a;

    public lr1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zu1 zu1Var = this.a;
        r47 r47Var = zu1Var.v5;
        if (r47Var == null || zu1Var.l9 == null) {
            return;
        }
        int max = Math.max(0, r47Var.k.ttl_period - (zu1Var.getConnectionsManager().getCurrentTime() - zu1Var.v5.k.date));
        zu1Var.l9.setSubtext(ob6.a0(null, null, 2131753846, max < 86400 ? hl.g0(max, false, true) : ob6.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        hl.d3(zu1Var.m9, 1000L);
    }
}
