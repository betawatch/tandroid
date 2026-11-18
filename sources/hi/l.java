package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i7) {
        super(true, false, false);
        this.e0 = i7;
        this.f0 = mVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                ((m) this.f0).invalidateSelf();
                break;
            case 1:
                ((m) this.f0).invalidateSelf();
                break;
            default:
                ((Runnable) this.f0).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = 2;
        this.f0 = runnable;
    }
}
