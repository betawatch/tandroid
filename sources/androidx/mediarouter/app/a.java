package androidx.mediarouter.app;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a extends zt6 {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // zt6
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void d(eu6 eu6Var) {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void e(eu6 eu6Var) {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void f(eu6 eu6Var) {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void g(eu6 eu6Var) {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // zt6
    public final void l(iu6 iu6Var) {
        boolean z = iu6Var != null ? iu6Var.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z) {
            mediaRouteButton.mIsFixedIcon = z;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
