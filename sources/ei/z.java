package ei;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class z extends org.telegram.ui.ActionBar.f5 {
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
