package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sv0 extends z50 {
    public final /* synthetic */ uv0 d;

    public sv0(uv0 uv0Var) {
        this.d = uv0Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final CharSequence d() {
        uv0 uv0Var = this.d;
        int i10 = uv0Var.F;
        String[] strArr = uv0Var.C;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.z50
    public final int i() {
        return this.d.C.length - 1;
    }

    @Override // org.telegram.ui.Components.z50
    public final int j() {
        return this.d.F;
    }

    @Override // org.telegram.ui.Components.z50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
