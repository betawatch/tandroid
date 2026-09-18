package ci;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.o6 {
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
