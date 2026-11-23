package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gt extends n6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ ot f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt(ot otVar, int i7) {
        super(false, false, false);
        this.e0 = i7;
        this.f0 = otVar;
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
