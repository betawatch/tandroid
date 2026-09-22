package ci;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.n6 {
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
