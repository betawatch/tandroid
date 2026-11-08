package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rs extends i6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ zs e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs(zs zsVar, int i7) {
        super(false, false, false);
        this.d0 = i7;
        this.e0 = zsVar;
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
