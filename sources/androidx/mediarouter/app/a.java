package androidx.mediarouter.app;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        boolean z10 = g0Var != null ? g0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
