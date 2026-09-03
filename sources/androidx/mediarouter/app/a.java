package androidx.mediarouter.app;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4 = f0Var != null ? f0Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z4) {
            mediaRouteButton.mIsFixedIcon = z4;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
