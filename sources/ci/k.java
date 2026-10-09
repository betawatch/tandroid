package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ l e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10) {
        super(true, false, false);
        this.d0 = i10;
        this.e0 = lVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                this.e0.invalidateSelf();
                break;
            default:
                this.e0.invalidateSelf();
                break;
        }
    }
}
