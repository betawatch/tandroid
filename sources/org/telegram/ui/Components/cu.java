package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cu extends r6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ EditTextBoldCursor e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu(EditTextBoldCursor editTextBoldCursor, int i10) {
        super(false, false, false);
        this.d0 = i10;
        this.e0 = editTextBoldCursor;
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
