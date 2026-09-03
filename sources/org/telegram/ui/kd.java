package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kd extends org.telegram.ui.Components.kj0 {
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
                ((f70) this.s).e.invalidate();
                break;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((af0) this.s).h.invalidate();
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
                ((org.telegram.ui.Components.t20) this.s).invalidate();
                break;
            case 2:
                super.invalidate();
                ((f70) this.s).e.invalidate();
                break;
            default:
                super.invalidate();
                ((af0) this.s).h.invalidate();
                break;
        }
    }
}
