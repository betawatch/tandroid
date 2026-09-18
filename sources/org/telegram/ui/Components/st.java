package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class st extends m6 {
    public final /* synthetic */ int W;
    public final /* synthetic */ EditTextBoldCursor X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false, false);
        this.W = i10;
        this.X = editTextBoldCursor;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidate();
                break;
            default:
                this.X.invalidate();
                break;
        }
    }
}
