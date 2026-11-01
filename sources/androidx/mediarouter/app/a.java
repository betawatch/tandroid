package androidx.mediarouter.app;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends p4.t {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // p4.t
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void d(p4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void e(p4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void f(p4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void g(p4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // p4.t
    public final void l(p4.a0 a0Var) {
        boolean z10 = a0Var != null ? a0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
