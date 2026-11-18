package androidx.mediarouter.app;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a extends s4.s {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // s4.s
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void d(s4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void e(s4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void f(s4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void g(s4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // s4.s
    public final void l(s4.z zVar) {
        boolean z10 = zVar != null ? zVar.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
