package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dx extends wh.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // wh.o, f2.h1
    public void e() {
        switch (this.q) {
            case 0:
                ((kz) this.r).c0 = true;
                break;
            case 3:
                ((org.telegram.ui.q61) this.r).t1 = true;
                break;
            case 5:
                ((ph.d1) this.r).Y2 = true;
                break;
        }
    }

    @Override // wh.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((kz) this.r).c0 = false;
                break;
            case 1:
                ((jx) this.r).Q.c0 = false;
                break;
            case 2:
                ((org.telegram.ui.c51) this.r).R.t1 = false;
                break;
            case 3:
                ((org.telegram.ui.q61) this.r).t1 = false;
                break;
            case 4:
                ((org.telegram.ui.c51) this.r).R.t1 = false;
                break;
            default:
                ((ph.d1) this.r).Y2 = false;
                break;
        }
    }
}
