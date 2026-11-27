package androidx.mediarouter.app;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
