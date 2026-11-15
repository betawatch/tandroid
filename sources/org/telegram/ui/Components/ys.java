package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ys extends g6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ ft f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(ft ftVar, int i7) {
        super(false, false, false);
        this.e0 = i7;
        this.f0 = ftVar;
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
