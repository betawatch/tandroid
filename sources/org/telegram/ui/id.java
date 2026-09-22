package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class id extends org.telegram.ui.Components.aj0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id(Object obj, Context context, int i10) {
        super(context);
        this.r = i10;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.s).f.invalidate();
                break;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.s).e.invalidate();
                break;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.r) {
            case 0:
                super.invalidate();
                ((ld) this.s).f.invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.s).invalidate();
                break;
            case 2:
                super.invalidate();
                ((l70) this.s).e.invalidate();
                break;
            default:
                super.invalidate();
                ((hf0) this.s).h.invalidate();
                break;
        }
    }
}
