package fi;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k extends org.telegram.ui.Components.i6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i7) {
        super(true, false, false);
        this.d0 = i7;
        this.e0 = lVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                ((l) this.e0).invalidateSelf();
                break;
            case 1:
                ((l) this.e0).invalidateSelf();
                break;
            default:
                ((Runnable) this.e0).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Runnable runnable) {
        super(false, true, true, true, false);
        this.d0 = 2;
        this.e0 = runnable;
    }
}
