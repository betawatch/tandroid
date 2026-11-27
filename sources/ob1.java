// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ob1 extends hn {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ pb1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob1(pb1 pb1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = pb1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        pb1 pb1Var = this.f0;
        switch (b) {
            case 0:
                pb1Var.invalidateSelf();
                break;
            default:
                pb1Var.invalidateSelf();
                break;
        }
    }
}
