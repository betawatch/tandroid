package androidx.mediarouter.app;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
