package di;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.Components.r6 {
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
