package androidx.mediarouter.app;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends c2.x {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // c2.x
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void d(c2.b0 b0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void e(c2.b0 b0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void f(c2.b0 b0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void g(c2.b0 b0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // c2.x
    public final void l(c2.g0 g0Var) {
        boolean z4 = g0Var != null ? g0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z4) {
            mediaRouteButton.mIsFixedIcon = z4;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
