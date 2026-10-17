package ei;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10) {
        super(true, false, false);
        this.e0 = i10;
        this.f0 = lVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                ((l) this.f0).invalidateSelf();
                break;
            case 1:
                ((l) this.f0).invalidateSelf();
                break;
            default:
                ((Runnable) this.f0).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = 2;
        this.f0 = runnable;
    }
}
