package hi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m extends org.telegram.ui.Components.n6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i7) {
        super(true, false, false);
        this.e0 = i7;
        this.f0 = nVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                ((n) this.f0).invalidateSelf();
                break;
            case 1:
                ((n) this.f0).invalidateSelf();
                break;
            default:
                ((Runnable) this.f0).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = 2;
        this.f0 = runnable;
    }
}
