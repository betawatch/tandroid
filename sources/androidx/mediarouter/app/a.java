package androidx.mediarouter.app;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
