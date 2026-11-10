package androidx.mediarouter.app;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        boolean z9 = zVar != null ? zVar.e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.mIsFixedIcon != z9) {
            mediaRouteButton.mIsFixedIcon = z9;
            mediaRouteButton.refreshDrawableState();
        }
    }
}
