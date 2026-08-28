package androidx.mediarouter.app;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends c2.w {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // c2.w
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void d(c2.a0 a0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void e(c2.a0 a0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void f(c2.a0 a0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void g(c2.a0 a0Var) {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // c2.w
    public final void l(c2.f0 f0Var) {
        boolean z10 = f0Var != null ? f0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
