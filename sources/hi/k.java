package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k extends org.telegram.ui.Components.g6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i7) {
        super(true, false, false);
        this.e0 = i7;
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
