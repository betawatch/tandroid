package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class et extends e6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ mt e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(mt mtVar, int i10) {
        super(false, false, false);
        this.d0 = i10;
        this.e0 = mtVar;
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
