package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fd extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(Object obj, Context context, int i9) {
        super(context);
        this.r = i9;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.r) {
            case 0:
                super.invalidate(i9, i10, i11, i12);
                ((id) this.s).f.invalidate();
                break;
            case 1:
            default:
                super.invalidate(i9, i10, i11, i12);
                break;
            case 2:
                super.invalidate(i9, i10, i11, i12);
                ((r60) this.s).e.invalidate();
                break;
            case 3:
                super.invalidate(i9, i10, i11, i12);
                ((qe0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.r) {
            case 0:
                super.invalidate();
                ((id) this.s).f.invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.b20) this.s).invalidate();
                break;
            case 2:
                super.invalidate();
                ((r60) this.s).e.invalidate();
                break;
            default:
                super.invalidate();
                ((qe0) this.s).h.invalidate();
                break;
        }
    }
}
