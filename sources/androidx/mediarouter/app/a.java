package androidx.mediarouter.app;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends p4.s {
    public final /* synthetic */ MediaRouteButton a;

    public a(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // p4.s
    public final void a() {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void b() {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void c() {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void d(p4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void e(p4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void f(p4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void g(p4.v vVar) {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void i() {
        this.a.refreshRoute();
    }

    @Override // p4.s
    public final void l(p4.z zVar) {
        boolean z10 = zVar != null ? zVar.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z10) {
            mediaRouteButton.mIsFixedIcon = z10;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
