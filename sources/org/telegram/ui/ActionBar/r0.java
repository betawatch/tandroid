package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.Components.n6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ v0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(v0 v0Var, int i7) {
        super(false, true, true);
        this.e0 = i7;
        this.f0 = v0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                this.f0.invalidate();
                break;
            default:
                this.f0.invalidate();
                break;
        }
    }
}
