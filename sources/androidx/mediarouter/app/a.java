package androidx.mediarouter.app;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends r4.s {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // r4.s
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void d(r4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void e(r4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void f(r4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void g(r4.w wVar) {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // r4.s
    public final void l(r4.a0 a0Var) {
        boolean z10 = a0Var != null ? a0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
