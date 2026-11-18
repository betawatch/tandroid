package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class et extends m6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ mt f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(mt mtVar, int i7) {
        super(false, false, false);
        this.e0 = i7;
        this.f0 = mtVar;
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
