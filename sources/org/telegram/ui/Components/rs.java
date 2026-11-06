package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rs extends i6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ ys e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs(ys ysVar, int i7) {
        super(false, false, false);
        this.d0 = i7;
        this.e0 = ysVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                this.e0.invalidate();
                break;
            default:
                this.e0.invalidate();
                break;
        }
    }
}
