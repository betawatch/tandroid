package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kd extends org.telegram.ui.Components.nj0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(Object obj, Context context, int i10) {
        super(context);
        this.r = i10;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.s).f.invalidate();
                break;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((k70) this.s).e.invalidate();
                break;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ff0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.r) {
            case 0:
                super.invalidate();
                ((nd) this.s).f.invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.v20) this.s).invalidate();
                break;
            case 2:
                super.invalidate();
                ((k70) this.s).e.invalidate();
                break;
            default:
                super.invalidate();
                ((ff0) this.s).h.invalidate();
                break;
        }
    }
}
