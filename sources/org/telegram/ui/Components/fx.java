package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fx extends xh.o {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // xh.o, f2.i1
    public void e() {
        switch (this.q) {
            case 0:
                ((mz) this.r).c0 = true;
                break;
            case 3:
                ((org.telegram.ui.w61) this.r).t1 = true;
                break;
            case 5:
                ((qh.d1) this.r).Y2 = true;
                break;
        }
    }

    @Override // xh.o
    public final void i() {
        switch (this.q) {
            case 0:
                ((mz) this.r).c0 = false;
                break;
            case 1:
                ((lx) this.r).Q.c0 = false;
                break;
            case 2:
                ((org.telegram.ui.j51) this.r).R.t1 = false;
                break;
            case 3:
                ((org.telegram.ui.w61) this.r).t1 = false;
                break;
            case 4:
                ((org.telegram.ui.j51) this.r).R.t1 = false;
                break;
            default:
                ((qh.d1) this.r).Y2 = false;
                break;
        }
    }
}
