package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
