package androidx.mediarouter.app;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a extends zv6 {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // zv6
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void d(ew6 ew6Var) {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void e(ew6 ew6Var) {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void f(ew6 ew6Var) {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void g(ew6 ew6Var) {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // zv6
    public final void l(iw6 iw6Var) {
        boolean z = iw6Var != null ? iw6Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z) {
            mediaRouteButton.mIsFixedIcon = z;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
