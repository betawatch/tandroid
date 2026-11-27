package androidx.mediarouter.app;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a extends ew6 {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // ew6
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void d(jw6 jw6Var) {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void e(jw6 jw6Var) {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void f(jw6 jw6Var) {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void g(jw6 jw6Var) {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // ew6
    public final void l(nw6 nw6Var) {
        boolean z = nw6Var != null ? nw6Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z) {
            mediaRouteButton.mIsFixedIcon = z;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
