package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qw extends ci.p {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw(Object obj, Context context, int i10) {
        super(context, 2);
        this.q = i10;
        this.r = obj;
    }

    @Override // ci.p, s4.y0
    public void e() {
        switch (this.q) {
            case 0:
                ((vy) this.r).f0 = true;
                break;
            case 3:
                ((org.telegram.ui.g31) this.r).x1 = true;
                break;
            case 5:
                ((vh.c1) this.r).i3 = true;
                break;
        }
    }

    @Override // ci.p
    public final void i() {
        switch (this.q) {
            case 0:
                ((vy) this.r).f0 = false;
                break;
            case 1:
                ((vw) this.r).Q.f0 = false;
                break;
            case 2:
                ((org.telegram.ui.u11) this.r).R.x1 = false;
                break;
            case 3:
                ((org.telegram.ui.g31) this.r).x1 = false;
                break;
            case 4:
                ((org.telegram.ui.u11) this.r).R.x1 = false;
                break;
            default:
                ((vh.c1) this.r).i3 = false;
                break;
        }
    }
}
