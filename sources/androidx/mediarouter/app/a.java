package androidx.mediarouter.app;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends c2.v {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // c2.v
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void d(c2.z zVar) {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void e(c2.z zVar) {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void f(c2.z zVar) {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void g(c2.z zVar) {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // c2.v
    public final void l(c2.e0 e0Var) {
        boolean z10 = e0Var != null ? e0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
