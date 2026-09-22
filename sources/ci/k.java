package ci;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ l X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10) {
        super(true, false, false, false);
        this.W = i10;
        this.X = lVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidateSelf();
                break;
            default:
                this.X.invalidateSelf();
                break;
        }
    }
}
