package ei;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class z extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ c0 p;

    public z(c0 c0Var) {
        this.p = c0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
