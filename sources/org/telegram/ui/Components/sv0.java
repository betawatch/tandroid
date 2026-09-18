package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sv0 extends x50 {
    public final /* synthetic */ uv0 d;

    public sv0(uv0 uv0Var) {
        this.d = uv0Var;
    }

    @Override // org.telegram.ui.Components.do0
    public final CharSequence d() {
        uv0 uv0Var = this.d;
        int i10 = uv0Var.I;
        String[] strArr = uv0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.x50
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.x50
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.x50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
